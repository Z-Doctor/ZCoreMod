package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkRenderContainer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bun";
		else
			return "net/minecraft/client/renderer/ChunkRenderContainer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bun";
		else
			return "ChunkRenderContainer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbun;";
		else
			return "Lnet/minecraft/client/renderer/ChunkRenderContainer;";
	}

	/**
	 * <p>
	 * Name: viewEntityX
	 * </p>
	 */
	public static McObfPair field_178008_c = McMappingDatabase.getSRG("field_178008_c");

	/**
	 * <p>
	 * Name: initialize
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_178004_a = McMappingDatabase.getSRG("ChunkRenderContainer.func_178004_a");

	/**
	 * <p>
	 * Name: viewEntityZ
	 * </p>
	 */
	public static McObfPair field_178006_e = McMappingDatabase.getSRG("field_178006_e");

	/**
	 * <p>
	 * Name: preRenderChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/chunk/RenderChunk;)V]
	 * </p>
	 */
	public static McObfPair func_178003_a = McMappingDatabase.getSRG("ChunkRenderContainer.func_178003_a");

	/**
	 * <p>
	 * Name: renderChunks
	 * </p>
	 */
	public static McObfPair field_178009_a = McMappingDatabase.getSRG("field_178009_a");

	/**
	 * <p>
	 * Name: renderChunkLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;)V]
	 * </p>
	 */
	public static McObfPair func_178001_a = McMappingDatabase.getSRG("ChunkRenderContainer.func_178001_a");

	/**
	 * <p>
	 * Name: initialized
	 * </p>
	 */
	public static McObfPair field_178007_b = McMappingDatabase.getSRG("field_178007_b");

	/**
	 * <p>
	 * Name: viewEntityY
	 * </p>
	 */
	public static McObfPair field_178005_d = McMappingDatabase.getSRG("field_178005_d");

	/**
	 * <p>
	 * Name: addRenderChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/chunk/RenderChunk;Lnet/minecraft/util/BlockRenderLayer;)V]
	 * </p>
	 */
	public static McObfPair func_178002_a = McMappingDatabase.getSRG("ChunkRenderContainer.func_178002_a");

}
