package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PathNavigate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ze";
		else
			return "net/minecraft/pathfinding/PathNavigate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ze";
		else
			return "PathNavigate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lze;";
		else
			return "Lnet/minecraft/pathfinding/PathNavigate;";
	}

	/**
	 * <p>
	 * Name: updatePath
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188554_j = McMappingDatabase.getSRG("PathNavigate.func_188554_j");

	/**
	 * <p>
	 * Name: tryUpdatePath
	 * </p>
	 */
	public static McObfPair field_188562_p = McMappingDatabase.getSRG("field_188562_p");

	/**
	 * <p>
	 * Name: removeSunnyPath
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75487_m = McMappingDatabase.getSRG("PathNavigate.func_75487_m");

	/**
	 * <p>
	 * Name: getPathSearchRange
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_111269_d = McMappingDatabase.getSRG("PathNavigate.func_111269_d");

	/**
	 * <p>
	 * Name: timeoutLimit
	 * </p>
	 */
	public static McObfPair field_188560_n = McMappingDatabase.getSRG("field_188560_n");

	/**
	 * <p>
	 * Name: pathFinder
	 * </p>
	 */
	public static McObfPair field_179681_j = McMappingDatabase.getSRG("field_179681_j");

	/**
	 * <p>
	 * Name: nodeProcessor
	 * </p>
	 */
	public static McObfPair field_179695_a = McMappingDatabase.getSRG("field_179695_a");

	/**
	 * <p>
	 * Name: timeoutTimer
	 * </p>
	 */
	public static McObfPair field_188558_l = McMappingDatabase.getSRG("field_188558_l");

	/**
	 * <p>
	 * Name: getEntityPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_75502_i = McMappingDatabase.getSRG("PathNavigate.func_75502_i");

	/**
	 * <p>
	 * Name: getPathFinder
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/PathFinder;]
	 * </p>
	 */
	public static McObfPair func_179679_a = McMappingDatabase.getSRG("PathNavigate.func_179679_a");

	/**
	 * <p>
	 * Name: targetPos
	 * </p>
	 */
	public static McObfPair field_188564_r = McMappingDatabase.getSRG("field_188564_r");

	/**
	 * <p>
	 * Name: lastPosCheck
	 * </p>
	 */
	public static McObfPair field_75521_i = McMappingDatabase.getSRG("field_75521_i");

	/**
	 * <p>
	 * Name: tryMoveToXYZ
	 * </p>
	 * <p>
	 * Desc: [(DDDD)Z]
	 * </p>
	 */
	public static McObfPair func_75492_a = McMappingDatabase.getSRG("PathNavigate.func_75492_a");

	/**
	 * <p>
	 * Name: isInLiquid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75506_l = McMappingDatabase.getSRG("PathNavigate.func_75506_l");

	/**
	 * <p>
	 * Name: getNodeProcessor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/NodeProcessor;]
	 * </p>
	 */
	public static McObfPair func_189566_q = McMappingDatabase.getSRG("PathNavigate.func_189566_q");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75513_b = McMappingDatabase.getSRG("field_75513_b");

	/**
	 * <p>
	 * Name: onUpdateNavigation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75501_e = McMappingDatabase.getSRG("PathNavigate.func_75501_e");

	/**
	 * <p>
	 * Name: lastTimeoutCheck
	 * </p>
	 */
	public static McObfPair field_188559_m = McMappingDatabase.getSRG("field_188559_m");

	/**
	 * <p>
	 * Name: setPath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/Path;D)Z]
	 * </p>
	 */
	public static McObfPair func_75484_a = McMappingDatabase.getSRG("PathNavigate.func_75484_a");

	/**
	 * <p>
	 * Name: timeoutCachedNode
	 * </p>
	 */
	public static McObfPair field_188557_k = McMappingDatabase.getSRG("field_188557_k");

	/**
	 * <p>
	 * Name: maxDistanceToWaypoint
	 * </p>
	 */
	public static McObfPair field_188561_o = McMappingDatabase.getSRG("field_188561_o");

	/**
	 * <p>
	 * Name: isDirectPathBetweenPoints
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;III)Z]
	 * </p>
	 */
	public static McObfPair func_75493_a = McMappingDatabase.getSRG("PathNavigate.func_75493_a");

	/**
	 * <p>
	 * Name: getPathToEntityLiving
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_75494_a = McMappingDatabase.getSRG("PathNavigate.func_75494_a");

	/**
	 * <p>
	 * Name: canUpdatePathOnTimeout
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188553_i = McMappingDatabase.getSRG("PathNavigate.func_188553_i");

	/**
	 * <p>
	 * Name: clearPath
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75499_g = McMappingDatabase.getSRG("PathNavigate.func_75499_g");

	/**
	 * <p>
	 * Name: canNavigate
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75485_k = McMappingDatabase.getSRG("PathNavigate.func_75485_k");

	/**
	 * <p>
	 * Name: debugPathFinding
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192876_m = McMappingDatabase.getSRG("PathNavigate.func_192876_m");

	/**
	 * <p>
	 * Name: pathFollow
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75508_h = McMappingDatabase.getSRG("PathNavigate.func_75508_h");

	/**
	 * <p>
	 * Name: noPath
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75500_f = McMappingDatabase.getSRG("PathNavigate.func_75500_f");

	/**
	 * <p>
	 * Name: tryMoveToEntityLiving
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;D)Z]
	 * </p>
	 */
	public static McObfPair func_75497_a = McMappingDatabase.getSRG("PathNavigate.func_75497_a");

	/**
	 * <p>
	 * Name: setSpeed
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_75489_a = McMappingDatabase.getSRG("PathNavigate.func_75489_a");

	/**
	 * <p>
	 * Name: getPathToXYZ
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_75488_a = McMappingDatabase.getSRG("PathNavigate.func_75488_a");

	/**
	 * <p>
	 * Name: lastTimeUpdated
	 * </p>
	 */
	public static McObfPair field_188563_q = McMappingDatabase.getSRG("field_188563_q");

	/**
	 * <p>
	 * Name: currentPath
	 * </p>
	 */
	public static McObfPair field_75514_c = McMappingDatabase.getSRG("field_75514_c");

	/**
	 * <p>
	 * Name: canEntityStandOnPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_188555_b = McMappingDatabase.getSRG("PathNavigate.func_188555_b");

	/**
	 * <p>
	 * Name: totalTicks
	 * </p>
	 */
	public static McObfPair field_75510_g = McMappingDatabase.getSRG("field_75510_g");

	/**
	 * <p>
	 * Name: checkForStuck
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)V]
	 * </p>
	 */
	public static McObfPair func_179677_a = McMappingDatabase.getSRG("PathNavigate.func_179677_a");

	/**
	 * <p>
	 * Name: speed
	 * </p>
	 */
	public static McObfPair field_75511_d = McMappingDatabase.getSRG("field_75511_d");

	/**
	 * <p>
	 * Name: getPathToPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_179680_a = McMappingDatabase.getSRG("PathNavigate.func_179680_a");

	/**
	 * <p>
	 * Name: ticksAtLastPos
	 * </p>
	 */
	public static McObfPair field_75520_h = McMappingDatabase.getSRG("field_75520_h");

	/**
	 * <p>
	 * Name: getPath
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_75505_d = McMappingDatabase.getSRG("PathNavigate.func_75505_d");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75515_a = McMappingDatabase.getSRG("field_75515_a");

	/**
	 * <p>
	 * Name: pathSearchRange
	 * </p>
	 */
	public static McObfPair field_75512_e = McMappingDatabase.getSRG("field_75512_e");

}
