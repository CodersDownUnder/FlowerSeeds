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
	
	}

	private void addBlocks() {
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
	}
	/*
	private void addConfig() {
		add("testmod3.config.common.fooBar", "Foo Bar");
		add("testmod3.config.common.exampleEnumProperty", "Example Enum Property");
		add("testmod3.config.common.exampleMapField", "Example Map Field");
		add("testmod3.config.client.baz", "Baz");
		add("testmod3.config.client.subcategory.exampleSubcategoryEnumProperty", "Example Subcategory Enum Property");
		add("testmod3.config.client.exampleNestedEnumProperty", "Example Nested Enum Property");
		add("testmod3.config.client.chunkEnergyHUDPos", "Chunk Energy HUD Position");
	}*/


}