package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkRenderDispatcher {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxm";
		else
			return "net/minecraft/client/renderer/chunk/ChunkRenderDispatcher";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxm";
		else
			return "ChunkRenderDispatcher";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxm;";
		else
			return "Lnet/minecraft/client/renderer/chunk/ChunkRenderDispatcher;";
	}

	/**
	 * <p>
	 * Name: runChunkUploads
	 * </p>
	 * <p>
	 * Desc: [(J)Z]
	 * </p>
	 */
	public static McObfPair func_178516_a = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_178516_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_178523_a = McMappingDatabase.getSRG("field_178523_a");

	/**
	 * <p>
	 * Name: renderWorker
	 * </p>
	 */
	public static McObfPair field_178525_i = McMappingDatabase.getSRG("field_178525_i");

	/**
	 * <p>
	 * Name: allocateRenderBuilder
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/RegionRenderCacheBuilder;]
	 * </p>
	 */
	public static McObfPair func_178515_c = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_178515_c");

	/**
	 * <p>
	 * Name: clearChunkUpdates
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178513_e = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_178513_e");

	/**
	 * <p>
	 * Name: stopChunkUpdates
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178514_b = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_178514_b");

	/**
	 * <p>
	 * Name: getDebugInfo
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178504_a = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_178504_a");

	/**
	 * <p>
	 * Name: stopWorkerThreads
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188244_g = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_188244_g");

	/**
	 * <p>
	 * Name: queueChunkUploads
	 * </p>
	 */
	public static McObfPair field_178524_h = McMappingDatabase.getSRG("field_178524_h");

	/**
	 * <p>
	 * Name: updateChunkNow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/chunk/RenderChunk;)Z]
	 * </p>
	 */
	public static McObfPair func_178505_b = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_178505_b");

	/**
	 * <p>
	 * Name: uploadDisplayList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;ILnet/minecraft/client/renderer/chunk/RenderChunk;)V]
	 * </p>
	 */
	public static McObfPair func_178510_a = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_178510_a");

	/**
	 * <p>
	 * Name: uploadVertexBuffer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/client/renderer/vertex/VertexBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_178506_a = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_178506_a");

	/**
	 * <p>
	 * Name: listWorkerThreads
	 * </p>
	 */
	public static McObfPair field_188250_d = McMappingDatabase.getSRG("field_188250_d");

	/**
	 * <p>
	 * Name: freeRenderBuilder
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/RegionRenderCacheBuilder;)V]
	 * </p>
	 */
	public static McObfPair func_178512_a = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_178512_a");

	/**
	 * <p>
	 * Name: queueChunkUpdates
	 * </p>
	 */
	public static McObfPair field_178519_d = McMappingDatabase.getSRG("field_178519_d");

	/**
	 * <p>
	 * Name: worldVertexUploader
	 * </p>
	 */
	public static McObfPair field_178517_f = McMappingDatabase.getSRG("field_178517_f");

	/**
	 * <p>
	 * Name: vertexUploader
	 * </p>
	 */
	public static McObfPair field_178518_g = McMappingDatabase.getSRG("field_178518_g");

	/**
	 * <p>
	 * Name: hasChunkUpdates
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188247_f = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_188247_f");

	/**
	 * <p>
	 * Name: uploadChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/client/renderer/chunk/RenderChunk;Lnet/minecraft/client/renderer/chunk/CompiledChunk;D)Lcom/google/common/util/concurrent/ListenableFuture;]
	 * </p>
	 */
	public static McObfPair func_188245_a = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_188245_a");

	/**
	 * <p>
	 * Name: listThreadedWorkers
	 * </p>
	 */
	public static McObfPair field_178522_c = McMappingDatabase.getSRG("field_178522_c");

	/**
	 * <p>
	 * Name: countRenderBuilders
	 * </p>
	 */
	public static McObfPair field_188249_c = McMappingDatabase.getSRG("field_188249_c");

	/**
	 * <p>
	 * Name: THREAD_FACTORY
	 * </p>
	 */
	public static McObfPair field_178521_b = McMappingDatabase.getSRG("field_178521_b");

	/**
	 * <p>
	 * Name: queueFreeRenderBuilders
	 * </p>
	 */
	public static McObfPair field_178520_e = McMappingDatabase.getSRG("field_178520_e");

	/**
	 * <p>
	 * Name: updateTransparencyLater
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/chunk/RenderChunk;)Z]
	 * </p>
	 */
	public static McObfPair func_178509_c = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_178509_c");

	/**
	 * <p>
	 * Name: getNextChunkUpdate
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;]
	 * </p>
	 */
	public static McObfPair func_178511_d = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_178511_d");

	/**
	 * <p>
	 * Name: hasNoFreeRenderBuilders
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188248_h = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_188248_h");

	/**
	 * <p>
	 * Name: updateChunkLater
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/chunk/RenderChunk;)Z]
	 * </p>
	 */
	public static McObfPair func_178507_a = McMappingDatabase.getSRG("ChunkRenderDispatcher.func_178507_a");

}
