package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockBeetroot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aov";
		else
			return "net/minecraft/block/BlockBeetroot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aov";
		else
			return "BlockBeetroot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laov;";
		else
			return "Lnet/minecraft/block/BlockBeetroot;";
	}

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockBeetroot.func_180661_e");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockBeetroot.func_185496_a");

	/**
	 * <p>
	 * Name: BEETROOT_AGE
	 * </p>
	 */
	public static McObfPair field_185531_a = McMappingDatabase.getSRG("field_185531_a");

	/**
	 * <p>
	 * Name: updateTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180650_b = McMappingDatabase.getSRG("BlockBeetroot.func_180650_b");

	/**
	 * <p>
	 * Name: getCrop
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_149865_P = McMappingDatabase.getSRG("BlockBeetroot.func_149865_P");

	/**
	 * <p>
	 * Name: BEETROOT_AABB
	 * </p>
	 */
	public static McObfPair field_185532_d = McMappingDatabase.getSRG("field_185532_d");

	/**
	 * <p>
	 * Name: getBonemealAgeIncrease
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)I]
	 * </p>
	 */
	public static McObfPair func_185529_b = McMappingDatabase.getSRG("BlockBeetroot.func_185529_b");

	/**
	 * <p>
	 * Name: getSeed
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_149866_i = McMappingDatabase.getSRG("BlockBeetroot.func_149866_i");

	/**
	 * <p>
	 * Name: getMaxAge
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185526_g = McMappingDatabase.getSRG("BlockBeetroot.func_185526_g");

	/**
	 * <p>
	 * Name: getAgeProperty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/properties/PropertyInteger;]
	 * </p>
	 */
	public static McObfPair func_185524_e = McMappingDatabase.getSRG("BlockBeetroot.func_185524_e");

}
