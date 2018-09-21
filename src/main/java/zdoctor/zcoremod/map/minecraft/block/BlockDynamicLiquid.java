package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockDynamicLiquid {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqe";
		else
			return "net/minecraft/block/BlockDynamicLiquid";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqe";
		else
			return "BlockDynamicLiquid";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqe;";
		else
			return "Lnet/minecraft/block/BlockDynamicLiquid;";
	}

	/**
	 * <p>
	 * Name: tryFlowInto
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V]
	 * </p>
	 */
	public static McObfPair func_176375_a = McMappingDatabase.getSRG("BlockDynamicLiquid.func_176375_a");

	/**
	 * <p>
	 * Name: getSlopeFindDistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)I]
	 * </p>
	 */
	public static McObfPair func_185698_b = McMappingDatabase.getSRG("BlockDynamicLiquid.func_185698_b");

	/**
	 * <p>
	 * Name: adjacentSourceBlocks
	 * </p>
	 */
	public static McObfPair field_149815_a = McMappingDatabase.getSRG("field_149815_a");

	/**
	 * <p>
	 * Name: canFlowInto
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_176373_h = McMappingDatabase.getSRG("BlockDynamicLiquid.func_176373_h");

	/**
	 * <p>
	 * Name: checkAdjacentBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)I]
	 * </p>
	 */
	public static McObfPair func_176371_a = McMappingDatabase.getSRG("BlockDynamicLiquid.func_176371_a");

	/**
	 * <p>
	 * Name: updateTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180650_b = McMappingDatabase.getSRG("BlockDynamicLiquid.func_180650_b");

	/**
	 * <p>
	 * Name: getPossibleFlowDirections
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_176376_e = McMappingDatabase.getSRG("BlockDynamicLiquid.func_176376_e");

	/**
	 * <p>
	 * Name: placeStaticBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180690_f = McMappingDatabase.getSRG("BlockDynamicLiquid.func_180690_f");

	/**
	 * <p>
	 * Name: getSlopeDistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_176374_a = McMappingDatabase.getSRG("BlockDynamicLiquid.func_176374_a");

	/**
	 * <p>
	 * Name: onBlockAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176213_c = McMappingDatabase.getSRG("BlockDynamicLiquid.func_176213_c");

	/**
	 * <p>
	 * Name: isBlocked
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_176372_g = McMappingDatabase.getSRG("BlockDynamicLiquid.func_176372_g");

}
