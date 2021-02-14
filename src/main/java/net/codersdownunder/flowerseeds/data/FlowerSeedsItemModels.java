package net.codersdownunder.flowerseeds.data;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FlowerSeedsItemModels extends ItemModelProvider {

	public FlowerSeedsItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, FlowerSeeds.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		
		//cropmodel("allium");
		//cropmodel("poppy");
		//cropmodel("orchid");
		//cropmodel("azure");
		//cropmodel("tulip_red");
		//cropmodel("tulip_white");
		//cropmodel("tulip_orange");
		//cropmodel("tulip_pink");
		//cropmodel("oxeye");
		//cropmodel("cornflower");
		//cropmodel("lily");
		//cropmodel("witherrose");
		
	}
	
	public void cropmodel(String name) {
		cropmodel1(name);
		cropmodel2(name);
		cropmodel3(name);
		cropmodel4(name);
	}

	public ItemModelBuilder cropmodel1(String name) {
        	
		return getBuilder(name + "_stage0")
            .parent(getExistingFile(mcLoc("block/crop")))
            .texture("crop", "flowerseeds:blocks/dandelion_stage0");
        	
        }
	
	public ItemModelBuilder cropmodel2(String name) {
    	
		return getBuilder(name + "_stage1")
            .parent(getExistingFile(mcLoc("block/crop")))
            .texture("crop", "flowerseeds:blocks/dandelion_stage1");
        	
        }
	
	public ItemModelBuilder cropmodel3(String name) {
    	
		return getBuilder(name + "_stage2")
            .parent(getExistingFile(mcLoc("block/crop")))
            .texture("crop", "flowerseeds:blocks/dandelion_stage2");
        	
        }
	
	public ItemModelBuilder cropmodel4(String name) {
    	
		return getBuilder(name + "_stage3")
            .parent(getExistingFile(mcLoc("block/crop")))
            .texture("crop", "flowerseeds:blocks/" + name + "_stage3");
        	
        }

}