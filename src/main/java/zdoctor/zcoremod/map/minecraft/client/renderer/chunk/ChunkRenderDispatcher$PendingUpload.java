package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkRenderDispatcher$PendingUpload {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxm$a";
		else
			return "net/minecraft/client/renderer/chunk/ChunkRenderDispatcher$PendingUpload";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxm$a";
		else
			return "ChunkRenderDispatcher$PendingUpload";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxm$a;";
		else
			return "Lnet/minecraft/client/renderer/chunk/ChunkRenderDispatcher$PendingUpload;";
	}

	/**
	 * <p>
	 * Name: uploadTask
	 * </p>
	 */
	public static McObfPair field_188241_b = McMappingDatabase.getSRG("field_188241_b");

	/**
	 * <p>
	 * Name: distanceSq
	 * </p>
	 */
	public static McObfPair field_188242_c = McMappingDatabase.getSRG("field_188242_c");

}
