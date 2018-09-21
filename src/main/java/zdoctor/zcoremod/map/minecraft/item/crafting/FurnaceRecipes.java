package zdoctor.zcoremod.map.minecraft.item.crafting;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FurnaceRecipes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akp";
		else
			return "net/minecraft/item/crafting/FurnaceRecipes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akp";
		else
			return "FurnaceRecipes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakp;";
		else
			return "Lnet/minecraft/item/crafting/FurnaceRecipes;";
	}

	/**
	 * <p>
	 * Name: instance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/crafting/FurnaceRecipes;]
	 * </p>
	 */
	public static McObfPair func_77602_a = McMappingDatabase.getSRG("FurnaceRecipes.func_77602_a");

	/**
	 * <p>
	 * Name: getSmeltingResult
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_151395_a = McMappingDatabase.getSRG("FurnaceRecipes.func_151395_a");

	/**
	 * <p>
	 * Name: SMELTING_BASE
	 * </p>
	 */
	public static McObfPair field_77606_a = McMappingDatabase.getSRG("field_77606_a");

	/**
	 * <p>
	 * Name: experienceList
	 * </p>
	 */
	public static McObfPair field_77605_c = McMappingDatabase.getSRG("field_77605_c");

	/**
	 * <p>
	 * Name: getSmeltingList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_77599_b = McMappingDatabase.getSRG("FurnaceRecipes.func_77599_b");

	/**
	 * <p>
	 * Name: addSmelting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;Lnet/minecraft/item/ItemStack;F)V]
	 * </p>
	 */
	public static McObfPair func_151396_a = McMappingDatabase.getSRG("FurnaceRecipes.func_151396_a");

	/**
	 * <p>
	 * Name: compareItemStacks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_151397_a = McMappingDatabase.getSRG("FurnaceRecipes.func_151397_a");

	/**
	 * <p>
	 * Name: addSmeltingRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;F)V]
	 * </p>
	 */
	public static McObfPair func_151394_a = McMappingDatabase.getSRG("FurnaceRecipes.func_151394_a");

	/**
	 * <p>
	 * Name: smeltingList
	 * </p>
	 */
	public static McObfPair field_77604_b = McMappingDatabase.getSRG("field_77604_b");

	/**
	 * <p>
	 * Name: getSmeltingExperience
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)F]
	 * </p>
	 */
	public static McObfPair func_151398_b = McMappingDatabase.getSRG("FurnaceRecipes.func_151398_b");

	/**
	 * <p>
	 * Name: addSmeltingRecipeForBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;Lnet/minecraft/item/ItemStack;F)V]
	 * </p>
	 */
	public static McObfPair func_151393_a = McMappingDatabase.getSRG("FurnaceRecipes.func_151393_a");

}
