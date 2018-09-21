package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPartFace {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvr";
		else
			return "net/minecraft/client/renderer/block/model/BlockPartFace";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvr";
		else
			return "BlockPartFace";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvr;";
		else
			return "Lnet/minecraft/client/renderer/block/model/BlockPartFace;";
	}

	/**
	 * <p>
	 * Name: cullFace
	 * </p>
	 */
	public static McObfPair field_178244_b = McMappingDatabase.getSRG("field_178244_b");

	/**
	 * <p>
	 * Name: tintIndex
	 * </p>
	 */
	public static McObfPair field_178245_c = McMappingDatabase.getSRG("field_178245_c");

	/**
	 * <p>
	 * Name: FACING_DEFAULT
	 * </p>
	 */
	public static McObfPair field_178246_a = McMappingDatabase.getSRG("field_178246_a");

	/**
	 * <p>
	 * Name: blockFaceUV
	 * </p>
	 */
	public static McObfPair field_178243_e = McMappingDatabase.getSRG("field_178243_e");

	/**
	 * <p>
	 * Name: texture
	 * </p>
	 */
	public static McObfPair field_178242_d = McMappingDatabase.getSRG("field_178242_d");

}
