package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldClient$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsb$2";
		else
			return "net/minecraft/client/multiplayer/WorldClient$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsb$2";
		else
			return "WorldClient$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsb$2;";
		else
			return "Lnet/minecraft/client/multiplayer/WorldClient$2;";
	}

}
