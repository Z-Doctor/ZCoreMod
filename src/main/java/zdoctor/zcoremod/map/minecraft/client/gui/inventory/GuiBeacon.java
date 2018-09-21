package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiBeacon {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmi";
		else
			return "net/minecraft/client/gui/inventory/GuiBeacon";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmi";
		else
			return "GuiBeacon";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmi;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiBeacon;";
	}

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiBeacon.func_146979_b");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiBeacon.func_146976_a");

	/**
	 * <p>
	 * Name: buttonsNotDrawn
	 * </p>
	 */
	public static McObfPair field_147027_y = McMappingDatabase.getSRG("field_147027_y");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiBeacon.func_146284_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiBeacon.func_73866_w_");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147026_u = McMappingDatabase.getSRG("field_147026_u");

	/**
	 * <p>
	 * Name: BEACON_GUI_TEXTURES
	 * </p>
	 */
	public static McObfPair field_147025_v = McMappingDatabase.getSRG("field_147025_v");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiBeacon.func_73876_c");

	/**
	 * <p>
	 * Name: beaconConfirmButton
	 * </p>
	 */
	public static McObfPair field_147028_x = McMappingDatabase.getSRG("field_147028_x");

	/**
	 * <p>
	 * Name: tileBeacon
	 * </p>
	 */
	public static McObfPair field_147024_w = McMappingDatabase.getSRG("field_147024_w");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiBeacon.func_73863_a");

}
