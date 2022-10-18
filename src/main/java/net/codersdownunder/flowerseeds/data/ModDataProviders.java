package net.codersdownunder.flowerseeds.data;

import net.codersdownunder.flowerseeds.data.client.FlowerSeedsBlockStates;
import net.codersdownunder.flowerseeds.data.client.FlowerSeedsItemModels;
import net.codersdownunder.flowerseeds.data.client.FlowerSeedsLanguageProvider;
import net.codersdownunder.flowerseeds.data.server.FlowerSeedsBlockTags;
import net.codersdownunder.flowerseeds.data.server.FlowerSeedsItemTags;
import net.codersdownunder.flowerseeds.data.server.FlowerSeedsRecipeProvider;
import net.codersdownunder.flowerseeds.data.server.LootTables;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataProviders {
	
	
	 @SubscribeEvent
	    public static void gatherData(GatherDataEvent event) {
	        DataGenerator generator = event.getGenerator();
	        if (event.includeServer()) {
	            
	            FlowerSeedsBlockTags blockTags = new FlowerSeedsBlockTags(generator, event.getExistingFileHelper());
	            generator.addProvider(blockTags);
	            generator.addProvider(new FlowerSeedsItemTags(generator, blockTags, event.getExistingFileHelper()));
	            generator.addProvider(new FlowerSeedsRecipeProvider(generator));
	            generator.addProvider(new LootTables(generator));
	        }
	        if (event.includeClient()) {
	            generator.addProvider(new FlowerSeedsBlockStates(generator, event.getExistingFileHelper()));
	            generator.addProvider(new FlowerSeedsItemModels(generator, event.getExistingFileHelper()));
	        	generator.addProvider(new FlowerSeedsLanguageProvider(generator));
	        	//generator.addProvider(new FlowerSeedsBlockStates(generator, event.getExistingFileHelper()));
	        	
	        	//ItemModelProvider itemModels = new FlowerSeedsItemModels(generator, event.getExistingFileHelper());
	            //generator.addProvider(itemModels);    
	        }
	    }
	
}
