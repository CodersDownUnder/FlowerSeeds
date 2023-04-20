package net.codersdownunder.flowerseeds.data;

import net.codersdownunder.flowerseeds.data.client.FlowerSeedsBlockStates;
import net.codersdownunder.flowerseeds.data.client.FlowerSeedsItemModels;
import net.codersdownunder.flowerseeds.data.client.lang.FlowerSeedsEN_US;
import net.codersdownunder.flowerseeds.data.client.lang.FlowerSeedsUK_UA;
import net.codersdownunder.flowerseeds.data.server.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

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
	            generator.addProvider(event.includeClient(), new FlowerSeedsBlockStates(generator, event.getExistingFileHelper()));
	            generator.addProvider(event.includeClient(), new FlowerSeedsItemModels(generator, event.getExistingFileHelper()));
	        	generator.addProvider(event.includeClient(), new FlowerSeedsEN_US(generator));
		 		generator.addProvider(event.includeClient(), new FlowerSeedsUK_UA(generator));


	    }
	
}
