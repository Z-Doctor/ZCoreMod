package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Path {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bel";
		else
			return "net/minecraft/pathfinding/Path";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bel";
		else
			return "Path";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbel;";
		else
			return "Lnet/minecraft/pathfinding/Path;";
	}

	/**
	 * <p>
	 * Name: incrementPathIndex
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75875_a = McMappingDatabase.getSRG("Path.func_75875_a");

	/**
	 * <p>
	 * Name: target
	 * </p>
	 */
	public static McObfPair field_186314_d = McMappingDatabase.getSRG("field_186314_d");

	/**
	 * <p>
	 * Name: openSet
	 * </p>
	 */
	public static McObfPair field_186312_b = McMappingDatabase.getSRG("field_186312_b");

	/**
	 * <p>
	 * Name: getPathPointFromIndex
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_75877_a = McMappingDatabase.getSRG("Path.func_75877_a");

	/**
	 * <p>
	 * Name: setCurrentPathLength
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_75871_b = McMappingDatabase.getSRG("Path.func_75871_b");

	/**
	 * <p>
	 * Name: getCurrentPathIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75873_e = McMappingDatabase.getSRG("Path.func_75873_e");

	/**
	 * <p>
	 * Name: setCurrentPathIndex
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_75872_c = McMappingDatabase.getSRG("Path.func_75872_c");

	/**
	 * <p>
	 * Name: isSamePath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/Path;)Z]
	 * </p>
	 */
	public static McObfPair func_75876_a = McMappingDatabase.getSRG("Path.func_75876_a");

	/**
	 * <p>
	 * Name: setPoint
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/pathfinding/PathPoint;)V]
	 * </p>
	 */
	public static McObfPair func_186309_a = McMappingDatabase.getSRG("Path.func_186309_a");

	/**
	 * <p>
	 * Name: getVectorFromIndex
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;I)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_75881_a = McMappingDatabase.getSRG("Path.func_75881_a");

	/**
	 * <p>
	 * Name: currentPathIndex
	 * </p>
	 */
	public static McObfPair field_75882_b = McMappingDatabase.getSRG("field_75882_b");

	/**
	 * <p>
	 * Name: getFinalPathPoint
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_75870_c = McMappingDatabase.getSRG("Path.func_75870_c");

	/**
	 * <p>
	 * Name: pathLength
	 * </p>
	 */
	public static McObfPair field_75883_c = McMappingDatabase.getSRG("field_75883_c");

	/**
	 * <p>
	 * Name: getOpenSet
	 * </p>
	 * <p>
	 * Desc: [()[Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_189966_g = McMappingDatabase.getSRG("Path.func_189966_g");

	/**
	 * <p>
	 * Name: points
	 * </p>
	 */
	public static McObfPair field_75884_a = McMappingDatabase.getSRG("field_75884_a");

	/**
	 * <p>
	 * Name: closedSet
	 * </p>
	 */
	public static McObfPair field_186313_c = McMappingDatabase.getSRG("field_186313_c");

	/**
	 * <p>
	 * Name: getTarget
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_189964_i = McMappingDatabase.getSRG("Path.func_189964_i");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_186311_b = McMappingDatabase.getSRG("Path.func_186311_b");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_75878_a = McMappingDatabase.getSRG("Path.func_75878_a");

	/**
	 * <p>
	 * Name: getCurrentPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_186310_f = McMappingDatabase.getSRG("Path.func_186310_f");

	/**
	 * <p>
	 * Name: getClosedSet
	 * </p>
	 * <p>
	 * Desc: [()[Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_189965_h = McMappingDatabase.getSRG("Path.func_189965_h");

	/**
	 * <p>
	 * Name: getCurrentPathLength
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75874_d = McMappingDatabase.getSRG("Path.func_75874_d");

	/**
	 * <p>
	 * Name: isFinished
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75879_b = McMappingDatabase.getSRG("Path.func_75879_b");

}
