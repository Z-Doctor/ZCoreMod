package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WalkNodeProcessor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "beo";
		else
			return "net/minecraft/pathfinding/WalkNodeProcessor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "beo";
		else
			return "WalkNodeProcessor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbeo;";
		else
			return "Lnet/minecraft/pathfinding/WalkNodeProcessor;";
	}

	/**
	 * <p>
	 * Name: findPathOptions
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;F)I]
	 * </p>
	 */
	public static McObfPair func_186320_a = McMappingDatabase.getSRG("WalkNodeProcessor.func_186320_a");

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;III)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_186330_a = McMappingDatabase.getSRG("WalkNodeProcessor.func_186330_a");

	/**
	 * <p>
	 * Name: avoidsWater
	 * </p>
	 */
	public static McObfPair field_176183_h = McMappingDatabase.getSRG("field_176183_h");

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLiving;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_186329_a = McMappingDatabase.getSRG("WalkNodeProcessor.func_186329_a");

	/**
	 * <p>
	 * Name: getPathNodeTypeRaw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;III)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_189553_b = McMappingDatabase.getSRG("WalkNodeProcessor.func_189553_b");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/entity/EntityLiving;)V]
	 * </p>
	 */
	public static McObfPair func_186315_a = McMappingDatabase.getSRG("WalkNodeProcessor.func_186315_a");

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;IIILnet/minecraft/entity/EntityLiving;IIIZZ)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_186319_a = McMappingDatabase.getSRG("WalkNodeProcessor.func_186319_a");

	/**
	 * <p>
	 * Name: getStart
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_186318_b = McMappingDatabase.getSRG("WalkNodeProcessor.func_186318_b");

	/**
	 * <p>
	 * Name: checkNeighborBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;IIILnet/minecraft/pathfinding/PathNodeType;)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_193578_a = McMappingDatabase.getSRG("WalkNodeProcessor.func_193578_a");

	/**
	 * <p>
	 * Name: postProcess
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_176163_a = McMappingDatabase.getSRG("WalkNodeProcessor.func_176163_a");

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;IIIIIIZZLjava/util/EnumSet;Lnet/minecraft/pathfinding/PathNodeType;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_193577_a = McMappingDatabase.getSRG("WalkNodeProcessor.func_193577_a");

	/**
	 * <p>
	 * Name: getSafePoint
	 * </p>
	 * <p>
	 * Desc: [(IIIIDLnet/minecraft/util/EnumFacing;)Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_186332_a = McMappingDatabase.getSRG("WalkNodeProcessor.func_186332_a");

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLiving;III)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_186331_a = McMappingDatabase.getSRG("WalkNodeProcessor.func_186331_a");

	/**
	 * <p>
	 * Name: getPathPointToCoords
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_186325_a = McMappingDatabase.getSRG("WalkNodeProcessor.func_186325_a");

}
