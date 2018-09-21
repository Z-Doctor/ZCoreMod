package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockCrops {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aps";
		else
			return "net/minecraft/block/BlockCrops";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aps";
		else
			return "BlockCrops";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laps;";
		else
			return "Lnet/minecraft/block/BlockCrops;";
	}

	/**
	 * <p>
	 * Name: getMaxAge
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185526_g = McMappingDatabase.getSRG("BlockCrops.func_185526_g");

	/**
	 * <p>
	 * Name: getBonemealAgeIncrease
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)I]
	 * </p>
	 */
	public static McObfPair func_185529_b = McMappingDatabase.getSRG("BlockCrops.func_185529_b");

	/**
	 * <p>
	 * Name: grow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176487_g = McMappingDatabase.getSRG("BlockCrops.func_176487_g");

	/**
	 * <p>
	 * Name: CROPS_AABB
	 * </p>
	 */
	public static McObfPair field_185530_a = McMappingDatabase.getSRG("field_185530_a");

	/**
	 * <p>
	 * Name: canSustainBush
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_185514_i = McMappingDatabase.getSRG("BlockCrops.func_185514_i");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockCrops.func_180661_e");

	/**
	 * <p>
	 * Name: canBlockStay
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_180671_f = McMappingDatabase.getSRG("BlockCrops.func_180671_f");

	/**
	 * <p>
	 * Name: getAge
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_185527_x = McMappingDatabase.getSRG("BlockCrops.func_185527_x");

	/**
	 * <p>
	 * Name: getAgeProperty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/properties/PropertyInteger;]
	 * </p>
	 */
	public static McObfPair func_185524_e = McMappingDatabase.getSRG("BlockCrops.func_185524_e");

	/**
	 * <p>
	 * Name: canUseBonemeal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_180670_a = McMappingDatabase.getSRG("BlockCrops.func_180670_a");

	/**
	 * <p>
	 * Name: getSeed
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_149866_i = McMappingDatabase.getSRG("BlockCrops.func_149866_i");

	/**
	 * <p>
	 * Name: updateTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180650_b = McMappingDatabase.getSRG("BlockCrops.func_180650_b");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockCrops.func_185496_a");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockCrops.func_180660_a");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockCrops.func_176203_a");

	/**
	 * <p>
	 * Name: getCrop
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_149865_P = McMappingDatabase.getSRG("BlockCrops.func_149865_P");

	/**
	 * <p>
	 * Name: canGrow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Z)Z]
	 * </p>
	 */
	public static McObfPair func_176473_a = McMappingDatabase.getSRG("BlockCrops.func_176473_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockCrops.func_176201_c");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185473_a = McMappingDatabase.getSRG("BlockCrops.func_185473_a");

	/**
	 * <p>
	 * Name: getGrowthChance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_180672_a = McMappingDatabase.getSRG("BlockCrops.func_180672_a");

	/**
	 * <p>
	 * Name: dropBlockAsItemWithChance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;FI)V]
	 * </p>
	 */
	public static McObfPair func_180653_a = McMappingDatabase.getSRG("BlockCrops.func_180653_a");

	/**
	 * <p>
	 * Name: withAge
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185528_e = McMappingDatabase.getSRG("BlockCrops.func_185528_e");

	/**
	 * <p>
	 * Name: grow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176474_b = McMappingDatabase.getSRG("BlockCrops.func_176474_b");

	/**
	 * <p>
	 * Name: isMaxAge
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_185525_y = McMappingDatabase.getSRG("BlockCrops.func_185525_y");

	/**
	 * <p>
	 * Name: AGE
	 * </p>
	 */
	public static McObfPair field_176488_a = McMappingDatabase.getSRG("field_176488_a");

}
