package net.codersdownunder.flowerseeds.data;


import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FlowerSeedsItemTags extends ItemTagsProvider {

	public FlowerSeedsItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
		super(generator, blockTags, FlowerSeeds.MODID, helper);
	}

	@Override
	protected void addTags() {
		
		
		tag(Tags.Items.CROPS)
		.add(ItemInit.ALLIUM_SEED.get())
		.add(ItemInit.AZURE_SEED.get())
		.add(ItemInit.CORNFLOWER_SEED.get())
		.add(ItemInit.CYANROSE_SEED.get())
		.add(ItemInit.DANDELION_SEED.get())
		.add(ItemInit.LILY_SEED.get())
		.add(ItemInit.ORCHID_SEED.get())
		.add(ItemInit.OXEYE_SEED.get())
		.add(ItemInit.POPPY_SEED.get())
		.add(ItemInit.TULIP_ORANGE_SEED.get())
		.add(ItemInit.TULIP_PINK_SEED.get())
		.add(ItemInit.TULIP_RED_SEED.get())
		.add(ItemInit.TULIP_WHITE_SEED.get())
		.add(ItemInit.WITHERROSE_SEED.get());

	}

	@Override
	public String getName() {
		return "Flower Seeds Tags";
	}
}