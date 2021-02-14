package net.codersdownunder.flowerseeds.utils;

import java.nio.file.Path;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.config.ModConfig.Reloading;


public class FlowerSeedsConfig {
		
		public static final String Flowers = "Flower Seeds";
		
		public static ForgeConfigSpec.BooleanValue dandelionseed;
		public static ForgeConfigSpec.BooleanValue poppyseed;
		public static ForgeConfigSpec.BooleanValue orchidseed;
		public static ForgeConfigSpec.BooleanValue alliumseed;
		public static ForgeConfigSpec.BooleanValue azureseed;
		public static ForgeConfigSpec.BooleanValue tulip_redseed;
		public static ForgeConfigSpec.BooleanValue tulip_orangeseed;
		public static ForgeConfigSpec.BooleanValue tulip_whiteseed;
		public static ForgeConfigSpec.BooleanValue tulip_pinkseed;
		public static ForgeConfigSpec.BooleanValue oxeyeseed;
		public static ForgeConfigSpec.BooleanValue lilyseed;
		public static ForgeConfigSpec.BooleanValue witherroseseed;
		public static ForgeConfigSpec.BooleanValue cornflowerseed;
		
		
		//Placeholder for 1.17
		//public static ForgeConfigSpec.BooleanValue SpawnEggGlowSquid;
		//public static ForgeConfigSpec.BooleanValue SpawnEggAxolotl;

		public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
		{
			server.push(Flowers);
			dandelionseed = server.comment("Dandelion Seed Recipe").define("dandelionseed", true);
			poppyseed = server.comment("Poppy Seed Recipe").define("poppyseed", true);
			orchidseed = server.comment("Blue Orchid Seed Recipe").define("orchidseed", true);
			alliumseed = server.comment("Allium Seed Recipe").define("alliumseed", true);
			azureseed = server.comment("Azure Bluet Seed Recipe").define("azureseed", true);
			tulip_redseed = server.comment("Red Tulip Seed Recipe").define("tulip_redseed", true);
			tulip_orangeseed = server.comment("Orange Tulip Seed Recipe").define("tulip_orangeseed", true);
			tulip_whiteseed = server.comment("White Tulip Seed Recipe").define("tulip_whiteseed", true);
			tulip_pinkseed = server.comment("Pink Tulip Seed Recipe").define("tulip_pinkseed", true);
			oxeyeseed = server.comment("Oxeye Daisy Seed Recipe").define("oxeyeseed", true);
			lilyseed = server.comment("Lily of The Valley Seed Recipe").define("lilyseed", true);
			witherroseseed = server.comment("Wither Rose Seed Recipe").define("witherroseseed", false);
			cornflowerseed = server.comment("CornFlower Seed Recipe").define("cornflowerseed", true);
			server.pop();
			

		}
		
		private static void refreshClientConfig() {
			
			
	      // FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_COBBLESTONE, FlowerSeedsModFlags.getFlag(FlowerSeedsModFlags.FLAG_COBBLESTONE) && Cobblestone.get());
		}
		
	    public static void loadConfig(ForgeConfigSpec spec, Path path) {

	        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
	                .sync()
	                .autosave()
	                .writingMode(WritingMode.REPLACE)
	                .build();

	        configData.load();
	        refreshClientConfig();
	        spec.setConfig(configData);
	        
	    }

	    @SubscribeEvent
	    public static void onLoad(final ModConfig.Loading configEvent) {
	    	refreshClientConfig();
	    }

	    @SubscribeEvent
	    public static void onReload(final Reloading configEvent) {
	    	refreshClientConfig();
	    }

	}
