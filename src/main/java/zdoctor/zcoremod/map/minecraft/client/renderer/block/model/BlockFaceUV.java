package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockFaceUV {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvt";
		else
			return "net/minecraft/client/renderer/block/model/BlockFaceUV";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvt";
		else
			return "BlockFaceUV";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvt;";
		else
			return "Lnet/minecraft/client/renderer/block/model/BlockFaceUV;";
	}

	/**
	 * <p>
	 * Name: getVertexV
	 * </p>
	 * <p>
	 * Desc: [(I)F]
	 * </p>
	 */
	public static McObfPair func_178346_b = McMappingDatabase.getSRG("BlockFaceUV.func_178346_b");

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_178350_b = McMappingDatabase.getSRG("field_178350_b");

	/**
	 * <p>
	 * Name: uvs
	 * </p>
	 */
	public static McObfPair field_178351_a = McMappingDatabase.getSRG("field_178351_a");

	/**
	 * <p>
	 * Name: getVertexRotatedRev
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_178345_c = McMappingDatabase.getSRG("BlockFaceUV.func_178345_c");

	/**
	 * <p>
	 * Name: setUvs
	 * </p>
	 * <p>
	 * Desc: [([F)V]
	 * </p>
	 */
	public static McObfPair func_178349_a = McMappingDatabase.getSRG("BlockFaceUV.func_178349_a");

	/**
	 * <p>
	 * Name: getVertexRotated
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_178347_d = McMappingDatabase.getSRG("BlockFaceUV.func_178347_d");

	/**
	 * <p>
	 * Name: getVertexU
	 * </p>
	 * <p>
	 * Desc: [(I)F]
	 * </p>
	 */
	public static McObfPair func_178348_a = McMappingDatabase.getSRG("BlockFaceUV.func_178348_a");

}
