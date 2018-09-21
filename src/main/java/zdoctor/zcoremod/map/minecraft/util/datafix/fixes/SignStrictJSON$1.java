package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SignStrictJSON$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sg$1";
		else
			return "net/minecraft/util/datafix/fixes/SignStrictJSON$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sg$1";
		else
			return "SignStrictJSON$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lsg$1;";
		else
			return "Lnet/minecraft/util/datafix/fixes/SignStrictJSON$1;";
	}

}
