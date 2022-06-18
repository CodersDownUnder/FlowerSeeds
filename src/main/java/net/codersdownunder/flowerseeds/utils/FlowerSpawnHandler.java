package net.codersdownunder.flowerseeds.utils;

import java.util.Random;

import javax.annotation.Nullable;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class FlowerSpawnHandler {
	
	public static Random rand = new Random();
	
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void onBone(BonemealEvent event) {
		  	  
		  	if (event.getBlock().getBlock() instanceof GrassBlock) {
		  	  FlowerSeeds.LOGGER.info("event cancelled");
			  event.setCanceled(true);
			  
			  applyBoneMeal(event.getWorld(), event.getPos(), event.getBlock(), event.getStack(), event.getPlayer());
		  	}		
	}
	
	public boolean applyBoneMeal(Level world, BlockPos pos, BlockState state, ItemStack itemStack, @Nullable Player player) {
        
        if (isGrassBlock(state)) {
            if (!world.isClientSide) {
                Random random = world.random;
                final int tries = 6;
                final int range = 6;
                boolean spawnedAnyFlower = false;
                for (int i = 0; i < tries; i++) {
                    BlockPos flowerPos = new BlockPos(pos.getX() + random.nextInt(range * 2) - range, pos.getY() + 1, pos.getZ() + random.nextInt(range * 2) - range);
                    if (world.isEmptyBlock(flowerPos) && isGrassBlock(world.getBlockState(flowerPos.below()))) {
                        plantFlower(world, flowerPos, rand);
                        spawnedAnyFlower = true;
                        
                    }
                }
                
                

                if (spawnedAnyFlower) {
                    world.levelEvent(2005, pos, 0);
                } else {
                    world.levelEvent(2000, pos.above(), 4);
                }
            }

            if (player == null || !player.getAbilities().instabuild) {
                itemStack.shrink(1);
            }

            return true;
        }
        return false;
    }
	

	    private void plantFlower(Level world, BlockPos pos, Random rand) {
	        BlockState state;
	        
	        Block block = rand.nextInt(3) == 0 ? Blocks.TALL_GRASS : Blocks.FERN;
			state = block.defaultBlockState();
	  
	        if (state.canSurvive(world, pos)) {
	            world.setBlockAndUpdate(pos, state);
	        }
	        
	        world.sendBlockUpdated(pos, state, state, 3);
	    }

	  
	public void grow(Level world, BlockPos pos, BlockState state, @Nullable Player player) {
	      
		  
		  if (isGrassBlock(state)) {
		  BlockPos blockpos = pos.above();
	      BlockState blockstate = Blocks.GRASS.defaultBlockState();

	      label48:
	      for(int i = 0; i < 128; ++i) {
	         BlockPos blockpos1 = blockpos;

	         for(int j = 0; j < i / 16; ++j) {
	            blockpos1 = blockpos1.offset(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2, rand.nextInt(3) - 1);
	            if (world.getBlockState(blockpos1).isCollisionShapeFullBlock(world, blockpos1)) {
	               continue label48;
	            }
	         }

	         BlockState blockstate2 = world.getBlockState(blockpos1);
	        
	          ((BonemealableBlock)blockstate.getBlock()).performBonemeal(world.getServer().overworld().getLevel(), rand, blockpos1, blockstate2);
	         

	         if (blockstate2.isAir()) {
	            BlockState blockstate1 = blockstate;

	            if (blockstate1.canSurvive(world, blockpos1)) {
	               world.setBlock(blockpos1, blockstate1, 2);
	            }
	         }	       
	       }
		 }
	
	   }
	  
	  public static boolean isGrassBlock(BlockState state) {
	        return state.getBlock() == Blocks.GRASS_BLOCK;
	    }

}
