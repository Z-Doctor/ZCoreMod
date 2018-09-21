package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AxisAlignedBB {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhb";
		else
			return "net/minecraft/util/math/AxisAlignedBB";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhb";
		else
			return "AxisAlignedBB";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhb;";
		else
			return "Lnet/minecraft/util/math/AxisAlignedBB;";
	}

	/**
	 * <p>
	 * Name: offset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_186670_a = McMappingDatabase.getSRG("AxisAlignedBB.func_186670_a");

	/**
	 * <p>
	 * Name: collideWithZPlane
	 * </p>
	 * <p>
	 * Desc: [(DLnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_186665_c = McMappingDatabase.getSRG("AxisAlignedBB.func_186665_c");

	/**
	 * <p>
	 * Name: setMaxY
	 * </p>
	 * <p>
	 * Desc: [(D)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_186666_e = McMappingDatabase.getSRG("AxisAlignedBB.func_186666_e");

	/**
	 * <p>
	 * Name: grow
	 * </p>
	 * <p>
	 * Desc: [(D)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_186662_g = McMappingDatabase.getSRG("AxisAlignedBB.func_186662_g");

	/**
	 * <p>
	 * Name: grow
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_72314_b = McMappingDatabase.getSRG("AxisAlignedBB.func_72314_b");

	/**
	 * <p>
	 * Name: calculateYOffset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;D)D]
	 * </p>
	 */
	public static McObfPair func_72323_b = McMappingDatabase.getSRG("AxisAlignedBB.func_72323_b");

	/**
	 * <p>
	 * Name: expand
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_72321_a = McMappingDatabase.getSRG("AxisAlignedBB.func_72321_a");

	/**
	 * <p>
	 * Name: minZ
	 * </p>
	 */
	public static McObfPair field_72339_c = McMappingDatabase.getSRG("field_72339_c");

	/**
	 * <p>
	 * Name: minY
	 * </p>
	 */
	public static McObfPair field_72338_b = McMappingDatabase.getSRG("field_72338_b");

	/**
	 * <p>
	 * Name: maxX
	 * </p>
	 */
	public static McObfPair field_72336_d = McMappingDatabase.getSRG("field_72336_d");

	/**
	 * <p>
	 * Name: union
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_111270_a = McMappingDatabase.getSRG("AxisAlignedBB.func_111270_a");

	/**
	 * <p>
	 * Name: isClosest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Z]
	 * </p>
	 */
	public static McObfPair func_186661_a = McMappingDatabase.getSRG("AxisAlignedBB.func_186661_a");

	/**
	 * <p>
	 * Name: maxY
	 * </p>
	 */
	public static McObfPair field_72337_e = McMappingDatabase.getSRG("field_72337_e");

	/**
	 * <p>
	 * Name: collideWithXPlane
	 * </p>
	 * <p>
	 * Desc: [(DLnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_186671_a = McMappingDatabase.getSRG("AxisAlignedBB.func_186671_a");

	/**
	 * <p>
	 * Name: calculateXOffset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;D)D]
	 * </p>
	 */
	public static McObfPair func_72316_a = McMappingDatabase.getSRG("AxisAlignedBB.func_72316_a");

	/**
	 * <p>
	 * Name: hasNaN
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181656_b = McMappingDatabase.getSRG("AxisAlignedBB.func_181656_b");

	/**
	 * <p>
	 * Name: getCenter
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_189972_c = McMappingDatabase.getSRG("AxisAlignedBB.func_189972_c");

	/**
	 * <p>
	 * Name: intersectsWithXZ
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)Z]
	 * </p>
	 */
	public static McObfPair func_186667_c = McMappingDatabase.getSRG("AxisAlignedBB.func_186667_c");

	/**
	 * <p>
	 * Name: intersect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_191500_a = McMappingDatabase.getSRG("AxisAlignedBB.func_191500_a");

	/**
	 * <p>
	 * Name: intersectsWithXY
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)Z]
	 * </p>
	 */
	public static McObfPair func_186669_d = McMappingDatabase.getSRG("AxisAlignedBB.func_186669_d");

	/**
	 * <p>
	 * Name: offset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_191194_a = McMappingDatabase.getSRG("AxisAlignedBB.func_191194_a");

	/**
	 * <p>
	 * Name: intersects
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Z]
	 * </p>
	 */
	public static McObfPair func_189973_a = McMappingDatabase.getSRG("AxisAlignedBB.func_189973_a");

	/**
	 * <p>
	 * Name: shrink
	 * </p>
	 * <p>
	 * Desc: [(D)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_186664_h = McMappingDatabase.getSRG("AxisAlignedBB.func_186664_h");

	/**
	 * <p>
	 * Name: maxZ
	 * </p>
	 */
	public static McObfPair field_72334_f = McMappingDatabase.getSRG("field_72334_f");

	/**
	 * <p>
	 * Name: intersectsWithYZ
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)Z]
	 * </p>
	 */
	public static McObfPair func_186660_b = McMappingDatabase.getSRG("AxisAlignedBB.func_186660_b");

	/**
	 * <p>
	 * Name: collideWithYPlane
	 * </p>
	 * <p>
	 * Desc: [(DLnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_186663_b = McMappingDatabase.getSRG("AxisAlignedBB.func_186663_b");

	/**
	 * <p>
	 * Name: calculateIntercept
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;]
	 * </p>
	 */
	public static McObfPair func_72327_a = McMappingDatabase.getSRG("AxisAlignedBB.func_72327_a");

	/**
	 * <p>
	 * Name: intersects
	 * </p>
	 * <p>
	 * Desc: [(DDDDDD)Z]
	 * </p>
	 */
	public static McObfPair func_186668_a = McMappingDatabase.getSRG("AxisAlignedBB.func_186668_a");

	/**
	 * <p>
	 * Name: contract
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_191195_a = McMappingDatabase.getSRG("AxisAlignedBB.func_191195_a");

	/**
	 * <p>
	 * Name: getAverageEdgeLength
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_72320_b = McMappingDatabase.getSRG("AxisAlignedBB.func_72320_b");

	/**
	 * <p>
	 * Name: contains
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)Z]
	 * </p>
	 */
	public static McObfPair func_72318_a = McMappingDatabase.getSRG("AxisAlignedBB.func_72318_a");

	/**
	 * <p>
	 * Name: calculateZOffset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;D)D]
	 * </p>
	 */
	public static McObfPair func_72322_c = McMappingDatabase.getSRG("AxisAlignedBB.func_72322_c");

	/**
	 * <p>
	 * Name: minX
	 * </p>
	 */
	public static McObfPair field_72340_a = McMappingDatabase.getSRG("field_72340_a");

	/**
	 * <p>
	 * Name: intersects
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Z]
	 * </p>
	 */
	public static McObfPair func_72326_a = McMappingDatabase.getSRG("AxisAlignedBB.func_72326_a");

	/**
	 * <p>
	 * Name: offset
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_72317_d = McMappingDatabase.getSRG("AxisAlignedBB.func_72317_d");

}
