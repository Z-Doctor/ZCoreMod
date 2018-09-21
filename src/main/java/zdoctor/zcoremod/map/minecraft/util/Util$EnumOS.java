package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Util$EnumOS {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "h$a";
		else
			return "net/minecraft/util/Util$EnumOS";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "h$a";
		else
			return "Util$EnumOS";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lh$a;";
		else
			return "Lnet/minecraft/util/Util$EnumOS;";
	}

}
