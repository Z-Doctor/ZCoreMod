package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRailBase$Rail {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aos$a";
		else
			return "net/minecraft/block/BlockRailBase$Rail";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aos$a";
		else
			return "BlockRailBase$Rail";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laos$a;";
		else
			return "Lnet/minecraft/block/BlockRailBase$Rail;";
	}

	/**
	 * <p>
	 * Name: isConnectedToRail
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/BlockRailBase$Rail;)Z]
	 * </p>
	 */
	public static McObfPair func_150653_a = McMappingDatabase.getSRG("BlockRailBase$Rail.func_150653_a");

	/**
	 * <p>
	 * Name: connectTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/BlockRailBase$Rail;)V]
	 * </p>
	 */
	public static McObfPair func_150645_c = McMappingDatabase.getSRG("BlockRailBase$Rail.func_150645_c");

	/**
	 * <p>
	 * Name: removeSoftConnections
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_150651_b = McMappingDatabase.getSRG("BlockRailBase$Rail.func_150651_b");

	/**
	 * <p>
	 * Name: isConnectedTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180363_c = McMappingDatabase.getSRG("BlockRailBase$Rail.func_180363_c");

	/**
	 * <p>
	 * Name: findRailAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockRailBase$Rail;]
	 * </p>
	 */
	public static McObfPair func_180697_b = McMappingDatabase.getSRG("BlockRailBase$Rail.func_180697_b");

	/**
	 * <p>
	 * Name: state
	 * </p>
	 */
	public static McObfPair field_180366_e = McMappingDatabase.getSRG("field_180366_e");

	/**
	 * <p>
	 * Name: countAdjacentRails
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_150650_a = McMappingDatabase.getSRG("BlockRailBase$Rail.func_150650_a");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_150660_b = McMappingDatabase.getSRG("field_150660_b");

	/**
	 * <p>
	 * Name: hasNeighborRail
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180361_d = McMappingDatabase.getSRG("BlockRailBase$Rail.func_180361_d");

	/**
	 * <p>
	 * Name: isPowered
	 * </p>
	 */
	public static McObfPair field_150656_f = McMappingDatabase.getSRG("field_150656_f");

	/**
	 * <p>
	 * Name: canConnectTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/BlockRailBase$Rail;)Z]
	 * </p>
	 */
	public static McObfPair func_150649_b = McMappingDatabase.getSRG("BlockRailBase$Rail.func_150649_b");

	/**
	 * <p>
	 * Name: hasRailAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180359_a = McMappingDatabase.getSRG("BlockRailBase$Rail.func_180359_a");

	/**
	 * <p>
	 * Name: connectedRails
	 * </p>
	 */
	public static McObfPair field_150657_g = McMappingDatabase.getSRG("field_150657_g");

	/**
	 * <p>
	 * Name: getConnectedRails
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_185763_a = McMappingDatabase.getSRG("BlockRailBase$Rail.func_185763_a");

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 */
	public static McObfPair field_180367_c = McMappingDatabase.getSRG("field_180367_c");

	/**
	 * <p>
	 * Name: place
	 * </p>
	 * <p>
	 * Desc: [(ZZ)Lnet/minecraft/block/BlockRailBase$Rail;]
	 * </p>
	 */
	public static McObfPair func_180364_a = McMappingDatabase.getSRG("BlockRailBase$Rail.func_180364_a");

	/**
	 * <p>
	 * Name: updateConnectedRails
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/BlockRailBase$EnumRailDirection;)V]
	 * </p>
	 */
	public static McObfPair func_180360_a = McMappingDatabase.getSRG("BlockRailBase$Rail.func_180360_a");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_180365_d = McMappingDatabase.getSRG("field_180365_d");

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180362_b = McMappingDatabase.getSRG("BlockRailBase$Rail.func_180362_b");

}
