package net.codersdownunder.flowerseeds.data.client.lang;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class FlowerSeedsEN_US extends LanguageProvider {
	
	public FlowerSeedsEN_US(final DataGenerator gen) {
		super(gen, FlowerSeeds.MODID, "en_us");
	}

	@Override
	protected void addTranslations() {
		
		addBlocks();
		addItemGroups();
	
	}

	private void addBlocks() {
		//Vanilla
		addBlock(BlockInit.CROP_DANDELION, "Dandelion Seeds");
		addBlock(BlockInit.CROP_POPPY, "Poppy Seeds");
		addBlock(BlockInit.CROP_ORCHID, "Orchid Seeds");
		addBlock(BlockInit.CROP_ALLIUM, "Allium Seeds");
		addBlock(BlockInit.CROP_AZURE, "Azure Bluet Seeds");
		addBlock(BlockInit.CROP_TULIP_RED, "Red Tulip Seeds");
		addBlock(BlockInit.CROP_TULIP_ORANGE, "Orange Tulip Seeds");
		addBlock(BlockInit.CROP_TULIP_WHITE, "White Tulip Seeds");
		addBlock(BlockInit.CROP_TULIP_PINK, "Pink Tulip Seeds");
		addBlock(BlockInit.CROP_OXEYE, "Oxeye Daisy Seeds");
		addBlock(BlockInit.CROP_LILY, "Lily of The Valley Seeds");
		addBlock(BlockInit.CROP_WITHERROSE, "Wither Rose Seeds");
		addBlock(BlockInit.CROP_CORNFLOWER, "Corn Flower Seeds");
		
		//Cyclic
		addBlock(BlockInit.CROP_CYANROSE, "Cyan Rose Seeds");
		addBlock(BlockInit.CROP_LIME_CARNATION, "Lime Carnation Seeds");
		addBlock(BlockInit.CROP_PURPLE_TULIP_CYCLIC, "Purple Tulip Cyclic Seeds");
		addBlock(BlockInit.CROP_ABSALON_TULIP, "Absalon Tulip Seeds");

		//BYG
		addBlock(BlockInit.CROP_HORSEWEED, "Horseweed Seeds");
		addBlock(BlockInit.CROP_WINTER_SUCCULENT, "Winter Succulent Seeds");
		addBlock(BlockInit.CROP_ALPINE_BELLFLOWER, "Alpine Bellflower Seeds");
		addBlock(BlockInit.CROP_ANGELICA, "Angelica Seeds");
		addBlock(BlockInit.CROP_HYDRANGEA_BUSH, "Hydrangea Bush Seeds");
		addBlock(BlockInit.CROP_BEGONIA, "Begonia Seeds");
		addBlock(BlockInit.CROP_BISTORT, "Bistort Seeds");
		addBlock(BlockInit.CROP_BLUE_SAGE, "Blue Sage Seeds");
		addBlock(BlockInit.CROP_CALIFORNIA_POPPY, "California Poppy Seeds");
		addBlock(BlockInit.CROP_CROCUS, "Crocus Seeds");
		addBlock(BlockInit.CROP_BLACK_ROSE, "Black Rose Seeds");
		addBlock(BlockInit.CROP_CYAN_ROSE, "Cyan Rose Seeds");
		addBlock(BlockInit.CROP_CYAN_TULIP, "Cyan Tulip Seeds");
		addBlock(BlockInit.CROP_DAFFODIL, "Daffodil Seeds");
		addBlock(BlockInit.CROP_FIRECRACKER_FLOWER_BUSH, "Firecracker Flower Bush Seeds");
		addBlock(BlockInit.CROP_GREEN_TULIP, "Green Tulip Seeds");
		addBlock(BlockInit.CROP_GUZMANIA, "Guzmania Seeds");
		addBlock(BlockInit.CROP_INCAN_LILY, "Incan Lily Seeds");
		addBlock(BlockInit.CROP_IRIS, "Iris Seeds");
		addBlock(BlockInit.CROP_JAPANESE_ORCHID, "Japanese Orchid Seeds");
		addBlock(BlockInit.CROP_KOVAN_FLOWER, "Kovan Flower Seeds");
		addBlock(BlockInit.CROP_LAZARUS_BELLFLOWER, "Lazarus Bellflower Seeds");
		addBlock(BlockInit.CROP_LOLLIPOP_FLOWER, "Lollipop Flower Seeds");
		addBlock(BlockInit.CROP_MAGENTA_TULIP, "Magenta Tulip Seeds");
		addBlock(BlockInit.CROP_ORANGE_DAISY, "Orange Daisy Seeds");
		addBlock(BlockInit.CROP_OSIRIA_ROSE, "Osiria Rose Seeds");
		addBlock(BlockInit.CROP_PEACH_LEATHER_FLOWER, "Peach Leather Flower Seeds");
		addBlock(BlockInit.CROP_PINK_ALLIUM, "Pink Allium Seeds");
		addBlock(BlockInit.CROP_PINK_ANEMONE, "Pink Anemone Seeds");
		addBlock(BlockInit.CROP_PINK_DAFFODIL, "Pink Daffodil Seeds");
		addBlock(BlockInit.CROP_PROTEA_FLOWER, "Protea Flower Seeds");
		addBlock(BlockInit.CROP_PURPLE_SAGE, "Purple Sage Seeds");
		addBlock(BlockInit.CROP_PURPLE_TULIP, "Purple Tulip Seeds");
		addBlock(BlockInit.CROP_RICHEA, "Richea Seeds");
		addBlock(BlockInit.CROP_ROSE, "Rose Seeds");
		addBlock(BlockInit.CROP_SILVER_VASE_FLOWER, "Silver Vase Flower Seeds");
		addBlock(BlockInit.CROP_TORCH_GINGER, "Torch Ginger Seeds");
		addBlock(BlockInit.CROP_VIOLET_LEATHER_FLOWER, "Violet Leather Flower Seeds");
		addBlock(BlockInit.CROP_WHITE_ANEMONE, "White Anemone Seeds");
		addBlock(BlockInit.CROP_WHITE_SAGE, "White Sage Seeds");
		addBlock(BlockInit.CROP_YELLOW_DAFFODIL, "Yellow Daffodil Seeds");
		addBlock(BlockInit.CROP_YELLOW_TULIP, "Yellow Tulip Seeds");

	}
	
	private void addItemGroups() {
		add("itemGroup.flowerseeds", "Flower Seeds");
	}

}