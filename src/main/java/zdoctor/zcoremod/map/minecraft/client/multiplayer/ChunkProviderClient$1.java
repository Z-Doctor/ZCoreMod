package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkProviderClient$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brx$1";
		else
			return "net/minecraft/client/multiplayer/ChunkProviderClient$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brx$1";
		else
			return "ChunkProviderClient$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrx$1;";
		else
			return "Lnet/minecraft/client/multiplayer/ChunkProviderClient$1;";
	}

}
