package zdoctor.zcoremod.map.minecraft.item.crafting;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ShapedRecipes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akw";
		else
			return "net/minecraft/item/crafting/ShapedRecipes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akw";
		else
			return "ShapedRecipes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakw;";
		else
			return "Lnet/minecraft/item/crafting/ShapedRecipes;";
	}

	/**
	 * <p>
	 * Name: getRecipeOutput
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77571_b = McMappingDatabase.getSRG("ShapedRecipes.func_77571_b");

	/**
	 * <p>
	 * Name: getIngredients
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_192400_c = McMappingDatabase.getSRG("ShapedRecipes.func_192400_c");

	/**
	 * <p>
	 * Name: recipeOutput
	 * </p>
	 */
	public static McObfPair field_77575_e = McMappingDatabase.getSRG("field_77575_e");

	/**
	 * <p>
	 * Name: getWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_192403_f = McMappingDatabase.getSRG("ShapedRecipes.func_192403_f");

	/**
	 * <p>
	 * Name: shrink
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;)[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_194134_a = McMappingDatabase.getSRG("ShapedRecipes.func_194134_a");

	/**
	 * <p>
	 * Name: getHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_192404_g = McMappingDatabase.getSRG("ShapedRecipes.func_192404_g");

	/**
	 * <p>
	 * Name: group
	 * </p>
	 */
	public static McObfPair field_194137_e = McMappingDatabase.getSRG("field_194137_e");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/item/crafting/ShapedRecipes;]
	 * </p>
	 */
	public static McObfPair func_193362_a = McMappingDatabase.getSRG("ShapedRecipes.func_193362_a");

	/**
	 * <p>
	 * Name: firstNonSpace
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_194135_a = McMappingDatabase.getSRG("ShapedRecipes.func_194135_a");

	/**
	 * <p>
	 * Name: deserializeItem
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Z)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_192405_a = McMappingDatabase.getSRG("ShapedRecipes.func_192405_a");

	/**
	 * <p>
	 * Name: lastNonSpace
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_194136_b = McMappingDatabase.getSRG("ShapedRecipes.func_194136_b");

	/**
	 * <p>
	 * Name: recipeWidth
	 * </p>
	 */
	public static McObfPair field_77576_b = McMappingDatabase.getSRG("field_77576_b");

	/**
	 * <p>
	 * Name: canFit
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_194133_a = McMappingDatabase.getSRG("ShapedRecipes.func_194133_a");

	/**
	 * <p>
	 * Name: checkMatch
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;IIZ)Z]
	 * </p>
	 */
	public static McObfPair func_77573_a = McMappingDatabase.getSRG("ShapedRecipes.func_77573_a");

	/**
	 * <p>
	 * Name: patternFromJson
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonArray;)[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_192407_a = McMappingDatabase.getSRG("ShapedRecipes.func_192407_a");

	/**
	 * <p>
	 * Name: getGroup
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_193358_e = McMappingDatabase.getSRG("ShapedRecipes.func_193358_e");

	/**
	 * <p>
	 * Name: getCraftingResult
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77572_b = McMappingDatabase.getSRG("ShapedRecipes.func_77572_b");

	/**
	 * <p>
	 * Name: recipeHeight
	 * </p>
	 */
	public static McObfPair field_77577_c = McMappingDatabase.getSRG("field_77577_c");

	/**
	 * <p>
	 * Name: getRemainingItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;)Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_179532_b = McMappingDatabase.getSRG("ShapedRecipes.func_179532_b");

	/**
	 * <p>
	 * Name: deserializeKey
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_192408_a = McMappingDatabase.getSRG("ShapedRecipes.func_192408_a");

	/**
	 * <p>
	 * Name: matches
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;Lnet/minecraft/world/World;)Z]
	 * </p>
	 */
	public static McObfPair func_77569_a = McMappingDatabase.getSRG("ShapedRecipes.func_77569_a");

	/**
	 * <p>
	 * Name: recipeItems
	 * </p>
	 */
	public static McObfPair field_77574_d = McMappingDatabase.getSRG("field_77574_d");

	/**
	 * <p>
	 * Name: deserializeIngredients
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;Ljava/util/Map;II)Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_192402_a = McMappingDatabase.getSRG("ShapedRecipes.func_192402_a");

	/**
	 * <p>
	 * Name: deserializeIngredient
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Lnet/minecraft/item/crafting/Ingredient;]
	 * </p>
	 */
	public static McObfPair func_193361_a = McMappingDatabase.getSRG("ShapedRecipes.func_193361_a");

}
