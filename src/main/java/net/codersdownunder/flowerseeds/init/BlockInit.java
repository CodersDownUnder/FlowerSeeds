package net.codersdownunder.flowerseeds.init;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.blocks.SingleCropBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FlowerSeeds.MODID);

	//rose, sunflower, lilac, peony: double high flowers

	public static final RegistryObject<Block> CROP_DANDELION = BLOCKS.register("crop_dandelion", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_POPPY = BLOCKS.register("crop_poppy", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_ORCHID = BLOCKS.register("crop_orchid", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_ALLIUM = BLOCKS.register("crop_allium", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_AZURE = BLOCKS.register("crop_azure", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_TULIP_RED = BLOCKS.register("crop_tulip_red", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_TULIP_ORANGE = BLOCKS.register("crop_tulip_orange", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_TULIP_WHITE = BLOCKS.register("crop_tulip_white", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_TULIP_PINK = BLOCKS.register("crop_tulip_pink", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_OXEYE = BLOCKS.register("crop_oxeye", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_CORNFLOWER = BLOCKS.register("crop_cornflower", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_LILY = BLOCKS.register("crop_lily", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_WITHERROSE = BLOCKS.register("crop_witherrose", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	
}
