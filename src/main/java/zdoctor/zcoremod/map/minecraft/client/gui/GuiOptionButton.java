package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiOptionButton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjn";
		else
			return "net/minecraft/client/gui/GuiOptionButton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjn";
		else
			return "GuiOptionButton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjn;";
		else
			return "Lnet/minecraft/client/gui/GuiOptionButton;";
	}

	/**
	 * <p>
	 * Name: enumOptions
	 * </p>
	 */
	public static McObfPair field_146137_o = McMappingDatabase.getSRG("field_146137_o");

	/**
	 * <p>
	 * Name: getOption
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/settings/GameSettings$Options;]
	 * </p>
	 */
	public static McObfPair func_146136_c = McMappingDatabase.getSRG("GuiOptionButton.func_146136_c");

}
