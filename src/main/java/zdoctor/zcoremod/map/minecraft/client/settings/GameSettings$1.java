package zdoctor.zcoremod.map.minecraft.client.settings;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameSettings$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bid$1";
		else
			return "net/minecraft/client/settings/GameSettings$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bid$1";
		else
			return "GameSettings$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbid$1;";
		else
			return "Lnet/minecraft/client/settings/GameSettings$1;";
	}

}
