package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldVertexBufferUploader {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bul";
		else
			return "net/minecraft/client/renderer/WorldVertexBufferUploader";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bul";
		else
			return "WorldVertexBufferUploader";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbul;";
		else
			return "Lnet/minecraft/client/renderer/WorldVertexBufferUploader;";
	}

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;)V]
	 * </p>
	 */
	public static McObfPair func_181679_a = McMappingDatabase.getSRG("WorldVertexBufferUploader.func_181679_a");

}
