package net.codersdownunder.flowerseeds.init;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.blocks.SingleCropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	
public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FlowerSeeds.MODID);

	//rose, sunflower, lilac, peony: double high flowers

	public static final RegistryObject<Block> CROP_DANDELION = BLOCKS.register("crop_dandelion", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_POPPY = BLOCKS.register("crop_poppy", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_ORCHID = BLOCKS.register("crop_orchid", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_ALLIUM = BLOCKS.register("crop_allium", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_AZURE = BLOCKS.register("crop_azure", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_TULIP_RED = BLOCKS.register("crop_tulip_red", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_TULIP_ORANGE = BLOCKS.register("crop_tulip_orange", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_TULIP_WHITE = BLOCKS.register("crop_tulip_white", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_TULIP_PINK = BLOCKS.register("crop_tulip_pink", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_OXEYE = BLOCKS.register("crop_oxeye", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_CORNFLOWER = BLOCKS.register("crop_cornflower", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_LILY = BLOCKS.register("crop_lily", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_WITHERROSE = BLOCKS.register("crop_witherrose", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	
	//Cyclic Support
	public static final RegistryObject<Block> CROP_CYANROSE = BLOCKS.register("crop_cyanrose", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_LIME_CARNATION = BLOCKS.register("crop_lime_carnation", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_PURPLE_TULIP_CYCLIC = BLOCKS.register("crop_purple_tulip_cyclic", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_ABSALON_TULIP = BLOCKS.register("crop_absalon_tulip", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));

	//Oh the Biomes You'll Go Support
	public static final RegistryObject<Block> CROP_HORSEWEED = BLOCKS.register("crop_horseweed", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_WINTER_SUCCULENT = BLOCKS.register("crop_winter_succulent", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_ALPINE_BELLFLOWER = BLOCKS.register("crop_alpine_bellflower", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_ANGELICA = BLOCKS.register("crop_angelica", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_HYDRANGEA_BUSH = BLOCKS.register("crop_hydrangea_bush", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_BEGONIA = BLOCKS.register("crop_begonia", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_BISTORT = BLOCKS.register("crop_bistort", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_BLUE_SAGE = BLOCKS.register("crop_blue_sage", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_CALIFORNIA_POPPY = BLOCKS.register("crop_california_poppy", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_CROCUS = BLOCKS.register("crop_crocus", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_BLACK_ROSE = BLOCKS.register("crop_black_rose", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_CYAN_ROSE = BLOCKS.register("crop_cyan_rose", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_CYAN_TULIP = BLOCKS.register("crop_cyan_tulip", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_DAFFODIL = BLOCKS.register("crop_daffodil", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_FIRECRACKER_FLOWER_BUSH = BLOCKS.register("crop_firecracker_flower_bush", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_GREEN_TULIP = BLOCKS.register("crop_green_tulip", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_GUZMANIA = BLOCKS.register("crop_guzmania", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_INCAN_LILY = BLOCKS.register("crop_incan_lily", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_IRIS = BLOCKS.register("crop_iris", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_JAPANESE_ORCHID = BLOCKS.register("crop_japanese_orchid", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_KOVAN_FLOWER = BLOCKS.register("crop_kovan_flower", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_LAZARUS_BELLFLOWER = BLOCKS.register("crop_lazarus_bellflower", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_LOLLIPOP_FLOWER = BLOCKS.register("crop_lollipop_flower", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_MAGENTA_TULIP = BLOCKS.register("crop_magenta_tulip", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_ORANGE_DAISY = BLOCKS.register("crop_orange_daisy", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_OSIRIA_ROSE = BLOCKS.register("crop_osiria_rose", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_PEACH_LEATHER_FLOWER = BLOCKS.register("crop_peach_leather_flower", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_PINK_ALLIUM = BLOCKS.register("crop_pink_allium", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_PINK_ANEMONE = BLOCKS.register("crop_pink_anemone", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_PINK_DAFFODIL = BLOCKS.register("crop_pink_daffodil", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_PROTEA_FLOWER = BLOCKS.register("crop_protea_flower", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_PURPLE_SAGE = BLOCKS.register("crop_purple_sage", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_PURPLE_TULIP = BLOCKS.register("crop_purple_tulip", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_RICHEA = BLOCKS.register("crop_richea", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_ROSE = BLOCKS.register("crop_rose", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_SILVER_VASE_FLOWER = BLOCKS.register("crop_silver_vase_flower", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_TORCH_GINGER = BLOCKS.register("crop_torch_ginger", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_VIOLET_LEATHER_FLOWER = BLOCKS.register("crop_violet_leather_flower", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_WHITE_ANEMONE = BLOCKS.register("crop_white_anemone", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_WHITE_SAGE = BLOCKS.register("crop_white_sage", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_YELLOW_DAFFODIL = BLOCKS.register("crop_yellow_daffodil", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CROP_YELLOW_TULIP = BLOCKS.register("crop_yellow_tulip", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));


//	//Terra Incognita Support
//	public static final RegistryObject<Block> CROP_DANDELION_PUFF = BLOCKS.register("crop_dandelion_puff", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_CHICORY = BLOCKS.register("crop_chicory", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_YARROW = BLOCKS.register("crop_yarrow", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_DAFFODIL = BLOCKS.register("crop_daffodil", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_YELLOW_PRIMROSE = BLOCKS.register("crop_yellow_primrose", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_PINK_PRIMROSE = BLOCKS.register("crop_pink_primrose", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_PURPLE_PRIMROSE = BLOCKS.register("crop_purple_primrose", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_FOXGLOVE = BLOCKS.register("crop_foxglove", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_WILD_GARLIC = BLOCKS.register("crop_wild_garlic", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_MARIGOLD = BLOCKS.register("crop_marigold", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_BLUE_LUPINE = BLOCKS.register("crop_blue_lupine", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_RED_SNAPDRAGON = BLOCKS.register("crop_red_snapdragon", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_YELLOW_SNAPDRAGON = BLOCKS.register("crop_yellow_snapdragon", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_MAGENTA_SNAPDRAGON = BLOCKS.register("crop_magenta_snapdragon", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_EDELWEISS = BLOCKS.register("crop_edelweiss", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_SAXIFRAGE = BLOCKS.register("crop_saxifrage", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_ALPINE_PINK = BLOCKS.register("crop_alpine_pink", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_GENTIAN = BLOCKS.register("crop_gentian", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_FORGET_ME_NOT = BLOCKS.register("crop_forget_me_not", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_GLOBEFLOWER = BLOCKS.register("crop_globeflower", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_BLUE_IRIS = BLOCKS.register("crop_blue_iris", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_PURPLE_IRIS = BLOCKS.register("crop_purple_iris", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_BLACK_IRIS = BLOCKS.register("crop_black_iris", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_FIREWEED = BLOCKS.register("crop_fireweed", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_ARCTIC_POPPY = BLOCKS.register("crop_arctic_poppy", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));
//	public static final RegistryObject<Block> CROP_WHITE_DRYAD = BLOCKS.register("crop_white_dryad", () -> new SingleCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.GRASS)));

	
}
