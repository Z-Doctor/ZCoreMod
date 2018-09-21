package zdoctor.zcoremod.map.minecraft.item.crafting;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipeRepairItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akv";
		else
			return "net/minecraft/item/crafting/RecipeRepairItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akv";
		else
			return "RecipeRepairItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakv;";
		else
			return "Lnet/minecraft/item/crafting/RecipeRepairItem;";
	}

	/**
	 * <p>
	 * Name: getRecipeOutput
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77571_b = McMappingDatabase.getSRG("RecipeRepairItem.func_77571_b");

	/**
	 * <p>
	 * Name: canFit
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_194133_a = McMappingDatabase.getSRG("RecipeRepairItem.func_194133_a");

	/**
	 * <p>
	 * Name: isDynamic
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192399_d = McMappingDatabase.getSRG("RecipeRepairItem.func_192399_d");

	/**
	 * <p>
	 * Name: getCraftingResult
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77572_b = McMappingDatabase.getSRG("RecipeRepairItem.func_77572_b");

	/**
	 * <p>
	 * Name: getRemainingItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;)Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_179532_b = McMappingDatabase.getSRG("RecipeRepairItem.func_179532_b");

	/**
	 * <p>
	 * Name: matches
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;Lnet/minecraft/world/World;)Z]
	 * </p>
	 */
	public static McObfPair func_77569_a = McMappingDatabase.getSRG("RecipeRepairItem.func_77569_a");

}
