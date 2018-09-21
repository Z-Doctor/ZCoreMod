package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ViewFrustum {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvh";
		else
			return "net/minecraft/client/renderer/ViewFrustum";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvh";
		else
			return "ViewFrustum";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvh;";
		else
			return "Lnet/minecraft/client/renderer/ViewFrustum;";
	}

	/**
	 * <p>
	 * Name: getRenderChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/client/renderer/chunk/RenderChunk;]
	 * </p>
	 */
	public static McObfPair func_178161_a = McMappingDatabase.getSRG("ViewFrustum.func_178161_a");

	/**
	 * <p>
	 * Name: renderGlobal
	 * </p>
	 */
	public static McObfPair field_178169_a = McMappingDatabase.getSRG("field_178169_a");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_178167_b = McMappingDatabase.getSRG("field_178167_b");

	/**
	 * <p>
	 * Name: createRenderChunks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/chunk/IRenderChunkFactory;)V]
	 * </p>
	 */
	public static McObfPair func_178158_a = McMappingDatabase.getSRG("ViewFrustum.func_178158_a");

	/**
	 * <p>
	 * Name: updateChunkPositions
	 * </p>
	 * <p>
	 * Desc: [(DD)V]
	 * </p>
	 */
	public static McObfPair func_178163_a = McMappingDatabase.getSRG("ViewFrustum.func_178163_a");

	/**
	 * <p>
	 * Name: deleteGlResources
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178160_a = McMappingDatabase.getSRG("ViewFrustum.func_178160_a");

	/**
	 * <p>
	 * Name: countChunksX
	 * </p>
	 */
	public static McObfPair field_178165_d = McMappingDatabase.getSRG("field_178165_d");

	/**
	 * <p>
	 * Name: markBlocksForUpdate
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIZ)V]
	 * </p>
	 */
	public static McObfPair func_187474_a = McMappingDatabase.getSRG("ViewFrustum.func_187474_a");

	/**
	 * <p>
	 * Name: renderChunks
	 * </p>
	 */
	public static McObfPair field_178164_f = McMappingDatabase.getSRG("field_178164_f");

	/**
	 * <p>
	 * Name: countChunksY
	 * </p>
	 */
	public static McObfPair field_178168_c = McMappingDatabase.getSRG("field_178168_c");

	/**
	 * <p>
	 * Name: setCountChunksXYZ
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_178159_a = McMappingDatabase.getSRG("ViewFrustum.func_178159_a");

	/**
	 * <p>
	 * Name: getBaseCoordinate
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_178157_a = McMappingDatabase.getSRG("ViewFrustum.func_178157_a");

	/**
	 * <p>
	 * Name: countChunksZ
	 * </p>
	 */
	public static McObfPair field_178166_e = McMappingDatabase.getSRG("field_178166_e");

}
