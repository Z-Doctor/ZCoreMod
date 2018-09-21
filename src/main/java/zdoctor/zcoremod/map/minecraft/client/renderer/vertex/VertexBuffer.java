package zdoctor.zcoremod.map.minecraft.client.renderer.vertex;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VertexBuffer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdz";
		else
			return "net/minecraft/client/renderer/vertex/VertexBuffer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdz";
		else
			return "VertexBuffer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdz;";
		else
			return "Lnet/minecraft/client/renderer/vertex/VertexBuffer;";
	}

	/**
	 * <p>
	 * Name: glBufferId
	 * </p>
	 */
	public static McObfPair field_177365_a = McMappingDatabase.getSRG("field_177365_a");

	/**
	 * <p>
	 * Name: vertexFormat
	 * </p>
	 */
	public static McObfPair field_177363_b = McMappingDatabase.getSRG("field_177363_b");

	/**
	 * <p>
	 * Name: count
	 * </p>
	 */
	public static McObfPair field_177364_c = McMappingDatabase.getSRG("field_177364_c");

	/**
	 * <p>
	 * Name: deleteGlBuffers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177362_c = McMappingDatabase.getSRG("VertexBuffer.func_177362_c");

	/**
	 * <p>
	 * Name: bufferData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/nio/ByteBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_181722_a = McMappingDatabase.getSRG("VertexBuffer.func_181722_a");

	/**
	 * <p>
	 * Name: unbindBuffer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177361_b = McMappingDatabase.getSRG("VertexBuffer.func_177361_b");

	/**
	 * <p>
	 * Name: bindBuffer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177359_a = McMappingDatabase.getSRG("VertexBuffer.func_177359_a");

	/**
	 * <p>
	 * Name: drawArrays
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_177358_a = McMappingDatabase.getSRG("VertexBuffer.func_177358_a");

}
