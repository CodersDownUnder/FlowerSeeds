package net.codersdownunder.flowerseeds.init;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.data.OptionalLootItem;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FlowerSeeds.MODID);
	public static final DeferredRegister<LootPoolEntryType> POOL_ENTRY_TYPES = DeferredRegister.create(Registry.LOOT_ENTRY_REGISTRY, FlowerSeeds.MODID);

	public static final RegistryObject<LootPoolEntryType> OPTIONAL_LOOT_ITEM = POOL_ENTRY_TYPES.register(
            "optional_item",
            () -> new LootPoolEntryType(new OptionalLootItem.Serializer())
    );

	public static final RegistryObject<Item> DANDELION_SEED = ITEMS.register("dandelion_seed", () -> new BlockItem(BlockInit.CROP_DANDELION.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	public static final RegistryObject<Item> POPPY_SEED = ITEMS.register("poppy_seed", () -> new BlockItem(BlockInit.CROP_POPPY.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	public static final RegistryObject<Item> ORCHID_SEED = ITEMS.register("orchid_seed", () -> new BlockItem(BlockInit.CROP_ORCHID.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	public static final RegistryObject<Item> ALLIUM_SEED = ITEMS.register("allium_seed", () -> new BlockItem(BlockInit.CROP_ALLIUM.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	public static final RegistryObject<Item> AZURE_SEED = ITEMS.register("azure_seed", () -> new BlockItem(BlockInit.CROP_AZURE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	public static final RegistryObject<Item> TULIP_RED_SEED = ITEMS.register("tulip_red_seed", () -> new BlockItem(BlockInit.CROP_TULIP_RED.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	public static final RegistryObject<Item> TULIP_ORANGE_SEED = ITEMS.register("tulip_orange_seed", () -> new BlockItem(BlockInit.CROP_TULIP_ORANGE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	public static final RegistryObject<Item> TULIP_WHITE_SEED = ITEMS.register("tulip_white_seed", () -> new BlockItem(BlockInit.CROP_TULIP_WHITE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	public static final RegistryObject<Item> TULIP_PINK_SEED = ITEMS.register("tulip_pink_seed", () -> new BlockItem(BlockInit.CROP_TULIP_PINK.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	public static final RegistryObject<Item> OXEYE_SEED = ITEMS.register("oxeye_seed", () -> new BlockItem(BlockInit.CROP_OXEYE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	public static final RegistryObject<Item> CORNFLOWER_SEED = ITEMS.register("cornflower_seed", () -> new BlockItem(BlockInit.CROP_CORNFLOWER.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	public static final RegistryObject<Item> LILY_SEED = ITEMS.register("lily_seed", () -> new BlockItem(BlockInit.CROP_LILY.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	public static final RegistryObject<Item> WITHERROSE_SEED = ITEMS.register("witherrose_seed", () -> new BlockItem(BlockInit.CROP_WITHERROSE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	
	//Cyclic Support
	public static final RegistryObject<Item> CYANROSE_SEED = ITEMS.register("cyanrose_seed", () -> new BlockItem(BlockInit.CROP_CYANROSE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
	
//	// Incognita Support
//	public static final RegistryObject<Item> DANDELION_PUFF_SEED = ITEMS.register("dandelion_puff_seed", () -> new BlockItem(BlockInit.CROP_DANDELION_PUFF.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> CHICORY_SEED = ITEMS.register("chicory_seed", () -> new BlockItem(BlockInit.CROP_CHICORY.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> YARROW_SEED = ITEMS.register("yarrow_seed", () -> new BlockItem(BlockInit.CROP_YARROW.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> DAFFODIL_SEED = ITEMS.register("daffodil_seed", () -> new BlockItem(BlockInit.CROP_DAFFODIL.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> YELLOW_PRIMROSE_SEED = ITEMS.register("yellow_primrose_seed", () -> new BlockItem(BlockInit.CROP_YELLOW_PRIMROSE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> PINK_PRIMROSE_SEED = ITEMS.register("pink_primrose_seed", () -> new BlockItem(BlockInit.CROP_PINK_PRIMROSE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> PURPLE_PRIMROSE_SEED = ITEMS.register("purple_primrose_seed", () -> new BlockItem(BlockInit.CROP_PURPLE_PRIMROSE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> FOXGLOVE_SEED = ITEMS.register("foxglove_seed", () -> new BlockItem(BlockInit.CROP_FOXGLOVE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> WILD_GARLIC_SEED = ITEMS.register("wild_garlic_seed", () -> new BlockItem(BlockInit.CROP_WILD_GARLIC.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> MARIGOLD_SEED = ITEMS.register("marigold_seed", () -> new BlockItem(BlockInit.CROP_MARIGOLD.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> BLUE_LUPINE_SEED = ITEMS.register("blue_lupine_seed", () -> new BlockItem(BlockInit.CROP_BLUE_LUPINE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> RED_SNAPDRAGON_SEED = ITEMS.register("red_snapdragon_seed", () -> new BlockItem(BlockInit.CROP_RED_SNAPDRAGON.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> YELLOW_SNAPDRAGON_SEED = ITEMS.register("yellow_snapdragon_seed", () -> new BlockItem(BlockInit.CROP_YELLOW_SNAPDRAGON.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> MAGENTA_SNAPDRAGON_SEED = ITEMS.register("magenta_snapdragon_seed", () -> new BlockItem(BlockInit.CROP_MAGENTA_SNAPDRAGON.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> EDELWEISS_SEED = ITEMS.register("edelweiss_seed", () -> new BlockItem(BlockInit.CROP_EDELWEISS.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> SAXIFRAGE_SEED = ITEMS.register("saxifrage_seed", () -> new BlockItem(BlockInit.CROP_SAXIFRAGE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> ALPINE_PINK_SEED = ITEMS.register("alpine_pink_seed", () -> new BlockItem(BlockInit.CROP_ALPINE_PINK.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> GENTIAN_SEED = ITEMS.register("gentian_seed", () -> new BlockItem(BlockInit.CROP_GENTIAN.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> FORGET_ME_NOT_SEED = ITEMS.register("forget_me_not_seed", () -> new BlockItem(BlockInit.CROP_FORGET_ME_NOT.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> GLOBEFLOWER_SEED = ITEMS.register("globeflower_seed", () -> new BlockItem(BlockInit.CROP_GLOBEFLOWER.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> BLUE_IRIS_SEED = ITEMS.register("blue_iris_seed", () -> new BlockItem(BlockInit.CROP_BLUE_IRIS.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> PURPLE_IRIS_SEED = ITEMS.register("purple_iris_seed", () -> new BlockItem(BlockInit.CROP_PURPLE_IRIS.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> BLACK_IRIS_SEED = ITEMS.register("black_iris_seed", () -> new BlockItem(BlockInit.CROP_BLACK_IRIS.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> FIREWEED_SEED = ITEMS.register("fireweed_seed", () -> new BlockItem(BlockInit.CROP_FIREWEED.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> ARCTIC_POPPY_SEED = ITEMS.register("arctic_poppy_seed", () -> new BlockItem(BlockInit.CROP_ARCTIC_POPPY.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));
//	public static final RegistryObject<Item> WHITE_DRYAD_SEED = ITEMS.register("white_dryad_seed", () -> new BlockItem(BlockInit.CROP_WHITE_DRYAD.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_ITEM_GROUP)));

}
