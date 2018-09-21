package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiBeacon$PowerButton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmi$c";
		else
			return "net/minecraft/client/gui/inventory/GuiBeacon$PowerButton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmi$c";
		else
			return "GuiBeacon$PowerButton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmi$c;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiBeacon$PowerButton;";
	}

	/**
	 * <p>
	 * Name: tier
	 * </p>
	 */
	public static McObfPair field_146148_q = McMappingDatabase.getSRG("field_146148_q");

	/**
	 * <p>
	 * Name: drawButtonForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146111_b = McMappingDatabase.getSRG("GuiBeacon$PowerButton.func_146111_b");

	/**
	 * <p>
	 * Name: effect
	 * </p>
	 */
	public static McObfPair field_184066_p = McMappingDatabase.getSRG("field_184066_p");

}
