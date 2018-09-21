package zdoctor.zcoremod.map.minecraft.realms;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Realms {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/realms/Realms";
		else
			return "net/minecraft/realms/Realms";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Realms";
		else
			return "Realms";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/realms/Realms;";
		else
			return "Lnet/minecraft/realms/Realms;";
	}

}
