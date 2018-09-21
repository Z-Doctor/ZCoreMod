package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockSlab {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arf";
		else
			return "net/minecraft/block/BlockSlab";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arf";
		else
			return "BlockSlab";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Larf;";
		else
			return "Lnet/minecraft/block/BlockSlab;";
	}

	/**
	 * <p>
	 * Name: isDouble
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_176552_j = McMappingDatabase.getSRG("BlockSlab.func_176552_j");

	/**
	 * <p>
	 * Name: canSilkHarvest
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149700_E = McMappingDatabase.getSRG("BlockSlab.func_149700_E");

	/**
	 * <p>
	 * Name: AABB_BOTTOM_HALF
	 * </p>
	 */
	public static McObfPair field_185676_b = McMappingDatabase.getSRG("field_185676_b");

	/**
	 * <p>
	 * Name: getVariantProperty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/properties/IProperty;]
	 * </p>
	 */
	public static McObfPair func_176551_l = McMappingDatabase.getSRG("BlockSlab.func_176551_l");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockSlab.func_193383_a");

	/**
	 * <p>
	 * Name: isTopSolid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_185481_k = McMappingDatabase.getSRG("BlockSlab.func_185481_k");

	/**
	 * <p>
	 * Name: getTypeForItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/Comparable;]
	 * </p>
	 */
	public static McObfPair func_185674_a = McMappingDatabase.getSRG("BlockSlab.func_185674_a");

	/**
	 * <p>
	 * Name: shouldSideBeRendered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176225_a = McMappingDatabase.getSRG("BlockSlab.func_176225_a");

	/**
	 * <p>
	 * Name: HALF
	 * </p>
	 */
	public static McObfPair field_176554_a = McMappingDatabase.getSRG("field_176554_a");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockSlab.func_185496_a");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockSlab.func_149662_c");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150002_b = McMappingDatabase.getSRG("BlockSlab.func_150002_b");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockSlab.func_149686_d");

	/**
	 * <p>
	 * Name: AABB_TOP_HALF
	 * </p>
	 */
	public static McObfPair field_185677_c = McMappingDatabase.getSRG("field_185677_c");

	/**
	 * <p>
	 * Name: getStateForPlacement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFILnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180642_a = McMappingDatabase.getSRG("BlockSlab.func_180642_a");

	/**
	 * <p>
	 * Name: isHalfSlab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_185675_i = McMappingDatabase.getSRG("BlockSlab.func_185675_i");

	/**
	 * <p>
	 * Name: quantityDropped
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_149745_a = McMappingDatabase.getSRG("BlockSlab.func_149745_a");

}
