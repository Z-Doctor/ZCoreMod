package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkCompileTaskGenerator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxl";
		else
			return "net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxl";
		else
			return "ChunkCompileTaskGenerator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxl;";
		else
			return "Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;";
	}

	/**
	 * <p>
	 * Name: isFinished
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178537_h = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_178537_h");

	/**
	 * <p>
	 * Name: distanceSq
	 * </p>
	 */
	public static McObfPair field_188229_e = McMappingDatabase.getSRG("field_188229_e");

	/**
	 * <p>
	 * Name: listFinishRunnables
	 * </p>
	 */
	public static McObfPair field_178552_c = McMappingDatabase.getSRG("field_178552_c");

	/**
	 * <p>
	 * Name: getRenderChunk
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/chunk/RenderChunk;]
	 * </p>
	 */
	public static McObfPair func_178536_b = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_178536_b");

	/**
	 * <p>
	 * Name: regionRenderCacheBuilder
	 * </p>
	 */
	public static McObfPair field_178550_e = McMappingDatabase.getSRG("field_178550_e");

	/**
	 * <p>
	 * Name: setStatus
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator$Status;)V]
	 * </p>
	 */
	public static McObfPair func_178535_a = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_178535_a");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator$Type;]
	 * </p>
	 */
	public static McObfPair func_178538_g = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_178538_g");

	/**
	 * <p>
	 * Name: finished
	 * </p>
	 */
	public static McObfPair field_178554_h = McMappingDatabase.getSRG("field_178554_h");

	/**
	 * <p>
	 * Name: lock
	 * </p>
	 */
	public static McObfPair field_178551_b = McMappingDatabase.getSRG("field_178551_b");

	/**
	 * <p>
	 * Name: getRegionRenderCacheBuilder
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/RegionRenderCacheBuilder;]
	 * </p>
	 */
	public static McObfPair func_178545_d = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_178545_d");

	/**
	 * <p>
	 * Name: setCompiledChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/chunk/CompiledChunk;)V]
	 * </p>
	 */
	public static McObfPair func_178543_a = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_178543_a");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_178549_d = McMappingDatabase.getSRG("field_178549_d");

	/**
	 * <p>
	 * Name: getCompiledChunk
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/chunk/CompiledChunk;]
	 * </p>
	 */
	public static McObfPair func_178544_c = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_178544_c");

	/**
	 * <p>
	 * Name: status
	 * </p>
	 */
	public static McObfPair field_178548_g = McMappingDatabase.getSRG("field_178548_g");

	/**
	 * <p>
	 * Name: finish
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178542_e = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_178542_e");

	/**
	 * <p>
	 * Name: getDistanceSq
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_188228_i = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_188228_i");

	/**
	 * <p>
	 * Name: addFinishRunnable
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Runnable;)V]
	 * </p>
	 */
	public static McObfPair func_178539_a = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_178539_a");

	/**
	 * <p>
	 * Name: getLock
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/concurrent/locks/ReentrantLock;]
	 * </p>
	 */
	public static McObfPair func_178540_f = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_178540_f");

	/**
	 * <p>
	 * Name: setRegionRenderCacheBuilder
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/RegionRenderCacheBuilder;)V]
	 * </p>
	 */
	public static McObfPair func_178541_a = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_178541_a");

	/**
	 * <p>
	 * Name: renderChunk
	 * </p>
	 */
	public static McObfPair field_178553_a = McMappingDatabase.getSRG("field_178553_a");

	/**
	 * <p>
	 * Name: compiledChunk
	 * </p>
	 */
	public static McObfPair field_178547_f = McMappingDatabase.getSRG("field_178547_f");

	/**
	 * <p>
	 * Name: getStatus
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator$Status;]
	 * </p>
	 */
	public static McObfPair func_178546_a = McMappingDatabase.getSRG("ChunkCompileTaskGenerator.func_178546_a");

}
