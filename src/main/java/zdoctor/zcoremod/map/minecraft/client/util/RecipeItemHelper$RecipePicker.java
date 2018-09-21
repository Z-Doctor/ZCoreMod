package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipeItemHelper$RecipePicker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aef$a";
		else
			return "net/minecraft/client/util/RecipeItemHelper$RecipePicker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aef$a";
		else
			return "RecipeItemHelper$RecipePicker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laef$a;";
		else
			return "Lnet/minecraft/client/util/RecipeItemHelper$RecipePicker;";
	}

	/**
	 * <p>
	 * Name: recipe
	 * </p>
	 */
	public static McObfPair field_194105_b = McMappingDatabase.getSRG("field_194105_b");

	/**
	 * <p>
	 * Name: possessedIngredientStacks
	 * </p>
	 */
	public static McObfPair field_194108_e = McMappingDatabase.getSRG("field_194108_e");

	/**
	 * <p>
	 * Name: toggleResidual
	 * </p>
	 * <p>
	 * Desc: [(ZII)V]
	 * </p>
	 */
	public static McObfPair func_194089_c = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194089_c");

	/**
	 * <p>
	 * Name: dfs
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_194098_a = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194098_a");

	/**
	 * <p>
	 * Name: hasResidual
	 * </p>
	 * <p>
	 * Desc: [(ZII)Z]
	 * </p>
	 */
	public static McObfPair func_194100_b = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194100_b");

	/**
	 * <p>
	 * Name: path
	 * </p>
	 */
	public static McObfPair field_194111_h = McMappingDatabase.getSRG("field_194111_h");

	/**
	 * <p>
	 * Name: ingredients
	 * </p>
	 */
	public static McObfPair field_194106_c = McMappingDatabase.getSRG("field_194106_c");

	/**
	 * <p>
	 * Name: ingredientCount
	 * </p>
	 */
	public static McObfPair field_194107_d = McMappingDatabase.getSRG("field_194107_d");

	/**
	 * <p>
	 * Name: getIndex
	 * </p>
	 * <p>
	 * Desc: [(ZII)I]
	 * </p>
	 */
	public static McObfPair func_194095_d = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194095_d");

	/**
	 * <p>
	 * Name: visit
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_194088_a = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194088_a");

	/**
	 * <p>
	 * Name: tryPick
	 * </p>
	 * <p>
	 * Desc: [(ILit/unimi/dsi/fastutil/ints/IntList;)Z]
	 * </p>
	 */
	public static McObfPair func_194092_a = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194092_a");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_194110_g = McMappingDatabase.getSRG("field_194110_g");

	/**
	 * <p>
	 * Name: tryPickAll
	 * </p>
	 * <p>
	 * Desc: [(ILit/unimi/dsi/fastutil/ints/IntList;)I]
	 * </p>
	 */
	public static McObfPair func_194102_b = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194102_b");

	/**
	 * <p>
	 * Name: getSatisfiedIndex
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_194094_d = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194094_d");

	/**
	 * <p>
	 * Name: hasVisited
	 * </p>
	 * <p>
	 * Desc: [(ZI)Z]
	 * </p>
	 */
	public static McObfPair func_194101_b = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194101_b");

	/**
	 * <p>
	 * Name: possessedIngredientStackCount
	 * </p>
	 */
	public static McObfPair field_194109_f = McMappingDatabase.getSRG("field_194109_f");

	/**
	 * <p>
	 * Name: setSatisfied
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_194096_c = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194096_c");

	/**
	 * <p>
	 * Name: getUniqueAvailIngredientItems
	 * </p>
	 * <p>
	 * Desc: [()[I]
	 * </p>
	 */
	public static McObfPair func_194097_a = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194097_a");

	/**
	 * <p>
	 * Name: getVisitedIndex
	 * </p>
	 * <p>
	 * Desc: [(ZI)I]
	 * </p>
	 */
	public static McObfPair func_194099_c = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194099_c");

	/**
	 * <p>
	 * Name: getMinIngredientCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_194090_b = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194090_b");

	/**
	 * <p>
	 * Name: isSatisfied
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_194091_b = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194091_b");

	/**
	 * <p>
	 * Name: hasConnection
	 * </p>
	 * <p>
	 * Desc: [(ZII)Z]
	 * </p>
	 */
	public static McObfPair func_194093_a = McMappingDatabase.getSRG("RecipeItemHelper$RecipePicker.func_194093_a");

}
