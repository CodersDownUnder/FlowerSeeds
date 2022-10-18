package net.codersdownunder.flowerseeds.init;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.data.server.OptionalLootItem;
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

	public static final RegistryObject<Item> DANDELION_SEED = ITEMS.register("dandelion_seed", () -> new BlockItem(BlockInit.CROP_DANDELION.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> POPPY_SEED = ITEMS.register("poppy_seed", () -> new BlockItem(BlockInit.CROP_POPPY.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> ORCHID_SEED = ITEMS.register("orchid_seed", () -> new BlockItem(BlockInit.CROP_ORCHID.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> ALLIUM_SEED = ITEMS.register("allium_seed", () -> new BlockItem(BlockInit.CROP_ALLIUM.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> AZURE_SEED = ITEMS.register("azure_seed", () -> new BlockItem(BlockInit.CROP_AZURE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> TULIP_RED_SEED = ITEMS.register("tulip_red_seed", () -> new BlockItem(BlockInit.CROP_TULIP_RED.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> TULIP_ORANGE_SEED = ITEMS.register("tulip_orange_seed", () -> new BlockItem(BlockInit.CROP_TULIP_ORANGE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> TULIP_WHITE_SEED = ITEMS.register("tulip_white_seed", () -> new BlockItem(BlockInit.CROP_TULIP_WHITE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> TULIP_PINK_SEED = ITEMS.register("tulip_pink_seed", () -> new BlockItem(BlockInit.CROP_TULIP_PINK.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> OXEYE_SEED = ITEMS.register("oxeye_seed", () -> new BlockItem(BlockInit.CROP_OXEYE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> CORNFLOWER_SEED = ITEMS.register("cornflower_seed", () -> new BlockItem(BlockInit.CROP_CORNFLOWER.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> LILY_SEED = ITEMS.register("lily_seed", () -> new BlockItem(BlockInit.CROP_LILY.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> WITHERROSE_SEED = ITEMS.register("witherrose_seed", () -> new BlockItem(BlockInit.CROP_WITHERROSE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));

	//Cyclic Support
	public static final RegistryObject<Item> CYANROSE_SEED = ITEMS.register("cyanrose_seed", () -> new BlockItem(BlockInit.CROP_CYANROSE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> LIME_CARNATION_SEED = ITEMS.register("lime_carnation_seed", () -> new BlockItem(BlockInit.CROP_LIME_CARNATION.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> PURPLE_TULIP_CYCLIC_SEED = ITEMS.register("purple_tulip_cyclic_seed", () -> new BlockItem(BlockInit.CROP_PURPLE_TULIP_CYCLIC.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> ABSALON_TULIP_SEED = ITEMS.register("absalon_tulip_seed", () -> new BlockItem(BlockInit.CROP_ABSALON_TULIP.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));

	//Oh, the Biomes You'll Go Support
	public static final RegistryObject<Item> HORSEWEED_SEED = ITEMS.register("horseweed_seed", () -> new BlockItem(BlockInit.CROP_HORSEWEED.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> WINTER_SUCCULENT_SEED = ITEMS.register("winter_succulent_seed", () -> new BlockItem(BlockInit.CROP_WINTER_SUCCULENT.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> ALPINE_BELLFLOWER_SEED = ITEMS.register("alpine_bellflower_seed", () -> new BlockItem(BlockInit.CROP_ALPINE_BELLFLOWER.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> ANGELICA_SEED = ITEMS.register("angelica_seed", () -> new BlockItem(BlockInit.CROP_ANGELICA.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> HYDRANGEA_BUSH_SEED = ITEMS.register("hydrangea_bush_seed", () -> new BlockItem(BlockInit.CROP_HYDRANGEA_BUSH.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> BEGONIA_SEED = ITEMS.register("begonia_seed", () -> new BlockItem(BlockInit.CROP_BEGONIA.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> BISTORT_SEED = ITEMS.register("bistort_seed", () -> new BlockItem(BlockInit.CROP_BISTORT.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> BLUE_SAGE_SEED = ITEMS.register("blue_sage_seed", () -> new BlockItem(BlockInit.CROP_BLUE_SAGE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> CALIFORNIA_POPPY_SEED = ITEMS.register("california_poppy_seed", () -> new BlockItem(BlockInit.CROP_CALIFORNIA_POPPY.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> CROCUS_SEED = ITEMS.register("crocus_seed", () -> new BlockItem(BlockInit.CROP_CROCUS.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> BLACK_ROSE_SEED = ITEMS.register("black_rose_seed", () -> new BlockItem(BlockInit.CROP_BLACK_ROSE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> CYAN_ROSE_SEED = ITEMS.register("cyan_rose_seed", () -> new BlockItem(BlockInit.CROP_CYAN_ROSE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> CYAN_TULIP_SEED = ITEMS.register("cyan_tulip_seed", () -> new BlockItem(BlockInit.CROP_CYAN_TULIP.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> DAFFODIL_SEED = ITEMS.register("daffodil_seed", () -> new BlockItem(BlockInit.CROP_DAFFODIL.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> FIRECRACKER_FLOWER_BUSH_SEED = ITEMS.register("firecracker_flower_bush_seed", () -> new BlockItem(BlockInit.CROP_FIRECRACKER_FLOWER_BUSH.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> GREEN_TULIP_SEED = ITEMS.register("green_tulip_seed", () -> new BlockItem(BlockInit.CROP_GREEN_TULIP.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> GUZMANIA_SEED = ITEMS.register("guzmania_seed", () -> new BlockItem(BlockInit.CROP_GUZMANIA.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> INCAN_LILY_SEED = ITEMS.register("incan_lily_seed", () -> new BlockItem(BlockInit.CROP_INCAN_LILY.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> IRIS_SEED = ITEMS.register("iris_seed", () -> new BlockItem(BlockInit.CROP_IRIS.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> JAPANESE_ORCHID_SEED = ITEMS.register("japanese_orchid_seed", () -> new BlockItem(BlockInit.CROP_JAPANESE_ORCHID.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> KOVAN_FLOWER_SEED = ITEMS.register("kovan_flower_seed", () -> new BlockItem(BlockInit.CROP_KOVAN_FLOWER.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> LAZARUS_BELLFLOWER_SEED = ITEMS.register("lazarus_bellflower_seed", () -> new BlockItem(BlockInit.CROP_LAZARUS_BELLFLOWER.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> LOLLIPOP_FLOWER_SEED = ITEMS.register("lollipop_flower_seed", () -> new BlockItem(BlockInit.CROP_LOLLIPOP_FLOWER.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> MAGENTA_TULIP_SEED = ITEMS.register("magenta_tulip_seed", () -> new BlockItem(BlockInit.CROP_MAGENTA_TULIP.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> ORANGE_DAISY_SEED = ITEMS.register("orange_daisy_seed", () -> new BlockItem(BlockInit.CROP_ORANGE_DAISY.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> OSIRIA_ROSE_SEED = ITEMS.register("osiria_rose_seed", () -> new BlockItem(BlockInit.CROP_OSIRIA_ROSE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> PEACH_LEATHER_FLOWER_SEED = ITEMS.register("peach_leather_flower_seed", () -> new BlockItem(BlockInit.CROP_PEACH_LEATHER_FLOWER.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> PINK_ALLIUM_SEED = ITEMS.register("pink_allium_seed", () -> new BlockItem(BlockInit.CROP_PINK_ALLIUM.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> PINK_ANEMONE_SEED = ITEMS.register("pink_anemone_seed", () -> new BlockItem(BlockInit.CROP_PINK_ANEMONE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> PINK_DAFFODIL_SEED = ITEMS.register("pink_daffodil_seed", () -> new BlockItem(BlockInit.CROP_PINK_DAFFODIL.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> PROTEA_FLOWER_SEED = ITEMS.register("protea_flower_seed", () -> new BlockItem(BlockInit.CROP_PROTEA_FLOWER.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> PURPLE_SAGE_SEED = ITEMS.register("purple_sage_seed", () -> new BlockItem(BlockInit.CROP_PURPLE_SAGE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> PURPLE_TULIP_SEED = ITEMS.register("purple_tulip_seed", () -> new BlockItem(BlockInit.CROP_PURPLE_TULIP.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> RICHEA_SEED = ITEMS.register("richea_seed", () -> new BlockItem(BlockInit.CROP_RICHEA.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> ROSE_SEED = ITEMS.register("rose_seed", () -> new BlockItem(BlockInit.CROP_ROSE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> SILVER_VASE_FLOWER_SEED = ITEMS.register("silver_vase_flower_seed", () -> new BlockItem(BlockInit.CROP_SILVER_VASE_FLOWER.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> TORCH_GINGER_SEED = ITEMS.register("torch_ginger_seed", () -> new BlockItem(BlockInit.CROP_TORCH_GINGER.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> VIOLET_LEATHER_FLOWER_SEED = ITEMS.register("violet_leather_flower_seed", () -> new BlockItem(BlockInit.CROP_VIOLET_LEATHER_FLOWER.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> WHITE_ANEMONE_SEED = ITEMS.register("white_anemone_seed", () -> new BlockItem(BlockInit.CROP_WHITE_ANEMONE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> WHITE_SAGE_SEED = ITEMS.register("white_sage_seed", () -> new BlockItem(BlockInit.CROP_WHITE_SAGE.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> YELLOW_DAFFODIL_SEED = ITEMS.register("yellow_daffodil_seed", () -> new BlockItem(BlockInit.CROP_YELLOW_DAFFODIL.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));
	public static final RegistryObject<Item> YELLOW_TULIP_SEED = ITEMS.register("yellow_tulip_seed", () -> new BlockItem(BlockInit.CROP_YELLOW_TULIP.get(), new Item.Properties().tab(FlowerSeeds.FLOWERSEEDS_TAB)));

}
