package zdoctor.zcoremod.map.minecraft.util.datafix;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FixTypes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rw";
		else
			return "net/minecraft/util/datafix/FixTypes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rw";
		else
			return "FixTypes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrw;";
		else
			return "Lnet/minecraft/util/datafix/FixTypes;";
	}

}
