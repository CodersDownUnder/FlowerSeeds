package net.codersdownunder.flowerseeds.data.server;

import java.util.stream.Collectors;

import com.lothrazar.cyclic.registry.ItemRegistry;

import net.codersdownunder.flowerseeds.FlowerSeeds;
import net.codersdownunder.flowerseeds.blocks.SingleCropBlock;
import net.codersdownunder.flowerseeds.init.BlockInit;
import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.ForgeRegistries;
import potionstudios.byg.common.block.BYGBlocks;


public class ModBlockLootTables extends BlockLoot {
    
        @Override
        public void addTables() {

            add(BlockInit.CROP_ALLIUM.get(), FlowerLootTableBuilder(BlockInit.CROP_ALLIUM.get(), Items.ALLIUM, ItemInit.ALLIUM_SEED.get()));
            add(BlockInit.CROP_AZURE.get(), FlowerLootTableBuilder(BlockInit.CROP_AZURE.get(), Items.AZURE_BLUET, ItemInit.AZURE_SEED.get()));
            add(BlockInit.CROP_CORNFLOWER.get(), FlowerLootTableBuilder(BlockInit.CROP_CORNFLOWER.get(), Items.CORNFLOWER, ItemInit.CORNFLOWER_SEED.get()));
            add(BlockInit.CROP_DANDELION.get(), FlowerLootTableBuilder(BlockInit.CROP_DANDELION.get(), Items.DANDELION, ItemInit.DANDELION_SEED.get()));
            add(BlockInit.CROP_LILY.get(), FlowerLootTableBuilder(BlockInit.CROP_LILY.get(), Items.LILY_OF_THE_VALLEY, ItemInit.LILY_SEED.get()));
            add(BlockInit.CROP_ORCHID.get(), FlowerLootTableBuilder(BlockInit.CROP_ORCHID.get(), Items.BLUE_ORCHID, ItemInit.ORCHID_SEED.get()));
            add(BlockInit.CROP_OXEYE.get(), FlowerLootTableBuilder(BlockInit.CROP_OXEYE.get(), Items.OXEYE_DAISY, ItemInit.OXEYE_SEED.get()));
            add(BlockInit.CROP_POPPY.get(), FlowerLootTableBuilder(BlockInit.CROP_POPPY.get(), Items.POPPY, ItemInit.POPPY_SEED.get()));
            add(BlockInit.CROP_TULIP_ORANGE.get(), FlowerLootTableBuilder(BlockInit.CROP_TULIP_ORANGE.get(), Items.ORANGE_TULIP, ItemInit.TULIP_ORANGE_SEED.get()));
            add(BlockInit.CROP_TULIP_PINK.get(), FlowerLootTableBuilder(BlockInit.CROP_TULIP_PINK.get(), Items.PINK_TULIP, ItemInit.TULIP_PINK_SEED.get()));
            add(BlockInit.CROP_TULIP_RED.get(), FlowerLootTableBuilder(BlockInit.CROP_TULIP_RED.get(), Items.RED_TULIP, ItemInit.TULIP_RED_SEED.get()));
            add(BlockInit.CROP_TULIP_WHITE.get(), FlowerLootTableBuilder(BlockInit.CROP_TULIP_WHITE.get(), Items.WHITE_TULIP, ItemInit.TULIP_WHITE_SEED.get()));
            add(BlockInit.CROP_WITHERROSE.get(), FlowerLootTableBuilder(BlockInit.CROP_WITHERROSE.get(), Items.WITHER_ROSE, ItemInit.WITHERROSE_SEED.get()));
            
            add(BlockInit.CROP_CYANROSE.get(), FlowerLootTableBuilder(BlockInit.CROP_CYANROSE.get(), ItemRegistry.FLOWER_CYAN.get(), ItemInit.CYANROSE_SEED.get()));
            add(BlockInit.CROP_LIME_CARNATION.get(), FlowerLootTableBuilder(BlockInit.CROP_LIME_CARNATION.get(), ItemRegistry.FLOWER_LIME.get().asItem(), ItemInit.LIME_CARNATION_SEED.get()));
            add(BlockInit.CROP_PURPLE_TULIP_CYCLIC.get(), FlowerLootTableBuilder(BlockInit.CROP_PURPLE_TULIP_CYCLIC.get(), ItemRegistry.FLOWER_PURPLE.get().asItem(), ItemInit.PURPLE_TULIP_CYCLIC_SEED.get()));
            add(BlockInit.CROP_ABSALON_TULIP.get(), FlowerLootTableBuilder(BlockInit.CROP_ABSALON_TULIP.get(), ItemRegistry.FLOWER_BROWN.get().asItem(), ItemInit.ABSALON_TULIP_SEED.get()));

            add(BlockInit.CROP_HORSEWEED.get(), FlowerLootTableBuilder(BlockInit.CROP_HORSEWEED.get(), BYGBlocks.HORSEWEED.get().asItem(), ItemInit.HORSEWEED_SEED.get()));
            add(BlockInit.CROP_WINTER_SUCCULENT.get(), FlowerLootTableBuilder(BlockInit.CROP_WINTER_SUCCULENT.get(), BYGBlocks.WINTER_SUCCULENT.get().asItem(), ItemInit.WINTER_SUCCULENT_SEED.get()));
            add(BlockInit.CROP_ALPINE_BELLFLOWER.get(), FlowerLootTableBuilder(BlockInit.CROP_ALPINE_BELLFLOWER.get(), BYGBlocks.ALPINE_BELLFLOWER.get().asItem(), ItemInit.ALPINE_BELLFLOWER_SEED.get()));
            add(BlockInit.CROP_ANGELICA.get(), FlowerLootTableBuilder(BlockInit.CROP_ANGELICA.get(), BYGBlocks.ANGELICA.get().asItem(), ItemInit.ANGELICA_SEED.get()));
            add(BlockInit.CROP_HYDRANGEA_BUSH.get(), FlowerLootTableBuilder(BlockInit.CROP_HYDRANGEA_BUSH.get(), BYGBlocks.HYDRANGEA_BUSH.get().asItem(), ItemInit.HYDRANGEA_BUSH_SEED.get()));
            add(BlockInit.CROP_BEGONIA.get(), FlowerLootTableBuilder(BlockInit.CROP_BEGONIA.get(), BYGBlocks.BEGONIA.get().asItem(), ItemInit.BEGONIA_SEED.get()));
            add(BlockInit.CROP_BISTORT.get(), FlowerLootTableBuilder(BlockInit.CROP_BISTORT.get(), BYGBlocks.BISTORT.get().asItem(), ItemInit.BISTORT_SEED.get()));
            add(BlockInit.CROP_BLUE_SAGE.get(), FlowerLootTableBuilder(BlockInit.CROP_BLUE_SAGE.get(), BYGBlocks.BLUE_SAGE.get().asItem(), ItemInit.BLUE_SAGE_SEED.get()));
            add(BlockInit.CROP_CALIFORNIA_POPPY.get(), FlowerLootTableBuilder(BlockInit.CROP_CALIFORNIA_POPPY.get(), BYGBlocks.CALIFORNIA_POPPY.get().asItem(), ItemInit.CALIFORNIA_POPPY_SEED.get()));
            add(BlockInit.CROP_CROCUS.get(), FlowerLootTableBuilder(BlockInit.CROP_CROCUS.get(), BYGBlocks.CROCUS.get().asItem(), ItemInit.CROCUS_SEED.get()));
            add(BlockInit.CROP_BLACK_ROSE.get(), FlowerLootTableBuilder(BlockInit.CROP_BLACK_ROSE.get(), BYGBlocks.BLACK_ROSE.get().asItem(), ItemInit.BLACK_ROSE_SEED.get()));
            add(BlockInit.CROP_CYAN_ROSE.get(), FlowerLootTableBuilder(BlockInit.CROP_CYAN_ROSE.get(), BYGBlocks.CYAN_ROSE.get().asItem(), ItemInit.CYAN_ROSE_SEED.get()));
            add(BlockInit.CROP_CYAN_TULIP.get(), FlowerLootTableBuilder(BlockInit.CROP_CYAN_TULIP.get(), BYGBlocks.CYAN_TULIP.get().asItem(), ItemInit.CYAN_TULIP_SEED.get()));
            add(BlockInit.CROP_DAFFODIL.get(), FlowerLootTableBuilder(BlockInit.CROP_DAFFODIL.get(), BYGBlocks.DAFFODIL.get().asItem(), ItemInit.DAFFODIL_SEED.get()));
            add(BlockInit.CROP_FIRECRACKER_FLOWER_BUSH.get(), FlowerLootTableBuilder(BlockInit.CROP_FIRECRACKER_FLOWER_BUSH.get(), BYGBlocks.FIRECRACKER_FLOWER_BUSH.get().asItem(), ItemInit.FIRECRACKER_FLOWER_BUSH_SEED.get()));
            add(BlockInit.CROP_GREEN_TULIP.get(), FlowerLootTableBuilder(BlockInit.CROP_GREEN_TULIP.get(), BYGBlocks.GREEN_TULIP.get().asItem(), ItemInit.GREEN_TULIP_SEED.get()));
            add(BlockInit.CROP_GUZMANIA.get(), FlowerLootTableBuilder(BlockInit.CROP_GUZMANIA.get(), BYGBlocks.GUZMANIA.get().asItem(), ItemInit.GUZMANIA_SEED.get()));
            add(BlockInit.CROP_INCAN_LILY.get(), FlowerLootTableBuilder(BlockInit.CROP_INCAN_LILY.get(), BYGBlocks.INCAN_LILY.get().asItem(), ItemInit.INCAN_LILY_SEED.get()));
            add(BlockInit.CROP_IRIS.get(), FlowerLootTableBuilder(BlockInit.CROP_IRIS.get(), BYGBlocks.IRIS.get().asItem(), ItemInit.IRIS_SEED.get()));
            add(BlockInit.CROP_JAPANESE_ORCHID.get(), FlowerLootTableBuilder(BlockInit.CROP_JAPANESE_ORCHID.get(), BYGBlocks.JAPANESE_ORCHID.get().asItem(), ItemInit.JAPANESE_ORCHID_SEED.get()));
            add(BlockInit.CROP_KOVAN_FLOWER.get(), FlowerLootTableBuilder(BlockInit.CROP_KOVAN_FLOWER.get(), BYGBlocks.KOVAN_FLOWER.get().asItem(), ItemInit.KOVAN_FLOWER_SEED.get()));
            add(BlockInit.CROP_LAZARUS_BELLFLOWER.get(), FlowerLootTableBuilder(BlockInit.CROP_LAZARUS_BELLFLOWER.get(), BYGBlocks.LAZARUS_BELLFLOWER.get().asItem(), ItemInit.LAZARUS_BELLFLOWER_SEED.get()));
            add(BlockInit.CROP_LOLLIPOP_FLOWER.get(), FlowerLootTableBuilder(BlockInit.CROP_LOLLIPOP_FLOWER.get(), BYGBlocks.LOLLIPOP_FLOWER.get().asItem(), ItemInit.LOLLIPOP_FLOWER_SEED.get()));
            add(BlockInit.CROP_MAGENTA_TULIP.get(), FlowerLootTableBuilder(BlockInit.CROP_MAGENTA_TULIP.get(), BYGBlocks.MAGENTA_TULIP.get().asItem(), ItemInit.MAGENTA_TULIP_SEED.get()));
            add(BlockInit.CROP_ORANGE_DAISY.get(), FlowerLootTableBuilder(BlockInit.CROP_ORANGE_DAISY.get(), BYGBlocks.ORANGE_DAISY.get().asItem(), ItemInit.ORANGE_DAISY_SEED.get()));
            add(BlockInit.CROP_OSIRIA_ROSE.get(), FlowerLootTableBuilder(BlockInit.CROP_OSIRIA_ROSE.get(), BYGBlocks.ORSIRIA_ROSE.get().asItem(), ItemInit.OSIRIA_ROSE_SEED.get()));
            add(BlockInit.CROP_PEACH_LEATHER_FLOWER.get(), FlowerLootTableBuilder(BlockInit.CROP_PEACH_LEATHER_FLOWER.get(), BYGBlocks.PEACH_LEATHER_FLOWER.get().asItem(), ItemInit.PEACH_LEATHER_FLOWER_SEED.get()));
            add(BlockInit.CROP_PINK_ALLIUM.get(), FlowerLootTableBuilder(BlockInit.CROP_PINK_ALLIUM.get(), BYGBlocks.PINK_ALLIUM.get().asItem(), ItemInit.PINK_ALLIUM_SEED.get()));
            add(BlockInit.CROP_PINK_ANEMONE.get(), FlowerLootTableBuilder(BlockInit.CROP_PINK_ANEMONE.get(), BYGBlocks.PINK_ANEMONE.get().asItem(), ItemInit.PINK_ANEMONE_SEED.get()));
            add(BlockInit.CROP_PINK_DAFFODIL.get(), FlowerLootTableBuilder(BlockInit.CROP_PINK_DAFFODIL.get(), BYGBlocks.PINK_DAFFODIL.get().asItem(), ItemInit.PINK_DAFFODIL_SEED.get()));
            add(BlockInit.CROP_PROTEA_FLOWER.get(), FlowerLootTableBuilder(BlockInit.CROP_PROTEA_FLOWER.get(), BYGBlocks.PROTEA_FLOWER.get().asItem(), ItemInit.PROTEA_FLOWER_SEED.get()));
            add(BlockInit.CROP_PURPLE_SAGE.get(), FlowerLootTableBuilder(BlockInit.CROP_PURPLE_SAGE.get(), BYGBlocks.PURPLE_SAGE.get().asItem(), ItemInit.PURPLE_SAGE_SEED.get()));
            add(BlockInit.CROP_PURPLE_TULIP.get(), FlowerLootTableBuilder(BlockInit.CROP_PURPLE_TULIP.get(), BYGBlocks.PURPLE_TULIP.get().asItem(), ItemInit.PURPLE_TULIP_SEED.get()));
            add(BlockInit.CROP_RICHEA.get(), FlowerLootTableBuilder(BlockInit.CROP_RICHEA.get(), BYGBlocks.RICHEA.get().asItem(), ItemInit.RICHEA_SEED.get()));
            add(BlockInit.CROP_ROSE.get(), FlowerLootTableBuilder(BlockInit.CROP_ROSE.get(), BYGBlocks.ROSE.get().asItem(), ItemInit.ROSE_SEED.get()));
            add(BlockInit.CROP_SILVER_VASE_FLOWER.get(), FlowerLootTableBuilder(BlockInit.CROP_SILVER_VASE_FLOWER.get(), BYGBlocks.SILVER_VASE_FLOWER.get().asItem(), ItemInit.SILVER_VASE_FLOWER_SEED.get()));
            add(BlockInit.CROP_TORCH_GINGER.get(), FlowerLootTableBuilder(BlockInit.CROP_TORCH_GINGER.get(), BYGBlocks.TORCH_GINGER.get().asItem(), ItemInit.TORCH_GINGER_SEED.get()));
            add(BlockInit.CROP_VIOLET_LEATHER_FLOWER.get(), FlowerLootTableBuilder(BlockInit.CROP_VIOLET_LEATHER_FLOWER.get(), BYGBlocks.VIOLET_LEATHER_FLOWER.get().asItem(), ItemInit.VIOLET_LEATHER_FLOWER_SEED.get()));
            add(BlockInit.CROP_WHITE_ANEMONE.get(), FlowerLootTableBuilder(BlockInit.CROP_WHITE_ANEMONE.get(), BYGBlocks.WHITE_ANEMONE.get().asItem(), ItemInit.WHITE_ANEMONE_SEED.get()));
            add(BlockInit.CROP_WHITE_SAGE.get(), FlowerLootTableBuilder(BlockInit.CROP_WHITE_SAGE.get(), BYGBlocks.WHITE_SAGE.get().asItem(), ItemInit.WHITE_SAGE_SEED.get()));
            add(BlockInit.CROP_YELLOW_DAFFODIL.get(), FlowerLootTableBuilder(BlockInit.CROP_YELLOW_DAFFODIL.get(), BYGBlocks.YELLOW_DAFFODIL.get().asItem(), ItemInit.YELLOW_DAFFODIL_SEED.get()));
            add(BlockInit.CROP_YELLOW_TULIP.get(), FlowerLootTableBuilder(BlockInit.CROP_YELLOW_TULIP.get(), BYGBlocks.YELLOW_TULIP.get().asItem(), ItemInit.YELLOW_TULIP_SEED.get()));


        }
        
