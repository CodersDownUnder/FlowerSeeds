package net.codersdownunder.flowerseeds.data;

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
            
            
//            add(BlockInit.CROP_ALPINE_PINK.get(), noDrop());
//            add(BlockInit.CROP_ARCTIC_POPPY.get(), noDrop()); 
//            add(BlockInit.CROP_BLACK_IRIS.get(), noDrop());
//            add(BlockInit.CROP_BLUE_IRIS.get(), noDrop());
//            add(BlockInit.CROP_BLUE_LUPINE.get(), noDrop());
//            add(BlockInit.CROP_CHICORY.get(), noDrop());
//            add(BlockInit.CROP_DAFFODIL.get(), noDrop());    
//            add(BlockInit.CROP_DANDELION_PUFF.get(), noDrop());
//            add(BlockInit.CROP_EDELWEISS.get(), noDrop());
//            add(BlockInit.CROP_FIREWEED.get(), noDrop());
//            add(BlockInit.CROP_FORGET_ME_NOT.get(), noDrop());
//            add(BlockInit.CROP_FOXGLOVE.get(), noDrop());
//            add(BlockInit.CROP_GENTIAN.get(), noDrop());
//            add(BlockInit.CROP_GLOBEFLOWER.get(), noDrop()); 
//            add(BlockInit.CROP_MAGENTA_SNAPDRAGON.get(), noDrop());
//            add(BlockInit.CROP_MARIGOLD.get(), noDrop());
//            add(BlockInit.CROP_PINK_PRIMROSE.get(), noDrop());
//            add(BlockInit.CROP_PURPLE_IRIS.get(), noDrop());
//            add(BlockInit.CROP_PURPLE_PRIMROSE.get(), noDrop());
//            add(BlockInit.CROP_RED_SNAPDRAGON.get(), noDrop());
//            add(BlockInit.CROP_SAXIFRAGE.get(), noDrop());
//            add(BlockInit.CROP_WHITE_DRYAD.get(), noDrop());
//            add(BlockInit.CROP_WILD_GARLIC.get(), noDrop());
//            add(BlockInit.CROP_YARROW.get(), noDrop());
//            add(BlockInit.CROP_YELLOW_PRIMROSE.get(), noDrop());
//            add(BlockInit.CROP_YELLOW_SNAPDRAGON.get(), noDrop());
//            
            
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
                    .filter(block -> FlowerSeeds.MODID.equals(block.getRegistryName().getNamespace()))
                    .collect(Collectors.toSet());
        }
}