package net.codersdownunder.flowerseeds;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.codersdownunder.flowerseeds.init.BlockInit;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.codersdownunder.flowerseeds.utils.ConfigManager;
import net.codersdownunder.flowerseeds.utils.FlowerSeedsConfig;
import net.codersdownunder.flowerseeds.utils.flags.FlowerSeedsModFlags;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(FlowerSeeds.MODID)
public class FlowerSeeds
{
    
	public static final String MODID = "flowerseeds";
	public static final ItemGroup creativetab = new FlowerSeedsCreativeTab();
	
    @SuppressWarnings("unused")
	public static final Logger LOGGER = LogManager.getLogger();

    public FlowerSeeds() {
        
    	ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ConfigManager.SERVER);

    	
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        
        ConfigManager.loadConfig(ConfigManager.SERVER,
				FMLPaths.CONFIGDIR.get().resolve(MODID + ".toml").toString());
        
        
        registerFlags();
        
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void registerFlags() {
    	
    	//Cobble/Stone/Obsidian
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_DANDELION, FlowerSeedsConfig.dandelionseed.get());
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_POPPY, FlowerSeedsConfig.poppyseed.get());
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_ORCHID, FlowerSeedsConfig.orchidseed.get());
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_ALLIUM, FlowerSeedsConfig.alliumseed.get());
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_AZURE, FlowerSeedsConfig.azureseed.get());
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_TULIP_RED, FlowerSeedsConfig.tulip_redseed.get());
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_TULIP_ORANGE, FlowerSeedsConfig.tulip_orangeseed.get());
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_TULIP_WHITE, FlowerSeedsConfig.tulip_whiteseed.get());
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_TULIP_PINK, FlowerSeedsConfig.tulip_pinkseed.get());
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_OXEYE, FlowerSeedsConfig.oxeyeseed.get());
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_LILY, FlowerSeedsConfig.lilyseed.get());
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_WITHERROSE, FlowerSeedsConfig.witherroseseed.get());
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_CORNFLOWER, FlowerSeedsConfig.cornflowerseed.get());
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
    
    private void clientSetup(final FMLClientSetupEvent event)
	{	
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_DANDELION.get(), RenderType.getCutout()); 
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_ALLIUM.get(), RenderType.getCutout()); 
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_AZURE.get(), RenderType.getCutout()); 
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_CORNFLOWER.get(), RenderType.getCutout()); 
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_LILY.get(), RenderType.getCutout()); 
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_ORCHID.get(), RenderType.getCutout()); 
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_OXEYE.get(), RenderType.getCutout()); 
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_POPPY.get(), RenderType.getCutout()); 
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_TULIP_ORANGE.get(), RenderType.getCutout()); 
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_TULIP_PINK.get(), RenderType.getCutout()); 
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_TULIP_RED.get(), RenderType.getCutout()); 
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_TULIP_WHITE.get(), RenderType.getCutout()); 
		RenderTypeLookup.setRenderLayer(BlockInit.CROP_WITHERROSE.get(), RenderType.getCutout()); 
		
	}
    
   
 
}
