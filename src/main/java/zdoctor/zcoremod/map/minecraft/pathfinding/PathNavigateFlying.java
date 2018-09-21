package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PathNavigateFlying {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zc";
		else
			return "net/minecraft/pathfinding/PathNavigateFlying";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zc";
		else
			return "PathNavigateFlying";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzc;";
		else
			return "Lnet/minecraft/pathfinding/PathNavigateFlying;";
	}

	/**
	 * <p>
	 * Name: canNavigate
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75485_k = McMappingDatabase.getSRG("PathNavigateFlying.func_75485_k");

	/**
	 * <p>
	 * Name: canFloat
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192880_g = McMappingDatabase.getSRG("PathNavigateFlying.func_192880_g");

	/**
	 * <p>
	 * Name: setCanOpenDoors
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_192879_a = McMappingDatabase.getSRG("PathNavigateFlying.func_192879_a");

	/**
	 * <p>
	 * Name: getEntityPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_75502_i = McMappingDatabase.getSRG("PathNavigateFlying.func_75502_i");

	/**
	 * <p>
	 * Name: setCanEnterDoors
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_192878_b = McMappingDatabase.getSRG("PathNavigateFlying.func_192878_b");

	/**
	 * <p>
	 * Name: getPathToEntityLiving
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/pathfinding/Path;]
	 * </p>
	 */
	public static McObfPair func_75494_a = McMappingDatabase.getSRG("PathNavigateFlying.func_75494_a");

	/**
	 * <p>
	 * Name: canEntityStandOnPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_188555_b = McMappingDatabase.getSRG("PathNavigateFlying.func_188555_b");

	/**
	 * <p>
	 * Name: onUpdateNavigation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75501_e = McMappingDatabase.getSRG("PathNavigateFlying.func_75501_e");

	/**
	 * <p>
	 * Name: setCanFloat
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_192877_c = McMappingDatabase.getSRG("PathNavigateFlying.func_192877_c");

	/**
	 * <p>
	 * Name: getPathFinder
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/PathFinder;]
	 * </p>
	 */
	public static McObfPair func_179679_a = McMappingDatabase.getSRG("PathNavigateFlying.func_179679_a");

	/**
	 * <p>
	 * Name: isDirectPathBetweenPoints
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;III)Z]
	 * </p>
	 */
	public static McObfPair func_75493_a = McMappingDatabase.getSRG("PathNavigateFlying.func_75493_a");

}
