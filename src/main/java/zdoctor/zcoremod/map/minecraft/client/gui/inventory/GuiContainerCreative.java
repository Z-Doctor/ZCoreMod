package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiContainerCreative {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmp";
		else
			return "net/minecraft/client/gui/inventory/GuiContainerCreative";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmp";
		else
			return "GuiContainerCreative";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmp;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiContainerCreative;";
	}

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiContainerCreative.func_73876_c");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiContainerCreative.func_146274_d");

	/**
	 * <p>
	 * Name: CREATIVE_INVENTORY_TABS
	 * </p>
	 */
	public static McObfPair field_147061_u = McMappingDatabase.getSRG("field_147061_u");

	/**
	 * <p>
	 * Name: isMouseOverTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;II)Z]
	 * </p>
	 */
	public static McObfPair func_147049_a = McMappingDatabase.getSRG("GuiContainerCreative.func_147049_a");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiContainerCreative.func_73864_a");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiContainerCreative.func_146979_b");

	/**
	 * <p>
	 * Name: wasClicking
	 * </p>
	 */
	public static McObfPair field_147065_z = McMappingDatabase.getSRG("field_147065_z");

	/**
	 * <p>
	 * Name: setCurrentCreativeTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;)V]
	 * </p>
	 */
	public static McObfPair func_147050_b = McMappingDatabase.getSRG("GuiContainerCreative.func_147050_b");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_146286_b = McMappingDatabase.getSRG("GuiContainerCreative.func_146286_b");

	/**
	 * <p>
	 * Name: clearSearch
	 * </p>
	 */
	public static McObfPair field_147057_D = McMappingDatabase.getSRG("field_147057_D");

	/**
	 * <p>
	 * Name: handleHotbarSnapshots
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IZZ)V]
	 * </p>
	 */
	public static McObfPair func_192044_a = McMappingDatabase.getSRG("GuiContainerCreative.func_192044_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiContainerCreative.func_146284_a");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiContainerCreative.func_146976_a");

	/**
	 * <p>
	 * Name: listener
	 * </p>
	 */
	public static McObfPair field_147059_E = McMappingDatabase.getSRG("field_147059_E");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiContainerCreative.func_73869_a");

	/**
	 * <p>
	 * Name: handleMouseClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Slot;IILnet/minecraft/inventory/ClickType;)V]
	 * </p>
	 */
	public static McObfPair func_184098_a = McMappingDatabase.getSRG("GuiContainerCreative.func_184098_a");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiContainerCreative.func_146281_b");

	/**
	 * <p>
	 * Name: renderCreativeInventoryHoveringText
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;II)Z]
	 * </p>
	 */
	public static McObfPair func_147052_b = McMappingDatabase.getSRG("GuiContainerCreative.func_147052_b");

	/**
	 * <p>
	 * Name: selectedTabIndex
	 * </p>
	 */
	public static McObfPair field_147058_w = McMappingDatabase.getSRG("field_147058_w");

	/**
	 * <p>
	 * Name: destroyItemSlot
	 * </p>
	 */
	public static McObfPair field_147064_C = McMappingDatabase.getSRG("field_147064_C");

	/**
	 * <p>
	 * Name: updateCreativeSearch
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147053_i = McMappingDatabase.getSRG("GuiContainerCreative.func_147053_i");

	/**
	 * <p>
	 * Name: needsScrollBars
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_147055_p = McMappingDatabase.getSRG("GuiContainerCreative.func_147055_p");

	/**
	 * <p>
	 * Name: searchField
	 * </p>
	 */
	public static McObfPair field_147062_A = McMappingDatabase.getSRG("field_147062_A");

	/**
	 * <p>
	 * Name: updateActivePotionEffects
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175378_g = McMappingDatabase.getSRG("GuiContainerCreative.func_175378_g");

	/**
	 * <p>
	 * Name: getSelectedTabIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_147056_g = McMappingDatabase.getSRG("GuiContainerCreative.func_147056_g");

	/**
	 * <p>
	 * Name: originalSlots
	 * </p>
	 */
	public static McObfPair field_147063_B = McMappingDatabase.getSRG("field_147063_B");

	/**
	 * <p>
	 * Name: drawTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;)V]
	 * </p>
	 */
	public static McObfPair func_147051_a = McMappingDatabase.getSRG("GuiContainerCreative.func_147051_a");

	/**
	 * <p>
	 * Name: currentScroll
	 * </p>
	 */
	public static McObfPair field_147067_x = McMappingDatabase.getSRG("field_147067_x");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiContainerCreative.func_73863_a");

	/**
	 * <p>
	 * Name: basicInventory
	 * </p>
	 */
	public static McObfPair field_147060_v = McMappingDatabase.getSRG("field_147060_v");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiContainerCreative.func_73866_w_");

	/**
	 * <p>
	 * Name: isScrolling
	 * </p>
	 */
	public static McObfPair field_147066_y = McMappingDatabase.getSRG("field_147066_y");

	/**
	 * <p>
	 * Name: renderToolTip
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;II)V]
	 * </p>
	 */
	public static McObfPair func_146285_a = McMappingDatabase.getSRG("GuiContainerCreative.func_146285_a");

}
