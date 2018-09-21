package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FlyingNodeProcessor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bei";
		else
			return "net/minecraft/pathfinding/FlyingNodeProcessor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bei";
		else
			return "FlyingNodeProcessor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbei;";
		else
			return "Lnet/minecraft/pathfinding/FlyingNodeProcessor;";
	}

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;III)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_186330_a = McMappingDatabase.getSRG("FlyingNodeProcessor.func_186330_a");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/entity/EntityLiving;)V]
	 * </p>
	 */
	public static McObfPair func_186315_a = McMappingDatabase.getSRG("FlyingNodeProcessor.func_186315_a");

	/**
	 * <p>
	 * Name: postProcess
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_176163_a = McMappingDatabase.getSRG("FlyingNodeProcessor.func_176163_a");

	/**
	 * <p>
	 * Name: openPoint
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_176159_a = McMappingDatabase.getSRG("FlyingNodeProcessor.func_176159_a");

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLiving;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_192559_a = McMappingDatabase.getSRG("FlyingNodeProcessor.func_192559_a");

	/**
	 * <p>
	 * Name: getStart
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_186318_b = McMappingDatabase.getSRG("FlyingNodeProcessor.func_186318_b");

	/**
	 * <p>
	 * Name: getPathPointToCoords
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_186325_a = McMappingDatabase.getSRG("FlyingNodeProcessor.func_186325_a");

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;IIILnet/minecraft/entity/EntityLiving;IIIZZ)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_186319_a = McMappingDatabase.getSRG("FlyingNodeProcessor.func_186319_a");

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLiving;III)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_192558_a = McMappingDatabase.getSRG("FlyingNodeProcessor.func_192558_a");

	/**
	 * <p>
	 * Name: findPathOptions
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;F)I]
	 * </p>
	 */
	public static McObfPair func_186320_a = McMappingDatabase.getSRG("FlyingNodeProcessor.func_186320_a");

}
