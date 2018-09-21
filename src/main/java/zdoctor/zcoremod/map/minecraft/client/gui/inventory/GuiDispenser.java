package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiDispenser {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmq";
		else
			return "net/minecraft/client/gui/inventory/GuiDispenser";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmq";
		else
			return "GuiDispenser";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmq;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiDispenser;";
	}

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiDispenser.func_73863_a");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiDispenser.func_146979_b");

	/**
	 * <p>
	 * Name: dispenserInventory
	 * </p>
	 */
	public static McObfPair field_175377_u = McMappingDatabase.getSRG("field_175377_u");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiDispenser.func_146976_a");

	/**
	 * <p>
	 * Name: DISPENSER_GUI_TEXTURES
	 * </p>
	 */
	public static McObfPair field_147088_v = McMappingDatabase.getSRG("field_147088_v");

	/**
	 * <p>
	 * Name: playerInventory
	 * </p>
	 */
	public static McObfPair field_175376_w = McMappingDatabase.getSRG("field_175376_w");

}
