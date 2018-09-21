package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiContainer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmg";
		else
			return "net/minecraft/client/gui/inventory/GuiContainer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmg";
		else
			return "GuiContainer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmg;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiContainer;";
	}

	/**
	 * <p>
	 * Name: inventorySlots
	 * </p>
	 */
	public static McObfPair field_147002_h = McMappingDatabase.getSRG("field_147002_h");

	/**
	 * <p>
	 * Name: INVENTORY_BACKGROUND
	 * </p>
	 */
	public static McObfPair field_147001_a = McMappingDatabase.getSRG("field_147001_a");

	/**
	 * <p>
	 * Name: dragSplittingButton
	 * </p>
	 */
	public static McObfPair field_146988_G = McMappingDatabase.getSRG("field_146988_G");

	/**
	 * <p>
	 * Name: dragSplittingLimit
	 * </p>
	 */
	public static McObfPair field_146987_F = McMappingDatabase.getSRG("field_146987_F");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiContainer.func_73863_a");

	/**
	 * <p>
	 * Name: lastClickSlot
	 * </p>
	 */
	public static McObfPair field_146998_K = McMappingDatabase.getSRG("field_146998_K");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiContainer.func_146976_a");

	/**
	 * <p>
	 * Name: returningStackTime
	 * </p>
	 */
	public static McObfPair field_146990_B = McMappingDatabase.getSRG("field_146990_B");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiContainer.func_73876_c");

	/**
	 * <p>
	 * Name: doesGuiPauseGame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73868_f = McMappingDatabase.getSRG("GuiContainer.func_73868_f");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiContainer.func_146979_b");

	/**
	 * <p>
	 * Name: hasClickedOutside
	 * </p>
	 * <p>
	 * Desc: [(IIII)Z]
	 * </p>
	 */
	public static McObfPair func_193983_c = McMappingDatabase.getSRG("GuiContainer.func_193983_c");

	/**
	 * <p>
	 * Name: handleMouseClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Slot;IILnet/minecraft/inventory/ClickType;)V]
	 * </p>
	 */
	public static McObfPair func_184098_a = McMappingDatabase.getSRG("GuiContainer.func_184098_a");

	/**
	 * <p>
	 * Name: isPointInRegion
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_146978_c = McMappingDatabase.getSRG("GuiContainer.func_146978_c");

	/**
	 * <p>
	 * Name: checkHotbarKeys
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_146983_a = McMappingDatabase.getSRG("GuiContainer.func_146983_a");

	/**
	 * <p>
	 * Name: dragSplittingSlots
	 * </p>
	 */
	public static McObfPair field_147008_s = McMappingDatabase.getSRG("field_147008_s");

	/**
	 * <p>
	 * Name: isRightMouseClick
	 * </p>
	 */
	public static McObfPair field_147004_w = McMappingDatabase.getSRG("field_147004_w");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiContainer.func_73864_a");

	/**
	 * <p>
	 * Name: touchUpX
	 * </p>
	 */
	public static McObfPair field_147011_y = McMappingDatabase.getSRG("field_147011_y");

	/**
	 * <p>
	 * Name: dragSplitting
	 * </p>
	 */
	public static McObfPair field_147007_t = McMappingDatabase.getSRG("field_147007_t");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_146286_b = McMappingDatabase.getSRG("GuiContainer.func_146286_b");

	/**
	 * <p>
	 * Name: clickedSlot
	 * </p>
	 */
	public static McObfPair field_147005_v = McMappingDatabase.getSRG("field_147005_v");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiContainer.func_73866_w_");

	/**
	 * <p>
	 * Name: ySize
	 * </p>
	 */
	public static McObfPair field_147000_g = McMappingDatabase.getSRG("field_147000_g");

	/**
	 * <p>
	 * Name: ignoreMouseUp
	 * </p>
	 */
	public static McObfPair field_146995_H = McMappingDatabase.getSRG("field_146995_H");

	/**
	 * <p>
	 * Name: doubleClick
	 * </p>
	 */
	public static McObfPair field_146993_M = McMappingDatabase.getSRG("field_146993_M");

	/**
	 * <p>
	 * Name: getSlotAtPosition
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/inventory/Slot;]
	 * </p>
	 */
	public static McObfPair func_146975_c = McMappingDatabase.getSRG("GuiContainer.func_146975_c");

	/**
	 * <p>
	 * Name: returningStackDestSlot
	 * </p>
	 */
	public static McObfPair field_146989_A = McMappingDatabase.getSRG("field_146989_A");

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Slot;)V]
	 * </p>
	 */
	public static McObfPair func_146977_a = McMappingDatabase.getSRG("GuiContainer.func_146977_a");

	/**
	 * <p>
	 * Name: lastClickTime
	 * </p>
	 */
	public static McObfPair field_146997_J = McMappingDatabase.getSRG("field_146997_J");

	/**
	 * <p>
	 * Name: updateDragSplitting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146980_g = McMappingDatabase.getSRG("GuiContainer.func_146980_g");

	/**
	 * <p>
	 * Name: shiftClickedSlot
	 * </p>
	 */
	public static McObfPair field_146994_N = McMappingDatabase.getSRG("field_146994_N");

	/**
	 * <p>
	 * Name: guiTop
	 * </p>
	 */
	public static McObfPair field_147009_r = McMappingDatabase.getSRG("field_147009_r");

	/**
	 * <p>
	 * Name: dragItemDropDelay
	 * </p>
	 */
	public static McObfPair field_146986_E = McMappingDatabase.getSRG("field_146986_E");

	/**
	 * <p>
	 * Name: isMouseOverSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Slot;II)Z]
	 * </p>
	 */
	public static McObfPair func_146981_a = McMappingDatabase.getSRG("GuiContainer.func_146981_a");

	/**
	 * <p>
	 * Name: dragSplittingRemnant
	 * </p>
	 */
	public static McObfPair field_146996_I = McMappingDatabase.getSRG("field_146996_I");

	/**
	 * <p>
	 * Name: xSize
	 * </p>
	 */
	public static McObfPair field_146999_f = McMappingDatabase.getSRG("field_146999_f");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiContainer.func_73869_a");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiContainer.func_146281_b");

	/**
	 * <p>
	 * Name: lastClickButton
	 * </p>
	 */
	public static McObfPair field_146992_L = McMappingDatabase.getSRG("field_146992_L");

	/**
	 * <p>
	 * Name: renderHoveredToolTip
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_191948_b = McMappingDatabase.getSRG("GuiContainer.func_191948_b");

	/**
	 * <p>
	 * Name: touchUpY
	 * </p>
	 */
	public static McObfPair field_147010_z = McMappingDatabase.getSRG("field_147010_z");

	/**
	 * <p>
	 * Name: currentDragTargetSlot
	 * </p>
	 */
	public static McObfPair field_146985_D = McMappingDatabase.getSRG("field_146985_D");

	/**
	 * <p>
	 * Name: drawItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_146982_a = McMappingDatabase.getSRG("GuiContainer.func_146982_a");

	/**
	 * <p>
	 * Name: guiLeft
	 * </p>
	 */
	public static McObfPair field_147003_i = McMappingDatabase.getSRG("field_147003_i");

	/**
	 * <p>
	 * Name: mouseClickMove
	 * </p>
	 * <p>
	 * Desc: [(IIIJ)V]
	 * </p>
	 */
	public static McObfPair func_146273_a = McMappingDatabase.getSRG("GuiContainer.func_146273_a");

	/**
	 * <p>
	 * Name: returningStack
	 * </p>
	 */
	public static McObfPair field_146991_C = McMappingDatabase.getSRG("field_146991_C");

	/**
	 * <p>
	 * Name: draggedStack
	 * </p>
	 */
	public static McObfPair field_147012_x = McMappingDatabase.getSRG("field_147012_x");

	/**
	 * <p>
	 * Name: hoveredSlot
	 * </p>
	 */
	public static McObfPair field_147006_u = McMappingDatabase.getSRG("field_147006_u");

}
