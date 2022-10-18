package net.codersdownunder.flowerseeds.data.server;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FlowerSeedsBlockTags extends BlockTagsProvider {

    public FlowerSeedsBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, FlowerSeeds.MODID, helper);
    }

    @Override
    protected void addTags() {
       tag(BlockTags.CROPS)
               .add(BlockInit.CROP_ALLIUM.get())
               .add(BlockInit.CROP_AZURE.get())
               .add(BlockInit.CROP_CORNFLOWER.get())
               .add(BlockInit.CROP_CYANROSE.get())
               .add(BlockInit.CROP_DANDELION.get())
               .add(BlockInit.CROP_LILY.get())
               .add(BlockInit.CROP_ORCHID.get())
               .add(BlockInit.CROP_OXEYE.get())
               .add(BlockInit.CROP_POPPY.get())
               .add(BlockInit.CROP_TULIP_ORANGE.get())
               .add(BlockInit.CROP_TULIP_PINK.get())
               .add(BlockInit.CROP_TULIP_RED.get())
               .add(BlockInit.CROP_TULIP_WHITE.get())
               .add(BlockInit.CROP_WITHERROSE.get())
               .add(BlockInit.CROP_HORSEWEED.get())
               .add(BlockInit.CROP_WINTER_SUCCULENT.get())
               .add(BlockInit.CROP_ALPINE_BELLFLOWER.get())
               .add(BlockInit.CROP_ANGELICA.get())
               .add(BlockInit.CROP_HYDRANGEA_BUSH.get())
               .add(BlockInit.CROP_BEGONIA.get())
               .add(BlockInit.CROP_BISTORT.get())
               .add(BlockInit.CROP_BLUE_SAGE.get())
               .add(BlockInit.CROP_CALIFORNIA_POPPY.get())
               .add(BlockInit.CROP_CROCUS.get())
               .add(BlockInit.CROP_BLACK_ROSE.get())
               .add(BlockInit.CROP_CYAN_ROSE.get())
               .add(BlockInit.CROP_CYAN_TULIP.get())
               .add(BlockInit.CROP_DAFFODIL.get())
               .add(BlockInit.CROP_FIRECRACKER_FLOWER_BUSH.get())
               .add(BlockInit.CROP_GREEN_TULIP.get())
               .add(BlockInit.CROP_GUZMANIA.get())
               .add(BlockInit.CROP_INCAN_LILY.get())
               .add(BlockInit.CROP_IRIS.get())
               .add(BlockInit.CROP_JAPANESE_ORCHID.get())
               .add(BlockInit.CROP_KOVAN_FLOWER.get())
               .add(BlockInit.CROP_LAZARUS_BELLFLOWER.get())
               .add(BlockInit.CROP_LOLLIPOP_FLOWER.get())
               .add(BlockInit.CROP_MAGENTA_TULIP.get())
               .add(BlockInit.CROP_ORANGE_DAISY.get())
               .add(BlockInit.CROP_OSIRIA_ROSE.get())
               .add(BlockInit.CROP_PEACH_LEATHER_FLOWER.get())
               .add(BlockInit.CROP_PINK_ALLIUM.get())
               .add(BlockInit.CROP_PINK_ANEMONE.get())
               .add(BlockInit.CROP_PINK_DAFFODIL.get())
               .add(BlockInit.CROP_PROTEA_FLOWER.get())
               .add(BlockInit.CROP_PURPLE_SAGE.get())
               .add(BlockInit.CROP_PURPLE_TULIP.get())
               .add(BlockInit.CROP_RICHEA.get())
               .add(BlockInit.CROP_ROSE.get())
               .add(BlockInit.CROP_SILVER_VASE_FLOWER.get())
               .add(BlockInit.CROP_TORCH_GINGER.get())
               .add(BlockInit.CROP_VIOLET_LEATHER_FLOWER.get())
               .add(BlockInit.CROP_WHITE_ANEMONE.get())
               .add(BlockInit.CROP_WHITE_SAGE.get())
               .add(BlockInit.CROP_YELLOW_DAFFODIL.get())
               .add(BlockInit.CROP_YELLOW_TULIP.get())
               .add(BlockInit.CROP_LIME_CARNATION.get())
               .add(BlockInit.CROP_PURPLE_TULIP_CYCLIC.get())
               .add(BlockInit.CROP_ABSALON_TULIP.get());
    }

    @Override
    public String getName() {
        return "FlowerSeeds Tags";
    }
}