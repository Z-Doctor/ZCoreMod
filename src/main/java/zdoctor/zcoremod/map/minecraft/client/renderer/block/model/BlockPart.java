package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvq";
		else
			return "net/minecraft/client/renderer/block/model/BlockPart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvq";
		else
			return "BlockPart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvq;";
		else
			return "Lnet/minecraft/client/renderer/block/model/BlockPart;";
	}

	/**
	 * <p>
	 * Name: partRotation
	 * </p>
	 */
	public static McObfPair field_178237_d = McMappingDatabase.getSRG("field_178237_d");

	/**
	 * <p>
	 * Name: setDefaultUvs
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178235_a = McMappingDatabase.getSRG("BlockPart.func_178235_a");

	/**
	 * <p>
	 * Name: positionTo
	 * </p>
	 */
	public static McObfPair field_178239_b = McMappingDatabase.getSRG("field_178239_b");

	/**
	 * <p>
	 * Name: mapFaces
	 * </p>
	 */
	public static McObfPair field_178240_c = McMappingDatabase.getSRG("field_178240_c");

	/**
	 * <p>
	 * Name: positionFrom
	 * </p>
	 */
	public static McObfPair field_178241_a = McMappingDatabase.getSRG("field_178241_a");

	/**
	 * <p>
	 * Name: shade
	 * </p>
	 */
	public static McObfPair field_178238_e = McMappingDatabase.getSRG("field_178238_e");

	/**
	 * <p>
	 * Name: getFaceUvs
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)[F]
	 * </p>
	 */
	public static McObfPair func_178236_a = McMappingDatabase.getSRG("BlockPart.func_178236_a");

}
