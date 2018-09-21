package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockLeaves {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arr";
		else
			return "net/minecraft/block/BlockLeaves";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arr";
		else
			return "BlockLeaves";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Larr;";
		else
			return "Lnet/minecraft/block/BlockLeaves;";
	}

	/**
	 * <p>
	 * Name: quantityDropped
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_149745_a = McMappingDatabase.getSRG("BlockLeaves.func_149745_a");

	/**
	 * <p>
	 * Name: destroy
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_176235_d = McMappingDatabase.getSRG("BlockLeaves.func_176235_d");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockLeaves.func_180660_a");

	/**
	 * <p>
	 * Name: causesSuffocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_176214_u = McMappingDatabase.getSRG("BlockLeaves.func_176214_u");

	/**
	 * <p>
	 * Name: dropBlockAsItemWithChance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;FI)V]
	 * </p>
	 */
	public static McObfPair func_180653_a = McMappingDatabase.getSRG("BlockLeaves.func_180653_a");

	/**
	 * <p>
	 * Name: shouldSideBeRendered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176225_a = McMappingDatabase.getSRG("BlockLeaves.func_176225_a");

	/**
	 * <p>
	 * Name: getWoodType
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockPlanks$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176233_b = McMappingDatabase.getSRG("BlockLeaves.func_176233_b");

	/**
	 * <p>
	 * Name: setGraphicsLevel
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_150122_b = McMappingDatabase.getSRG("BlockLeaves.func_150122_b");

	/**
	 * <p>
	 * Name: randomDisplayTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180655_c = McMappingDatabase.getSRG("BlockLeaves.func_180655_c");

	/**
	 * <p>
	 * Name: DECAYABLE
	 * </p>
	 */
	public static McObfPair field_176237_a = McMappingDatabase.getSRG("field_176237_a");

	/**
	 * <p>
	 * Name: surroundings
	 * </p>
	 */
	public static McObfPair field_150128_a = McMappingDatabase.getSRG("field_150128_a");

	/**
	 * <p>
	 * Name: dropApple
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V]
	 * </p>
	 */
	public static McObfPair func_176234_a = McMappingDatabase.getSRG("BlockLeaves.func_176234_a");

	/**
	 * <p>
	 * Name: CHECK_DECAY
	 * </p>
	 */
	public static McObfPair field_176236_b = McMappingDatabase.getSRG("field_176236_b");

	/**
	 * <p>
	 * Name: leavesFancy
	 * </p>
	 */
	public static McObfPair field_185686_c = McMappingDatabase.getSRG("field_185686_c");

	/**
	 * <p>
	 * Name: breakBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180663_b = McMappingDatabase.getSRG("BlockLeaves.func_180663_b");

	/**
	 * <p>
	 * Name: getSaplingDropChance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176232_d = McMappingDatabase.getSRG("BlockLeaves.func_176232_d");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockLeaves.func_149662_c");

	/**
	 * <p>
	 * Name: updateTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180650_b = McMappingDatabase.getSRG("BlockLeaves.func_180650_b");

	/**
	 * <p>
	 * Name: getBlockLayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/BlockRenderLayer;]
	 * </p>
	 */
	public static McObfPair func_180664_k = McMappingDatabase.getSRG("BlockLeaves.func_180664_k");

}
