package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiCrafting {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmn";
		else
			return "net/minecraft/client/gui/inventory/GuiCrafting";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmn";
		else
			return "GuiCrafting";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmn;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiCrafting;";
	}

	/**
	 * <p>
	 * Name: recipeButton
	 * </p>
	 */
	public static McObfPair field_192049_w = McMappingDatabase.getSRG("field_192049_w");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiCrafting.func_73864_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiCrafting.func_73866_w_");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiCrafting.func_146284_a");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiCrafting.func_73876_c");

	/**
	 * <p>
	 * Name: CRAFTING_TABLE_GUI_TEXTURES
	 * </p>
	 */
	public static McObfPair field_147019_u = McMappingDatabase.getSRG("field_147019_u");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiCrafting.func_146976_a");

	/**
	 * <p>
	 * Name: handleMouseClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Slot;IILnet/minecraft/inventory/ClickType;)V]
	 * </p>
	 */
	public static McObfPair func_184098_a = McMappingDatabase.getSRG("GuiCrafting.func_184098_a");

	/**
	 * <p>
	 * Name: recipeBookGui
	 * </p>
	 */
	public static McObfPair field_192050_x = McMappingDatabase.getSRG("field_192050_x");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiCrafting.func_146281_b");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiCrafting.func_73869_a");

	/**
	 * <p>
	 * Name: recipesUpdated
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192043_J_ = McMappingDatabase.getSRG("GuiCrafting.func_192043_J_");

	/**
	 * <p>
	 * Name: isPointInRegion
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_146978_c = McMappingDatabase.getSRG("GuiCrafting.func_146978_c");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiCrafting.func_146979_b");

	/**
	 * <p>
	 * Name: hasClickedOutside
	 * </p>
	 * <p>
	 * Desc: [(IIII)Z]
	 * </p>
	 */
	public static McObfPair func_193983_c = McMappingDatabase.getSRG("GuiCrafting.func_193983_c");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiCrafting.func_73863_a");

	/**
	 * <p>
	 * Name: widthTooNarrow
	 * </p>
	 */
	public static McObfPair field_193112_y = McMappingDatabase.getSRG("field_193112_y");

}
