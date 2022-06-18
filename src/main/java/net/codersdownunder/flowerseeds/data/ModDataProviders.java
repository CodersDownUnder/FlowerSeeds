package net.codersdownunder.flowerseeds.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataProviders {
	
	
	 @SubscribeEvent
	    public static void gatherData(GatherDataEvent event) {
	        DataGenerator generator = event.getGenerator();

	            FlowerSeedsBlockTags blockTags = new FlowerSeedsBlockTags(generator, event.getExistingFileHelper());
	            generator.addProvider(event.includeServer(), blockTags);
	            generator.addProvider(event.includeServer(), new FlowerSeedsItemTags(generator, blockTags, event.getExistingFileHelper()));
	            generator.addProvider(event.includeServer(), new FlowerSeedsRecipeProvider(generator));
	            generator.addProvider(event.includeServer(), new LootTables(generator));
	
	            //generator.addProvider(new BlockStates(generator, event.getExistingFileHelper()));
	            //generator.addProvider(new Items(generator, event.getExistingFileHelper()));
	        	generator.addProvider(event.includeClient(), new FlowerSeedsLanguageProvider(generator));
	        	
	        	//ItemModelProvider itemModels = new FlowerSeedsItemModels(generator, event.getExistingFileHelper());
	            //generator.addProvider(itemModels);    
	        
	    }
}
