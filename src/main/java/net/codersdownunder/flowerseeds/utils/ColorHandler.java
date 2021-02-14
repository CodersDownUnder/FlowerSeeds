package net.codersdownunder.flowerseeds.utils;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FlowerSeeds.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ColorHandler {

	@SubscribeEvent
	public static void registerItemColor(ColorHandlerEvent.Item event) {
		final IItemColor dandelionColor = (stack, tintIndex) -> {
			return 0xFED83D;
		};
		event.getItemColors().register(dandelionColor, ItemInit.DANDELION_SEED.get());

		final IItemColor poppyColor = (stack, tintIndex) -> {
			return 0xB02E26;
		};
		event.getItemColors().register(poppyColor, ItemInit.POPPY_SEED.get());

		final IItemColor orchidColor = (stack, tintIndex) -> {
			return 0x3AB3DA;
		};
		event.getItemColors().register(orchidColor, ItemInit.ORCHID_SEED.get());

		final IItemColor alliumColor = (stack, tintIndex) -> {
			return 0xC74EBD;
		};
		event.getItemColors().register(alliumColor, ItemInit.ALLIUM_SEED.get());

		final IItemColor azureColor = (stack, tintIndex) -> {
			return 0x9D9D97;
		};
		event.getItemColors().register(azureColor, ItemInit.AZURE_SEED.get());

		final IItemColor tulip_redColor = (stack, tintIndex) -> {
			return 0xB02E26;
		};
		event.getItemColors().register(tulip_redColor, ItemInit.TULIP_RED_SEED.get());

		final IItemColor tulip_orangeColor = (stack, tintIndex) -> {
			return 0xF9801D;
		};
		event.getItemColors().register(tulip_orangeColor, ItemInit.TULIP_ORANGE_SEED.get());

		final IItemColor tulip_whiteColor = (stack, tintIndex) -> {
			return 0xFED83D;
		};
		event.getItemColors().register(tulip_whiteColor, ItemInit.TULIP_WHITE_SEED.get());

		final IItemColor tulip_pinkColor = (stack, tintIndex) -> {
			return 0xF38BAA;
		};
		event.getItemColors().register(tulip_pinkColor, ItemInit.TULIP_PINK_SEED.get());

		final IItemColor oxeyeColor = (stack, tintIndex) -> {
			return 0x9D9D97;
		};
		event.getItemColors().register(oxeyeColor, ItemInit.OXEYE_SEED.get());

		final IItemColor cornflowerColor = (stack, tintIndex) -> {
			return 0x3C44AA;
		};
		event.getItemColors().register(cornflowerColor, ItemInit.CORNFLOWER_SEED.get());

		
		final IItemColor lilyColor = (stack, tintIndex) -> {
			return 0xffffff;
		};
		event.getItemColors().register(lilyColor, ItemInit.LILY_SEED.get());

		final IItemColor witherroseColor = (stack, tintIndex) -> {
			return 0x1D1D21;
		};
		event.getItemColors().register(witherroseColor, ItemInit.WITHERROSE_SEED.get());

	}

}