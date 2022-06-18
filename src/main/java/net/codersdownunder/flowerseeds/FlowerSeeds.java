package net.codersdownunder.flowerseeds;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.codersdownunder.flowerseeds.init.BlockInit;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.codersdownunder.flowerseeds.utils.flags.FlowerSeedsModFlags;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FlowerSeeds.MODID)
public class FlowerSeeds
{
    

	
	public static final String MODID = "flowerseeds";
	public static FlowerSeedsItemGroup FLOWERSEEDS_ITEM_GROUP;
	public static Boolean cyclicLoaded;
	public static Boolean terraLoaded;
	
    @SuppressWarnings("unused")
	public static final Logger LOGGER = LogManager.getLogger();

    public FlowerSeeds() {
        
    	//ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ConfigManager.SERVER);

    	
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        
        
        ItemInit.ITEMS.register(bus);
        ItemInit.POOL_ENTRY_TYPES.register(bus);
        BlockInit.BLOCKS.register(bus);
        
        
        //ConfigManager.loadConfig(ConfigManager.SERVER,
		//		FMLPaths.CONFIGDIR.get().resolve(MODID + ".toml").toString());
        
        
        //MinecraftForge.EVENT_BUS.register(new FlowerSpawnHandler());
        MinecraftForge.EVENT_BUS.register(this);
        
        
        
        FLOWERSEEDS_ITEM_GROUP = new FlowerSeedsItemGroup("flowerseeds");
        
        terraLoaded = ModList.get().isLoaded("terraincognita");
        cyclicLoaded = ModList.get().isLoaded("cyclic");
        
        registerFlags();
    }
    
   
    
    private void registerFlags() {
    	
    	//Cobble/Stone/Obsidian
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_DANDELION, true);
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_POPPY, true);
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_ORCHID, true);
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_ALLIUM, true);
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_AZURE, true);
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_TULIP_RED, true);
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_TULIP_ORANGE, true);
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_TULIP_WHITE, true);
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_TULIP_PINK, true);
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_OXEYE, true);
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_LILY, true);
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_WITHERROSE, true);
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_CORNFLOWER, true);
    	
    	//Cyclic
    	FlowerSeedsModFlags.setFlag(FlowerSeedsModFlags.FLAG_CYANROSE, cyclicLoaded ? true : false);
    	

    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    	
    	
    	event.enqueueWork(() -> {
            // CROPS
            {
                float chance = 0.3F;

                ComposterBlock.COMPOSTABLES.put(ItemInit.ALLIUM_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.AZURE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.CORNFLOWER_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.DANDELION_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.LILY_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.ORCHID_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.OXEYE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.POPPY_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.TULIP_ORANGE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.TULIP_PINK_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.TULIP_RED_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.TULIP_WHITE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.WITHERROSE_SEED.get(), chance);
                
                //Cyclic Support
                ComposterBlock.COMPOSTABLES.put(ItemInit.CYANROSE_SEED.get(), chance);
                
               


            }
    	});
    }
    
    private void clientSetup(final FMLClientSetupEvent event)
	{	
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_DANDELION.get(), RenderType.cutout()); 
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_ALLIUM.get(), RenderType.cutout()); 
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_AZURE.get(), RenderType.cutout()); 
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_CORNFLOWER.get(), RenderType.cutout()); 
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_LILY.get(), RenderType.cutout()); 
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_ORCHID.get(), RenderType.cutout()); 
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_OXEYE.get(), RenderType.cutout()); 
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_POPPY.get(), RenderType.cutout()); 
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_TULIP_ORANGE.get(), RenderType.cutout()); 
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_TULIP_PINK.get(), RenderType.cutout()); 
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_TULIP_RED.get(), RenderType.cutout()); 
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_TULIP_WHITE.get(), RenderType.cutout()); 
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_WITHERROSE.get(), RenderType.cutout());
		
		//Cyclic
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_CYANROSE.get(), RenderType.cutout());
	

		
	}

 
}
