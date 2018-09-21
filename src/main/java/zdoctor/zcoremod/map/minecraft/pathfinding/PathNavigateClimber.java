package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PathNavigateClimber {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zg";
		else
			return "net/minecraft/pathfinding/PathNavigateClimber";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zg";
		else
			return "PathNavigateClimber";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzg;";
		else
			return "Lnet/minecraft/pathfinding/PathNavigateClimber;";
	}

	/**
	 * <p>
	 * Name: getPathToEntityLiving
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_75494_a = McMappingDatabase.getSRG("PathNavigateClimber.func_75494_a");

	/**
	 * <p>
	 * Name: getPathToPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_179680_a = McMappingDatabase.getSRG("PathNavigateClimber.func_179680_a");

	/**
	 * <p>
	 * Name: targetPosition
	 * </p>
	 */
	public static McObfPair field_179696_f = McMappingDatabase.getSRG("field_179696_f");

	/**
	 * <p>
	 * Name: tryMoveToEntityLiving
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;D)Z]
	 * </p>
	 */
	public static McObfPair func_75497_a = McMappingDatabase.getSRG("PathNavigateClimber.func_75497_a");

	/**
	 * <p>
	 * Name: onUpdateNavigation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75501_e = McMappingDatabase.getSRG("PathNavigateClimber.func_75501_e");

}
