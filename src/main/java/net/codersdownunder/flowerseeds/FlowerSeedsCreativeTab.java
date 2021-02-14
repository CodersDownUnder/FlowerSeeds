package net.codersdownunder.flowerseeds;

import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FlowerSeedsCreativeTab extends ItemGroup {

	public FlowerSeedsCreativeTab() {
		super("flowerseedtab");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemInit.DANDELION_SEED.get());
	}
	
	

}
