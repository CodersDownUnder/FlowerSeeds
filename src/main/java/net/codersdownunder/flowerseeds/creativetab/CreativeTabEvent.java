package net.codersdownunder.flowerseeds.creativetab;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class CreativeTabEvent {

    @SubscribeEvent
    public void buildContents(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(FlowerSeeds.MODID, "flowerseeds"), builder ->
                // Set name of tab to display
                builder.title(Component.translatable("item_group." + FlowerSeeds.MODID + ".flowerseeds"))
                        // Set icon of creative tab
                        .icon(() -> new ItemStack(ItemInit.POPPY_SEED.get()))
                        // Add default items to tab
                        .displayItems((params, output) -> {
                            output.accept(new ItemStack(ItemInit.DANDELION_SEED.get()));
                            output.accept(new ItemStack(ItemInit.POPPY_SEED.get()));
                            output.accept(new ItemStack(ItemInit.ORCHID_SEED.get()));
                            output.accept(new ItemStack(ItemInit.ALLIUM_SEED.get()));
                            output.accept(new ItemStack(ItemInit.AZURE_SEED.get()));
                            output.accept(new ItemStack(ItemInit.TULIP_RED_SEED.get()));
                            output.accept(new ItemStack(ItemInit.TULIP_ORANGE_SEED.get()));
                            output.accept(new ItemStack(ItemInit.TULIP_WHITE_SEED.get()));
                            output.accept(new ItemStack(ItemInit.TULIP_PINK_SEED.get()));
                            output.accept(new ItemStack(ItemInit.OXEYE_SEED.get()));
                            output.accept(new ItemStack(ItemInit.CORNFLOWER_SEED.get()));
                            output.accept(new ItemStack(ItemInit.LILY_SEED.get()));
                            output.accept(new ItemStack(ItemInit.WITHERROSE_SEED.get()));

                            if (FlowerSeeds.cyclicLoaded) {
                                output.accept(new ItemStack(ItemInit.CYANROSE_SEED.get()));
                                output.accept(new ItemStack(ItemInit.LIME_CARNATION_SEED.get()));
                                output.accept(new ItemStack(ItemInit.PURPLE_TULIP_CYCLIC_SEED.get()));
                                output.accept(new ItemStack(ItemInit.ABSALON_TULIP_SEED.get()));
                            }

                            if (FlowerSeeds.OTBYGLoaded) {
                                output.accept(new ItemStack(ItemInit.HORSEWEED_SEED.get()));
                                output.accept(new ItemStack(ItemInit.WINTER_SUCCULENT_SEED.get()));
                                output.accept(new ItemStack(ItemInit.ALPINE_BELLFLOWER_SEED.get()));
                                output.accept(new ItemStack(ItemInit.ANGELICA_SEED.get()));
                                output.accept(new ItemStack(ItemInit.HYDRANGEA_BUSH_SEED.get()));
                                output.accept(new ItemStack(ItemInit.BEGONIA_SEED.get()));
                                output.accept(new ItemStack(ItemInit.BISTORT_SEED.get()));
                                output.accept(new ItemStack(ItemInit.BLUE_SAGE_SEED.get()));
                                output.accept(new ItemStack(ItemInit.CALIFORNIA_POPPY_SEED.get()));
                                output.accept(new ItemStack(ItemInit.CROCUS_SEED.get()));
                                output.accept(new ItemStack(ItemInit.BLACK_ROSE_SEED.get()));
                                output.accept(new ItemStack(ItemInit.CYAN_ROSE_SEED.get()));
                                output.accept(new ItemStack(ItemInit.CYAN_TULIP_SEED.get()));
                                output.accept(new ItemStack(ItemInit.DAFFODIL_SEED.get()));
                                output.accept(new ItemStack(ItemInit.FIRECRACKER_FLOWER_BUSH_SEED.get()));
                                output.accept(new ItemStack(ItemInit.GREEN_TULIP_SEED.get()));
                                output.accept(new ItemStack(ItemInit.GUZMANIA_SEED.get()));
                                output.accept(new ItemStack(ItemInit.INCAN_LILY_SEED.get()));
                                output.accept(new ItemStack(ItemInit.IRIS_SEED.get()));
                                output.accept(new ItemStack(ItemInit.JAPANESE_ORCHID_SEED.get()));
                                output.accept(new ItemStack(ItemInit.KOVAN_FLOWER_SEED.get()));
                                output.accept(new ItemStack(ItemInit.LAZARUS_BELLFLOWER_SEED.get()));
                                output.accept(new ItemStack(ItemInit.LOLLIPOP_FLOWER_SEED.get()));
                                output.accept(new ItemStack(ItemInit.MAGENTA_TULIP_SEED.get()));
                                output.accept(new ItemStack(ItemInit.ORANGE_DAISY_SEED.get()));
                                output.accept(new ItemStack(ItemInit.OSIRIA_ROSE_SEED.get()));
                                output.accept(new ItemStack(ItemInit.PEACH_LEATHER_FLOWER_SEED.get()));
                                output.accept(new ItemStack(ItemInit.PINK_ALLIUM_SEED.get()));
                                output.accept(new ItemStack(ItemInit.PINK_ANEMONE_SEED.get()));
                                output.accept(new ItemStack(ItemInit.PINK_DAFFODIL_SEED.get()));
                                output.accept(new ItemStack(ItemInit.PROTEA_FLOWER_SEED.get()));
                                output.accept(new ItemStack(ItemInit.PURPLE_SAGE_SEED.get()));
                                output.accept(new ItemStack(ItemInit.PURPLE_TULIP_SEED.get()));
                                output.accept(new ItemStack(ItemInit.RICHEA_SEED.get()));
                                output.accept(new ItemStack(ItemInit.ROSE_SEED.get()));
                                output.accept(new ItemStack(ItemInit.SILVER_VASE_FLOWER_SEED.get()));
                                output.accept(new ItemStack(ItemInit.TORCH_GINGER_SEED.get()));
                                output.accept(new ItemStack(ItemInit.VIOLET_LEATHER_FLOWER_SEED.get()));
                                output.accept(new ItemStack(ItemInit.WHITE_ANEMONE_SEED.get()));
                                output.accept(new ItemStack(ItemInit.WHITE_SAGE_SEED.get()));
                                output.accept(new ItemStack(ItemInit.YELLOW_DAFFODIL_SEED.get()));
                                output.accept(new ItemStack(ItemInit.YELLOW_TULIP_SEED.get()));

                            }

                        })
        );
    }

}
