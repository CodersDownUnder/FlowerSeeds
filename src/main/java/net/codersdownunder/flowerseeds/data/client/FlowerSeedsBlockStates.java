package net.codersdownunder.flowerseeds.data.client;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.blocks.SingleCropBlock;
import net.codersdownunder.flowerseeds.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class FlowerSeedsBlockStates extends BlockStateProvider {

    public FlowerSeedsBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, FlowerSeeds.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

    	makeCrop((SingleCropBlock) BlockInit.CROP_ALLIUM.get(), "minecraft", "allium");
        makeCrop((SingleCropBlock) BlockInit.CROP_AZURE.get(), "minecraft", "azure_bluet");
        makeCrop((SingleCropBlock) BlockInit.CROP_CORNFLOWER.get(), "minecraft", "cornflower");
        makeCrop((SingleCropBlock) BlockInit.CROP_ORCHID.get(), "minecraft", "blue_orchid");
        makeCrop((SingleCropBlock) BlockInit.CROP_LILY.get(), "minecraft", "lily_of_the_valley");
        makeCrop((SingleCropBlock) BlockInit.CROP_POPPY.get(), "minecraft", "poppy");
        makeCrop((SingleCropBlock) BlockInit.CROP_DANDELION.get(), "minecraft", "dandelion");
        makeCrop((SingleCropBlock) BlockInit.CROP_OXEYE.get(), "minecraft", "oxeye_daisy");
        makeCrop((SingleCropBlock) BlockInit.CROP_TULIP_ORANGE.get(), "minecraft", "orange_tulip");
        makeCrop((SingleCropBlock) BlockInit.CROP_TULIP_PINK.get(), "minecraft", "pink_tulip");
        makeCrop((SingleCropBlock) BlockInit.CROP_TULIP_RED.get(), "minecraft", "red_tulip");
        makeCrop((SingleCropBlock) BlockInit.CROP_TULIP_WHITE.get(), "minecraft", "white_tulip");
        makeCrop((SingleCropBlock) BlockInit.CROP_WITHERROSE.get(), "minecraft", "wither_rose");

        makeCompatCrop((SingleCropBlock) BlockInit.CROP_CYANROSE.get(), "cyclic", "blocks/flower_cyan");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_LIME_CARNATION.get(), "cyclic", "blocks/flower_lime_carnation");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_PURPLE_TULIP_CYCLIC.get(), "cyclic", "blocks/flower_purple_tulip");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_ABSALON_TULIP.get(), "cyclic", "blocks/flower_absalon_tulip");

        makeCompatCrop((SingleCropBlock) BlockInit.CROP_HORSEWEED.get(), "byg", "block/horseweed");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_WINTER_SUCCULENT.get(), "byg", "block/winter_succulent");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_ALPINE_BELLFLOWER.get(), "byg", "block/alpine_bellflower");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_ANGELICA.get(), "byg", "block/angelica");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_HYDRANGEA_BUSH.get(), "byg", "block/hydrangea_bush");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_BEGONIA.get(), "byg", "block/begonia");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_BISTORT.get(), "byg", "block/bistort");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_BLUE_SAGE.get(), "byg", "block/blue_sage");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_CALIFORNIA_POPPY.get(), "byg", "block/california_poppy");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_CROCUS.get(), "byg", "block/crocus");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_BLACK_ROSE.get(), "byg", "block/black_rose");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_CYAN_ROSE.get(), "byg", "block/cyan_rose");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_CYAN_TULIP.get(), "byg", "block/cyan_tulip");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_DAFFODIL.get(), "byg", "block/daffodil");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_FIRECRACKER_FLOWER_BUSH.get(), "byg", "block/firecracker_flower_bush");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_GREEN_TULIP.get(), "byg", "block/green_tulip");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_GUZMANIA.get(), "byg", "block/guzmania");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_INCAN_LILY.get(), "byg", "block/incan_lily");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_IRIS.get(), "byg", "block/iris");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_JAPANESE_ORCHID.get(), "byg", "block/japanese_orchid");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_KOVAN_FLOWER.get(), "byg", "block/kovan_flower");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_LAZARUS_BELLFLOWER.get(), "byg", "block/lazarus_bellflower");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_LOLLIPOP_FLOWER.get(), "byg", "block/lollipop_flower");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_MAGENTA_TULIP.get(), "byg", "block/magenta_tulip");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_ORANGE_DAISY.get(), "byg", "block/orange_daisy");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_OSIRIA_ROSE.get(), "byg", "block/osiria_rose");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_PEACH_LEATHER_FLOWER.get(), "byg", "block/peach_leather_flower");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_PINK_ALLIUM.get(), "byg", "block/pink_allium");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_PINK_ANEMONE.get(), "byg", "block/pink_anemone");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_PINK_DAFFODIL.get(), "byg", "block/pink_daffodil");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_PROTEA_FLOWER.get(), "byg", "block/protea_flower");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_PURPLE_SAGE.get(), "byg", "block/purple_sage");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_PURPLE_TULIP.get(), "byg", "block/purple_tulip");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_RICHEA.get(), "byg", "block/richea");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_ROSE.get(), "byg", "block/rose");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_SILVER_VASE_FLOWER.get(), "byg", "block/silver_vase_flower");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_TORCH_GINGER.get(), "byg", "block/torch_ginger");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_VIOLET_LEATHER_FLOWER.get(), "byg", "block/violet_leather_flower");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_WHITE_ANEMONE.get(), "byg", "block/white_anemone");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_WHITE_SAGE.get(), "byg", "block/white_sage");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_YELLOW_DAFFODIL.get(), "byg", "block/yellow_daffodil");
        makeCompatCrop((SingleCropBlock) BlockInit.CROP_YELLOW_TULIP.get(), "byg", "block/yellow_tulip");


    }

    public void makeCompatCrop(CropBlock block, String modid, String textureName) {

        String blockName = ForgeRegistries.BLOCKS.getKey(block).getPath();

        ModelFile stage_0 = models().withExistingParent(blockName + "_stage_0", modLoc("block/flower_stage_0"))
                .texture("texture",  new ResourceLocation(modid, textureName)).renderType("minecraft:cutout_mipped");
        ModelFile stage_1 = models().withExistingParent(blockName + "_stage_1", modLoc("block/flower_stage_1"))
                .texture("texture",  new ResourceLocation(modid, textureName)).renderType("minecraft:cutout_mipped");
        ModelFile stage_2 = models().withExistingParent(blockName + "_stage_2", modLoc("block/flower_stage_2"))
                .texture("texture",  new ResourceLocation(modid, textureName)).renderType("minecraft:cutout_mipped");
        ModelFile stage_3 = models().withExistingParent(blockName + "_stage_3", modLoc("block/flower_stage_3"))
                .texture("texture",  new ResourceLocation(modid, textureName)).renderType("minecraft:cutout_mipped");

        getVariantBuilder(block)
                .partialState()
                .with(SingleCropBlock.AGE, 0)
                .modelForState()
                .modelFile(stage_0)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 1)
                .modelForState()
                .modelFile(stage_0)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 2)
                .modelForState()
                .modelFile(stage_1)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 3)
                .modelForState()
                .modelFile(stage_1)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 4)
                .modelForState()
                .modelFile(stage_1)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 5)
                .modelForState()
                .modelFile(stage_2)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 6)
                .modelForState()
                .modelFile(stage_2)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 7)
                .modelForState()
                .modelFile(stage_3)
                .addModel();
    }

    public void makeCrop(CropBlock block, String modid, String textureName) {

        String blockName = ForgeRegistries.BLOCKS.getKey(block).getPath();

        ModelFile stage_0 = models().withExistingParent(blockName + "_stage_0", modLoc("block/flower_stage_0"))
                .texture("texture",  new ResourceLocation(modid, "block/" + textureName)).renderType("minecraft:cutout_mipped");
        ModelFile stage_1 = models().withExistingParent(blockName + "_stage_1", modLoc("block/flower_stage_1"))
                .texture("texture",  new ResourceLocation(modid, "block/" + textureName)).renderType("minecraft:cutout_mipped");
        ModelFile stage_2 = models().withExistingParent(blockName + "_stage_2", modLoc("block/flower_stage_2"))
                .texture("texture",  new ResourceLocation(modid, "block/" + textureName)).renderType("minecraft:cutout_mipped");
        ModelFile stage_3 = models().withExistingParent(blockName + "_stage_3", modLoc("block/flower_stage_3"))
                .texture("texture",  new ResourceLocation(modid, "block/" + textureName)).renderType("minecraft:cutout_mipped");

        getVariantBuilder(block)
                .partialState()
                .with(SingleCropBlock.AGE, 0)
                .modelForState()
                .modelFile(stage_0)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 1)
                .modelForState()
                .modelFile(stage_0)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 2)
                .modelForState()
                .modelFile(stage_1)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 3)
                .modelForState()
                .modelFile(stage_1)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 4)
                .modelForState()
                .modelFile(stage_1)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 5)
                .modelForState()
                .modelFile(stage_2)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 6)
                .modelForState()
                .modelFile(stage_2)
                .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 7)
                .modelForState()
                .modelFile(stage_3)
                .addModel();
    }

}