package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PathPoint {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bej";
		else
			return "net/minecraft/pathfinding/PathPoint";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bej";
		else
			return "PathPoint";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbej;";
		else
			return "Lnet/minecraft/pathfinding/PathPoint;";
	}

	/**
	 * <p>
	 * Name: nodeType
	 * </p>
	 */
	public static McObfPair field_186287_m = McMappingDatabase.getSRG("field_186287_m");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_75839_a = McMappingDatabase.getSRG("field_75839_a");

	/**
	 * <p>
	 * Name: cost
	 * </p>
	 */
	public static McObfPair field_186285_k = McMappingDatabase.getSRG("field_186285_k");

	/**
	 * <p>
	 * Name: previous
	 * </p>
	 */
	public static McObfPair field_75841_h = McMappingDatabase.getSRG("field_75841_h");

	/**
	 * <p>
	 * Name: hash
	 * </p>
	 */
	public static McObfPair field_75840_j = McMappingDatabase.getSRG("field_75840_j");

	/**
	 * <p>
	 * Name: costMalus
	 * </p>
	 */
	public static McObfPair field_186286_l = McMappingDatabase.getSRG("field_186286_l");

	/**
	 * <p>
	 * Name: distanceToSquared
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/PathPoint;)F]
	 * </p>
	 */
	public static McObfPair func_75832_b = McMappingDatabase.getSRG("PathPoint.func_75832_b");

	/**
	 * <p>
	 * Name: createFromBuffer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_186282_b = McMappingDatabase.getSRG("PathPoint.func_186282_b");

	/**
	 * <p>
	 * Name: isAssigned
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75831_a = McMappingDatabase.getSRG("PathPoint.func_75831_a");

	/**
	 * <p>
	 * Name: distanceFromOrigin
	 * </p>
	 */
	public static McObfPair field_186284_j = McMappingDatabase.getSRG("field_186284_j");

	/**
	 * <p>
	 * Name: distanceToTarget
	 * </p>
	 */
	public static McObfPair field_75834_g = McMappingDatabase.getSRG("field_75834_g");

	/**
	 * <p>
	 * Name: distanceManhattan
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/PathPoint;)F]
	 * </p>
	 */
	public static McObfPair func_186281_c = McMappingDatabase.getSRG("PathPoint.func_186281_c");

	/**
	 * <p>
	 * Name: distanceToNext
	 * </p>
	 */
	public static McObfPair field_75833_f = McMappingDatabase.getSRG("field_75833_f");

	/**
	 * <p>
	 * Name: visited
	 * </p>
	 */
	public static McObfPair field_75842_i = McMappingDatabase.getSRG("field_75842_i");

	/**
	 * <p>
	 * Name: totalPathDistance
	 * </p>
	 */
	public static McObfPair field_75836_e = McMappingDatabase.getSRG("field_75836_e");

	/**
	 * <p>
	 * Name: cloneMove
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_186283_a = McMappingDatabase.getSRG("PathPoint.func_186283_a");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_75838_c = McMappingDatabase.getSRG("field_75838_c");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_75837_b = McMappingDatabase.getSRG("field_75837_b");

	/**
	 * <p>
	 * Name: index
	 * </p>
	 */
	public static McObfPair field_75835_d = McMappingDatabase.getSRG("field_75835_d");

	/**
	 * <p>
	 * Name: distanceTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/PathPoint;)F]
	 * </p>
	 */
	public static McObfPair func_75829_a = McMappingDatabase.getSRG("PathPoint.func_75829_a");

	/**
	 * <p>
	 * Name: makeHash
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_75830_a = McMappingDatabase.getSRG("PathPoint.func_75830_a");

}
