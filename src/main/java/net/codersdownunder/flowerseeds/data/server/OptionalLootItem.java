package net.codersdownunder.flowerseeds.data.server;

import com.google.gson.*;

import net.codersdownunder.flowerseeds.init.ItemInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.entries.*;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;


public final class OptionalLootItem extends LootPoolSingletonContainer
{
    private final Item item;

    private OptionalLootItem(Item item, int weight, int quality, LootItemCondition[] conditions, LootItemFunction[] functions)
    {
        super(weight, quality, conditions, functions);
        this.item = item;
    }

    @Override
    protected void createItemStack(Consumer<ItemStack> stackConsumer, @NotNull LootContext lootContext)
    {
        stackConsumer.accept(new ItemStack(this.item));
    }

    public static LootPoolSingletonContainer.Builder<?> lootTableItem(ItemLike item)
    {
        return simpleBuilder((weight, quality, conditions, functions) ->
                new OptionalLootItem(item.asItem(), weight, quality, conditions, functions)
        );
    }

    @Override
    public @NotNull LootPoolEntryType getType() { return ItemInit.OPTIONAL_LOOT_ITEM.get(); }

    public static class Serializer extends LootPoolSingletonContainer.Serializer<OptionalLootItem>
    {
        @Override
        public void serializeCustom(@NotNull JsonObject object, @NotNull OptionalLootItem loot, @NotNull JsonSerializationContext ctx)
        {
            super.serializeCustom(object, loot, ctx);

            ResourceLocation name = ForgeRegistries.ITEMS.getKey(loot.item);
            if (name == null)
            {
                throw new IllegalArgumentException("Can't serialize unknown item " + loot.item);
            }
            object.addProperty("name", name.toString());
        }

        @Override
        protected @NotNull OptionalLootItem deserialize(JsonObject object, @NotNull JsonDeserializationContext ctx, int weight, int quality, LootItemCondition @NotNull [] conditions, LootItemFunction @NotNull [] functions)
        {
            if (!object.has("name") || !object.get("name").isJsonPrimitive())
            {
                throw new JsonSyntaxException("Expected name to be an item, was " + GsonHelper.getType(object));
            }

            Item item = Items.AIR;
            if (ForgeRegistries.ITEMS.containsKey(new ResourceLocation(object.get("name").getAsString())))
            {
                item = GsonHelper.getAsItem(object, "name");
            }
            return new OptionalLootItem(item, weight, quality, conditions, functions);
        }
    }
}