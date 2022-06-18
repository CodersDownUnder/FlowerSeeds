package net.codersdownunder.flowerseeds.data;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FlowerSeedsBlockTags extends BlockTagsProvider {

    public FlowerSeedsBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, FlowerSeeds.MODID, helper);
    }

    @Override
    protected void addTags() {
       
    }

    @Override
    public String getName() {
        return "FlowerSeeds Tags";
    }
}