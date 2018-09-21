package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Variant {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwe";
		else
			return "net/minecraft/client/renderer/block/model/Variant";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwe";
		else
			return "Variant";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwe;";
		else
			return "Lnet/minecraft/client/renderer/block/model/Variant;";
	}

	/**
	 * <p>
	 * Name: modelLocation
	 * </p>
	 */
	public static McObfPair field_188050_a = McMappingDatabase.getSRG("field_188050_a");

	/**
	 * <p>
	 * Name: uvLock
	 * </p>
	 */
	public static McObfPair field_188052_c = McMappingDatabase.getSRG("field_188052_c");

	/**
	 * <p>
	 * Name: getRotation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ModelRotation;]
	 * </p>
	 */
	public static McObfPair func_188048_b = McMappingDatabase.getSRG("Variant.func_188048_b");

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_188051_b = McMappingDatabase.getSRG("field_188051_b");

	/**
	 * <p>
	 * Name: getModelLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_188046_a = McMappingDatabase.getSRG("Variant.func_188046_a");

	/**
	 * <p>
	 * Name: weight
	 * </p>
	 */
	public static McObfPair field_188053_d = McMappingDatabase.getSRG("field_188053_d");

	/**
	 * <p>
	 * Name: isUvLock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188049_c = McMappingDatabase.getSRG("Variant.func_188049_c");

	/**
	 * <p>
	 * Name: getWeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188047_d = McMappingDatabase.getSRG("Variant.func_188047_d");

}
