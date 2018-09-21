package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPos {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "et";
		else
			return "net/minecraft/util/math/BlockPos";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "et";
		else
			return "BlockPos";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Let;";
		else
			return "Lnet/minecraft/util/math/BlockPos;";
	}

	/**
	 * <p>
	 * Name: crossProduct
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;, (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/Vec3i;]
	 * </p>
	 */
	public static McObfPair func_177955_d = McMappingDatabase.getSRG("BlockPos.func_177955_d");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177971_a = McMappingDatabase.getSRG("BlockPos.func_177971_a");

	/**
	 * <p>
	 * Name: subtract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177973_b = McMappingDatabase.getSRG("BlockPos.func_177973_b");

	/**
	 * <p>
	 * Name: toImmutable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_185334_h = McMappingDatabase.getSRG("BlockPos.func_185334_h");

	/**
	 * <p>
	 * Name: X_SHIFT
	 * </p>
	 */
	public static McObfPair field_177988_g = McMappingDatabase.getSRG("field_177988_g");

	/**
	 * <p>
	 * Name: getAllInBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_177980_a = McMappingDatabase.getSRG("BlockPos.func_177980_a");

	/**
	 * <p>
	 * Name: down
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177979_c = McMappingDatabase.getSRG("BlockPos.func_177979_c");

	/**
	 * <p>
	 * Name: NUM_Y_BITS
	 * </p>
	 */
	public static McObfPair field_177989_d = McMappingDatabase.getSRG("field_177989_d");

	/**
	 * <p>
	 * Name: Y_SHIFT
	 * </p>
	 */
	public static McObfPair field_177987_f = McMappingDatabase.getSRG("field_177987_f");

	/**
	 * <p>
	 * Name: north
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177964_d = McMappingDatabase.getSRG("BlockPos.func_177964_d");

	/**
	 * <p>
	 * Name: east
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177965_g = McMappingDatabase.getSRG("BlockPos.func_177965_g");

	/**
	 * <p>
	 * Name: up
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177984_a = McMappingDatabase.getSRG("BlockPos.func_177984_a");

	/**
	 * <p>
	 * Name: down
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177977_b = McMappingDatabase.getSRG("BlockPos.func_177977_b");

	/**
	 * <p>
	 * Name: Z_MASK
	 * </p>
	 */
	public static McObfPair field_177993_j = McMappingDatabase.getSRG("field_177993_j");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177982_a = McMappingDatabase.getSRG("BlockPos.func_177982_a");

	/**
	 * <p>
	 * Name: west
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177985_f = McMappingDatabase.getSRG("BlockPos.func_177985_f");

	/**
	 * <p>
	 * Name: toLong
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_177986_g = McMappingDatabase.getSRG("BlockPos.func_177986_g");

	/**
	 * <p>
	 * Name: getAllInBox
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_191532_a = McMappingDatabase.getSRG("BlockPos.func_191532_a");

	/**
	 * <p>
	 * Name: south
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177970_e = McMappingDatabase.getSRG("BlockPos.func_177970_e");

	/**
	 * <p>
	 * Name: offset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;I)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177967_a = McMappingDatabase.getSRG("BlockPos.func_177967_a");

	/**
	 * <p>
	 * Name: getAllInBoxMutable
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_191531_b = McMappingDatabase.getSRG("BlockPos.func_191531_b");

	/**
	 * <p>
	 * Name: rotate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Rotation;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_190942_a = McMappingDatabase.getSRG("BlockPos.func_190942_a");

	/**
	 * <p>
	 * Name: west
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177976_e = McMappingDatabase.getSRG("BlockPos.func_177976_e");

	/**
	 * <p>
	 * Name: offset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177972_a = McMappingDatabase.getSRG("BlockPos.func_177972_a");

	/**
	 * <p>
	 * Name: south
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177968_d = McMappingDatabase.getSRG("BlockPos.func_177968_d");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_185335_c = McMappingDatabase.getSRG("field_185335_c");

	/**
	 * <p>
	 * Name: east
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177974_f = McMappingDatabase.getSRG("BlockPos.func_177974_f");

	/**
	 * <p>
	 * Name: fromLong
	 * </p>
	 * <p>
	 * Desc: [(J)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177969_a = McMappingDatabase.getSRG("BlockPos.func_177969_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177963_a = McMappingDatabase.getSRG("BlockPos.func_177963_a");

	/**
	 * <p>
	 * Name: north
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177978_c = McMappingDatabase.getSRG("BlockPos.func_177978_c");

	/**
	 * <p>
	 * Name: up
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177981_b = McMappingDatabase.getSRG("BlockPos.func_177981_b");

	/**
	 * <p>
	 * Name: Y_MASK
	 * </p>
	 */
	public static McObfPair field_177995_i = McMappingDatabase.getSRG("field_177995_i");

	/**
	 * <p>
	 * Name: X_MASK
	 * </p>
	 */
	public static McObfPair field_177994_h = McMappingDatabase.getSRG("field_177994_h");

	/**
	 * <p>
	 * Name: getAllInBoxMutable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_177975_b = McMappingDatabase.getSRG("BlockPos.func_177975_b");

	/**
	 * <p>
	 * Name: ORIGIN
	 * </p>
	 */
	public static McObfPair field_177992_a = McMappingDatabase.getSRG("field_177992_a");

	/**
	 * <p>
	 * Name: NUM_Z_BITS
	 * </p>
	 */
	public static McObfPair field_177991_c = McMappingDatabase.getSRG("field_177991_c");

	/**
	 * <p>
	 * Name: NUM_X_BITS
	 * </p>
	 */
	public static McObfPair field_177990_b = McMappingDatabase.getSRG("field_177990_b");

}
