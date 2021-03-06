package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerChunkMap$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ou$2";
		else
			return "net/minecraft/server/management/PlayerChunkMap$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ou$2";
		else
			return "PlayerChunkMap$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lou$2;";
		else
			return "Lnet/minecraft/server/management/PlayerChunkMap$2;";
	}

}
