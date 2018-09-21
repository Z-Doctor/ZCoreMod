package zdoctor.zcoremod.map.minecraft.item.crafting;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipeTippedArrow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ala";
		else
			return "net/minecraft/item/crafting/RecipeTippedArrow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ala";
		else
			return "RecipeTippedArrow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lala;";
		else
			return "Lnet/minecraft/item/crafting/RecipeTippedArrow;";
	}

	/**
	 * <p>
	 * Name: getRecipeOutput
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77571_b = McMappingDatabase.getSRG("RecipeTippedArrow.func_77571_b");

	/**
	 * <p>
	 * Name: matches
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;Lnet/minecraft/world/World;)Z]
	 * </p>
	 */
	public static McObfPair func_77569_a = McMappingDatabase.getSRG("RecipeTippedArrow.func_77569_a");

	/**
	 * <p>
	 * Name: canFit
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_194133_a = McMappingDatabase.getSRG("RecipeTippedArrow.func_194133_a");

	/**
	 * <p>
	 * Name: getCraftingResult
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77572_b = McMappingDatabase.getSRG("RecipeTippedArrow.func_77572_b");

	/**
	 * <p>
	 * Name: getRemainingItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;)Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_179532_b = McMappingDatabase.getSRG("RecipeTippedArrow.func_179532_b");

	/**
	 * <p>
	 * Name: isDynamic
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192399_d = McMappingDatabase.getSRG("RecipeTippedArrow.func_192399_d");

}
