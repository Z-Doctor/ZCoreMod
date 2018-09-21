package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiPlayerTabOverlay$PlayerComparator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjq$a";
		else
			return "net/minecraft/client/gui/GuiPlayerTabOverlay$PlayerComparator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjq$a";
		else
			return "GuiPlayerTabOverlay$PlayerComparator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjq$a;";
		else
			return "Lnet/minecraft/client/gui/GuiPlayerTabOverlay$PlayerComparator;";
	}

}
