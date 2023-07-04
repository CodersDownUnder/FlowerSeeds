package net.codersdownunder.flowerseeds.data.server.tags;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.BlockInit;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.codersdownunder.flowerseeds.utils.CompatTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

public class BYGCompatTags {

    public static class ItemTagProvider extends ItemTagsProvider {

        public ItemTagProvider(GatherDataEvent event, BlockTagsProvider blocks, PackOutput packOutput) {
            super(packOutput, event.getLookupProvider(), blocks.contentsGetter(), FlowerSeeds.MODID, event.getExistingFileHelper());
        }


        @Override
        protected void addTags(HolderLookup.@NotNull Provider provider) {

            tag(Tags.Items.SEEDS)
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
        public @NotNull String getName() {
            return "BYG Tags";
        }
    }

    public static class BlockTagProvider extends BlockTagsProvider {

        public BlockTagProvider(GatherDataEvent event, PackOutput packOutput) {
            super(packOutput, event.getLookupProvider(), FlowerSeeds.MODID, event.getExistingFileHelper());
        }

        @Override
        protected void addTags(HolderLookup.@NotNull Provider provider) {
            tag(BlockTags.CROPS)
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
                    .add(BlockInit.CROP_YELLOW_TULIP.get());
        }

        @Override
        public @NotNull String getName() {
            return "BYG Block Tags";
        }
    }
}
