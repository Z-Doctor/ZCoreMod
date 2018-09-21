package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NodeProcessor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bek";
		else
			return "net/minecraft/pathfinding/NodeProcessor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bek";
		else
			return "NodeProcessor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbek;";
		else
			return "Lnet/minecraft/pathfinding/NodeProcessor;";
	}

	/**
	 * <p>
	 * Name: canSwim
	 * </p>
	 */
	public static McObfPair field_176184_i = McMappingDatabase.getSRG("field_176184_i");

	/**
	 * <p>
	 * Name: getCanOpenDoors
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186324_d = McMappingDatabase.getSRG("NodeProcessor.func_186324_d");

	/**
	 * <p>
	 * Name: getCanEnterDoors
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186323_c = McMappingDatabase.getSRG("NodeProcessor.func_186323_c");

	/**
	 * <p>
	 * Name: entitySizeY
	 * </p>
	 */
	public static McObfPair field_176165_d = McMappingDatabase.getSRG("field_176165_d");

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;IIILnet/minecraft/entity/EntityLiving;IIIZZ)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_186319_a = McMappingDatabase.getSRG("NodeProcessor.func_186319_a");

	/**
	 * <p>
	 * Name: blockaccess
	 * </p>
	 */
	public static McObfPair field_176169_a = McMappingDatabase.getSRG("field_176169_a");

	/**
	 * <p>
	 * Name: entitySizeZ
	 * </p>
	 */
	public static McObfPair field_176166_e = McMappingDatabase.getSRG("field_176166_e");

	/**
	 * <p>
	 * Name: postProcess
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_176163_a = McMappingDatabase.getSRG("NodeProcessor.func_176163_a");

	/**
	 * <p>
	 * Name: canEnterDoors
	 * </p>
	 */
	public static McObfPair field_176180_f = McMappingDatabase.getSRG("field_176180_f");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/entity/EntityLiving;)V]
	 * </p>
	 */
	public static McObfPair func_186315_a = McMappingDatabase.getSRG("NodeProcessor.func_186315_a");

	/**
	 * <p>
	 * Name: getStart
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_186318_b = McMappingDatabase.getSRG("NodeProcessor.func_186318_b");

	/**
	 * <p>
	 * Name: canOpenDoors
	 * </p>
	 */
	public static McObfPair field_176181_g = McMappingDatabase.getSRG("field_176181_g");

	/**
	 * <p>
	 * Name: setCanOpenDoors
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_186321_b = McMappingDatabase.getSRG("NodeProcessor.func_186321_b");

	/**
	 * <p>
	 * Name: getPathNodeType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;III)Lnet/minecraft/pathfinding/PathNodeType;]
	 * </p>
	 */
	public static McObfPair func_186330_a = McMappingDatabase.getSRG("NodeProcessor.func_186330_a");

	/**
	 * <p>
	 * Name: entitySizeX
	 * </p>
	 */
	public static McObfPair field_176168_c = McMappingDatabase.getSRG("field_176168_c");

	/**
	 * <p>
	 * Name: openPoint
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_176159_a = McMappingDatabase.getSRG("NodeProcessor.func_176159_a");

	/**
	 * <p>
	 * Name: findPathOptions
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;F)I]
	 * </p>
	 */
	public static McObfPair func_186320_a = McMappingDatabase.getSRG("NodeProcessor.func_186320_a");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_186326_b = McMappingDatabase.getSRG("field_186326_b");

	/**
	 * <p>
	 * Name: getPathPointToCoords
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/pathfinding/PathPoint;]
	 * </p>
	 */
	public static McObfPair func_186325_a = McMappingDatabase.getSRG("NodeProcessor.func_186325_a");

	/**
	 * <p>
	 * Name: setCanEnterDoors
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_186317_a = McMappingDatabase.getSRG("NodeProcessor.func_186317_a");

	/**
	 * <p>
	 * Name: setCanSwim
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_186316_c = McMappingDatabase.getSRG("NodeProcessor.func_186316_c");

	/**
	 * <p>
	 * Name: getCanSwim
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186322_e = McMappingDatabase.getSRG("NodeProcessor.func_186322_e");

	/**
	 * <p>
	 * Name: pointMap
	 * </p>
	 */
	public static McObfPair field_176167_b = McMappingDatabase.getSRG("field_176167_b");

}
