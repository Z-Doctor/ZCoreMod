package zdoctor.zcoremod.map.minecraft.block.state;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockWorldState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aww";
		else
			return "net/minecraft/block/state/BlockWorldState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aww";
		else
			return "BlockWorldState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laww;";
		else
			return "Lnet/minecraft/block/state/BlockWorldState;";
	}

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_177509_a = McMappingDatabase.getSRG("BlockWorldState.func_177509_a");

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 */
	public static McObfPair field_177513_b = McMappingDatabase.getSRG("field_177513_b");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_177515_a = McMappingDatabase.getSRG("field_177515_a");

	/**
	 * <p>
	 * Name: tileEntityInitialized
	 * </p>
	 */
	public static McObfPair field_177512_e = McMappingDatabase.getSRG("field_177512_e");

	/**
	 * <p>
	 * Name: hasState
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_177510_a = McMappingDatabase.getSRG("BlockWorldState.func_177510_a");

	/**
	 * <p>
	 * Name: tileEntity
	 * </p>
	 */
	public static McObfPair field_177511_d = McMappingDatabase.getSRG("field_177511_d");

	/**
	 * <p>
	 * Name: getPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177508_d = McMappingDatabase.getSRG("BlockWorldState.func_177508_d");

	/**
	 * <p>
	 * Name: state
	 * </p>
	 */
	public static McObfPair field_177514_c = McMappingDatabase.getSRG("field_177514_c");

	/**
	 * <p>
	 * Name: forceLoad
	 * </p>
	 */
	public static McObfPair field_181628_c = McMappingDatabase.getSRG("field_181628_c");

	/**
	 * <p>
	 * Name: getTileEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_177507_b = McMappingDatabase.getSRG("BlockWorldState.func_177507_b");

}
