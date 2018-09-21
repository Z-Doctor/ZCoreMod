package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PathNavigateGround {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zd";
		else
			return "net/minecraft/pathfinding/PathNavigateGround";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zd";
		else
			return "PathNavigateGround";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzd;";
		else
			return "Lnet/minecraft/pathfinding/PathNavigateGround;";
	}

	/**
	 * <p>
	 * Name: setBreakDoors
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_179688_b = McMappingDatabase.getSRG("PathNavigateGround.func_179688_b");

	/**
	 * <p>
	 * Name: removeSunnyPath
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75487_m = McMappingDatabase.getSRG("PathNavigateGround.func_75487_m");

	/**
	 * <p>
	 * Name: getPathToEntityLiving
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_75494_a = McMappingDatabase.getSRG("PathNavigateGround.func_75494_a");

	/**
	 * <p>
	 * Name: setCanSwim
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_179693_d = McMappingDatabase.getSRG("PathNavigateGround.func_179693_d");

	/**
	 * <p>
	 * Name: isDirectPathBetweenPoints
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;III)Z]
	 * </p>
	 */
	public static McObfPair func_75493_a = McMappingDatabase.getSRG("PathNavigateGround.func_75493_a");

	/**
	 * <p>
	 * Name: isPositionClear
	 * </p>
	 * <p>
	 * Desc: [(IIIIIILnet/minecraft/util/math/Vec3d;DD)Z]
	 * </p>
	 */
	public static McObfPair func_179692_b = McMappingDatabase.getSRG("PathNavigateGround.func_179692_b");

	/**
	 * <p>
	 * Name: getPathFinder
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/PathFinder;]
	 * </p>
	 */
	public static McObfPair func_179679_a = McMappingDatabase.getSRG("PathNavigateGround.func_179679_a");

	/**
	 * <p>
	 * Name: getPathablePosY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179687_p = McMappingDatabase.getSRG("PathNavigateGround.func_179687_p");

	/**
	 * <p>
	 * Name: getPathToPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_179680_a = McMappingDatabase.getSRG("PathNavigateGround.func_179680_a");

	/**
	 * <p>
	 * Name: setAvoidSun
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_179685_e = McMappingDatabase.getSRG("PathNavigateGround.func_179685_e");

	/**
	 * <p>
	 * Name: setEnterDoors
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_179691_c = McMappingDatabase.getSRG("PathNavigateGround.func_179691_c");

	/**
	 * <p>
	 * Name: getEntityPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_75502_i = McMappingDatabase.getSRG("PathNavigateGround.func_75502_i");

	/**
	 * <p>
	 * Name: getEnterDoors
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179686_g = McMappingDatabase.getSRG("PathNavigateGround.func_179686_g");

	/**
	 * <p>
	 * Name: canNavigate
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75485_k = McMappingDatabase.getSRG("PathNavigateGround.func_75485_k");

	/**
	 * <p>
	 * Name: shouldAvoidSun
	 * </p>
	 */
	public static McObfPair field_179694_f = McMappingDatabase.getSRG("field_179694_f");

	/**
	 * <p>
	 * Name: getCanSwim
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179684_h = McMappingDatabase.getSRG("PathNavigateGround.func_179684_h");

	/**
	 * <p>
	 * Name: isSafeToStandAt
	 * </p>
	 * <p>
	 * Desc: [(IIIIIILnet/minecraft/util/math/Vec3d;DD)Z]
	 * </p>
	 */
	public static McObfPair func_179683_a = McMappingDatabase.getSRG("PathNavigateGround.func_179683_a");

}
