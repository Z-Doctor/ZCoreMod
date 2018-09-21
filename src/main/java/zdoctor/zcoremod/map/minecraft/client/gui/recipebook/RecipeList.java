package zdoctor.zcoremod.map.minecraft.client.gui.recipebook;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipeList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bns";
		else
			return "net/minecraft/client/gui/recipebook/RecipeList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bns";
		else
			return "RecipeList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbns;";
		else
			return "Lnet/minecraft/client/gui/recipebook/RecipeList;";
	}

	/**
	 * <p>
	 * Name: hasSingleResultItem
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_194211_e = McMappingDatabase.getSRG("RecipeList.func_194211_e");

	/**
	 * <p>
	 * Name: singleResultItem
	 * </p>
	 */
	public static McObfPair field_194218_e = McMappingDatabase.getSRG("field_194218_e");

	/**
	 * <p>
	 * Name: inBook
	 * </p>
	 */
	public static McObfPair field_194217_d = McMappingDatabase.getSRG("field_194217_d");

	/**
	 * <p>
	 * Name: craftable
	 * </p>
	 */
	public static McObfPair field_194215_b = McMappingDatabase.getSRG("field_194215_b");

	/**
	 * <p>
	 * Name: updateKnownRecipes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/stats/RecipeBook;)V]
	 * </p>
	 */
	public static McObfPair func_194214_a = McMappingDatabase.getSRG("RecipeList.func_194214_a");

	/**
	 * <p>
	 * Name: getDisplayRecipes
	 * </p>
	 * <p>
	 * Desc: [(Z)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_194207_b = McMappingDatabase.getSRG("RecipeList.func_194207_b");

	/**
	 * <p>
	 * Name: containsCraftableRecipes
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192708_c = McMappingDatabase.getSRG("RecipeList.func_192708_c");

	/**
	 * <p>
	 * Name: getRecipes
	 * </p>
	 * <p>
	 * Desc: [(Z)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_194208_a = McMappingDatabase.getSRG("RecipeList.func_194208_a");

	/**
	 * <p>
	 * Name: canCraft
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/util/RecipeItemHelper;IILnet/minecraft/stats/RecipeBook;)V]
	 * </p>
	 */
	public static McObfPair func_194210_a = McMappingDatabase.getSRG("RecipeList.func_194210_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_192709_a = McMappingDatabase.getSRG("RecipeList.func_192709_a");

	/**
	 * <p>
	 * Name: containsValidRecipes
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_194212_c = McMappingDatabase.getSRG("RecipeList.func_194212_c");

	/**
	 * <p>
	 * Name: isCraftable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)Z]
	 * </p>
	 */
	public static McObfPair func_194213_a = McMappingDatabase.getSRG("RecipeList.func_194213_a");

	/**
	 * <p>
	 * Name: isNotEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_194209_a = McMappingDatabase.getSRG("RecipeList.func_194209_a");

	/**
	 * <p>
	 * Name: canFit
	 * </p>
	 */
	public static McObfPair field_194216_c = McMappingDatabase.getSRG("field_194216_c");

	/**
	 * <p>
	 * Name: getRecipes
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_192711_b = McMappingDatabase.getSRG("RecipeList.func_192711_b");

	/**
	 * <p>
	 * Name: recipes
	 * </p>
	 */
	public static McObfPair field_192713_b = McMappingDatabase.getSRG("field_192713_b");

}
