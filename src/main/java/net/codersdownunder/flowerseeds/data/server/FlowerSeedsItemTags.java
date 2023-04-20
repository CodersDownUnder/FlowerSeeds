package net.codersdownunder.flowerseeds.data.server;


import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.codersdownunder.flowerseeds.utils.CompatTags;
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

        tag(Tags.Items.SEEDS)
                .add(ItemInit.ALLIUM_SEED.get())
                .add(ItemInit.AZURE_SEED.get())
                .add(ItemInit.CORNFLOWER_SEED.get())
                .add(ItemInit.DANDELION_SEED.get())
                .add(ItemInit.LILY_SEED.get())
                .add(ItemInit.ORCHID_SEED.get())
                .add(ItemInit.OXEYE_SEED.get())
                .add(ItemInit.POPPY_SEED.get())
                .add(ItemInit.TULIP_ORANGE_SEED.get())
                .add(ItemInit.TULIP_PINK_SEED.get())
                .add(ItemInit.TULIP_RED_SEED.get())
                .add(ItemInit.TULIP_WHITE_SEED.get())
                .add(ItemInit.WITHERROSE_SEED.get())
                .addOptionalTag(CompatTags.Items.CYCLIC_SEEDS.location())
                .addOptionalTag(CompatTags.Items.BYG_SEEDS.location());

        tag(CompatTags.Items.CYCLIC_SEEDS)
                .add(ItemInit.CYANROSE_SEED.get())
                .add(ItemInit.ABSALON_TULIP_SEED.get())
                .add(ItemInit.PURPLE_TULIP_CYCLIC_SEED.get())
                .add(ItemInit.LIME_CARNATION_SEED.get());

        tag(CompatTags.Items.BYG_SEEDS)
                .add(ItemInit.HORSEWEED_SEED.get())
                .add(ItemInit.WINTER_SUCCULENT_SEED.get())
                .add(ItemInit.ALPINE_BELLFLOWER_SEED.get())
                .add(ItemInit.ANGELICA_SEED.get())
                .add(ItemInit.HYDRANGEA_BUSH_SEED.get())
                .add(ItemInit.BEGONIA_SEED.get())
                .add(ItemInit.BISTORT_SEED.get())
                .add(ItemInit.BLUE_SAGE_SEED.get())
                .add(ItemInit.CALIFORNIA_POPPY_SEED.get())
                .add(ItemInit.CROCUS_SEED.get())
                .add(ItemInit.BLACK_ROSE_SEED.get())
                .add(ItemInit.CYAN_ROSE_SEED.get())
                .add(ItemInit.CYAN_TULIP_SEED.get())
                .add(ItemInit.DAFFODIL_SEED.get())
                .add(ItemInit.FIRECRACKER_FLOWER_BUSH_SEED.get())
                .add(ItemInit.GREEN_TULIP_SEED.get())
                .add(ItemInit.GUZMANIA_SEED.get())
                .add(ItemInit.INCAN_LILY_SEED.get())
                .add(ItemInit.IRIS_SEED.get())
                .add(ItemInit.JAPANESE_ORCHID_SEED.get())
                .add(ItemInit.KOVAN_FLOWER_SEED.get())
                .add(ItemInit.LAZARUS_BELLFLOWER_SEED.get())
                .add(ItemInit.LOLLIPOP_FLOWER_SEED.get())
                .add(ItemInit.MAGENTA_TULIP_SEED.get())
                .add(ItemInit.ORANGE_DAISY_SEED.get())
                .add(ItemInit.OSIRIA_ROSE_SEED.get())
                .add(ItemInit.PEACH_LEATHER_FLOWER_SEED.get())
                .add(ItemInit.PINK_ALLIUM_SEED.get())
                .add(ItemInit.PINK_ANEMONE_SEED.get())
                .add(ItemInit.PINK_DAFFODIL_SEED.get())
                .add(ItemInit.PROTEA_FLOWER_SEED.get())
                .add(ItemInit.PURPLE_SAGE_SEED.get())
                .add(ItemInit.PURPLE_TULIP_SEED.get())
                .add(ItemInit.RICHEA_SEED.get())
                .add(ItemInit.ROSE_SEED.get())
                .add(ItemInit.SILVER_VASE_FLOWER_SEED.get())
                .add(ItemInit.TORCH_GINGER_SEED.get())
                .add(ItemInit.VIOLET_LEATHER_FLOWER_SEED.get())
                .add(ItemInit.WHITE_ANEMONE_SEED.get())
                .add(ItemInit.WHITE_SAGE_SEED.get())
                .add(ItemInit.YELLOW_DAFFODIL_SEED.get())
                .add(ItemInit.YELLOW_TULIP_SEED.get());

        tag(Tags.Items.CROPS)
                .add(ItemInit.ALLIUM_SEED.get())
                .add(ItemInit.AZURE_SEED.get())
                .add(ItemInit.CORNFLOWER_SEED.get())
                .add(ItemInit.DANDELION_SEED.get())
                .add(ItemInit.LILY_SEED.get())
                .add(ItemInit.ORCHID_SEED.get())
                .add(ItemInit.OXEYE_SEED.get())
                .add(ItemInit.POPPY_SEED.get())
                .add(ItemInit.TULIP_ORANGE_SEED.get())
                .add(ItemInit.TULIP_PINK_SEED.get())
                .add(ItemInit.TULIP_RED_SEED.get())
                .add(ItemInit.TULIP_WHITE_SEED.get())
                .add(ItemInit.WITHERROSE_SEED.get())
                .addOptionalTag(CompatTags.Items.CYCLIC_CROPS.location())
                .addOptionalTag(CompatTags.Items.BYG_CROPS.location());

        tag(CompatTags.Items.CYCLIC_CROPS)
                .add(ItemInit.CYANROSE_SEED.get())
                .add(ItemInit.ABSALON_TULIP_SEED.get())
                .add(ItemInit.PURPLE_TULIP_CYCLIC_SEED.get())
                .add(ItemInit.LIME_CARNATION_SEED.get());

        tag(CompatTags.Items.BYG_CROPS)
                .add(ItemInit.HORSEWEED_SEED.get())
                .add(ItemInit.WINTER_SUCCULENT_SEED.get())
                .add(ItemInit.ALPINE_BELLFLOWER_SEED.get())
                .add(ItemInit.ANGELICA_SEED.get())
                .add(ItemInit.HYDRANGEA_BUSH_SEED.get())
                .add(ItemInit.BEGONIA_SEED.get())
                .add(ItemInit.BISTORT_SEED.get())
                .add(ItemInit.BLUE_SAGE_SEED.get())
                .add(ItemInit.CALIFORNIA_POPPY_SEED.get())
                .add(ItemInit.CROCUS_SEED.get())
                .add(ItemInit.BLACK_ROSE_SEED.get())
                .add(ItemInit.CYAN_ROSE_SEED.get())
                .add(ItemInit.CYAN_TULIP_SEED.get())
                .add(ItemInit.DAFFODIL_SEED.get())
                .add(ItemInit.FIRECRACKER_FLOWER_BUSH_SEED.get())
                .add(ItemInit.GREEN_TULIP_SEED.get())
                .add(ItemInit.GUZMANIA_SEED.get())
                .add(ItemInit.INCAN_LILY_SEED.get())
                .add(ItemInit.IRIS_SEED.get())
                .add(ItemInit.JAPANESE_ORCHID_SEED.get())
                .add(ItemInit.KOVAN_FLOWER_SEED.get())
                .add(ItemInit.LAZARUS_BELLFLOWER_SEED.get())
                .add(ItemInit.LOLLIPOP_FLOWER_SEED.get())
                .add(ItemInit.MAGENTA_TULIP_SEED.get())
                .add(ItemInit.ORANGE_DAISY_SEED.get())
                .add(ItemInit.OSIRIA_ROSE_SEED.get())
                .add(ItemInit.PEACH_LEATHER_FLOWER_SEED.get())
                .add(ItemInit.PINK_ALLIUM_SEED.get())
                .add(ItemInit.PINK_ANEMONE_SEED.get())
                .add(ItemInit.PINK_DAFFODIL_SEED.get())
                .add(ItemInit.PROTEA_FLOWER_SEED.get())
                .add(ItemInit.PURPLE_SAGE_SEED.get())
                .add(ItemInit.PURPLE_TULIP_SEED.get())
                .add(ItemInit.RICHEA_SEED.get())
                .add(ItemInit.ROSE_SEED.get())
                .add(ItemInit.SILVER_VASE_FLOWER_SEED.get())
                .add(ItemInit.TORCH_GINGER_SEED.get())
                .add(ItemInit.VIOLET_LEATHER_FLOWER_SEED.get())
                .add(ItemInit.WHITE_ANEMONE_SEED.get())
                .add(ItemInit.WHITE_SAGE_SEED.get())
                .add(ItemInit.YELLOW_DAFFODIL_SEED.get())
                .add(ItemInit.YELLOW_TULIP_SEED.get());

    }

    @Override
    public String getName() {
        return "Flower Seeds Tags";
    }
}