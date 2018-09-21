package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PathHeap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "beg";
		else
			return "net/minecraft/pathfinding/PathHeap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "beg";
		else
			return "PathHeap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbeg;";
		else
			return "Lnet/minecraft/pathfinding/PathHeap;";
	}

	/**
	 * <p>
	 * Name: dequeue
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_75844_c = McMappingDatabase.getSRG("PathHeap.func_75844_c");

	/**
	 * <p>
	 * Name: changeDistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/PathPoint;F)V]
	 * </p>
	 */
	public static McObfPair func_75850_a = McMappingDatabase.getSRG("PathHeap.func_75850_a");

	/**
	 * <p>
	 * Name: clearPath
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75848_a = McMappingDatabase.getSRG("PathHeap.func_75848_a");

	/**
	 * <p>
	 * Name: isPathEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75845_e = McMappingDatabase.getSRG("PathHeap.func_75845_e");

	/**
	 * <p>
	 * Name: pathPoints
	 * </p>
	 */
	public static McObfPair field_75852_a = McMappingDatabase.getSRG("field_75852_a");

	/**
	 * <p>
	 * Name: addPoint
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/PathPoint;)Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_75849_a = McMappingDatabase.getSRG("PathHeap.func_75849_a");

	/**
	 * <p>
	 * Name: count
	 * </p>
	 */
	public static McObfPair field_75851_b = McMappingDatabase.getSRG("field_75851_b");

	/**
	 * <p>
	 * Name: sortForward
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_75846_b = McMappingDatabase.getSRG("PathHeap.func_75846_b");

	/**
	 * <p>
	 * Name: sortBack
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_75847_a = McMappingDatabase.getSRG("PathHeap.func_75847_a");

}
