package net.codersdownunder.flowerseeds.data;

import java.util.function.Consumer;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.codersdownunder.flowerseeds.utils.flags.FlagManager;
import net.codersdownunder.flowerseeds.utils.flags.FlagRecipeCondition;
import net.codersdownunder.flowerseeds.utils.flags.FlowerSeedsModFlags;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class Recipes extends RecipeProvider implements IConditionBuilder {

	private FlagManager manager;

	public Recipes(DataGenerator generatorIn) {
		super(generatorIn);
		
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {

		glowstone(consumer);
		
	}
	
	public void glowstone(Consumer<IFinishedRecipe> consumer) {
		
		ConditionalRecipe.builder().addCondition(

				flagEnabled(manager, FlowerSeedsModFlags.FLAG_DANDELION))
		.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.DANDELION_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.DANDELION).setGroup(FlowerSeeds.MODID + ":flower_seed1")
				.addCriterion("Dandelion", InventoryChangeTrigger.Instance.forItems(Items.DANDELION))
				::build)
		.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "dandelion"));
		
		ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, FlowerSeedsModFlags.FLAG_POPPY))
				.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.POPPY_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.POPPY).setGroup(FlowerSeeds.MODID + ":flower_seed0")
				.addCriterion("Poppy", InventoryChangeTrigger.Instance.forItems(Items.POPPY))
				::build)
				.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "poppy"));

				ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, FlowerSeedsModFlags.FLAG_ORCHID))
				.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ORCHID_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.BLUE_ORCHID).setGroup(FlowerSeeds.MODID + ":flower_seed1")
				.addCriterion("Blue_Orchid", InventoryChangeTrigger.Instance.forItems(Items.BLUE_ORCHID))
				::build)
				.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "orchid"));

				ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, FlowerSeedsModFlags.FLAG_ALLIUM))
				.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.ALLIUM_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.ALLIUM).setGroup(FlowerSeeds.MODID + ":flower_seed2")
				.addCriterion("Allium", InventoryChangeTrigger.Instance.forItems(Items.ALLIUM))
				::build)
				.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "allium"));

				ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, FlowerSeedsModFlags.FLAG_AZURE))
				.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.AZURE_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.AZURE_BLUET).setGroup(FlowerSeeds.MODID + ":flower_seed3")
				.addCriterion("Azure", InventoryChangeTrigger.Instance.forItems(Items.AZURE_BLUET))
				::build)
				.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "azure"));

				ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, FlowerSeedsModFlags.FLAG_TULIP_RED))
				.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TULIP_RED_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.RED_TULIP).setGroup(FlowerSeeds.MODID + ":flower_seed4")
				.addCriterion("Tulip_Red", InventoryChangeTrigger.Instance.forItems(Items.RED_TULIP))
				::build)
				.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "tulip_red"));

				ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, FlowerSeedsModFlags.FLAG_TULIP_ORANGE))
				.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TULIP_ORANGE_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.ORANGE_TULIP).setGroup(FlowerSeeds.MODID + ":flower_seed5")
				.addCriterion("Tulip_Orange", InventoryChangeTrigger.Instance.forItems(Items.ORANGE_TULIP))
				::build)
				.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "tulip_orange"));

				ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, FlowerSeedsModFlags.FLAG_TULIP_WHITE))
				.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TULIP_WHITE_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.WHITE_TULIP).setGroup(FlowerSeeds.MODID + ":flower_seed6")
				.addCriterion("Tulip_White", InventoryChangeTrigger.Instance.forItems(Items.WHITE_TULIP))
				::build)
				.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "tulip_white"));

				ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, FlowerSeedsModFlags.FLAG_TULIP_PINK))
				.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.TULIP_PINK_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.PINK_TULIP).setGroup(FlowerSeeds.MODID + ":flower_seed7")
				.addCriterion("Tulip_Pink", InventoryChangeTrigger.Instance.forItems(Items.PINK_TULIP))
				::build)
				.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "tulip_pink"));

				ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, FlowerSeedsModFlags.FLAG_OXEYE))
				.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.OXEYE_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.OXEYE_DAISY).setGroup(FlowerSeeds.MODID + ":flower_seed8")
				.addCriterion("Oxeye", InventoryChangeTrigger.Instance.forItems(Items.OXEYE_DAISY))
				::build)
				.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "oxeye"));

				ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, FlowerSeedsModFlags.FLAG_LILY))
				.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.LILY_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.LILY_OF_THE_VALLEY).setGroup(FlowerSeeds.MODID + ":flower_seed9")
				.addCriterion("Lily", InventoryChangeTrigger.Instance.forItems(Items.LILY_OF_THE_VALLEY))
				::build)
				.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "lily"));

				ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, FlowerSeedsModFlags.FLAG_WITHERROSE))
				.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.WITHERROSE_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.WITHER_ROSE).setGroup(FlowerSeeds.MODID + ":flower_seed10")
				.addCriterion("Witherrose", InventoryChangeTrigger.Instance.forItems(Items.WITHER_ROSE))
				::build)
				.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "witherrose"));

				ConditionalRecipe.builder().addCondition(
				flagEnabled(manager, FlowerSeedsModFlags.FLAG_CORNFLOWER))
				.addRecipe(ShapelessRecipeBuilder.shapelessRecipe(ItemInit.CORNFLOWER_SEED.get(), 2)
				.addIngredient(Items.WHEAT_SEEDS).addIngredient(Items.CORNFLOWER).setGroup(FlowerSeeds.MODID + ":flower_seed11")
				.addCriterion("Cornflower", InventoryChangeTrigger.Instance.forItems(Items.CORNFLOWER))
				::build)
				.generateAdvancement().build(consumer, new ResourceLocation(FlowerSeeds.MODID, "cornflower"));

	}
	

	
	protected ICondition flagEnabled(FlagManager manager, String flag) {

		return new FlagRecipeCondition(manager, flag);
	}

}