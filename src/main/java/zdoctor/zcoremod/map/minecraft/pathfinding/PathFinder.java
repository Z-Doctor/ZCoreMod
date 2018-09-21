package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PathFinder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bem";
		else
			return "net/minecraft/pathfinding/PathFinder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bem";
		else
			return "PathFinder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbem;";
		else
			return "Lnet/minecraft/pathfinding/PathFinder;";
	}

	/**
	 * <p>
	 * Name: pathOptions
	 * </p>
	 */
	public static McObfPair field_75864_d = McMappingDatabase.getSRG("field_75864_d");

	/**
	 * <p>
	 * Name: findPath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/entity/EntityLiving;Lnet/minecraft/util/math/BlockPos;F)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_186336_a = McMappingDatabase.getSRG("PathFinder.func_186336_a");

	/**
	 * <p>
	 * Name: findPath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;F)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_186335_a = McMappingDatabase.getSRG("PathFinder.func_186335_a");

	/**
	 * <p>
	 * Name: closedSet
	 * </p>
	 */
	public static McObfPair field_186337_b = McMappingDatabase.getSRG("field_186337_b");

	/**
	 * <p>
	 * Name: findPath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/entity/EntityLiving;DDDF)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_186334_a = McMappingDatabase.getSRG("PathFinder.func_186334_a");

	/**
	 * <p>
	 * Name: createPath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_75853_a = McMappingDatabase.getSRG("PathFinder.func_75853_a");

	/**
	 * <p>
	 * Name: findPath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/entity/EntityLiving;Lnet/minecraft/entity/Entity;F)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_186333_a = McMappingDatabase.getSRG("PathFinder.func_186333_a");

	/**
	 * <p>
	 * Name: nodeProcessor
	 * </p>
	 */
	public static McObfPair field_176190_c = McMappingDatabase.getSRG("field_176190_c");

	/**
	 * <p>
	 * Name: path
	 * </p>
	 */
	public static McObfPair field_75866_b = McMappingDatabase.getSRG("field_75866_b");

}
