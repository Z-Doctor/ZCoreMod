package zdoctor.zcoremod.map.minecraft.client.gui.toasts;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipeToast {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjz";
		else
			return "net/minecraft/client/gui/toasts/RecipeToast";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjz";
		else
			return "RecipeToast";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjz;";
		else
			return "Lnet/minecraft/client/gui/toasts/RecipeToast;";
	}

	/**
	 * <p>
	 * Name: recipesOutputs
	 * </p>
	 */
	public static McObfPair field_193666_c = McMappingDatabase.getSRG("field_193666_c");

	/**
	 * <p>
	 * Name: firstDrawTime
	 * </p>
	 */
	public static McObfPair field_193667_d = McMappingDatabase.getSRG("field_193667_d");

	/**
	 * <p>
	 * Name: addRecipeOutput
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_193664_a = McMappingDatabase.getSRG("RecipeToast.func_193664_a");

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/toasts/GuiToast;J)Lnet/minecraft/client/gui/toasts/IToast$Visibility;]
	 * </p>
	 */
	public static McObfPair func_193653_a = McMappingDatabase.getSRG("RecipeToast.func_193653_a");

	/**
	 * <p>
	 * Name: hasNewOutputs
	 * </p>
	 */
	public static McObfPair field_193668_e = McMappingDatabase.getSRG("field_193668_e");

	/**
	 * <p>
	 * Name: addOrUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/toasts/GuiToast;Lnet/minecraft/item/crafting/IRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_193665_a = McMappingDatabase.getSRG("RecipeToast.func_193665_a");

}
