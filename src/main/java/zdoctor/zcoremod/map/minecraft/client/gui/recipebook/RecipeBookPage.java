package zdoctor.zcoremod.map.minecraft.client.gui.recipebook;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipeBookPage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnp";
		else
			return "net/minecraft/client/gui/recipebook/RecipeBookPage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnp";
		else
			return "RecipeBookPage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnp;";
		else
			return "Lnet/minecraft/client/gui/recipebook/RecipeBookPage;";
	}

	/**
	 * <p>
	 * Name: buttons
	 * </p>
	 */
	public static McObfPair field_193743_h = McMappingDatabase.getSRG("field_193743_h");

	/**
	 * <p>
	 * Name: updateLists
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Z)V]
	 * </p>
	 */
	public static McObfPair func_194192_a = McMappingDatabase.getSRG("RecipeBookPage.func_194192_a");

	/**
	 * <p>
	 * Name: updateButtonsForPage
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_194198_d = McMappingDatabase.getSRG("RecipeBookPage.func_194198_d");

	/**
	 * <p>
	 * Name: minecraft
	 * </p>
	 */
	public static McObfPair field_193754_s = McMappingDatabase.getSRG("field_193754_s");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(IIIIF)V]
	 * </p>
	 */
	public static McObfPair func_194191_a = McMappingDatabase.getSRG("RecipeBookPage.func_194191_a");

	/**
	 * <p>
	 * Name: getLastClickedRecipe
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/crafting/IRecipe;]
	 * </p>
	 */
	public static McObfPair func_194193_a = McMappingDatabase.getSRG("RecipeBookPage.func_194193_a");

	/**
	 * <p>
	 * Name: renderTooltip
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_193721_a = McMappingDatabase.getSRG("RecipeBookPage.func_193721_a");

	/**
	 * <p>
	 * Name: backButton
	 * </p>
	 */
	public static McObfPair field_193741_f = McMappingDatabase.getSRG("field_193741_f");

	/**
	 * <p>
	 * Name: lastClickedRecipeList
	 * </p>
	 */
	public static McObfPair field_194206_m = McMappingDatabase.getSRG("field_194206_m");

	/**
	 * <p>
	 * Name: currentPage
	 * </p>
	 */
	public static McObfPair field_193738_c = McMappingDatabase.getSRG("field_193738_c");

	/**
	 * <p>
	 * Name: overlay
	 * </p>
	 */
	public static McObfPair field_194202_c = McMappingDatabase.getSRG("field_194202_c");

	/**
	 * <p>
	 * Name: recipeLists
	 * </p>
	 */
	public static McObfPair field_194203_f = McMappingDatabase.getSRG("field_194203_f");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_193757_v = McMappingDatabase.getSRG("field_193757_v");

	/**
	 * <p>
	 * Name: getLastClickedRecipeList
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/recipebook/RecipeList;]
	 * </p>
	 */
	public static McObfPair func_194199_b = McMappingDatabase.getSRG("RecipeBookPage.func_194199_b");

	/**
	 * <p>
	 * Name: totalPages
	 * </p>
	 */
	public static McObfPair field_193737_b = McMappingDatabase.getSRG("field_193737_b");

	/**
	 * <p>
	 * Name: updateArrowButtons
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_194197_e = McMappingDatabase.getSRG("RecipeBookPage.func_194197_e");

	/**
	 * <p>
	 * Name: recipesShown
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_194195_a = McMappingDatabase.getSRG("RecipeBookPage.func_194195_a");

	/**
	 * <p>
	 * Name: setInvisible
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_194200_c = McMappingDatabase.getSRG("RecipeBookPage.func_194200_c");

	/**
	 * <p>
	 * Name: recipeBook
	 * </p>
	 */
	public static McObfPair field_194204_k = McMappingDatabase.getSRG("field_194204_k");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)V]
	 * </p>
	 */
	public static McObfPair func_194194_a = McMappingDatabase.getSRG("RecipeBookPage.func_194194_a");

	/**
	 * <p>
	 * Name: hoveredButton
	 * </p>
	 */
	public static McObfPair field_194201_b = McMappingDatabase.getSRG("field_194201_b");

	/**
	 * <p>
	 * Name: forwardButton
	 * </p>
	 */
	public static McObfPair field_193740_e = McMappingDatabase.getSRG("field_193740_e");

	/**
	 * <p>
	 * Name: lastClickedRecipe
	 * </p>
	 */
	public static McObfPair field_194205_l = McMappingDatabase.getSRG("field_194205_l");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/recipebook/GuiRecipeBook;)V]
	 * </p>
	 */
	public static McObfPair func_193732_a = McMappingDatabase.getSRG("RecipeBookPage.func_193732_a");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(IIIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_194196_a = McMappingDatabase.getSRG("RecipeBookPage.func_194196_a");

}
