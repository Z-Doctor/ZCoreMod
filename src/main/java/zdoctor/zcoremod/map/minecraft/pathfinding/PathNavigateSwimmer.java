package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PathNavigateSwimmer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zh";
		else
			return "net/minecraft/pathfinding/PathNavigateSwimmer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zh";
		else
			return "PathNavigateSwimmer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzh;";
		else
			return "Lnet/minecraft/pathfinding/PathNavigateSwimmer;";
	}

	/**
	 * <p>
	 * Name: pathFollow
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75508_h = McMappingDatabase.getSRG("PathNavigateSwimmer.func_75508_h");

	/**
	 * <p>
	 * Name: canNavigate
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75485_k = McMappingDatabase.getSRG("PathNavigateSwimmer.func_75485_k");

	/**
	 * <p>
	 * Name: getPathFinder
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/PathFinder;]
	 * </p>
	 */
	public static McObfPair func_179679_a = McMappingDatabase.getSRG("PathNavigateSwimmer.func_179679_a");

	/**
	 * <p>
	 * Name: getEntityPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_75502_i = McMappingDatabase.getSRG("PathNavigateSwimmer.func_75502_i");

	/**
	 * <p>
	 * Name: isDirectPathBetweenPoints
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;III)Z]
	 * </p>
	 */
	public static McObfPair func_75493_a = McMappingDatabase.getSRG("PathNavigateSwimmer.func_75493_a");

	/**
	 * <p>
	 * Name: canEntityStandOnPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_188555_b = McMappingDatabase.getSRG("PathNavigateSwimmer.func_188555_b");

}
