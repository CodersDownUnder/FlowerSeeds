//package net.codersdownunder.flowerseeds.data;
//
//import net.codersdownunder.flowerseeds.FlowerSeeds;
//import net.codersdownunder.flowerseeds.blocks.SingleCropBlock;
//import net.codersdownunder.flowerseeds.init.BlockInit;
//import net.minecraft.data.DataGenerator;
//import net.minecraftforge.client.model.generators.BlockStateProvider;
//import net.minecraftforge.client.model.generators.ConfiguredModel;
//import net.minecraftforge.client.model.generators.ModelFile;
//import net.minecraftforge.common.data.ExistingFileHelper;
//
//public class FlowerSeedsBlockStates extends BlockStateProvider {
//
//    public FlowerSeedsBlockStates(DataGenerator gen, ExistingFileHelper helper) {
//        super(gen, FlowerSeeds.MODID, helper);
//    }
//
//    @Override
//    protected void registerStatesAndModels() {
//    	
//    	mcFlowerCrop((SingleCropBlock) BlockInit.CROP_ALLIUM.get(), "allium", "allium");
//    	
//    }
//    
//    public void mcFlowerCrop(SingleCropBlock block, String name, String texture) {
//        
//    	ModelFile stage0 = models().singleTexture(name, modLoc("block/flower_stage_0"), "flower", mcLoc("block/" + texture));
//    	ModelFile stage1 = models().singleTexture(name, modLoc("block/flower_stage_1"), "flower", mcLoc("block/" + texture));
//    	ModelFile stage2 = models().singleTexture(name, modLoc("block/flower_stage_2"), "flower", mcLoc("block/" + texture));
//    	ModelFile stage3 = models().singleTexture(name, modLoc("block/flower_stage_3"), "flower", mcLoc("block/" + texture));
//  
//        getVariantBuilder(block)
//        .forAllStates(state -> ConfiguredModel.builder()
//        		.modelFile(state.)
////                .partialState()
////                .with(SingleCropBlock.AGE, 0)
////                .modelForState()
////                .modelFile(stage0)
////                .addModel()
////                .partialState()
////                .with(SingleCropBlock.AGE, 1)
////                .modelForState()
////                .modelFile(stage0)
////                .addModel()
////                .partialState()
////                .with(SingleCropBlock.AGE, 2)
////                .modelForState()
////                .modelFile(stage1)
////                .addModel()
////                .partialState()
////                .with(SingleCropBlock.AGE, 3)
////                .modelForState()
////                .modelFile(stage1)
////                .addModel()
////                .partialState()
////                .with(SingleCropBlock.AGE, 4)
////                .modelForState()
////                .modelFile(stage1)
////                .addModel()
////                .partialState()
////                .with(SingleCropBlock.AGE, 5)
////                .modelForState()
////                .modelFile(stage2)
////                .addModel()
////                .partialState()
////                .with(SingleCropBlock.AGE, 6)
////                .modelForState()
////                .modelFile(stage2)
////                .addModel()
////                .partialState()
////                .with(SingleCropBlock.AGE, 7)
////                .modelForState()
////                .modelFile(stage3)
//                );
//        
//    }
//    
//}