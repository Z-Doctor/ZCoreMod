package zdoctor.zcoremod.map.minecraft.client.gui.recipebook;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiRecipeOverlay {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnn";
		else
			return "net/minecraft/client/gui/recipebook/GuiRecipeOverlay";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnn";
		else
			return "GuiRecipeOverlay";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnn;";
		else
			return "Lnet/minecraft/client/gui/recipebook/GuiRecipeOverlay;";
	}

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_191852_j = McMappingDatabase.getSRG("field_191852_j");

	/**
	 * <p>
	 * Name: RECIPE_BOOK_TEXTURE
	 * </p>
	 */
	public static McObfPair field_191847_a = McMappingDatabase.getSRG("field_191847_a");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_191851_i = McMappingDatabase.getSRG("field_191851_i");

	/**
	 * <p>
	 * Name: buttonList
	 * </p>
	 */
	public static McObfPair field_193972_f = McMappingDatabase.getSRG("field_193972_f");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_191853_k = McMappingDatabase.getSRG("field_191853_k");

	/**
	 * <p>
	 * Name: setVisible
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_192999_a = McMappingDatabase.getSRG("GuiRecipeOverlay.func_192999_a");

	/**
	 * <p>
	 * Name: recipeList
	 * </p>
	 */
	public static McObfPair field_191848_f = McMappingDatabase.getSRG("field_191848_f");

	/**
	 * <p>
	 * Name: lastRecipeClicked
	 * </p>
	 */
	public static McObfPair field_193973_l = McMappingDatabase.getSRG("field_193973_l");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/gui/recipebook/RecipeList;IIIIFLnet/minecraft/stats/RecipeBook;)V]
	 * </p>
	 */
	public static McObfPair func_191845_a = McMappingDatabase.getSRG("GuiRecipeOverlay.func_191845_a");

	/**
	 * <p>
	 * Name: time
	 * </p>
	 */
	public static McObfPair field_193974_m = McMappingDatabase.getSRG("field_193974_m");

	/**
	 * <p>
	 * Name: isVisible
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191839_a = McMappingDatabase.getSRG("GuiRecipeOverlay.func_191839_a");

	/**
	 * <p>
	 * Name: getLastRecipeClicked
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/crafting/IRecipe;]
	 * </p>
	 */
	public static McObfPair func_193967_b = McMappingDatabase.getSRG("GuiRecipeOverlay.func_193967_b");

	/**
	 * <p>
	 * Name: getRecipeList
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/recipebook/RecipeList;]
	 * </p>
	 */
	public static McObfPair func_193971_a = McMappingDatabase.getSRG("GuiRecipeOverlay.func_193971_a");

	/**
	 * <p>
	 * Name: visible
	 * </p>
	 */
	public static McObfPair field_191850_h = McMappingDatabase.getSRG("field_191850_h");

	/**
	 * <p>
	 * Name: nineInchSprite
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_191846_c = McMappingDatabase.getSRG("GuiRecipeOverlay.func_191846_c");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_191842_a = McMappingDatabase.getSRG("GuiRecipeOverlay.func_191842_a");

	/**
	 * <p>
	 * Name: buttonClicked
	 * </p>
	 * <p>
	 * Desc: [(III)Z]
	 * </p>
	 */
	public static McObfPair func_193968_a = McMappingDatabase.getSRG("GuiRecipeOverlay.func_193968_a");

}
