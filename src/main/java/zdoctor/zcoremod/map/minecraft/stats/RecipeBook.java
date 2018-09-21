package zdoctor.zcoremod.map.minecraft.stats;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipeBook {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ql";
		else
			return "net/minecraft/stats/RecipeBook";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ql";
		else
			return "RecipeBook";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lql;";
		else
			return "Lnet/minecraft/stats/RecipeBook;";
	}

	/**
	 * <p>
	 * Name: isGuiOpen
	 * </p>
	 */
	public static McObfPair field_192818_b = McMappingDatabase.getSRG("field_192818_b");

	/**
	 * <p>
	 * Name: getRecipeId
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)I]
	 * </p>
	 */
	public static McObfPair func_194075_d = McMappingDatabase.getSRG("RecipeBook.func_194075_d");

	/**
	 * <p>
	 * Name: isGuiOpen
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192812_b = McMappingDatabase.getSRG("RecipeBook.func_192812_b");

	/**
	 * <p>
	 * Name: isUnlocked
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)Z]
	 * </p>
	 */
	public static McObfPair func_193830_f = McMappingDatabase.getSRG("RecipeBook.func_193830_f");

	/**
	 * <p>
	 * Name: markSeen
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_194074_f = McMappingDatabase.getSRG("RecipeBook.func_194074_f");

	/**
	 * <p>
	 * Name: markNew
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_193825_e = McMappingDatabase.getSRG("RecipeBook.func_193825_e");

	/**
	 * <p>
	 * Name: setGuiOpen
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_192813_a = McMappingDatabase.getSRG("RecipeBook.func_192813_a");

	/**
	 * <p>
	 * Name: lock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_193831_b = McMappingDatabase.getSRG("RecipeBook.func_193831_b");

	/**
	 * <p>
	 * Name: isNew
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)Z]
	 * </p>
	 */
	public static McObfPair func_194076_e = McMappingDatabase.getSRG("RecipeBook.func_194076_e");

	/**
	 * <p>
	 * Name: recipes
	 * </p>
	 */
	public static McObfPair field_194077_a = McMappingDatabase.getSRG("field_194077_a");

	/**
	 * <p>
	 * Name: copyFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/stats/RecipeBook;)V]
	 * </p>
	 */
	public static McObfPair func_193824_a = McMappingDatabase.getSRG("RecipeBook.func_193824_a");

	/**
	 * <p>
	 * Name: isFilteringCraftable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192815_c = McMappingDatabase.getSRG("RecipeBook.func_192815_c");

	/**
	 * <p>
	 * Name: unlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_194073_a = McMappingDatabase.getSRG("RecipeBook.func_194073_a");

	/**
	 * <p>
	 * Name: newRecipes
	 * </p>
	 */
	public static McObfPair field_194078_b = McMappingDatabase.getSRG("field_194078_b");

	/**
	 * <p>
	 * Name: setFilteringCraftable
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_192810_b = McMappingDatabase.getSRG("RecipeBook.func_192810_b");

	/**
	 * <p>
	 * Name: isFilteringCraftable
	 * </p>
	 */
	public static McObfPair field_192819_c = McMappingDatabase.getSRG("field_192819_c");

}
