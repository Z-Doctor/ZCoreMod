package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockModelRenderer$AmbientOcclusionFace {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvo$b";
		else
			return "net/minecraft/client/renderer/BlockModelRenderer$AmbientOcclusionFace";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvo$b";
		else
			return "BlockModelRenderer$AmbientOcclusionFace";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvo$b;";
		else
			return "Lnet/minecraft/client/renderer/BlockModelRenderer$AmbientOcclusionFace;";
	}

	/**
	 * <p>
	 * Name: updateVertexBrightness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;[FLjava/util/BitSet;)V]
	 * </p>
	 */
	public static McObfPair func_187491_a = McMappingDatabase.getSRG("BlockModelRenderer$AmbientOcclusionFace.func_187491_a");

	/**
	 * <p>
	 * Name: getAoBrightness
	 * </p>
	 * <p>
	 * Desc: [(IIII)I]
	 * </p>
	 */
	public static McObfPair func_147778_a = McMappingDatabase.getSRG("BlockModelRenderer$AmbientOcclusionFace.func_147778_a");

	/**
	 * <p>
	 * Name: vertexBrightness
	 * </p>
	 */
	public static McObfPair field_178207_c = McMappingDatabase.getSRG("field_178207_c");

	/**
	 * <p>
	 * Name: getVertexBrightness
	 * </p>
	 * <p>
	 * Desc: [(IIIIFFFF)I]
	 * </p>
	 */
	public static McObfPair func_178203_a = McMappingDatabase.getSRG("BlockModelRenderer$AmbientOcclusionFace.func_178203_a");

	/**
	 * <p>
	 * Name: vertexColorMultiplier
	 * </p>
	 */
	public static McObfPair field_178206_b = McMappingDatabase.getSRG("field_178206_b");

}
