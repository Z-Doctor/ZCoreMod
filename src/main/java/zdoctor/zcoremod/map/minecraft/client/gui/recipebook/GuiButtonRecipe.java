package zdoctor.zcoremod.map.minecraft.client.gui.recipebook;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiButtonRecipe {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnr";
		else
			return "net/minecraft/client/gui/recipebook/GuiButtonRecipe";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnr";
		else
			return "GuiButtonRecipe";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnr;";
		else
			return "Lnet/minecraft/client/gui/recipebook/GuiButtonRecipe;";
	}

	/**
	 * <p>
	 * Name: getList
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/recipebook/RecipeList;]
	 * </p>
	 */
	public static McObfPair func_191771_c = McMappingDatabase.getSRG("GuiButtonRecipe.func_191771_c");

	/**
	 * <p>
	 * Name: RECIPE_BOOK
	 * </p>
	 */
	public static McObfPair field_191780_o = McMappingDatabase.getSRG("field_191780_o");

	/**
	 * <p>
	 * Name: getButtonWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_146117_b = McMappingDatabase.getSRG("GuiButtonRecipe.func_146117_b");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/recipebook/RecipeList;Lnet/minecraft/client/gui/recipebook/RecipeBookPage;Lnet/minecraft/stats/RecipeBook;)V]
	 * </p>
	 */
	public static McObfPair func_193928_a = McMappingDatabase.getSRG("GuiButtonRecipe.func_193928_a");

	/**
	 * <p>
	 * Name: animationTime
	 * </p>
	 */
	public static McObfPair field_191778_t = McMappingDatabase.getSRG("field_191778_t");

	/**
	 * <p>
	 * Name: getToolTipText
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiScreen;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_191772_a = McMappingDatabase.getSRG("GuiButtonRecipe.func_191772_a");

	/**
	 * <p>
	 * Name: list
	 * </p>
	 */
	public static McObfPair field_191774_p = McMappingDatabase.getSRG("field_191774_p");

	/**
	 * <p>
	 * Name: time
	 * </p>
	 */
	public static McObfPair field_193931_r = McMappingDatabase.getSRG("field_193931_r");

	/**
	 * <p>
	 * Name: getOrderedRecipes
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_193927_f = McMappingDatabase.getSRG("GuiButtonRecipe.func_193927_f");

	/**
	 * <p>
	 * Name: isOnlyOption
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193929_d = McMappingDatabase.getSRG("GuiButtonRecipe.func_193929_d");

	/**
	 * <p>
	 * Name: getRecipe
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/crafting/IRecipe;]
	 * </p>
	 */
	public static McObfPair func_193760_e = McMappingDatabase.getSRG("GuiButtonRecipe.func_193760_e");

	/**
	 * <p>
	 * Name: drawButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IIF)V]
	 * </p>
	 */
	public static McObfPair func_191745_a = McMappingDatabase.getSRG("GuiButtonRecipe.func_191745_a");

	/**
	 * <p>
	 * Name: currentIndex
	 * </p>
	 */
	public static McObfPair field_193932_t = McMappingDatabase.getSRG("field_193932_t");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_191770_c = McMappingDatabase.getSRG("GuiButtonRecipe.func_191770_c");

	/**
	 * <p>
	 * Name: book
	 * </p>
	 */
	public static McObfPair field_193930_p = McMappingDatabase.getSRG("field_193930_p");

}
