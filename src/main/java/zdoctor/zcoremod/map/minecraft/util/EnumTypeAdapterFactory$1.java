package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumTypeAdapterFactory$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rj$1";
		else
			return "net/minecraft/util/EnumTypeAdapterFactory$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rj$1";
		else
			return "EnumTypeAdapterFactory$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrj$1;";
		else
			return "Lnet/minecraft/util/EnumTypeAdapterFactory$1;";
	}

}
