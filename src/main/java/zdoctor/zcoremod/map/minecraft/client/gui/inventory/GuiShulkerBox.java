package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiShulkerBox {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bna";
		else
			return "net/minecraft/client/gui/inventory/GuiShulkerBox";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bna";
		else
			return "GuiShulkerBox";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbna;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiShulkerBox;";
	}

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiShulkerBox.func_73863_a");

	/**
	 * <p>
	 * Name: playerInventory
	 * </p>
	 */
	public static McObfPair field_190780_w = McMappingDatabase.getSRG("field_190780_w");

	/**
	 * <p>
	 * Name: GUI_TEXTURE
	 * </p>
	 */
	public static McObfPair field_190778_u = McMappingDatabase.getSRG("field_190778_u");

	/**
	 * <p>
	 * Name: inventory
	 * </p>
	 */
	public static McObfPair field_190779_v = McMappingDatabase.getSRG("field_190779_v");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiShulkerBox.func_146979_b");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiShulkerBox.func_146976_a");

}
