//package net.codersdownunder.flowerseeds.utils.flags;
//
//import javax.annotation.Nonnull;
//
//import net.codersdownunder.flowerseeds.FlowerSeeds;
//import net.codersdownunder.flowerseeds.loot.TerraIncognitaModifier;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
//import net.minecraftforge.event.RegistryEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//
//@Mod.EventBusSubscriber
//public class EventHandler {
//
//	 @SubscribeEvent
//	    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
//	    	event.getRegistry().registerAll(
//	    			new TerraIncognitaModifier.Serializer().setRegistryName(new ResourceLocation(FlowerSeeds.MODID, "terra_incognita"))
//	    			);
//	    }
//}
