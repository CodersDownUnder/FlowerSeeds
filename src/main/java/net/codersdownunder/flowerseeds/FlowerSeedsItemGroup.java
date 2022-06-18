package net.codersdownunder.flowerseeds;

import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.NonNullList;

public class FlowerSeedsItemGroup extends CreativeModeTab {

		  public FlowerSeedsItemGroup(String label) {
		    super(label);
		    label = "flowerseeds";
		  }

		  @Override
		  public ItemStack makeIcon() {
		    return new ItemStack(ItemInit.DANDELION_SEED.get());
		  }

		  @Override
		  public void fillItemList(NonNullList<ItemStack> items)
		  {
			 items.removeAll(items);
			  
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
		    }
		    
		  
		  }

}
