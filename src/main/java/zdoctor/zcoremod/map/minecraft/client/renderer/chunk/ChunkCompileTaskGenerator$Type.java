package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkCompileTaskGenerator$Type {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxl$b";
		else
			return "net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator$Type";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxl$b";
		else
			return "ChunkCompileTaskGenerator$Type";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxl$b;";
		else
			return "Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator$Type;";
	}

}
