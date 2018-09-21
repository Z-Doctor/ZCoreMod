package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockModelRenderer$EnumNeighborInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvo$a";
		else
			return "net/minecraft/client/renderer/BlockModelRenderer$EnumNeighborInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvo$a";
		else
			return "BlockModelRenderer$EnumNeighborInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvo$a;";
		else
			return "Lnet/minecraft/client/renderer/BlockModelRenderer$EnumNeighborInfo;";
	}

	/**
	 * <p>
	 * Name: vert3Weights
	 * </p>
	 */
	public static McObfPair field_178285_m = McMappingDatabase.getSRG("field_178285_m");

	/**
	 * <p>
	 * Name: corners
	 * </p>
	 */
	public static McObfPair field_178276_g = McMappingDatabase.getSRG("field_178276_g");

	/**
	 * <p>
	 * Name: vert2Weights
	 * </p>
	 */
	public static McObfPair field_178284_l = McMappingDatabase.getSRG("field_178284_l");

	/**
	 * <p>
	 * Name: doNonCubicWeight
	 * </p>
	 */
	public static McObfPair field_178289_i = McMappingDatabase.getSRG("field_178289_i");

	/**
	 * <p>
	 * Name: vert1Weights
	 * </p>
	 */
	public static McObfPair field_178287_k = McMappingDatabase.getSRG("field_178287_k");

	/**
	 * <p>
	 * Name: VALUES
	 * </p>
	 */
	public static McObfPair field_178282_n = McMappingDatabase.getSRG("field_178282_n");

	/**
	 * <p>
	 * Name: getNeighbourInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/client/renderer/BlockModelRenderer$EnumNeighborInfo;]
	 * </p>
	 */
	public static McObfPair func_178273_a = McMappingDatabase.getSRG("BlockModelRenderer$EnumNeighborInfo.func_178273_a");

	/**
	 * <p>
	 * Name: shadeWeight
	 * </p>
	 */
	public static McObfPair field_178288_h = McMappingDatabase.getSRG("field_178288_h");

	/**
	 * <p>
	 * Name: vert0Weights
	 * </p>
	 */
	public static McObfPair field_178286_j = McMappingDatabase.getSRG("field_178286_j");

}
