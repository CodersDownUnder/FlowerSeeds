package net.codersdownunder.flowerseeds;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.codersdownunder.flowerseeds.init.BlockInit;
import net.codersdownunder.flowerseeds.init.ItemInit;
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
	public static FlowerSeedsItemGroup FLOWERSEEDS_TAB;
	public static Boolean cyclicLoaded;
    public static Boolean OTBYGLoaded;
	//public static Boolean terraLoaded;
	
    @SuppressWarnings("unused")
	public static final Logger LOGGER = LogManager.getLogger();

    public FlowerSeeds() {

    	
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        
        
        ItemInit.ITEMS.register(bus);
        ItemInit.POOL_ENTRY_TYPES.register(bus);
        BlockInit.BLOCKS.register(bus);


        MinecraftForge.EVENT_BUS.register(this);
        
        
        
        FLOWERSEEDS_TAB = new FlowerSeedsItemGroup("flowerseeds");
        
        //terraLoaded = ModList.get().isLoaded("terraincognita");
        cyclicLoaded = ModList.get().isLoaded("cyclic");
        OTBYGLoaded = ModList.get().isLoaded("byg");

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
                ComposterBlock.COMPOSTABLES.put(ItemInit.LIME_CARNATION_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.PURPLE_TULIP_CYCLIC_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.ABSALON_TULIP_SEED.get(), chance);


                ComposterBlock.COMPOSTABLES.put(ItemInit.HORSEWEED_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.WINTER_SUCCULENT_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.ALPINE_BELLFLOWER_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.ANGELICA_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.HYDRANGEA_BUSH_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.BEGONIA_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.BISTORT_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.BLUE_SAGE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.CALIFORNIA_POPPY_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.CROCUS_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.BLACK_ROSE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.CYAN_ROSE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.CYAN_TULIP_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.DAFFODIL_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.FIRECRACKER_FLOWER_BUSH_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.GREEN_TULIP_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.GUZMANIA_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.INCAN_LILY_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.IRIS_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.JAPANESE_ORCHID_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.KOVAN_FLOWER_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.LAZARUS_BELLFLOWER_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.LOLLIPOP_FLOWER_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.MAGENTA_TULIP_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.ORANGE_DAISY_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.OSIRIA_ROSE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.PEACH_LEATHER_FLOWER_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.PINK_ALLIUM_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.PINK_ANEMONE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.PINK_DAFFODIL_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.PROTEA_FLOWER_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.PURPLE_SAGE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.PURPLE_TULIP_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.RICHEA_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.ROSE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.SILVER_VASE_FLOWER_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.TORCH_GINGER_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.VIOLET_LEATHER_FLOWER_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.WHITE_ANEMONE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.WHITE_SAGE_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.YELLOW_DAFFODIL_SEED.get(), chance);
                ComposterBlock.COMPOSTABLES.put(ItemInit.YELLOW_TULIP_SEED.get(), chance);



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
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_ABSALON_TULIP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_PURPLE_TULIP_CYCLIC.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_LIME_CARNATION.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_HORSEWEED.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_WINTER_SUCCULENT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_ALPINE_BELLFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_ANGELICA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_HYDRANGEA_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_BEGONIA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_BISTORT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_BLUE_SAGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_CALIFORNIA_POPPY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_CROCUS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_BLACK_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_CYAN_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_CYAN_TULIP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_DAFFODIL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_FIRECRACKER_FLOWER_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_GREEN_TULIP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_GUZMANIA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_INCAN_LILY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_IRIS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_JAPANESE_ORCHID.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_KOVAN_FLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_LAZARUS_BELLFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_LOLLIPOP_FLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_MAGENTA_TULIP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_ORANGE_DAISY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_OSIRIA_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_PEACH_LEATHER_FLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_PINK_ALLIUM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_PINK_ANEMONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_PINK_DAFFODIL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_PROTEA_FLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_PURPLE_SAGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_PURPLE_TULIP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_RICHEA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_SILVER_VASE_FLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_TORCH_GINGER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_VIOLET_LEATHER_FLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_WHITE_ANEMONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_WHITE_SAGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_YELLOW_DAFFODIL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CROP_YELLOW_TULIP.get(), RenderType.cutout());

    }

 
}
