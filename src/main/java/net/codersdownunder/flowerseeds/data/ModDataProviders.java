package net.codersdownunder.flowerseeds.data;

import com.google.common.collect.ImmutableMap;
import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.data.client.FlowerSeedsBlockStates;
import net.codersdownunder.flowerseeds.data.client.FlowerSeedsItemModels;
import net.codersdownunder.flowerseeds.data.client.lang.FlowerSeedsEN_US;
import net.codersdownunder.flowerseeds.data.client.lang.FlowerSeedsUK_UA;
import net.codersdownunder.flowerseeds.data.server.*;
import net.codersdownunder.flowerseeds.data.server.tags.BYGCompatTags;
import net.codersdownunder.flowerseeds.events.AddonLoader;
import net.minecraft.DetectedVersion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.server.packs.PackType.CLIENT_RESOURCES;
import static net.minecraft.server.packs.PackType.SERVER_DATA;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataProviders {
	
	
	 @SubscribeEvent
	    public static void gatherData(GatherDataEvent event) {
		 DataGenerator generator = event.getGenerator();
		 PackOutput packOutput = event.getGenerator().getPackOutput();
		 CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

	            FlowerSeedsBlockTags blockTags = new FlowerSeedsBlockTags(event);
				generator.addProvider(true, PackMetaGenerator.create(packOutput, "FlowerSeeds Resource and Datapack"));
	            generator.addProvider(event.includeServer(), blockTags);
	            generator.addProvider(event.includeServer(), new FlowerSeedsItemTags(event, blockTags));
	            generator.addProvider(event.includeServer(), new FlowerSeedsRecipeProvider(packOutput));
		 		generator.addProvider(true, LootTables.create(packOutput));
	            generator.addProvider(event.includeClient(), new FlowerSeedsBlockStates(packOutput, event.getExistingFileHelper()));
	            generator.addProvider(event.includeClient(), new FlowerSeedsItemModels(packOutput, event.getExistingFileHelper()));
	        	generator.addProvider(event.includeClient(), new FlowerSeedsEN_US(packOutput));
		 		generator.addProvider(event.includeClient(), new FlowerSeedsUK_UA(packOutput));

		 		final Path path = ModList.get().getModFileById(FlowerSeeds.MODID).getFile().findResource("/" + AddonLoader.OTBYG_PACK_NAME);
				 PackOutput packOutput2 = new PackOutput(path);
				 //generator.addProvider(true, PackMetaGenerator.createServer(packOutput2, "FlowerSeeds BYG Compat Data Pack"));
				 BYGCompatTags.BlockTagProvider blockTagsBYG = new BYGCompatTags.BlockTagProvider(event, packOutput2);
				 generator.addProvider(event.includeServer(), new BYGCompatTags.ItemTagProvider(event, blockTagsBYG, packOutput2));
				 generator.addProvider(event.includeServer(), blockTagsBYG);


	    }
	
}
