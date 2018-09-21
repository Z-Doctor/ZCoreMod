package zdoctor.zcoremod.map.minecraft.realms;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DisconnectedRealmsScreen {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/realms/DisconnectedRealmsScreen";
		else
			return "net/minecraft/realms/DisconnectedRealmsScreen";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "DisconnectedRealmsScreen";
		else
			return "DisconnectedRealmsScreen";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/realms/DisconnectedRealmsScreen;";
		else
			return "Lnet/minecraft/realms/DisconnectedRealmsScreen;";
	}

}
