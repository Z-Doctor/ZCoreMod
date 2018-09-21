package zdoctor.zcoremod.map.minecraft.server.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StatsComponent$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oe$1";
		else
			return "net/minecraft/server/gui/StatsComponent$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oe$1";
		else
			return "StatsComponent$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loe$1;";
		else
			return "Lnet/minecraft/server/gui/StatsComponent$1;";
	}

}
