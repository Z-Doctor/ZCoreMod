package zdoctor.zcoremod.map.minecraft.item.crafting;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Ingredient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akq";
		else
			return "net/minecraft/item/crafting/Ingredient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akq";
		else
			return "Ingredient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakq;";
		else
			return "Lnet/minecraft/item/crafting/Ingredient;";
	}

	/**
	 * <p>
	 * Name: EMPTY
	 * </p>
	 */
	public static McObfPair field_193370_a = McMappingDatabase.getSRG("field_193370_a");

	/**
	 * <p>
	 * Name: getMatchingStacks
	 * </p>
	 * <p>
	 * Desc: [()[Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_193365_a = McMappingDatabase.getSRG("Ingredient.func_193365_a");

	/**
	 * <p>
	 * Name: fromItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Lnet/minecraft/item/crafting/Ingredient;]
	 * </p>
	 */
	public static McObfPair func_193367_a = McMappingDatabase.getSRG("Ingredient.func_193367_a");

	/**
	 * <p>
	 * Name: getValidItemStacksPacked
	 * </p>
	 * <p>
	 * Desc: [()Lit/unimi/dsi/fastutil/ints/IntList;]
	 * </p>
	 */
	public static McObfPair func_194139_b = McMappingDatabase.getSRG("Ingredient.func_194139_b");

	/**
	 * <p>
	 * Name: matchingStacks
	 * </p>
	 */
	public static McObfPair field_193371_b = McMappingDatabase.getSRG("field_193371_b");

	/**
	 * <p>
	 * Name: matchingStacksPacked
	 * </p>
	 */
	public static McObfPair field_194140_c = McMappingDatabase.getSRG("field_194140_c");

	/**
	 * <p>
	 * Name: fromStacks
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/crafting/Ingredient;]
	 * </p>
	 */
	public static McObfPair func_193369_a = McMappingDatabase.getSRG("Ingredient.func_193369_a");

	/**
	 * <p>
	 * Name: fromItems
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/item/Item;)Lnet/minecraft/item/crafting/Ingredient;]
	 * </p>
	 */
	public static McObfPair func_193368_a = McMappingDatabase.getSRG("Ingredient.func_193368_a");

}
