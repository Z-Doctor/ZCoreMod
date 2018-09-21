package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkRenderWorker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxn";
		else
			return "net/minecraft/client/renderer/chunk/ChunkRenderWorker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxn";
		else
			return "ChunkRenderWorker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxn;";
		else
			return "Lnet/minecraft/client/renderer/chunk/ChunkRenderWorker;";
	}

	/**
	 * <p>
	 * Name: freeRenderBuilder
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;)V]
	 * </p>
	 */
	public static McObfPair func_178473_b = McMappingDatabase.getSRG("ChunkRenderWorker.func_178473_b");

	/**
	 * <p>
	 * Name: chunkRenderDispatcher
	 * </p>
	 */
	public static McObfPair field_178477_b = McMappingDatabase.getSRG("field_178477_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_152478_a = McMappingDatabase.getSRG("field_152478_a");

	/**
	 * <p>
	 * Name: processTask
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;)V]
	 * </p>
	 */
	public static McObfPair func_178474_a = McMappingDatabase.getSRG("ChunkRenderWorker.func_178474_a");

	/**
	 * <p>
	 * Name: shouldRun
	 * </p>
	 */
	public static McObfPair field_188265_d = McMappingDatabase.getSRG("field_188265_d");

	/**
	 * <p>
	 * Name: isChunkExisting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;)Z]
	 * </p>
	 */
	public static McObfPair func_188263_a = McMappingDatabase.getSRG("ChunkRenderWorker.func_188263_a");

	/**
	 * <p>
	 * Name: notifyToStop
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188264_a = McMappingDatabase.getSRG("ChunkRenderWorker.func_188264_a");

	/**
	 * <p>
	 * Name: regionRenderCacheBuilder
	 * </p>
	 */
	public static McObfPair field_178478_c = McMappingDatabase.getSRG("field_178478_c");

	/**
	 * <p>
	 * Name: getRegionRenderCacheBuilder
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/RegionRenderCacheBuilder;]
	 * </p>
	 */
	public static McObfPair func_178475_b = McMappingDatabase.getSRG("ChunkRenderWorker.func_178475_b");

}
