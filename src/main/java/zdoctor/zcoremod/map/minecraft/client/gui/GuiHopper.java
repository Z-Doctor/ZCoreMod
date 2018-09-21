package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiHopper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmv";
		else
			return "net/minecraft/client/gui/GuiHopper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmv";
		else
			return "GuiHopper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmv;";
		else
			return "Lnet/minecraft/client/gui/GuiHopper;";
	}

	/**
	 * <p>
	 * Name: HOPPER_GUI_TEXTURE
	 * </p>
	 */
	public static McObfPair field_147085_u = McMappingDatabase.getSRG("field_147085_u");

	/**
	 * <p>
	 * Name: playerInventory
	 * </p>
	 */
	public static McObfPair field_147084_v = McMappingDatabase.getSRG("field_147084_v");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiHopper.func_146979_b");

	/**
	 * <p>
	 * Name: hopperInventory
	 * </p>
	 */
	public static McObfPair field_147083_w = McMappingDatabase.getSRG("field_147083_w");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiHopper.func_73863_a");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiHopper.func_146976_a");

}
