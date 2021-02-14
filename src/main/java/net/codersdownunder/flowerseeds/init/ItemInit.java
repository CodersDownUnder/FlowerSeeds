package net.codersdownunder.flowerseeds.init;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FlowerSeeds.MODID);

	public static final RegistryObject<Item> DANDELION_SEED = ITEMS.register("dandelion_seed", () -> new BlockItem(BlockInit.CROP_DANDELION.get(), new Item.Properties().group(FlowerSeeds.creativetab)));
	public static final RegistryObject<Item> POPPY_SEED = ITEMS.register("poppy_seed", () -> new BlockItem(BlockInit.CROP_POPPY.get(), new Item.Properties().group(FlowerSeeds.creativetab)));
	public static final RegistryObject<Item> ORCHID_SEED = ITEMS.register("orchid_seed", () -> new BlockItem(BlockInit.CROP_ORCHID.get(), new Item.Properties().group(FlowerSeeds.creativetab)));
	public static final RegistryObject<Item> ALLIUM_SEED = ITEMS.register("allium_seed", () -> new BlockItem(BlockInit.CROP_ALLIUM.get(), new Item.Properties().group(FlowerSeeds.creativetab)));
	public static final RegistryObject<Item> AZURE_SEED = ITEMS.register("azure_seed", () -> new BlockItem(BlockInit.CROP_AZURE.get(), new Item.Properties().group(FlowerSeeds.creativetab)));
	public static final RegistryObject<Item> TULIP_RED_SEED = ITEMS.register("tulip_red_seed", () -> new BlockItem(BlockInit.CROP_TULIP_RED.get(), new Item.Properties().group(FlowerSeeds.creativetab)));
	public static final RegistryObject<Item> TULIP_ORANGE_SEED = ITEMS.register("tulip_orange_seed", () -> new BlockItem(BlockInit.CROP_TULIP_ORANGE.get(), new Item.Properties().group(FlowerSeeds.creativetab)));
	public static final RegistryObject<Item> TULIP_WHITE_SEED = ITEMS.register("tulip_white_seed", () -> new BlockItem(BlockInit.CROP_TULIP_WHITE.get(), new Item.Properties().group(FlowerSeeds.creativetab)));
	public static final RegistryObject<Item> TULIP_PINK_SEED = ITEMS.register("tulip_pink_seed", () -> new BlockItem(BlockInit.CROP_TULIP_PINK.get(), new Item.Properties().group(FlowerSeeds.creativetab)));
	public static final RegistryObject<Item> OXEYE_SEED = ITEMS.register("oxeye_seed", () -> new BlockItem(BlockInit.CROP_OXEYE.get(), new Item.Properties().group(FlowerSeeds.creativetab)));
	public static final RegistryObject<Item> CORNFLOWER_SEED = ITEMS.register("cornflower_seed", () -> new BlockItem(BlockInit.CROP_CORNFLOWER.get(), new Item.Properties().group(FlowerSeeds.creativetab)));
	public static final RegistryObject<Item> LILY_SEED = ITEMS.register("lily_seed", () -> new BlockItem(BlockInit.CROP_LILY.get(), new Item.Properties().group(FlowerSeeds.creativetab)));
	public static final RegistryObject<Item> WITHERROSE_SEED = ITEMS.register("witherrose_seed", () -> new BlockItem(BlockInit.CROP_WITHERROSE.get(), new Item.Properties().group(FlowerSeeds.creativetab)));

	
}
