package zdoctor.zcoremod.map.minecraft.server.integrated;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IntegratedServer$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chd$3";
		else
			return "net/minecraft/server/integrated/IntegratedServer$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chd$3";
		else
			return "IntegratedServer$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchd$3;";
		else
			return "Lnet/minecraft/server/integrated/IntegratedServer$3;";
	}

}
