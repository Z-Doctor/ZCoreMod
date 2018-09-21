package zdoctor.zcoremod.map.minecraft.item.crafting;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CraftingManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aku";
		else
			return "net/minecraft/item/crafting/CraftingManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aku";
		else
			return "CraftingManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laku;";
		else
			return "Lnet/minecraft/item/crafting/CraftingManager;";
	}

	/**
	 * <p>
	 * Name: REGISTRY
	 * </p>
	 */
	public static McObfPair field_193380_a = McMappingDatabase.getSRG("field_193380_a");

	/**
	 * <p>
	 * Name: getRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/item/crafting/IRecipe;]
	 * </p>
	 */
	public static McObfPair func_193373_a = McMappingDatabase.getSRG("CraftingManager.func_193373_a");

	/**
	 * <p>
	 * Name: findMatchingRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;Lnet/minecraft/world/World;)Lnet/minecraft/item/crafting/IRecipe;]
	 * </p>
	 */
	public static McObfPair func_192413_b = McMappingDatabase.getSRG("CraftingManager.func_192413_b");

	/**
	 * <p>
	 * Name: getRemainingItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;Lnet/minecraft/world/World;)Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_180303_b = McMappingDatabase.getSRG("CraftingManager.func_180303_b");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193377_a = McMappingDatabase.getSRG("CraftingManager.func_193377_a");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/item/crafting/IRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_193379_a = McMappingDatabase.getSRG("CraftingManager.func_193379_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_192422_a = McMappingDatabase.getSRG("field_192422_a");

	/**
	 * <p>
	 * Name: getIDForRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)I]
	 * </p>
	 */
	public static McObfPair func_193375_a = McMappingDatabase.getSRG("CraftingManager.func_193375_a");

	/**
	 * <p>
	 * Name: parseJsonRecipes
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192420_c = McMappingDatabase.getSRG("CraftingManager.func_192420_c");

	/**
	 * <p>
	 * Name: getRecipeById
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/crafting/IRecipe;]
	 * </p>
	 */
	public static McObfPair func_193374_a = McMappingDatabase.getSRG("CraftingManager.func_193374_a");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/item/crafting/IRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_193372_a = McMappingDatabase.getSRG("CraftingManager.func_193372_a");

	/**
	 * <p>
	 * Name: nextAvailableId
	 * </p>
	 */
	public static McObfPair field_193381_c = McMappingDatabase.getSRG("field_193381_c");

	/**
	 * <p>
	 * Name: findMatchingResult
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/InventoryCrafting;Lnet/minecraft/world/World;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82787_a = McMappingDatabase.getSRG("CraftingManager.func_82787_a");

	/**
	 * <p>
	 * Name: parseRecipeJson
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/item/crafting/IRecipe;]
	 * </p>
	 */
	public static McObfPair func_193376_a = McMappingDatabase.getSRG("CraftingManager.func_193376_a");

}
