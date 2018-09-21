package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Vec3i {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fq";
		else
			return "net/minecraft/util/math/Vec3i";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fq";
		else
			return "Vec3i";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfq;";
		else
			return "Lnet/minecraft/util/math/Vec3i;";
	}

	/**
	 * <p>
	 * Name: crossProduct
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/Vec3i;]
	 * </p>
	 */
	public static McObfPair func_177955_d = McMappingDatabase.getSRG("Vec3i.func_177955_d");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177956_o = McMappingDatabase.getSRG("Vec3i.func_177956_o");

	/**
	 * <p>
	 * Name: getDistance
	 * </p>
	 * <p>
	 * Desc: [(III)D]
	 * </p>
	 */
	public static McObfPair func_185332_f = McMappingDatabase.getSRG("Vec3i.func_185332_f");

	/**
	 * <p>
	 * Name: distanceSqToCenter
	 * </p>
	 * <p>
	 * Desc: [(DDD)D]
	 * </p>
	 */
	public static McObfPair func_177957_d = McMappingDatabase.getSRG("Vec3i.func_177957_d");

	/**
	 * <p>
	 * Name: distanceSq
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3i;)D]
	 * </p>
	 */
	public static McObfPair func_177951_i = McMappingDatabase.getSRG("Vec3i.func_177951_i");

	/**
	 * <p>
	 * Name: distanceSq
	 * </p>
	 * <p>
	 * Desc: [(DDD)D]
	 * </p>
	 */
	public static McObfPair func_177954_c = McMappingDatabase.getSRG("Vec3i.func_177954_c");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_177960_b = McMappingDatabase.getSRG("field_177960_b");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177958_n = McMappingDatabase.getSRG("Vec3i.func_177958_n");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_177961_c = McMappingDatabase.getSRG("field_177961_c");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177952_p = McMappingDatabase.getSRG("Vec3i.func_177952_p");

	/**
	 * <p>
	 * Name: NULL_VECTOR
	 * </p>
	 */
	public static McObfPair field_177959_e = McMappingDatabase.getSRG("field_177959_e");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_177962_a = McMappingDatabase.getSRG("field_177962_a");

}
