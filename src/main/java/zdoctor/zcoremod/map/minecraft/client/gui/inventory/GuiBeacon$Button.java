package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiBeacon$Button {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmi$d";
		else
			return "net/minecraft/client/gui/inventory/GuiBeacon$Button";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmi$d";
		else
			return "GuiBeacon$Button";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmi$d;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiBeacon$Button;";
	}

	/**
	 * <p>
	 * Name: iconY
	 * </p>
	 */
	public static McObfPair field_146143_q = McMappingDatabase.getSRG("field_146143_q");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146141_c = McMappingDatabase.getSRG("GuiBeacon$Button.func_146141_c");

	/**
	 * <p>
	 * Name: drawButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IIF)V]
	 * </p>
	 */
	public static McObfPair func_191745_a = McMappingDatabase.getSRG("GuiBeacon$Button.func_191745_a");

	/**
	 * <p>
	 * Name: setSelected
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_146140_b = McMappingDatabase.getSRG("GuiBeacon$Button.func_146140_b");

	/**
	 * <p>
	 * Name: iconTexture
	 * </p>
	 */
	public static McObfPair field_146145_o = McMappingDatabase.getSRG("field_146145_o");

	/**
	 * <p>
	 * Name: selected
	 * </p>
	 */
	public static McObfPair field_146142_r = McMappingDatabase.getSRG("field_146142_r");

	/**
	 * <p>
	 * Name: iconX
	 * </p>
	 */
	public static McObfPair field_146144_p = McMappingDatabase.getSRG("field_146144_p");

}
