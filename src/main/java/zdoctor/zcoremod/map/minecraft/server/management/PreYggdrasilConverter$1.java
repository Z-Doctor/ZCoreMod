package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PreYggdrasilConverter$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pk$1";
		else
			return "net/minecraft/server/management/PreYggdrasilConverter$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pk$1";
		else
			return "PreYggdrasilConverter$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpk$1;";
		else
			return "Lnet/minecraft/server/management/PreYggdrasilConverter$1;";
	}

}