        protected static Builder FlowerLootTableBuilder(Block pCropBlock, Item pGrownCropItem, Item pSeedsItem) {
        	LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
            		.hasBlockStateProperties(pCropBlock).setProperties(StatePropertiesPredicate.Builder
            				.properties().hasProperty(SingleCropBlock.AGE, 7));
        	return FlowerSeedsCropDrops(pCropBlock, pGrownCropItem, pSeedsItem, lootitemcondition$builder);
        }

        
        protected static LootTable.Builder FlowerSeedsCropDrops(Block pCropBlock, Item pGrownCropItem, Item pSeedsItem, LootItemCondition.Builder pDropGrownCropCondition) {
            return applyExplosionDecay(pCropBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(OptionalLootItem.lootTableItem(pGrownCropItem).setWeight(2).when(pDropGrownCropCondition).otherwise(OptionalLootItem.lootTableItem(pSeedsItem)))).withPool(LootPool.lootPool().when(pDropGrownCropCondition).add(OptionalLootItem.lootTableItem(pSeedsItem).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3)))));
         }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ForgeRegistries.BLOCKS.getValues().stream()
                    .filter(block -> FlowerSeeds.MODID.equals(ForgeRegistries.BLOCKS.getKey(block).getNamespace()))
                    .collect(Collectors.toSet());
        }
}