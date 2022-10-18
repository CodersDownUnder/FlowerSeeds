package net.codersdownunder.flowerseeds;

import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.NonNullList;

public class FlowerSeedsItemGroup extends CreativeModeTab {

		  public FlowerSeedsItemGroup(String label) {
		    super(label);
		  }

		  @Override
		  public ItemStack makeIcon() {
		    return new ItemStack(ItemInit.DANDELION_SEED.get());
		  }

		  @Override
		  public void fillItemList(NonNullList<ItemStack> items)
		  {
			  items.clear();
			  
			items.add(new ItemStack(ItemInit.DANDELION_SEED.get()));
			items.add(new ItemStack(ItemInit.POPPY_SEED.get()));
			items.add(new ItemStack(ItemInit.ORCHID_SEED.get()));
			items.add(new ItemStack(ItemInit.ALLIUM_SEED.get()));
			items.add(new ItemStack(ItemInit.AZURE_SEED.get()));
			items.add(new ItemStack(ItemInit.TULIP_RED_SEED.get()));
			items.add(new ItemStack(ItemInit.TULIP_ORANGE_SEED.get()));
			items.add(new ItemStack(ItemInit.TULIP_WHITE_SEED.get()));
			items.add(new ItemStack(ItemInit.TULIP_PINK_SEED.get()));
			items.add(new ItemStack(ItemInit.OXEYE_SEED.get()));
			items.add(new ItemStack(ItemInit.CORNFLOWER_SEED.get()));
			items.add(new ItemStack(ItemInit.LILY_SEED.get()));
			items.add(new ItemStack(ItemInit.WITHERROSE_SEED.get()));
			
			
		    if (FlowerSeeds.cyclicLoaded) {
		    	items.add(new ItemStack(ItemInit.CYANROSE_SEED.get()));
				items.add(new ItemStack(ItemInit.LIME_CARNATION_SEED.get()));
				items.add(new ItemStack(ItemInit.PURPLE_TULIP_CYCLIC_SEED.get()));
				items.add(new ItemStack(ItemInit.ABSALON_TULIP_SEED.get()));
			}

			if (FlowerSeeds.OTBYGLoaded) {
				items.add(new ItemStack(ItemInit.HORSEWEED_SEED.get()));
				items.add(new ItemStack(ItemInit.WINTER_SUCCULENT_SEED.get()));
				items.add(new ItemStack(ItemInit.ALPINE_BELLFLOWER_SEED.get()));
				items.add(new ItemStack(ItemInit.ANGELICA_SEED.get()));
				items.add(new ItemStack(ItemInit.HYDRANGEA_BUSH_SEED.get()));
				items.add(new ItemStack(ItemInit.BEGONIA_SEED.get()));
				items.add(new ItemStack(ItemInit.BISTORT_SEED.get()));
				items.add(new ItemStack(ItemInit.BLUE_SAGE_SEED.get()));
				items.add(new ItemStack(ItemInit.CALIFORNIA_POPPY_SEED.get()));
				items.add(new ItemStack(ItemInit.CROCUS_SEED.get()));
				items.add(new ItemStack(ItemInit.BLACK_ROSE_SEED.get()));
				items.add(new ItemStack(ItemInit.CYAN_ROSE_SEED.get()));
				items.add(new ItemStack(ItemInit.CYAN_TULIP_SEED.get()));
				items.add(new ItemStack(ItemInit.DAFFODIL_SEED.get()));
				items.add(new ItemStack(ItemInit.FIRECRACKER_FLOWER_BUSH_SEED.get()));
				items.add(new ItemStack(ItemInit.GREEN_TULIP_SEED.get()));
				items.add(new ItemStack(ItemInit.GUZMANIA_SEED.get()));
				items.add(new ItemStack(ItemInit.INCAN_LILY_SEED.get()));
				items.add(new ItemStack(ItemInit.IRIS_SEED.get()));
				items.add(new ItemStack(ItemInit.JAPANESE_ORCHID_SEED.get()));
				items.add(new ItemStack(ItemInit.KOVAN_FLOWER_SEED.get()));
				items.add(new ItemStack(ItemInit.LAZARUS_BELLFLOWER_SEED.get()));
				items.add(new ItemStack(ItemInit.LOLLIPOP_FLOWER_SEED.get()));
				items.add(new ItemStack(ItemInit.MAGENTA_TULIP_SEED.get()));
				items.add(new ItemStack(ItemInit.ORANGE_DAISY_SEED.get()));
				items.add(new ItemStack(ItemInit.OSIRIA_ROSE_SEED.get()));
				items.add(new ItemStack(ItemInit.PEACH_LEATHER_FLOWER_SEED.get()));
				items.add(new ItemStack(ItemInit.PINK_ALLIUM_SEED.get()));
				items.add(new ItemStack(ItemInit.PINK_ANEMONE_SEED.get()));
				items.add(new ItemStack(ItemInit.PINK_DAFFODIL_SEED.get()));
				items.add(new ItemStack(ItemInit.PROTEA_FLOWER_SEED.get()));
				items.add(new ItemStack(ItemInit.PURPLE_SAGE_SEED.get()));
				items.add(new ItemStack(ItemInit.PURPLE_TULIP_SEED.get()));
				items.add(new ItemStack(ItemInit.RICHEA_SEED.get()));
				items.add(new ItemStack(ItemInit.ROSE_SEED.get()));
				items.add(new ItemStack(ItemInit.SILVER_VASE_FLOWER_SEED.get()));
				items.add(new ItemStack(ItemInit.TORCH_GINGER_SEED.get()));
				items.add(new ItemStack(ItemInit.VIOLET_LEATHER_FLOWER_SEED.get()));
				items.add(new ItemStack(ItemInit.WHITE_ANEMONE_SEED.get()));
				items.add(new ItemStack(ItemInit.WHITE_SAGE_SEED.get()));
				items.add(new ItemStack(ItemInit.YELLOW_DAFFODIL_SEED.get()));
				items.add(new ItemStack(ItemInit.YELLOW_TULIP_SEED.get()));

			}
		  
		  }

}
