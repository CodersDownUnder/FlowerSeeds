package net.codersdownunder.flowerseeds.data.client;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FlowerSeedsItemModels extends ItemModelProvider {

	public FlowerSeedsItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, FlowerSeeds.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		oneLayerItem(ItemInit.ALLIUM_SEED.get());
		oneLayerItem(ItemInit.AZURE_SEED.get());
		oneLayerItem(ItemInit.CORNFLOWER_SEED.get());
		oneLayerItem(ItemInit.DANDELION_SEED.get());
		oneLayerItem(ItemInit.LILY_SEED.get());
		oneLayerItem(ItemInit.ORCHID_SEED.get());
		oneLayerItem(ItemInit.OXEYE_SEED.get());
		oneLayerItem(ItemInit.POPPY_SEED.get());
		oneLayerItem(ItemInit.TULIP_ORANGE_SEED.get());
		oneLayerItem(ItemInit.TULIP_PINK_SEED.get());
		oneLayerItem(ItemInit.TULIP_RED_SEED.get());
		oneLayerItem(ItemInit.TULIP_WHITE_SEED.get());
		oneLayerItem(ItemInit.WITHERROSE_SEED.get());

		oneLayerItem(ItemInit.CYANROSE_SEED.get());
		oneLayerItem(ItemInit.LIME_CARNATION_SEED.get());
		oneLayerItem(ItemInit.PURPLE_TULIP_CYCLIC_SEED.get());
		oneLayerItem(ItemInit.ABSALON_TULIP_SEED.get());

		oneLayerItem(ItemInit.HORSEWEED_SEED.get());
		oneLayerItem(ItemInit.WINTER_SUCCULENT_SEED.get());
		oneLayerItem(ItemInit.ALPINE_BELLFLOWER_SEED.get());
		oneLayerItem(ItemInit.ANGELICA_SEED.get());
		oneLayerItem(ItemInit.HYDRANGEA_BUSH_SEED.get());
		oneLayerItem(ItemInit.BEGONIA_SEED.get());
		oneLayerItem(ItemInit.BISTORT_SEED.get());
		oneLayerItem(ItemInit.BLUE_SAGE_SEED.get());
		oneLayerItem(ItemInit.CALIFORNIA_POPPY_SEED.get());
		oneLayerItem(ItemInit.CROCUS_SEED.get());
		oneLayerItem(ItemInit.BLACK_ROSE_SEED.get());
		oneLayerItem(ItemInit.CYAN_ROSE_SEED.get());
		oneLayerItem(ItemInit.CYAN_TULIP_SEED.get());
		oneLayerItem(ItemInit.DAFFODIL_SEED.get());
		oneLayerItem(ItemInit.FIRECRACKER_FLOWER_BUSH_SEED.get());
		oneLayerItem(ItemInit.GREEN_TULIP_SEED.get());
		oneLayerItem(ItemInit.GUZMANIA_SEED.get());
		oneLayerItem(ItemInit.INCAN_LILY_SEED.get());
		oneLayerItem(ItemInit.IRIS_SEED.get());
		oneLayerItem(ItemInit.JAPANESE_ORCHID_SEED.get());
		oneLayerItem(ItemInit.KOVAN_FLOWER_SEED.get());
		oneLayerItem(ItemInit.LAZARUS_BELLFLOWER_SEED.get());
		oneLayerItem(ItemInit.LOLLIPOP_FLOWER_SEED.get());
		oneLayerItem(ItemInit.MAGENTA_TULIP_SEED.get());
		oneLayerItem(ItemInit.ORANGE_DAISY_SEED.get());
		oneLayerItem(ItemInit.OSIRIA_ROSE_SEED.get());
		oneLayerItem(ItemInit.PEACH_LEATHER_FLOWER_SEED.get());
		oneLayerItem(ItemInit.PINK_ALLIUM_SEED.get());
		oneLayerItem(ItemInit.PINK_ANEMONE_SEED.get());
		oneLayerItem(ItemInit.PINK_DAFFODIL_SEED.get());
		oneLayerItem(ItemInit.PROTEA_FLOWER_SEED.get());
		oneLayerItem(ItemInit.PURPLE_SAGE_SEED.get());
		oneLayerItem(ItemInit.PURPLE_TULIP_SEED.get());
		oneLayerItem(ItemInit.RICHEA_SEED.get());
		oneLayerItem(ItemInit.ROSE_SEED.get());
		oneLayerItem(ItemInit.SILVER_VASE_FLOWER_SEED.get());
		oneLayerItem(ItemInit.TORCH_GINGER_SEED.get());
		oneLayerItem(ItemInit.VIOLET_LEATHER_FLOWER_SEED.get());
		oneLayerItem(ItemInit.WHITE_ANEMONE_SEED.get());
		oneLayerItem(ItemInit.WHITE_SAGE_SEED.get());
		oneLayerItem(ItemInit.YELLOW_DAFFODIL_SEED.get());
		oneLayerItem(ItemInit.YELLOW_TULIP_SEED.get());

	}

	@Override
	public String getName() {
		return "FlowerSeeds Item Models";
	}

	protected void oneLayerItem(Item item, ResourceLocation texture) {
		ResourceLocation itemTexture = new ResourceLocation(FlowerSeeds.MODID,"item/seed");
		if (existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures")) {
			getBuilder(item.getRegistryName().getPath()).parent(getExistingFile(mcLoc("item/generated")))
					.texture("layer0", itemTexture);
		} else {
			System.out.println(
					"Texture for " + item.getRegistryName().toString() + " not present at " + itemTexture.toString());
		}
	}

	protected void oneLayerItem(Item item) {
		oneLayerItem(item, item.getRegistryName());
	}


}