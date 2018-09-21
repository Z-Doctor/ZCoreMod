package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipeItemHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aef";
		else
			return "net/minecraft/client/util/RecipeItemHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aef";
		else
			return "RecipeItemHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laef;";
		else
			return "Lnet/minecraft/client/util/RecipeItemHelper;";
	}

	/**
	 * <p>
	 * Name: increment
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_194117_b = McMappingDatabase.getSRG("RecipeItemHelper.func_194117_b");

	/**
	 * <p>
	 * Name: accountStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_194112_a = McMappingDatabase.getSRG("RecipeItemHelper.func_194112_a");

	/**
	 * <p>
	 * Name: containsItem
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_194120_a = McMappingDatabase.getSRG("RecipeItemHelper.func_194120_a");

	/**
	 * <p>
	 * Name: getBiggestCraftableStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;ILit/unimi/dsi/fastutil/ints/IntList;)I]
	 * </p>
	 */
	public static McObfPair func_194121_a = McMappingDatabase.getSRG("RecipeItemHelper.func_194121_a");

	/**
	 * <p>
	 * Name: canCraft
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;Lit/unimi/dsi/fastutil/ints/IntList;)Z]
	 * </p>
	 */
	public static McObfPair func_194116_a = McMappingDatabase.getSRG("RecipeItemHelper.func_194116_a");

	/**
	 * <p>
	 * Name: getBiggestCraftableStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;Lit/unimi/dsi/fastutil/ints/IntList;)I]
	 * </p>
	 */
	public static McObfPair func_194114_b = McMappingDatabase.getSRG("RecipeItemHelper.func_194114_b");

	/**
	 * <p>
	 * Name: itemToCount
	 * </p>
	 */
	public static McObfPair field_194124_a = McMappingDatabase.getSRG("field_194124_a");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_194119_a = McMappingDatabase.getSRG("RecipeItemHelper.func_194119_a");

	/**
	 * <p>
	 * Name: pack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_194113_b = McMappingDatabase.getSRG("RecipeItemHelper.func_194113_b");

	/**
	 * <p>
	 * Name: tryTake
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_194122_a = McMappingDatabase.getSRG("RecipeItemHelper.func_194122_a");

	/**
	 * <p>
	 * Name: unpack
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_194115_b = McMappingDatabase.getSRG("RecipeItemHelper.func_194115_b");

	/**
	 * <p>
	 * Name: canCraft
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;Lit/unimi/dsi/fastutil/ints/IntList;I)Z]
	 * </p>
	 */
	public static McObfPair func_194118_a = McMappingDatabase.getSRG("RecipeItemHelper.func_194118_a");

}
