package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SwimNodeProcessor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ben";
		else
			return "net/minecraft/pathfinding/SwimNodeProcessor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ben";
		else
			return "SwimNodeProcessor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lben;";
		else
			return "Lnet/minecraft/pathfinding/SwimNodeProcessor;";
	}

	/**
	 * <p>
	 * Name: isFree
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_186327_c = McMappingDatabase.getSRG("SwimNodeProcessor.func_186327_c");

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;III)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_186330_a = McMappingDatabase.getSRG("SwimNodeProcessor.func_186330_a");

	/**
	 * <p>
	 * Name: findPathOptions
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;F)I]
	 * </p>
	 */
	public static McObfPair func_186320_a = McMappingDatabase.getSRG("SwimNodeProcessor.func_186320_a");

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;IIILnet/minecraft/entity/EntityLiving;IIIZZ)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_186319_a = McMappingDatabase.getSRG("SwimNodeProcessor.func_186319_a");

	/**
	 * <p>
	 * Name: getStart
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_186318_b = McMappingDatabase.getSRG("SwimNodeProcessor.func_186318_b");

	/**
	 * <p>
	 * Name: getPathPointToCoords
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_186325_a = McMappingDatabase.getSRG("SwimNodeProcessor.func_186325_a");

	/**
	 * <p>
	 * Name: getWaterNode
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_186328_b = McMappingDatabase.getSRG("SwimNodeProcessor.func_186328_b");

}
