package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VertexBufferUploader {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvg";
		else
			return "net/minecraft/client/renderer/VertexBufferUploader";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvg";
		else
			return "VertexBufferUploader";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvg;";
		else
			return "Lnet/minecraft/client/renderer/VertexBufferUploader;";
	}

	/**
	 * <p>
	 * Name: vertexBuffer
	 * </p>
	 */
	public static McObfPair field_178179_a = McMappingDatabase.getSRG("field_178179_a");

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;)V]
	 * </p>
	 */
	public static McObfPair func_181679_a = McMappingDatabase.getSRG("VertexBufferUploader.func_181679_a");

	/**
	 * <p>
	 * Name: setVertexBuffer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/vertex/VertexBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_178178_a = McMappingDatabase.getSRG("VertexBufferUploader.func_178178_a");

}
