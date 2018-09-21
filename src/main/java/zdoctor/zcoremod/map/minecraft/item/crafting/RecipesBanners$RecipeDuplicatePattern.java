package zdoctor.zcoremod.map.minecraft.item.crafting;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipesBanners$RecipeDuplicatePattern {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akm$b";
		else
			return "net/minecraft/item/crafting/RecipesBanners$RecipeDuplicatePattern";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akm$b";
		else
			return "RecipesBanners$RecipeDuplicatePattern";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakm$b;";
		else
			return "Lnet/minecraft/item/crafting/RecipesBanners$RecipeDuplicatePattern;";
	}

	/**
	 * <p>
	 * Name: getRecipeOutput
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77571_b = McMappingDatabase.getSRG("RecipesBanners$RecipeDuplicatePattern.func_77571_b");

	/**
	 * <p>
	 * Name: canFit
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_194133_a = McMappingDatabase.getSRG("RecipesBanners$RecipeDuplicatePattern.func_194133_a");

	/**
	 * <p>
	 * Name: matches
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;Lnet/minecraft/world/World;)Z]
	 * </p>
	 */
	public static McObfPair func_77569_a = McMappingDatabase.getSRG("RecipesBanners$RecipeDuplicatePattern.func_77569_a");

	/**
	 * <p>
	 * Name: getRemainingItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;)Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_179532_b = McMappingDatabase.getSRG("RecipesBanners$RecipeDuplicatePattern.func_179532_b");

	/**
	 * <p>
	 * Name: isDynamic
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192399_d = McMappingDatabase.getSRG("RecipesBanners$RecipeDuplicatePattern.func_192399_d");

	/**
	 * <p>
	 * Name: getCraftingResult
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77572_b = McMappingDatabase.getSRG("RecipesBanners$RecipeDuplicatePattern.func_77572_b");

}
