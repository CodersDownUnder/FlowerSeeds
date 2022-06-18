package net.codersdownunder.flowerseeds.blocks;

import net.codersdownunder.flowerseeds.init.BlockInit;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.BlockGetter;


public class SingleCropBlock extends CropBlock {

	private static final VoxelShape[] SHAPES = new VoxelShape[] {
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D) };

	public SingleCropBlock(Properties builder) {
		super(builder);
	}
	
	

	@Override
	protected ItemLike getBaseSeedId() {
		if (this.asBlock() == BlockInit.CROP_DANDELION.get()) {
			return ItemInit.DANDELION_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_ALLIUM.get()) {
			return ItemInit.ALLIUM_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_AZURE.get()) {
			return ItemInit.AZURE_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_CORNFLOWER.get()) {
			return ItemInit.CORNFLOWER_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_LILY.get()) {
			return ItemInit.LILY_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_ORCHID.get()) {
			return ItemInit.ORCHID_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_OXEYE.get()) {
			return ItemInit.OXEYE_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_POPPY.get()) {
			return ItemInit.POPPY_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_TULIP_RED.get()) {
			return ItemInit.TULIP_RED_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_TULIP_ORANGE.get()) {
			return ItemInit.TULIP_ORANGE_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_TULIP_WHITE.get()) {
			return ItemInit.TULIP_WHITE_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_TULIP_PINK.get()) {
			return ItemInit.TULIP_PINK_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_WITHERROSE.get()) {
			return ItemInit.WITHERROSE_SEED.get();
		} else if (this.asBlock() == BlockInit.CROP_CYANROSE.get()) {
			return ItemInit.CYANROSE_SEED.get();
		} else {
			return Items.PAPER;
		}

	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return SHAPES[state.getValue(this.getAgeProperty())];
	}

}