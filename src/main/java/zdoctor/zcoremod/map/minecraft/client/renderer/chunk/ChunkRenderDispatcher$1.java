package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkRenderDispatcher$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxm$1";
		else
			return "net/minecraft/client/renderer/chunk/ChunkRenderDispatcher$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxm$1";
		else
			return "ChunkRenderDispatcher$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxm$1;";
		else
			return "Lnet/minecraft/client/renderer/chunk/ChunkRenderDispatcher$1;";
	}

}
