package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiRepair {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmh";
		else
			return "net/minecraft/client/gui/GuiRepair";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmh";
		else
			return "GuiRepair";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmh;";
		else
			return "Lnet/minecraft/client/gui/GuiRepair;";
	}

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiRepair.func_146976_a");

	/**
	 * <p>
	 * Name: sendAllWindowProperties
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_175173_a = McMappingDatabase.getSRG("GuiRepair.func_175173_a");

	/**
	 * <p>
	 * Name: renameItem
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147090_g = McMappingDatabase.getSRG("GuiRepair.func_147090_g");

	/**
	 * <p>
	 * Name: ANVIL_RESOURCE
	 * </p>
	 */
	public static McObfPair field_147093_u = McMappingDatabase.getSRG("field_147093_u");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiRepair.func_146281_b");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiRepair.func_146979_b");

	/**
	 * <p>
	 * Name: anvil
	 * </p>
	 */
	public static McObfPair field_147092_v = McMappingDatabase.getSRG("field_147092_v");

	/**
	 * <p>
	 * Name: playerInventory
	 * </p>
	 */
	public static McObfPair field_147094_x = McMappingDatabase.getSRG("field_147094_x");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiRepair.func_73864_a");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiRepair.func_73863_a");

	/**
	 * <p>
	 * Name: sendWindowProperty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;II)V]
	 * </p>
	 */
	public static McObfPair func_71112_a = McMappingDatabase.getSRG("GuiRepair.func_71112_a");

	/**
	 * <p>
	 * Name: nameField
	 * </p>
	 */
	public static McObfPair field_147091_w = McMappingDatabase.getSRG("field_147091_w");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiRepair.func_73869_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiRepair.func_73866_w_");

	/**
	 * <p>
	 * Name: sendAllContents
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_71110_a = McMappingDatabase.getSRG("GuiRepair.func_71110_a");

	/**
	 * <p>
	 * Name: sendSlotContents
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/Container;ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_71111_a = McMappingDatabase.getSRG("GuiRepair.func_71111_a");

}
