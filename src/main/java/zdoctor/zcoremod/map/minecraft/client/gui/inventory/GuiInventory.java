package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiInventory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmx";
		else
			return "net/minecraft/client/gui/inventory/GuiInventory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmx";
		else
			return "GuiInventory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmx;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiInventory;";
	}

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiInventory.func_73864_a");

	/**
	 * <p>
	 * Name: hasClickedOutside
	 * </p>
	 * <p>
	 * Desc: [(IIII)Z]
	 * </p>
	 */
	public static McObfPair func_193983_c = McMappingDatabase.getSRG("GuiInventory.func_193983_c");

	/**
	 * <p>
	 * Name: isPointInRegion
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_146978_c = McMappingDatabase.getSRG("GuiInventory.func_146978_c");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiInventory.func_146976_a");

	/**
	 * <p>
	 * Name: recipeBookGui
	 * </p>
	 */
	public static McObfPair field_192045_A = McMappingDatabase.getSRG("field_192045_A");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiInventory.func_73869_a");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiInventory.func_146281_b");

	/**
	 * <p>
	 * Name: handleMouseClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Slot;IILnet/minecraft/inventory/ClickType;)V]
	 * </p>
	 */
	public static McObfPair func_184098_a = McMappingDatabase.getSRG("GuiInventory.func_184098_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiInventory.func_73866_w_");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiInventory.func_73876_c");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_146286_b = McMappingDatabase.getSRG("GuiInventory.func_146286_b");

	/**
	 * <p>
	 * Name: recipesUpdated
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192043_J_ = McMappingDatabase.getSRG("GuiInventory.func_192043_J_");

	/**
	 * <p>
	 * Name: widthTooNarrow
	 * </p>
	 */
	public static McObfPair field_192046_B = McMappingDatabase.getSRG("field_192046_B");

	/**
	 * <p>
	 * Name: buttonClicked
	 * </p>
	 */
	public static McObfPair field_194031_B = McMappingDatabase.getSRG("field_194031_B");

	/**
	 * <p>
	 * Name: drawEntityOnScreen
	 * </p>
	 * <p>
	 * Desc: [(IIIFFLnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_147046_a = McMappingDatabase.getSRG("GuiInventory.func_147046_a");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiInventory.func_146979_b");

	/**
	 * <p>
	 * Name: oldMouseY
	 * </p>
	 */
	public static McObfPair field_147047_v = McMappingDatabase.getSRG("field_147047_v");

	/**
	 * <p>
	 * Name: oldMouseX
	 * </p>
	 */
	public static McObfPair field_147048_u = McMappingDatabase.getSRG("field_147048_u");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiInventory.func_146284_a");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiInventory.func_73863_a");

	/**
	 * <p>
	 * Name: recipeButton
	 * </p>
	 */
	public static McObfPair field_192048_z = McMappingDatabase.getSRG("field_192048_z");

}
