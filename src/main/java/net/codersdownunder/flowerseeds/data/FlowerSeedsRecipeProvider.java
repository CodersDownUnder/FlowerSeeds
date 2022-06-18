package net.codersdownunder.flowerseeds.data;

import java.util.function.Consumer;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.codersdownunder.flowerseeds.utils.flags.FlagManager;
import net.codersdownunder.flowerseeds.utils.flags.FlagRecipeCondition;
import net.codersdownunder.flowerseeds.utils.flags.FlowerSeedsModFlags;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ICondition;

public class FlowerSeedsRecipeProvider extends RecipeProvider {

	private FlagManager manager;

	
	public FlowerSeedsRecipeProvider(DataGenerator generatorIn) {
		super(generatorIn);
		
	}
	
	@Override
	public void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_DANDELION, Items.DANDELION, ItemInit.DANDELION_SEED.get(), "dandelion", consumer);
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_POPPY, Items.POPPY, ItemInit.POPPY_SEED.get(), "poppy", consumer);
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_ORCHID, Items.BLUE_ORCHID, ItemInit.ORCHID_SEED.get(), "orchid", consumer);
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_ALLIUM, Items.ALLIUM, ItemInit.ALLIUM_SEED.get(), "allium", consumer);
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_AZURE, Items.AZURE_BLUET, ItemInit.AZURE_SEED.get(), "azure", consumer);
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_TULIP_RED, Items.RED_TULIP, ItemInit.TULIP_RED_SEED.get(), "tulip", consumer);
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_TULIP_ORANGE, Items.ORANGE_TULIP, ItemInit.TULIP_ORANGE_SEED.get(), "tulip", consumer);
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_TULIP_PINK, Items.PINK_TULIP, ItemInit.TULIP_PINK_SEED.get(), "tulip", consumer);
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_TULIP_WHITE, Items.WHITE_TULIP, ItemInit.TULIP_WHITE_SEED.get(), "tulip", consumer);
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_OXEYE, Items.OXEYE_DAISY, ItemInit.OXEYE_SEED.get(), "oxeye", consumer);
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_LILY, Items.LILY_OF_THE_VALLEY, ItemInit.LILY_SEED.get(), "lily", consumer);
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_CORNFLOWER, Items.CORNFLOWER, ItemInit.CORNFLOWER_SEED.get(), "cornflower", consumer);
		VanillaFlowerRecipe(FlowerSeedsModFlags.FLAG_WITHERROSE, Items.WITHER_ROSE, ItemInit.WITHERROSE_SEED.get(), "witherrose", consumer);
		
		//Cyclic
		//CompatRecipe(FlowerSeedsModFlags.FLAG_CYANROSE, ItemRegistry.FLOWER_CYAN.get(), ItemInit.CYANROSE_SEED.get(), "cyanrose", consumer, "cyclic");
		
		//Terra Incognita
		//CompatRecipe(FlowerSeedsModFlags.FLAG_ALPINE_PINK, ModBlocks.ALPINE_PINK.asItem(), ItemInit.ALPINE_PINK_SEED.get(), "alpine_pink", consumer, "terraincognita");
		
	}
	
	
	protected void VanillaFlowerRecipe(String flag, Item item, Item seed, String advancement, Consumer<FinishedRecipe> consumer) {
		ConditionalRecipe.builder()
				.addCondition(flagEnabled(manager, flag))
				.addRecipe(ShapelessRecipeBuilder.shapeless(seed, 2)
				.requires(Tags.Items.SEEDS).requires(item)
				.group(FlowerSeeds.MODID)
				.unlockedBy(advancement, InventoryChangeTrigger.TriggerInstance.hasItems(item))
				::save)
		.generateAdvancement()
		.build(consumer, new ResourceLocation(FlowerSeeds.MODID, seed.getName(new ItemStack(seed)).getString()));
	}
	
	protected void CompatRecipe(String flag, Item item, Item seed, String advancement, Consumer<FinishedRecipe> consumer, String modid) {
		ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, flag))
				.addRecipe(ShapelessRecipeBuilder.shapeless(seed, 2)
				.requires(Tags.Items.SEEDS).requires(item)
				.group(FlowerSeeds.MODID)
				.unlockedBy(item.toString(), InventoryChangeTrigger.TriggerInstance.hasItems(item))
				::save)
		.generateAdvancement()
		.build(consumer, new ResourceLocation(FlowerSeeds.MODID, seed.getName(new ItemStack(seed)).getString()));
	}
	
	protected ICondition flagEnabled(FlagManager manager, String flag) {

		return new FlagRecipeCondition(manager, flag);
	}

}