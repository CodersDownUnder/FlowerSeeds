package net.codersdownunder.flowerseeds.utils;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.client.color.item.ItemColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FlowerSeeds.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventHandler {

	@SubscribeEvent
	public static void registerItemColor(RegisterColorHandlersEvent.Item event) {
		final ItemColor dandelionColor = (stack, tintIndex) -> {
			return 0xFED83D;
		};
		event.register(dandelionColor, ItemInit.DANDELION_SEED.get());

		final ItemColor poppyColor = (stack, tintIndex) -> {
			return 0xB02E26;
		};
		event.register(poppyColor, ItemInit.POPPY_SEED.get());

		final ItemColor orchidColor = (stack, tintIndex) -> {
			return 0x3AB3DA;
		};
		event.register(orchidColor, ItemInit.ORCHID_SEED.get());

		final ItemColor alliumColor = (stack, tintIndex) -> {
			return 0xC74EBD;
		};
		event.register(alliumColor, ItemInit.ALLIUM_SEED.get());

		final ItemColor azureColor = (stack, tintIndex) -> {
			return 0x9D9D97;
		};
		event.register(azureColor, ItemInit.AZURE_SEED.get());

		final ItemColor tulip_redColor = (stack, tintIndex) -> {
			return 0xB02E26;
		};
		event.register(tulip_redColor, ItemInit.TULIP_RED_SEED.get());

		final ItemColor tulip_orangeColor = (stack, tintIndex) -> {
			return 0xF9801D;
		};
		event.register(tulip_orangeColor, ItemInit.TULIP_ORANGE_SEED.get());

		final ItemColor tulip_whiteColor = (stack, tintIndex) -> {
			return 0xFED83D;
		};
		event.register(tulip_whiteColor, ItemInit.TULIP_WHITE_SEED.get());

		final ItemColor tulip_pinkColor = (stack, tintIndex) -> {
			return 0xF38BAA;
		};
		event.register(tulip_pinkColor, ItemInit.TULIP_PINK_SEED.get());


		final ItemColor oxeyeColor = (stack, tintIndex) -> {
			return 0x9D9D97;
		};
		event.register(oxeyeColor, ItemInit.OXEYE_SEED.get());

		final ItemColor cornflowerColor = (stack, tintIndex) -> {
			return 0x3C44AA;
		};
		event.register(cornflowerColor, ItemInit.CORNFLOWER_SEED.get());
		
		final ItemColor lilyColor = (stack, tintIndex) -> {
			return 0xffffff;
		};
		event.register(lilyColor, ItemInit.LILY_SEED.get());

		final ItemColor witherroseColor = (stack, tintIndex) -> {
			return 0x1D1D21;
		};
		event.register(witherroseColor, ItemInit.WITHERROSE_SEED.get());
		
		final ItemColor cyanroseColor = (stack, tintIndex) -> {
			return 0x158991;
		};
		event.register(cyanroseColor, ItemInit.CYANROSE_SEED.get());
		
//		final ItemColor dandelionpuffColor = (stack, tintIndex) -> {
//			return Color.white.hashCode();
//		};
//
//		
//		final ItemColor chicoryColor = (stack, tintIndex) -> {
//			return 0xC74EBD;
//		};
//
//		
//
//		final ItemColor daffodilColor = (stack, tintIndex) -> {
//			return 0xFED83D;
//		};
//
//		
//		final ItemColor orangeColor = (stack, tintIndex) -> {
//			return 0xF07613;
//		};
		
	}

}