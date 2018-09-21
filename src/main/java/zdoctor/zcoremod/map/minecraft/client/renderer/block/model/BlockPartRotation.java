package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPartRotation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvs";
		else
			return "net/minecraft/client/renderer/block/model/BlockPartRotation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvs";
		else
			return "BlockPartRotation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvs;";
		else
			return "Lnet/minecraft/client/renderer/block/model/BlockPartRotation;";
	}

	/**
	 * <p>
	 * Name: axis
	 * </p>
	 */
	public static McObfPair field_178342_b = McMappingDatabase.getSRG("field_178342_b");

	/**
	 * <p>
	 * Name: origin
	 * </p>
	 */
	public static McObfPair field_178344_a = McMappingDatabase.getSRG("field_178344_a");

	/**
	 * <p>
	 * Name: rescale
	 * </p>
	 */
	public static McObfPair field_178341_d = McMappingDatabase.getSRG("field_178341_d");

	/**
	 * <p>
	 * Name: angle
	 * </p>
	 */
	public static McObfPair field_178343_c = McMappingDatabase.getSRG("field_178343_c");

}
