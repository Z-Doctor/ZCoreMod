package zdoctor.zcoremod.map.minecraft.realms;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RealmsSharedConstants {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/realms/RealmsSharedConstants";
		else
			return "net/minecraft/realms/RealmsSharedConstants";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "RealmsSharedConstants";
		else
			return "RealmsSharedConstants";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/realms/RealmsSharedConstants;";
		else
			return "Lnet/minecraft/realms/RealmsSharedConstants;";
	}

}
