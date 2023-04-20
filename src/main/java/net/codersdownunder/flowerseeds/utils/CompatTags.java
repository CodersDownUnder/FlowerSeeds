package net.codersdownunder.flowerseeds.utils;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

@SuppressWarnings("unused")
public class CompatTags {

	public static class Blocks {

		public static final TagKey<Block> CYCLIC_CROPS = createCompatTag("cyclic", "crops");
		public static final TagKey<Block> BYG_CROPS = createCompatTag("byg", "crops");

		private static TagKey<Block> createCompatTag(String modid, String name) {
			return BlockTags.create(new ResourceLocation(modid, name));
		}
	}
	
	public static class Items {

		public static final TagKey<Item> CYCLIC_CROPS = createCompatTag("cyclic", "crops");
		public static final TagKey<Item> BYG_CROPS = createCompatTag("byg", "crops");

		public static final TagKey<Item> CYCLIC_SEEDS = createCompatTag("cyclic", "seeds");
		public static final TagKey<Item> BYG_SEEDS = createCompatTag("byg", "seeds");

		private static TagKey<Item> createCompatTag(String modid, String name) {
			return ItemTags.create(new ResourceLocation(modid, name));
		}
	}
}
