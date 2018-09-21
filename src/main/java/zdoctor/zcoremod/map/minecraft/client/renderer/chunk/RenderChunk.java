package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderChunk {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxr";
		else
			return "net/minecraft/client/renderer/chunk/RenderChunk";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxr";
		else
			return "RenderChunk";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxr;";
		else
			return "Lnet/minecraft/client/renderer/chunk/RenderChunk;";
	}

	/**
	 * <p>
	 * Name: makeCompileTaskChunk
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;]
	 * </p>
	 */
	public static McObfPair func_178574_d = McMappingDatabase.getSRG("RenderChunk.func_178574_d");

	/**
	 * <p>
	 * Name: getVertexBufferByLayer
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/renderer/vertex/VertexBuffer;]
	 * </p>
	 */
	public static McObfPair func_178565_b = McMappingDatabase.getSRG("RenderChunk.func_178565_b");

	/**
	 * <p>
	 * Name: rebuildWorldView
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189563_q = McMappingDatabase.getSRG("RenderChunk.func_189563_q");

	/**
	 * <p>
	 * Name: setCompiledChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/chunk/CompiledChunk;)V]
	 * </p>
	 */
	public static McObfPair func_178580_a = McMappingDatabase.getSRG("RenderChunk.func_178580_a");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_178568_j = McMappingDatabase.getSRG("RenderChunk.func_178568_j");

	/**
	 * <p>
	 * Name: lockCompiledChunk
	 * </p>
	 */
	public static McObfPair field_178598_h = McMappingDatabase.getSRG("field_178598_h");

	/**
	 * <p>
	 * Name: mapEnumFacing
	 * </p>
	 */
	public static McObfPair field_181702_p = McMappingDatabase.getSRG("field_181702_p");

	/**
	 * <p>
	 * Name: compileTask
	 * </p>
	 */
	public static McObfPair field_178599_i = McMappingDatabase.getSRG("field_178599_i");

	/**
	 * <p>
	 * Name: needsUpdate
	 * </p>
	 */
	public static McObfPair field_178593_n = McMappingDatabase.getSRG("field_178593_n");

	/**
	 * <p>
	 * Name: setFrameIndex
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_178577_a = McMappingDatabase.getSRG("RenderChunk.func_178577_a");

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_188283_p = McMappingDatabase.getSRG("RenderChunk.func_188283_p");

	/**
	 * <p>
	 * Name: setNeedsUpdate
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_178575_a = McMappingDatabase.getSRG("RenderChunk.func_178575_a");

	/**
	 * <p>
	 * Name: needsUpdate
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178569_m = McMappingDatabase.getSRG("RenderChunk.func_178569_m");

	/**
	 * <p>
	 * Name: stopCompileTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178585_h = McMappingDatabase.getSRG("RenderChunk.func_178585_h");

	/**
	 * <p>
	 * Name: modelviewMatrix
	 * </p>
	 */
	public static McObfPair field_178597_k = McMappingDatabase.getSRG("field_178597_k");

	/**
	 * <p>
	 * Name: renderChunksUpdated
	 * </p>
	 */
	public static McObfPair field_178592_a = McMappingDatabase.getSRG("field_178592_a");

	/**
	 * <p>
	 * Name: frameIndex
	 * </p>
	 */
	public static McObfPair field_178595_m = McMappingDatabase.getSRG("field_178595_m");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_178588_d = McMappingDatabase.getSRG("field_178588_d");

	/**
	 * <p>
	 * Name: makeCompileTaskTransparency
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;]
	 * </p>
	 */
	public static McObfPair func_178582_e = McMappingDatabase.getSRG("RenderChunk.func_178582_e");

	/**
	 * <p>
	 * Name: postRenderBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;FFFLnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/client/renderer/chunk/CompiledChunk;)V]
	 * </p>
	 */
	public static McObfPair func_178584_a = McMappingDatabase.getSRG("RenderChunk.func_178584_a");

	/**
	 * <p>
	 * Name: setTileEntities
	 * </p>
	 */
	public static McObfPair field_181056_j = McMappingDatabase.getSRG("field_181056_j");

	/**
	 * <p>
	 * Name: getBlockPosOffset16
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_181701_a = McMappingDatabase.getSRG("RenderChunk.func_181701_a");

	/**
	 * <p>
	 * Name: getCompiledChunk
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/chunk/CompiledChunk;]
	 * </p>
	 */
	public static McObfPair func_178571_g = McMappingDatabase.getSRG("RenderChunk.func_178571_g");

	/**
	 * <p>
	 * Name: renderGlobal
	 * </p>
	 */
	public static McObfPair field_178589_e = McMappingDatabase.getSRG("field_178589_e");

	/**
	 * <p>
	 * Name: compiledChunk
	 * </p>
	 */
	public static McObfPair field_178590_b = McMappingDatabase.getSRG("field_178590_b");

	/**
	 * <p>
	 * Name: needsImmediateUpdate
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188281_o = McMappingDatabase.getSRG("RenderChunk.func_188281_o");

	/**
	 * <p>
	 * Name: worldView
	 * </p>
	 */
	public static McObfPair field_189564_r = McMappingDatabase.getSRG("field_189564_r");

	/**
	 * <p>
	 * Name: clearNeedsUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188282_m = McMappingDatabase.getSRG("RenderChunk.func_188282_m");

	/**
	 * <p>
	 * Name: multModelviewMatrix
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178572_f = McMappingDatabase.getSRG("RenderChunk.func_178572_f");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_178586_f = McMappingDatabase.getSRG("field_178586_f");

	/**
	 * <p>
	 * Name: lockCompileTask
	 * </p>
	 */
	public static McObfPair field_178587_g = McMappingDatabase.getSRG("field_178587_g");

	/**
	 * <p>
	 * Name: initModelviewMatrix
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178567_n = McMappingDatabase.getSRG("RenderChunk.func_178567_n");

	/**
	 * <p>
	 * Name: preRenderBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_178573_a = McMappingDatabase.getSRG("RenderChunk.func_178573_a");

	/**
	 * <p>
	 * Name: index
	 * </p>
	 */
	public static McObfPair field_178596_j = McMappingDatabase.getSRG("field_178596_j");

	/**
	 * <p>
	 * Name: getLockCompileTask
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/concurrent/locks/ReentrantLock;]
	 * </p>
	 */
	public static McObfPair func_178579_c = McMappingDatabase.getSRG("RenderChunk.func_178579_c");

	/**
	 * <p>
	 * Name: needsImmediateUpdate
	 * </p>
	 */
	public static McObfPair field_188284_q = McMappingDatabase.getSRG("field_188284_q");

	/**
	 * <p>
	 * Name: rebuildChunk
	 * </p>
	 * <p>
	 * Desc: [(FFFLnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;)V]
	 * </p>
	 */
	public static McObfPair func_178581_b = McMappingDatabase.getSRG("RenderChunk.func_178581_b");

	/**
	 * <p>
	 * Name: boundingBox
	 * </p>
	 */
	public static McObfPair field_178591_c = McMappingDatabase.getSRG("field_178591_c");

	/**
	 * <p>
	 * Name: finishCompileTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178578_b = McMappingDatabase.getSRG("RenderChunk.func_178578_b");

	/**
	 * <p>
	 * Name: deleteGlResources
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178566_a = McMappingDatabase.getSRG("RenderChunk.func_178566_a");

	/**
	 * <p>
	 * Name: getDistanceSq
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_188280_f = McMappingDatabase.getSRG("RenderChunk.func_188280_f");

	/**
	 * <p>
	 * Name: vertexBuffers
	 * </p>
	 */
	public static McObfPair field_178594_l = McMappingDatabase.getSRG("field_178594_l");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_189562_a = McMappingDatabase.getSRG("RenderChunk.func_189562_a");

	/**
	 * <p>
	 * Name: resortTransparency
	 * </p>
	 * <p>
	 * Desc: [(FFFLnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;)V]
	 * </p>
	 */
	public static McObfPair func_178570_a = McMappingDatabase.getSRG("RenderChunk.func_178570_a");

}
