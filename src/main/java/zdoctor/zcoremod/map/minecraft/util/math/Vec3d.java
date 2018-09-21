package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Vec3d {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhe";
		else
			return "net/minecraft/util/math/Vec3d";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhe";
		else
			return "Vec3d";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhe;";
		else
			return "Lnet/minecraft/util/math/Vec3d;";
	}

	/**
	 * <p>
	 * Name: subtract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_178788_d = McMappingDatabase.getSRG("Vec3d.func_178788_d");

	/**
	 * <p>
	 * Name: normalize
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_72432_b = McMappingDatabase.getSRG("Vec3d.func_72432_b");

	/**
	 * <p>
	 * Name: subtractReverse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_72444_a = McMappingDatabase.getSRG("Vec3d.func_72444_a");

	/**
	 * <p>
	 * Name: getIntermediateWithZValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_72434_d = McMappingDatabase.getSRG("Vec3d.func_72434_d");

	/**
	 * <p>
	 * Name: getIntermediateWithXValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_72429_b = McMappingDatabase.getSRG("Vec3d.func_72429_b");

	/**
	 * <p>
	 * Name: lengthSquared
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_189985_c = McMappingDatabase.getSRG("Vec3d.func_189985_c");

	/**
	 * <p>
	 * Name: squareDistanceTo
	 * </p>
	 * <p>
	 * Desc: [(DDD)D]
	 * </p>
	 */
	public static McObfPair func_186679_c = McMappingDatabase.getSRG("Vec3d.func_186679_c");

	/**
	 * <p>
	 * Name: squareDistanceTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)D]
	 * </p>
	 */
	public static McObfPair func_72436_e = McMappingDatabase.getSRG("Vec3d.func_72436_e");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_72450_a = McMappingDatabase.getSRG("field_72450_a");

	/**
	 * <p>
	 * Name: fromPitchYawVector
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec2f;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_189984_a = McMappingDatabase.getSRG("Vec3d.func_189984_a");

	/**
	 * <p>
	 * Name: subtract
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_178786_a = McMappingDatabase.getSRG("Vec3d.func_178786_a");

	/**
	 * <p>
	 * Name: lengthVector
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_72433_c = McMappingDatabase.getSRG("Vec3d.func_72433_c");

	/**
	 * <p>
	 * Name: distanceTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)D]
	 * </p>
	 */
	public static McObfPair func_72438_d = McMappingDatabase.getSRG("Vec3d.func_72438_d");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_72448_b = McMappingDatabase.getSRG("field_72448_b");

	/**
	 * <p>
	 * Name: ZERO
	 * </p>
	 */
	public static McObfPair field_186680_a = McMappingDatabase.getSRG("field_186680_a");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_72449_c = McMappingDatabase.getSRG("field_72449_c");

	/**
	 * <p>
	 * Name: getIntermediateWithYValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;D)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_72435_c = McMappingDatabase.getSRG("Vec3d.func_72435_c");

	/**
	 * <p>
	 * Name: crossProduct
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_72431_c = McMappingDatabase.getSRG("Vec3d.func_72431_c");

	/**
	 * <p>
	 * Name: dotProduct
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)D]
	 * </p>
	 */
	public static McObfPair func_72430_b = McMappingDatabase.getSRG("Vec3d.func_72430_b");

	/**
	 * <p>
	 * Name: rotateYaw
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_178785_b = McMappingDatabase.getSRG("Vec3d.func_178785_b");

	/**
	 * <p>
	 * Name: addVector
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_72441_c = McMappingDatabase.getSRG("Vec3d.func_72441_c");

	/**
	 * <p>
	 * Name: rotatePitch
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_178789_a = McMappingDatabase.getSRG("Vec3d.func_178789_a");

	/**
	 * <p>
	 * Name: scale
	 * </p>
	 * <p>
	 * Desc: [(D)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_186678_a = McMappingDatabase.getSRG("Vec3d.func_186678_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_178787_e = McMappingDatabase.getSRG("Vec3d.func_178787_e");

	/**
	 * <p>
	 * Name: fromPitchYaw
	 * </p>
	 * <p>
	 * Desc: [(FF)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_189986_a = McMappingDatabase.getSRG("Vec3d.func_189986_a");

}
