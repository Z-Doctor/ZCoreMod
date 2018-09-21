package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SuffixArray$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgz$1";
		else
			return "net/minecraft/client/util/SuffixArray$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgz$1";
		else
			return "SuffixArray$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgz$1;";
		else
			return "Lnet/minecraft/client/util/SuffixArray$1;";
	}

}
