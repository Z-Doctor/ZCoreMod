package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiBeacon$CancelButton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmi$a";
		else
			return "net/minecraft/client/gui/inventory/GuiBeacon$CancelButton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmi$a";
		else
			return "GuiBeacon$CancelButton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmi$a;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiBeacon$CancelButton;";
	}

	/**
	 * <p>
	 * Name: drawButtonForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146111_b = McMappingDatabase.getSRG("GuiBeacon$CancelButton.func_146111_b");

}
