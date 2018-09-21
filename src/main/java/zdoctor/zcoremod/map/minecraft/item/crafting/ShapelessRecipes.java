package zdoctor.zcoremod.map.minecraft.item.crafting;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ShapelessRecipes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akx";
		else
			return "net/minecraft/item/crafting/ShapelessRecipes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akx";
		else
			return "ShapelessRecipes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakx;";
		else
			return "Lnet/minecraft/item/crafting/ShapelessRecipes;";
	}

	/**
	 * <p>
	 * Name: matches
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;Lnet/minecraft/world/World;)Z]
	 * </p>
	 */
	public static McObfPair func_77569_a = McMappingDatabase.getSRG("ShapelessRecipes.func_77569_a");

	/**
	 * <p>
	 * Name: getCraftingResult
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77572_b = McMappingDatabase.getSRG("ShapelessRecipes.func_77572_b");

	/**
	 * <p>
	 * Name: recipeOutput
	 * </p>
	 */
	public static McObfPair field_77580_a = McMappingDatabase.getSRG("field_77580_a");

	/**
	 * <p>
	 * Name: getRecipeOutput
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77571_b = McMappingDatabase.getSRG("ShapelessRecipes.func_77571_b");

	/**
	 * <p>
	 * Name: deserializeIngredients
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonArray;)Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_193364_a = McMappingDatabase.getSRG("ShapelessRecipes.func_193364_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/item/crafting/ShapelessRecipes;]
	 * </p>
	 */
	public static McObfPair func_193363_a = McMappingDatabase.getSRG("ShapelessRecipes.func_193363_a");

	/**
	 * <p>
	 * Name: getGroup
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_193358_e = McMappingDatabase.getSRG("ShapelessRecipes.func_193358_e");

	/**
	 * <p>
	 * Name: getRemainingItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;)Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_179532_b = McMappingDatabase.getSRG("ShapelessRecipes.func_179532_b");

	/**
	 * <p>
	 * Name: getIngredients
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_192400_c = McMappingDatabase.getSRG("ShapelessRecipes.func_192400_c");

	/**
	 * <p>
	 * Name: canFit
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_194133_a = McMappingDatabase.getSRG("ShapelessRecipes.func_194133_a");

	/**
	 * <p>
	 * Name: recipeItems
	 * </p>
	 */
	public static McObfPair field_77579_b = McMappingDatabase.getSRG("field_77579_b");

	/**
	 * <p>
	 * Name: group
	 * </p>
	 */
	public static McObfPair field_194138_c = McMappingDatabase.getSRG("field_194138_c");

}
