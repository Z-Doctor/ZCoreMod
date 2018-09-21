package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipeBookClient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cih";
		else
			return "net/minecraft/client/util/RecipeBookClient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cih";
		else
			return "RecipeBookClient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcih;";
		else
			return "Lnet/minecraft/client/util/RecipeBookClient;";
	}

	/**
	 * <p>
	 * Name: newRecipeList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;)Lnet/minecraft/client/gui/recipebook/RecipeList;]
	 * </p>
	 */
	public static McObfPair func_194082_a = McMappingDatabase.getSRG("RecipeBookClient.func_194082_a");

	/**
	 * <p>
	 * Name: ALL_RECIPES
	 * </p>
	 */
	public static McObfPair field_194087_f = McMappingDatabase.getSRG("field_194087_f");

	/**
	 * <p>
	 * Name: getItemStackTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/creativetab/CreativeTabs;]
	 * </p>
	 */
	public static McObfPair func_194084_a = McMappingDatabase.getSRG("RecipeBookClient.func_194084_a");

	/**
	 * <p>
	 * Name: RECIPES_BY_TAB
	 * </p>
	 */
	public static McObfPair field_194086_e = McMappingDatabase.getSRG("field_194086_e");

}
