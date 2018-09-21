package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockHopper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arl";
		else
			return "net/minecraft/block/BlockHopper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arl";
		else
			return "BlockHopper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Larl;";
		else
			return "Lnet/minecraft/block/BlockHopper;";
	}

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockHopper.func_149686_d");

	/**
	 * <p>
	 * Name: ENABLED
	 * </p>
	 */
	public static McObfPair field_176429_b = McMappingDatabase.getSRG("field_176429_b");

	/**
	 * <p>
	 * Name: onBlockActivated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z]
	 * </p>
	 */
	public static McObfPair func_180639_a = McMappingDatabase.getSRG("BlockHopper.func_180639_a");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("BlockHopper.func_189540_a");

	/**
	 * <p>
	 * Name: getStateForPlacement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFILnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180642_a = McMappingDatabase.getSRG("BlockHopper.func_180642_a");

	/**
	 * <p>
	 * Name: SOUTH_AABB
	 * </p>
	 */
	public static McObfPair field_185572_d = McMappingDatabase.getSRG("field_185572_d");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockHopper.func_185499_a");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockHopper.func_176203_a");

	/**
	 * <p>
	 * Name: FACING
	 * </p>
	 */
	public static McObfPair field_176430_a = McMappingDatabase.getSRG("field_176430_a");

	/**
	 * <p>
	 * Name: getComparatorInputOverride
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180641_l = McMappingDatabase.getSRG("BlockHopper.func_180641_l");

	/**
	 * <p>
	 * Name: createNewTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;I)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_149915_a = McMappingDatabase.getSRG("BlockHopper.func_149915_a");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176428_b = McMappingDatabase.getSRG("BlockHopper.func_176428_b");

	/**
	 * <p>
	 * Name: EAST_AABB
	 * </p>
	 */
	public static McObfPair field_185575_g = McMappingDatabase.getSRG("field_185575_g");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockHopper.func_176201_c");

	/**
	 * <p>
	 * Name: NORTH_AABB
	 * </p>
	 */
	public static McObfPair field_185573_e = McMappingDatabase.getSRG("field_185573_e");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockHopper.func_185471_a");

	/**
	 * <p>
	 * Name: isEnabled
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_149917_c = McMappingDatabase.getSRG("BlockHopper.func_149917_c");

	/**
	 * <p>
	 * Name: WEST_AABB
	 * </p>
	 */
	public static McObfPair field_185574_f = McMappingDatabase.getSRG("field_185574_f");

	/**
	 * <p>
	 * Name: onBlockAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176213_c = McMappingDatabase.getSRG("BlockHopper.func_176213_c");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockHopper.func_149662_c");

	/**
	 * <p>
	 * Name: updateState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176427_e = McMappingDatabase.getSRG("BlockHopper.func_176427_e");

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/util/EnumBlockRenderType;]
	 * </p>
	 */
	public static McObfPair func_149645_b = McMappingDatabase.getSRG("BlockHopper.func_149645_b");

	/**
	 * <p>
	 * Name: addCollisionBoxToList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_185477_a = McMappingDatabase.getSRG("BlockHopper.func_185477_a");

	/**
	 * <p>
	 * Name: isTopSolid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_185481_k = McMappingDatabase.getSRG("BlockHopper.func_185481_k");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockHopper.func_185496_a");

	/**
	 * <p>
	 * Name: onBlockPlacedBy
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_180633_a = McMappingDatabase.getSRG("BlockHopper.func_180633_a");

	/**
	 * <p>
	 * Name: shouldSideBeRendered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176225_a = McMappingDatabase.getSRG("BlockHopper.func_176225_a");

	/**
	 * <p>
	 * Name: getBlockLayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/BlockRenderLayer;]
	 * </p>
	 */
	public static McObfPair func_180664_k = McMappingDatabase.getSRG("BlockHopper.func_180664_k");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockHopper.func_193383_a");

	/**
	 * <p>
	 * Name: hasComparatorInputOverride
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149740_M = McMappingDatabase.getSRG("BlockHopper.func_149740_M");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockHopper.func_180661_e");

	/**
	 * <p>
	 * Name: BASE_AABB
	 * </p>
	 */
	public static McObfPair field_185571_c = McMappingDatabase.getSRG("field_185571_c");

	/**
	 * <p>
	 * Name: breakBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180663_b = McMappingDatabase.getSRG("BlockHopper.func_180663_b");

}
