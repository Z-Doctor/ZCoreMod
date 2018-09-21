package zdoctor.zcoremod.map.minecraft.client.gui.recipebook;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiRecipeBook {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bno";
		else
			return "net/minecraft/client/gui/recipebook/GuiRecipeBook";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bno";
		else
			return "GuiRecipeBook";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbno;";
		else
			return "Lnet/minecraft/client/gui/recipebook/GuiRecipeBook;";
	}

	/**
	 * <p>
	 * Name: renderGhostRecipe
	 * </p>
	 * <p>
	 * Desc: [(IIZF)V]
	 * </p>
	 */
	public static McObfPair func_191864_a = McMappingDatabase.getSRG("GuiRecipeBook.func_191864_a");

	/**
	 * <p>
	 * Name: RECIPE_BOOK
	 * </p>
	 */
	public static McObfPair field_191894_a = McMappingDatabase.getSRG("field_191894_a");

	/**
	 * <p>
	 * Name: hasClickedOutside
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_193955_c = McMappingDatabase.getSRG("GuiRecipeBook.func_193955_c");

	/**
	 * <p>
	 * Name: recipeBookPage
	 * </p>
	 */
	public static McObfPair field_193022_s = McMappingDatabase.getSRG("field_193022_s");

	/**
	 * <p>
	 * Name: setupGhostRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_193951_a = McMappingDatabase.getSRG("GuiRecipeBook.func_193951_a");

	/**
	 * <p>
	 * Name: craftingSlots
	 * </p>
	 */
	public static McObfPair field_193961_o = McMappingDatabase.getSRG("field_193961_o");

	/**
	 * <p>
	 * Name: searchBar
	 * </p>
	 */
	public static McObfPair field_193962_q = McMappingDatabase.getSRG("field_193962_q");

	/**
	 * <p>
	 * Name: toggleRecipesBtn
	 * </p>
	 */
	public static McObfPair field_193960_m = McMappingDatabase.getSRG("field_193960_m");

	/**
	 * <p>
	 * Name: setVisible
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_193006_a = McMappingDatabase.getSRG("GuiRecipeBook.func_193006_a");

	/**
	 * <p>
	 * Name: slotClicked
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Slot;)V]
	 * </p>
	 */
	public static McObfPair func_191874_a = McMappingDatabase.getSRG("GuiRecipeBook.func_191874_a");

	/**
	 * <p>
	 * Name: xOffset
	 * </p>
	 */
	public static McObfPair field_191903_n = McMappingDatabase.getSRG("field_191903_n");

	/**
	 * <p>
	 * Name: keyPressed
	 * </p>
	 * <p>
	 * Desc: [(CI)Z]
	 * </p>
	 */
	public static McObfPair func_191859_a = McMappingDatabase.getSRG("GuiRecipeBook.func_191859_a");

	/**
	 * <p>
	 * Name: recipesShown
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_193001_a = McMappingDatabase.getSRG("GuiRecipeBook.func_193001_a");

	/**
	 * <p>
	 * Name: renderTooltip
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_191876_c = McMappingDatabase.getSRG("GuiRecipeBook.func_191876_c");

	/**
	 * <p>
	 * Name: currentTab
	 * </p>
	 */
	public static McObfPair field_191913_x = McMappingDatabase.getSRG("field_191913_x");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)Z]
	 * </p>
	 */
	public static McObfPair func_191862_a = McMappingDatabase.getSRG("GuiRecipeBook.func_191862_a");

	/**
	 * <p>
	 * Name: isOffsetNextToMainGUI
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191880_f = McMappingDatabase.getSRG("GuiRecipeBook.func_191880_f");

	/**
	 * <p>
	 * Name: ghostRecipe
	 * </p>
	 */
	public static McObfPair field_191915_z = McMappingDatabase.getSRG("field_191915_z");

	/**
	 * <p>
	 * Name: isVisible
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191878_b = McMappingDatabase.getSRG("GuiRecipeBook.func_191878_b");

	/**
	 * <p>
	 * Name: updateStackedContents
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193942_g = McMappingDatabase.getSRG("GuiRecipeBook.func_193942_g");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_191905_p = McMappingDatabase.getSRG("field_191905_p");

	/**
	 * <p>
	 * Name: recipeBook
	 * </p>
	 */
	public static McObfPair field_193964_s = McMappingDatabase.getSRG("field_193964_s");

	/**
	 * <p>
	 * Name: stackedContents
	 * </p>
	 */
	public static McObfPair field_193965_u = McMappingDatabase.getSRG("field_193965_u");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_191861_a = McMappingDatabase.getSRG("GuiRecipeBook.func_191861_a");

	/**
	 * <p>
	 * Name: timesInventoryChanged
	 * </p>
	 */
	public static McObfPair field_193966_v = McMappingDatabase.getSRG("field_193966_v");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_191888_F = McMappingDatabase.getSRG("field_191888_F");

	/**
	 * <p>
	 * Name: removed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_191871_c = McMappingDatabase.getSRG("GuiRecipeBook.func_191871_c");

	/**
	 * <p>
	 * Name: initVisuals
	 * </p>
	 * <p>
	 * Desc: [(ZLnet/minecraft/inventory/InventoryCrafting;)V]
	 * </p>
	 */
	public static McObfPair func_193014_a = McMappingDatabase.getSRG("GuiRecipeBook.func_193014_a");

	/**
	 * <p>
	 * Name: lastSearch
	 * </p>
	 */
	public static McObfPair field_193963_r = McMappingDatabase.getSRG("field_193963_r");

	/**
	 * <p>
	 * Name: pirateRecipe
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_193716_a = McMappingDatabase.getSRG("GuiRecipeBook.func_193716_a");

	/**
	 * <p>
	 * Name: recipesUpdated
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193948_e = McMappingDatabase.getSRG("GuiRecipeBook.func_193948_e");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_191904_o = McMappingDatabase.getSRG("field_191904_o");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193957_d = McMappingDatabase.getSRG("GuiRecipeBook.func_193957_d");

	/**
	 * <p>
	 * Name: recipeTabs
	 * </p>
	 */
	public static McObfPair field_193018_j = McMappingDatabase.getSRG("field_193018_j");

	/**
	 * <p>
	 * Name: updateCollections
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_193003_g = McMappingDatabase.getSRG("GuiRecipeBook.func_193003_g");

	/**
	 * <p>
	 * Name: updateScreenPosition
	 * </p>
	 * <p>
	 * Desc: [(ZII)I]
	 * </p>
	 */
	public static McObfPair func_193011_a = McMappingDatabase.getSRG("GuiRecipeBook.func_193011_a");

	/**
	 * <p>
	 * Name: sendUpdateSettings
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193956_j = McMappingDatabase.getSRG("GuiRecipeBook.func_193956_j");

	/**
	 * <p>
	 * Name: toggleVisibility
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_191866_a = McMappingDatabase.getSRG("GuiRecipeBook.func_191866_a");

	/**
	 * <p>
	 * Name: updateTabs
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193949_f = McMappingDatabase.getSRG("GuiRecipeBook.func_193949_f");

	/**
	 * <p>
	 * Name: renderGhostRecipeTooltip
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_193015_d = McMappingDatabase.getSRG("GuiRecipeBook.func_193015_d");

}
