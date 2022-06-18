package net.codersdownunder.flowerseeds.utils.flags;

import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class FlagManager {

    public static final BooleanSupplier TRUE = () -> true;
    public static final BooleanSupplier FALSE = () -> false;
    
	private final Map<String, Boolean> flags = new HashMap<>();

    public LootItemConditionType flagConditionType;

    public FlagManager(String modId) {

        CraftingHelper.register(new FlagRecipeCondition.Serializer(this, new ResourceLocation(modId, "flag")));
        CraftingHelper.register(new ResourceLocation(modId, "flag"),  new FlagIngredient.Serializer(this));

    }


	public void clear() {
		flags.clear();
	}
	
	public void putFlag(String flag, boolean value) {
		flags.put(flag, value);
	}
	
	public boolean getFlag(String flag) {
		Boolean obj = flags.get(flag);
		return obj != null && obj;
	}
    

	

}