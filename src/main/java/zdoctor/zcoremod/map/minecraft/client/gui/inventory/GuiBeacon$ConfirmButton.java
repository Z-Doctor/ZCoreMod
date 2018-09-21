package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiBeacon$ConfirmButton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmi$b";
		else
			return "net/minecraft/client/gui/inventory/GuiBeacon$ConfirmButton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmi$b";
		else
			return "GuiBeacon$ConfirmButton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmi$b;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiBeacon$ConfirmButton;";
	}

	/**
	 * <p>
	 * Name: drawButtonForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146111_b = McMappingDatabase.getSRG("GuiBeacon$ConfirmButton.func_146111_b");

}
