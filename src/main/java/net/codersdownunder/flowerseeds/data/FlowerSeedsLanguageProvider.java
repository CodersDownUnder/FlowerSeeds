package net.codersdownunder.flowerseeds.data;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class FlowerSeedsLanguageProvider extends LanguageProvider {
	
	public FlowerSeedsLanguageProvider(final DataGenerator gen) {
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
		
//		//Terra Incognita
//		addBlock(BlockInit.CROP_ALPINE_PINK, "Alpine Pink Seeds");
//		addBlock(BlockInit.CROP_ARCTIC_POPPY, "Arctic Poppy Seeds");
//		addBlock(BlockInit.CROP_BLACK_IRIS, "Black Iris Seeds");
//		addBlock(BlockInit.CROP_BLUE_IRIS, "Blue Iris Seeds");
//		addBlock(BlockInit.CROP_BLUE_LUPINE, "Blue Lupine Seeds");
//		addBlock(BlockInit.CROP_CHICORY, "Chicory Seeds");
//		addBlock(BlockInit.CROP_DAFFODIL, "Daffodil Seeds");
//		addBlock(BlockInit.CROP_DANDELION_PUFF, "Dandelion Puff Seeds");
//		addBlock(BlockInit.CROP_EDELWEISS, "Edelweiss Seeds");
//		addBlock(BlockInit.CROP_FIREWEED, "Fire Weed Seeds");
//		addBlock(BlockInit.CROP_FORGET_ME_NOT, "Forget Me Not Seeds");
//		addBlock(BlockInit.CROP_FOXGLOVE, "Fox Flove Seeds");
//		addBlock(BlockInit.CROP_GENTIAN, "Gentian Seeds");
//		addBlock(BlockInit.CROP_GLOBEFLOWER, "Globe Flower Seeds");
//		addBlock(BlockInit.CROP_MAGENTA_SNAPDRAGON, "Magenta Snap Dragon Seeds");
//		addBlock(BlockInit.CROP_MARIGOLD, "Marigold Seeds");
//		addBlock(BlockInit.CROP_PINK_PRIMROSE, "Pink Primrose Seeds");
//		addBlock(BlockInit.CROP_PURPLE_IRIS, "Purple Iris Seeds");
//		addBlock(BlockInit.CROP_PURPLE_PRIMROSE, "Purple Primrose Seeds");
//		addBlock(BlockInit.CROP_RED_SNAPDRAGON, "Red Snap Dragon Seeds");
//		addBlock(BlockInit.CROP_SAXIFRAGE, "Saxifrage Seeds");
//		addBlock(BlockInit.CROP_WHITE_DRYAD, "White Drayd Seeds");
//		addBlock(BlockInit.CROP_WILD_GARLIC, "Wild Garlic Seeds");
//		addBlock(BlockInit.CROP_YARROW, "Yarrow Seeds");
//		addBlock(BlockInit.CROP_YELLOW_PRIMROSE, "Yellow Primrose Seeds");
//		addBlock(BlockInit.CROP_YELLOW_SNAPDRAGON, "Yellow Snap Dragon Seeds");
	}
	
	private void addItemGroups() {
		add("itemGroup.flowerseeds", "Flower Seeds");
	}

}