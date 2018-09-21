package zdoctor.zcoremod.map.minecraft.block.state;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPistonStructureHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awn";
		else
			return "net/minecraft/block/state/BlockPistonStructureHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awn";
		else
			return "BlockPistonStructureHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawn;";
		else
			return "Lnet/minecraft/block/state/BlockPistonStructureHelper;";
	}

	/**
	 * <p>
	 * Name: pistonPos
	 * </p>
	 */
	public static McObfPair field_177259_b = McMappingDatabase.getSRG("field_177259_b");

	/**
	 * <p>
	 * Name: blockToMove
	 * </p>
	 */
	public static McObfPair field_177260_c = McMappingDatabase.getSRG("field_177260_c");

	/**
	 * <p>
	 * Name: toMove
	 * </p>
	 */
	public static McObfPair field_177258_e = McMappingDatabase.getSRG("field_177258_e");

	/**
	 * <p>
	 * Name: canMove
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177253_a = McMappingDatabase.getSRG("BlockPistonStructureHelper.func_177253_a");

	/**
	 * <p>
	 * Name: getBlocksToDestroy
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177252_d = McMappingDatabase.getSRG("BlockPistonStructureHelper.func_177252_d");

	/**
	 * <p>
	 * Name: reorderListAtCollision
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_177255_a = McMappingDatabase.getSRG("BlockPistonStructureHelper.func_177255_a");

	/**
	 * <p>
	 * Name: getBlocksToMove
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177254_c = McMappingDatabase.getSRG("BlockPistonStructureHelper.func_177254_c");

	/**
	 * <p>
	 * Name: addBranchingBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_177250_b = McMappingDatabase.getSRG("BlockPistonStructureHelper.func_177250_b");

	/**
	 * <p>
	 * Name: toDestroy
	 * </p>
	 */
	public static McObfPair field_177256_f = McMappingDatabase.getSRG("field_177256_f");

	/**
	 * <p>
	 * Name: addBlockLine
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_177251_a = McMappingDatabase.getSRG("BlockPistonStructureHelper.func_177251_a");

	/**
	 * <p>
	 * Name: moveDirection
	 * </p>
	 */
	public static McObfPair field_177257_d = McMappingDatabase.getSRG("field_177257_d");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_177261_a = McMappingDatabase.getSRG("field_177261_a");

}
