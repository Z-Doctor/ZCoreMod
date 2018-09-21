package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiSlider$FormatHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjf$a";
		else
			return "net/minecraft/client/gui/GuiSlider$FormatHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjf$a";
		else
			return "GuiSlider$FormatHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjf$a;";
		else
			return "Lnet/minecraft/client/gui/GuiSlider$FormatHelper;";
	}

	/**
	 * <p>
	 * Name: getText
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;F)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175318_a = McMappingDatabase.getSRG("GuiSlider$FormatHelper.func_175318_a");

}
