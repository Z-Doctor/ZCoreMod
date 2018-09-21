package zdoctor.zcoremod.map.minecraft.util.datafix;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IFixType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rv";
		else
			return "net/minecraft/util/datafix/IFixType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rv";
		else
			return "IFixType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrv;";
		else
			return "Lnet/minecraft/util/datafix/IFixType;";
	}

}
