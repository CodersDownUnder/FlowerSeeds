package net.codersdownunder.flowerseeds.data.server;

import java.util.function.Consumer;

import com.lothrazar.cyclic.registry.ItemRegistry;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;
import potionstudios.byg.common.block.BYGBlocks;

public class FlowerSeedsRecipeProvider extends RecipeProvider implements IConditionBuilder {

	
	public FlowerSeedsRecipeProvider(PackOutput packOutput) {
		super(packOutput);
		
	}
	
	@Override
	public void buildRecipes(Consumer<FinishedRecipe> consumer) {
		
		VanillaFlowerRecipe(Items.DANDELION, ItemInit.DANDELION_SEED.get(), consumer);
		VanillaFlowerRecipe(Items.POPPY, ItemInit.POPPY_SEED.get(), consumer);
		VanillaFlowerRecipe(Items.BLUE_ORCHID, ItemInit.ORCHID_SEED.get(), consumer);
		VanillaFlowerRecipe(Items.ALLIUM, ItemInit.ALLIUM_SEED.get(), consumer);
		VanillaFlowerRecipe(Items.AZURE_BLUET, ItemInit.AZURE_SEED.get(), consumer);
		VanillaFlowerRecipe(Items.RED_TULIP, ItemInit.TULIP_RED_SEED.get(), consumer);
		VanillaFlowerRecipe(Items.ORANGE_TULIP, ItemInit.TULIP_ORANGE_SEED.get(), consumer);
		VanillaFlowerRecipe(Items.PINK_TULIP, ItemInit.TULIP_PINK_SEED.get(), consumer);
		VanillaFlowerRecipe(Items.WHITE_TULIP, ItemInit.TULIP_WHITE_SEED.get(), consumer);
		VanillaFlowerRecipe(Items.OXEYE_DAISY, ItemInit.OXEYE_SEED.get(), consumer);
		VanillaFlowerRecipe(Items.LILY_OF_THE_VALLEY, ItemInit.LILY_SEED.get(), consumer);
		VanillaFlowerRecipe(Items.CORNFLOWER, ItemInit.CORNFLOWER_SEED.get(), consumer);
		VanillaFlowerRecipe(Items.WITHER_ROSE, ItemInit.WITHERROSE_SEED.get(), consumer);
		
		//Cyclic
		CompatRecipe(ItemRegistry.FLOWER_CYAN.get(), ItemInit.CYANROSE_SEED.get(), consumer, "cyclic");
		CompatRecipe(ItemRegistry.FLOWER_LIME.get(), ItemInit.LIME_CARNATION_SEED.get(), consumer, "byg");
		CompatRecipe(ItemRegistry.FLOWER_PURPLE.get(), ItemInit.PURPLE_TULIP_CYCLIC_SEED.get(), consumer, "byg");
		CompatRecipe(ItemRegistry.FLOWER_BROWN.get(), ItemInit.ABSALON_TULIP_SEED.get(), consumer, "byg");

		//BYG
		CompatRecipe(BYGBlocks.HORSEWEED.get().asItem(), ItemInit.HORSEWEED_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.WINTER_SUCCULENT.get().asItem(), ItemInit.WINTER_SUCCULENT_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.ALPINE_BELLFLOWER.get().asItem(), ItemInit.ALPINE_BELLFLOWER_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.ANGELICA.get().asItem(), ItemInit.ANGELICA_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.HYDRANGEA_BUSH.get().asItem(), ItemInit.HYDRANGEA_BUSH_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.BEGONIA.get().asItem(), ItemInit.BEGONIA_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.BISTORT.get().asItem(), ItemInit.BISTORT_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.BLUE_SAGE.get().asItem(), ItemInit.BLUE_SAGE_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.CALIFORNIA_POPPY.get().asItem(), ItemInit.CALIFORNIA_POPPY_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.CROCUS.get().asItem(), ItemInit.CROCUS_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.BLACK_ROSE.get().asItem(), ItemInit.BLACK_ROSE_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.CYAN_ROSE.get().asItem(), ItemInit.CYAN_ROSE_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.CYAN_TULIP.get().asItem(), ItemInit.CYAN_TULIP_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.DAFFODIL.get().asItem(), ItemInit.DAFFODIL_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.FIRECRACKER_FLOWER_BUSH.get().asItem(), ItemInit.FIRECRACKER_FLOWER_BUSH_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.GREEN_TULIP.get().asItem(), ItemInit.GREEN_TULIP_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.GUZMANIA.get().asItem(), ItemInit.GUZMANIA_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.INCAN_LILY.get().asItem(), ItemInit.INCAN_LILY_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.IRIS.get().asItem(), ItemInit.IRIS_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.JAPANESE_ORCHID.get().asItem(), ItemInit.JAPANESE_ORCHID_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.KOVAN_FLOWER.get().asItem(), ItemInit.KOVAN_FLOWER_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.LAZARUS_BELLFLOWER.get().asItem(), ItemInit.LAZARUS_BELLFLOWER_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.LOLLIPOP_FLOWER.get().asItem(), ItemInit.LOLLIPOP_FLOWER_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.MAGENTA_TULIP.get().asItem(), ItemInit.MAGENTA_TULIP_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.ORANGE_DAISY.get().asItem(), ItemInit.ORANGE_DAISY_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.PEACH_LEATHER_FLOWER.get().asItem(), ItemInit.PEACH_LEATHER_FLOWER_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.PINK_ALLIUM.get().asItem(), ItemInit.PINK_ALLIUM_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.PINK_ANEMONE.get().asItem(), ItemInit.PINK_ANEMONE_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.PINK_DAFFODIL.get().asItem(), ItemInit.PINK_DAFFODIL_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.PROTEA_FLOWER.get().asItem(), ItemInit.PROTEA_FLOWER_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.PURPLE_SAGE.get().asItem(), ItemInit.PURPLE_SAGE_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.PURPLE_TULIP.get().asItem(), ItemInit.PURPLE_TULIP_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.RICHEA.get().asItem(), ItemInit.RICHEA_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.ROSE.get().asItem(), ItemInit.ROSE_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.SILVER_VASE_FLOWER.get().asItem(), ItemInit.SILVER_VASE_FLOWER_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.TORCH_GINGER.get().asItem(), ItemInit.TORCH_GINGER_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.VIOLET_LEATHER_FLOWER.get().asItem(), ItemInit.VIOLET_LEATHER_FLOWER_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.WHITE_ANEMONE.get().asItem(), ItemInit.WHITE_ANEMONE_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.WHITE_SAGE.get().asItem(), ItemInit.WHITE_SAGE_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.YELLOW_DAFFODIL.get().asItem(), ItemInit.YELLOW_DAFFODIL_SEED.get(), consumer, "byg");
		CompatRecipe(BYGBlocks.YELLOW_TULIP.get().asItem(), ItemInit.YELLOW_TULIP_SEED.get(), consumer, "byg");

	}

	private static String getItemName(Item item) {
		return ForgeRegistries.ITEMS.getKey(item).getPath();
	}
	
	protected void VanillaFlowerRecipe(Item item, Item seed, Consumer<FinishedRecipe> consumer) {
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, seed, 2)
				.requires(item)
				.requires(Tags.Items.SEEDS)
				.group(FlowerSeeds.MODID)
				.unlockedBy(getItemName(item), InventoryChangeTrigger.TriggerInstance.hasItems(item))
				.save(consumer);
	}
	
	protected void CompatRecipe(Item item, Item seed, Consumer<FinishedRecipe> consumer, String modid) {
		ConditionalRecipe.builder().addCondition(and(modLoaded(modid), not(FALSE())))
				.addRecipe(ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, seed, 2)
				.requires(Tags.Items.SEEDS).requires(item)
				.group(FlowerSeeds.MODID)
				.unlockedBy(getItemName(item), InventoryChangeTrigger.TriggerInstance.hasItems(item))
				::save)
		.generateAdvancement()
		.build(consumer, new ResourceLocation(FlowerSeeds.MODID, seed.getName(new ItemStack(seed)).getString()));
	}

}