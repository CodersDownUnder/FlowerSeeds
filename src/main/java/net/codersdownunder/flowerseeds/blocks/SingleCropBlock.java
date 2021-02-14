package net.codersdownunder.flowerseeds.blocks;

import net.codersdownunder.flowerseeds.init.BlockInit;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class SingleCropBlock extends CropsBlock
{

	private static final VoxelShape[] SHAPES = new VoxelShape[] { Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D)};
	
	public SingleCropBlock(Properties builder) {
		super(builder);
		
	}
	
	@Override
	protected IItemProvider getSeedsItem() {
		if (this.getBlock() == BlockInit.CROP_DANDELION.get()) {
			return ItemInit.DANDELION_SEED.get();
		 } else if (this.getBlock() == BlockInit.CROP_ALLIUM.get()) {
			 return ItemInit.ALLIUM_SEED.get();
		 } else if (this.getBlock() == BlockInit.CROP_AZURE.get()) {
			 return ItemInit.AZURE_SEED.get();
		 } else if (this.getBlock() == BlockInit.CROP_CORNFLOWER.get()) {
			 return ItemInit.CORNFLOWER_SEED.get();
		 } else if (this.getBlock() == BlockInit.CROP_LILY.get()) {
			 return ItemInit.LILY_SEED.get();
		 } else if (this.getBlock() == BlockInit.CROP_ORCHID.get()) {
			 return ItemInit.ORCHID_SEED.get();
		 } else if (this.getBlock() == BlockInit.CROP_OXEYE.get()) {
			 return ItemInit.OXEYE_SEED.get();
		 } else if (this.getBlock() == BlockInit.CROP_POPPY.get()) {
			 return ItemInit.POPPY_SEED.get();
		 } else if (this.getBlock() == BlockInit.CROP_TULIP_RED.get()) {
			 return ItemInit.TULIP_RED_SEED.get();
		 } else if (this.getBlock() == BlockInit.CROP_TULIP_ORANGE.get()) {
			 return ItemInit.TULIP_ORANGE_SEED.get();
		 } else if (this.getBlock() == BlockInit.CROP_TULIP_WHITE.get()) {
			 return ItemInit.TULIP_WHITE_SEED.get();
		 } else if (this.getBlock() == BlockInit.CROP_TULIP_PINK.get()) {
			 return ItemInit.TULIP_PINK_SEED.get();
		 } else if (this.getBlock() == BlockInit.CROP_WITHERROSE.get()) {
			 return ItemInit.WITHERROSE_SEED.get();
		 } else {
			 return Items.PAPER;
		 }
		
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES[state.get(this.getAgeProperty())];
	}
	
}