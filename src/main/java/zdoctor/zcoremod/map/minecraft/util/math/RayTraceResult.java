package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RayTraceResult {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhc";
		else
			return "net/minecraft/util/math/RayTraceResult";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhc";
		else
			return "RayTraceResult";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhc;";
		else
			return "Lnet/minecraft/util/math/RayTraceResult;";
	}

	/**
	 * <p>
	 * Name: sideHit
	 * </p>
	 */
	public static McObfPair field_178784_b = McMappingDatabase.getSRG("field_178784_b");

	/**
	 * <p>
	 * Name: entityHit
	 * </p>
	 */
	public static McObfPair field_72308_g = McMappingDatabase.getSRG("field_72308_g");

	/**
	 * <p>
	 * Name: typeOfHit
	 * </p>
	 */
	public static McObfPair field_72313_a = McMappingDatabase.getSRG("field_72313_a");

	/**
	 * <p>
	 * Name: blockPos
	 * </p>
	 */
	public static McObfPair field_178783_e = McMappingDatabase.getSRG("field_178783_e");

	/**
	 * <p>
	 * Name: hitVec
	 * </p>
	 */
	public static McObfPair field_72307_f = McMappingDatabase.getSRG("field_72307_f");

	/**
	 * <p>
	 * Name: getBlockPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_178782_a = McMappingDatabase.getSRG("RayTraceResult.func_178782_a");

}
