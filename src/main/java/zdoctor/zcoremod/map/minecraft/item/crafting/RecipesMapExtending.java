package zdoctor.zcoremod.map.minecraft.item.crafting;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipesMapExtending {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aks";
		else
			return "net/minecraft/item/crafting/RecipesMapExtending";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aks";
		else
			return "RecipesMapExtending";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laks;";
		else
			return "Lnet/minecraft/item/crafting/RecipesMapExtending;";
	}

	/**
	 * <p>
	 * Name: isDynamic
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192399_d = McMappingDatabase.getSRG("RecipesMapExtending.func_192399_d");

	/**
	 * <p>
	 * Name: matches
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;Lnet/minecraft/world/World;)Z]
	 * </p>
	 */
	public static McObfPair func_77569_a = McMappingDatabase.getSRG("RecipesMapExtending.func_77569_a");

	/**
	 * <p>
	 * Name: isExplorationMap
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/MapData;)Z]
	 * </p>
	 */
	public static McObfPair func_190934_a = McMappingDatabase.getSRG("RecipesMapExtending.func_190934_a");

	/**
	 * <p>
	 * Name: getCraftingResult
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77572_b = McMappingDatabase.getSRG("RecipesMapExtending.func_77572_b");

}
