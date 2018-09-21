package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MathHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rk";
		else
			return "net/minecraft/util/math/MathHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rk";
		else
			return "MathHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrk;";
		else
			return "Lnet/minecraft/util/math/MathHelper;";
	}

	/**
	 * <p>
	 * Name: frac
	 * </p>
	 * <p>
	 * Desc: [(D)D]
	 * </p>
	 */
	public static McObfPair func_181162_h = McMappingDatabase.getSRG("MathHelper.func_181162_h");

	/**
	 * <p>
	 * Name: getDouble
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;D)D]
	 * </p>
	 */
	public static McObfPair func_82712_a = McMappingDatabase.getSRG("MathHelper.func_82712_a");

	/**
	 * <p>
	 * Name: sqrt
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_76129_c = McMappingDatabase.getSRG("MathHelper.func_76129_c");

	/**
	 * <p>
	 * Name: wrapDegrees
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_188209_b = McMappingDatabase.getSRG("MathHelper.func_188209_b");

	/**
	 * <p>
	 * Name: rgb
	 * </p>
	 * <p>
	 * Desc: [(FFF)I]
	 * </p>
	 */
	public static McObfPair func_180183_b = McMappingDatabase.getSRG("MathHelper.func_180183_b");

	/**
	 * <p>
	 * Name: clamp
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_76125_a = McMappingDatabase.getSRG("MathHelper.func_76125_a");

	/**
	 * <p>
	 * Name: fastInvSqrt
	 * </p>
	 * <p>
	 * Desc: [(D)D]
	 * </p>
	 */
	public static McObfPair func_181161_i = McMappingDatabase.getSRG("MathHelper.func_181161_i");

	/**
	 * <p>
	 * Name: abs
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_76130_a = McMappingDatabase.getSRG("MathHelper.func_76130_a");

	/**
	 * <p>
	 * Name: intFloorDiv
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_76137_a = McMappingDatabase.getSRG("MathHelper.func_76137_a");

	/**
	 * <p>
	 * Name: roundUp
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_154354_b = McMappingDatabase.getSRG("MathHelper.func_154354_b");

	/**
	 * <p>
	 * Name: ASINE_TAB
	 * </p>
	 */
	public static McObfPair field_181164_e = McMappingDatabase.getSRG("field_181164_e");

	/**
	 * <p>
	 * Name: RANDOM
	 * </p>
	 */
	public static McObfPair field_188211_c = McMappingDatabase.getSRG("field_188211_c");

	/**
	 * <p>
	 * Name: abs
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_76135_e = McMappingDatabase.getSRG("MathHelper.func_76135_e");

	/**
	 * <p>
	 * Name: ceil
	 * </p>
	 * <p>
	 * Desc: [(D)I]
	 * </p>
	 */
	public static McObfPair func_76143_f = McMappingDatabase.getSRG("MathHelper.func_76143_f");

	/**
	 * <p>
	 * Name: FRAC_BIAS
	 * </p>
	 */
	public static McObfPair field_181163_d = McMappingDatabase.getSRG("field_181163_d");

	/**
	 * <p>
	 * Name: log2
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_151239_c = McMappingDatabase.getSRG("MathHelper.func_151239_c");

	/**
	 * <p>
	 * Name: atan2
	 * </p>
	 * <p>
	 * Desc: [(DD)D]
	 * </p>
	 */
	public static McObfPair func_181159_b = McMappingDatabase.getSRG("MathHelper.func_181159_b");

	/**
	 * <p>
	 * Name: getRandomUUID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_188210_a = McMappingDatabase.getSRG("MathHelper.func_188210_a");

	/**
	 * <p>
	 * Name: positiveModulo
	 * </p>
	 * <p>
	 * Desc: [(DD)D]
	 * </p>
	 */
	public static McObfPair func_191273_b = McMappingDatabase.getSRG("MathHelper.func_191273_b");

	/**
	 * <p>
	 * Name: floor
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_76141_d = McMappingDatabase.getSRG("MathHelper.func_76141_d");

	/**
	 * <p>
	 * Name: nextFloat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;FF)F]
	 * </p>
	 */
	public static McObfPair func_151240_a = McMappingDatabase.getSRG("MathHelper.func_151240_a");

	/**
	 * <p>
	 * Name: SQRT_2
	 * </p>
	 */
	public static McObfPair field_180189_a = McMappingDatabase.getSRG("field_180189_a");

	/**
	 * <p>
	 * Name: pct
	 * </p>
	 * <p>
	 * Desc: [(DDD)D]
	 * </p>
	 */
	public static McObfPair func_181160_c = McMappingDatabase.getSRG("MathHelper.func_181160_c");

	/**
	 * <p>
	 * Name: nextDouble
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;DD)D]
	 * </p>
	 */
	public static McObfPair func_82716_a = McMappingDatabase.getSRG("MathHelper.func_82716_a");

	/**
	 * <p>
	 * Name: hash
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_188208_f = McMappingDatabase.getSRG("MathHelper.func_188208_f");

	/**
	 * <p>
	 * Name: wrapDegrees
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_76142_g = McMappingDatabase.getSRG("MathHelper.func_76142_g");

	/**
	 * <p>
	 * Name: normalizeAngle
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_180184_b = McMappingDatabase.getSRG("MathHelper.func_180184_b");

	/**
	 * <p>
	 * Name: clampedLerp
	 * </p>
	 * <p>
	 * Desc: [(DDD)D]
	 * </p>
	 */
	public static McObfPair func_151238_b = McMappingDatabase.getSRG("MathHelper.func_151238_b");

	/**
	 * <p>
	 * Name: lfloor
	 * </p>
	 * <p>
	 * Desc: [(D)J]
	 * </p>
	 */
	public static McObfPair func_76124_d = McMappingDatabase.getSRG("MathHelper.func_76124_d");

	/**
	 * <p>
	 * Name: isPowerOfTwo
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_151235_d = McMappingDatabase.getSRG("MathHelper.func_151235_d");

	/**
	 * <p>
	 * Name: getCoordinateRandom
	 * </p>
	 * <p>
	 * Desc: [(III)J]
	 * </p>
	 */
	public static McObfPair func_180187_c = McMappingDatabase.getSRG("MathHelper.func_180187_c");

	/**
	 * <p>
	 * Name: clamp
	 * </p>
	 * <p>
	 * Desc: [(FFF)F]
	 * </p>
	 */
	public static McObfPair func_76131_a = McMappingDatabase.getSRG("MathHelper.func_76131_a");

	/**
	 * <p>
	 * Name: COS_TAB
	 * </p>
	 */
	public static McObfPair field_181165_f = McMappingDatabase.getSRG("field_181165_f");

	/**
	 * <p>
	 * Name: sin
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_76126_a = McMappingDatabase.getSRG("MathHelper.func_76126_a");

	/**
	 * <p>
	 * Name: epsilonEquals
	 * </p>
	 * <p>
	 * Desc: [(FF)Z]
	 * </p>
	 */
	public static McObfPair func_180185_a = McMappingDatabase.getSRG("MathHelper.func_180185_a");

	/**
	 * <p>
	 * Name: cos
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_76134_b = McMappingDatabase.getSRG("MathHelper.func_76134_b");

	/**
	 * <p>
	 * Name: average
	 * </p>
	 * <p>
	 * Desc: [([J)D]
	 * </p>
	 */
	public static McObfPair func_76127_a = McMappingDatabase.getSRG("MathHelper.func_76127_a");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;II)I]
	 * </p>
	 */
	public static McObfPair func_76136_a = McMappingDatabase.getSRG("MathHelper.func_76136_a");

	/**
	 * <p>
	 * Name: multiplyColor
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_180188_d = McMappingDatabase.getSRG("MathHelper.func_180188_d");

	/**
	 * <p>
	 * Name: positiveModulo
	 * </p>
	 * <p>
	 * Desc: [(FF)F]
	 * </p>
	 */
	public static McObfPair func_188207_b = McMappingDatabase.getSRG("MathHelper.func_188207_b");

	/**
	 * <p>
	 * Name: smallestEncompassingPowerOfTwo
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_151236_b = McMappingDatabase.getSRG("MathHelper.func_151236_b");

	/**
	 * <p>
	 * Name: absFloor
	 * </p>
	 * <p>
	 * Desc: [(D)I]
	 * </p>
	 */
	public static McObfPair func_154353_e = McMappingDatabase.getSRG("MathHelper.func_154353_e");

	/**
	 * <p>
	 * Name: floor
	 * </p>
	 * <p>
	 * Desc: [(D)I]
	 * </p>
	 */
	public static McObfPair func_76128_c = McMappingDatabase.getSRG("MathHelper.func_76128_c");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;II)I]
	 * </p>
	 */
	public static McObfPair func_82714_a = McMappingDatabase.getSRG("MathHelper.func_82714_a");

	/**
	 * <p>
	 * Name: getRandomUUID
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_180182_a = McMappingDatabase.getSRG("MathHelper.func_180182_a");

	/**
	 * <p>
	 * Name: MULTIPLY_DE_BRUIJN_BIT_POSITION
	 * </p>
	 */
	public static McObfPair field_151242_b = McMappingDatabase.getSRG("field_151242_b");

	/**
	 * <p>
	 * Name: hsvToRGB
	 * </p>
	 * <p>
	 * Desc: [(FFF)I]
	 * </p>
	 */
	public static McObfPair func_181758_c = McMappingDatabase.getSRG("MathHelper.func_181758_c");

	/**
	 * <p>
	 * Name: absMax
	 * </p>
	 * <p>
	 * Desc: [(DD)D]
	 * </p>
	 */
	public static McObfPair func_76132_a = McMappingDatabase.getSRG("MathHelper.func_76132_a");

	/**
	 * <p>
	 * Name: rgb
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_180181_b = McMappingDatabase.getSRG("MathHelper.func_180181_b");

	/**
	 * <p>
	 * Name: ceil
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_76123_f = McMappingDatabase.getSRG("MathHelper.func_76123_f");

	/**
	 * <p>
	 * Name: wrapDegrees
	 * </p>
	 * <p>
	 * Desc: [(D)D]
	 * </p>
	 */
	public static McObfPair func_76138_g = McMappingDatabase.getSRG("MathHelper.func_76138_g");

	/**
	 * <p>
	 * Name: getPositionRandom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3i;)J]
	 * </p>
	 */
	public static McObfPair func_180186_a = McMappingDatabase.getSRG("MathHelper.func_180186_a");

	/**
	 * <p>
	 * Name: SIN_TABLE
	 * </p>
	 */
	public static McObfPair field_76144_a = McMappingDatabase.getSRG("field_76144_a");

	/**
	 * <p>
	 * Name: clamp
	 * </p>
	 * <p>
	 * Desc: [(DDD)D]
	 * </p>
	 */
	public static McObfPair func_151237_a = McMappingDatabase.getSRG("MathHelper.func_151237_a");

	/**
	 * <p>
	 * Name: fastFloor
	 * </p>
	 * <p>
	 * Desc: [(D)I]
	 * </p>
	 */
	public static McObfPair func_76140_b = McMappingDatabase.getSRG("MathHelper.func_76140_b");

	/**
	 * <p>
	 * Name: sqrt
	 * </p>
	 * <p>
	 * Desc: [(D)F]
	 * </p>
	 */
	public static McObfPair func_76133_a = McMappingDatabase.getSRG("MathHelper.func_76133_a");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)I]
	 * </p>
	 */
	public static McObfPair func_82715_a = McMappingDatabase.getSRG("MathHelper.func_82715_a");

	/**
	 * <p>
	 * Name: getDouble
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;DD)D]
	 * </p>
	 */
	public static McObfPair func_82713_a = McMappingDatabase.getSRG("MathHelper.func_82713_a");

	/**
	 * <p>
	 * Name: log2DeBruijn
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_151241_e = McMappingDatabase.getSRG("MathHelper.func_151241_e");

}
