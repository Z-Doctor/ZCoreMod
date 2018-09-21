package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPistonBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awj";
		else
			return "net/minecraft/block/BlockPistonBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awj";
		else
			return "BlockPistonBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawj;";
		else
			return "Lnet/minecraft/block/BlockPistonBase;";
	}

	/**
	 * <p>
	 * Name: causesSuffocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_176214_u = McMappingDatabase.getSRG("BlockPistonBase.func_176214_u");

	/**
	 * <p>
	 * Name: PISTON_BASE_DOWN_AABB
	 * </p>
	 */
	public static McObfPair field_185653_g = McMappingDatabase.getSRG("field_185653_g");

	/**
	 * <p>
	 * Name: isSticky
	 * </p>
	 */
	public static McObfPair field_150082_a = McMappingDatabase.getSRG("field_150082_a");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockPistonBase.func_149662_c");

	/**
	 * <p>
	 * Name: canPush
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;ZLnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_185646_a = McMappingDatabase.getSRG("BlockPistonBase.func_185646_a");

	/**
	 * <p>
	 * Name: isTopSolid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_185481_k = McMappingDatabase.getSRG("BlockPistonBase.func_185481_k");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockPistonBase.func_185471_a");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockPistonBase.func_176203_a");

	/**
	 * <p>
	 * Name: addCollisionBoxToList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_185477_a = McMappingDatabase.getSRG("BlockPistonBase.func_185477_a");

	/**
	 * <p>
	 * Name: onBlockPlacedBy
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_180633_a = McMappingDatabase.getSRG("BlockPistonBase.func_180633_a");

	/**
	 * <p>
	 * Name: PISTON_BASE_NORTH_AABB
	 * </p>
	 */
	public static McObfPair field_185651_e = McMappingDatabase.getSRG("field_185651_e");

	/**
	 * <p>
	 * Name: shouldBeExtended
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176318_b = McMappingDatabase.getSRG("BlockPistonBase.func_176318_b");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockPistonBase.func_185499_a");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockPistonBase.func_149686_d");

	/**
	 * <p>
	 * Name: doMove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Z)Z]
	 * </p>
	 */
	public static McObfPair func_176319_a = McMappingDatabase.getSRG("BlockPistonBase.func_176319_a");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176317_b = McMappingDatabase.getSRG("BlockPistonBase.func_176317_b");

	/**
	 * <p>
	 * Name: getStateForPlacement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFILnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180642_a = McMappingDatabase.getSRG("BlockPistonBase.func_180642_a");

	/**
	 * <p>
	 * Name: eventReceived
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;II)Z]
	 * </p>
	 */
	public static McObfPair func_189539_a = McMappingDatabase.getSRG("BlockPistonBase.func_189539_a");

	/**
	 * <p>
	 * Name: PISTON_BASE_UP_AABB
	 * </p>
	 */
	public static McObfPair field_185652_f = McMappingDatabase.getSRG("field_185652_f");

	/**
	 * <p>
	 * Name: PISTON_BASE_SOUTH_AABB
	 * </p>
	 */
	public static McObfPair field_185650_d = McMappingDatabase.getSRG("field_185650_d");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockPistonBase.func_180661_e");

	/**
	 * <p>
	 * Name: PISTON_BASE_EAST_AABB
	 * </p>
	 */
	public static McObfPair field_185648_b = McMappingDatabase.getSRG("field_185648_b");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("BlockPistonBase.func_189540_a");

	/**
	 * <p>
	 * Name: onBlockAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176213_c = McMappingDatabase.getSRG("BlockPistonBase.func_176213_c");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockPistonBase.func_193383_a");

	/**
	 * <p>
	 * Name: PISTON_BASE_WEST_AABB
	 * </p>
	 */
	public static McObfPair field_185649_c = McMappingDatabase.getSRG("field_185649_c");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockPistonBase.func_176201_c");

	/**
	 * <p>
	 * Name: checkForMove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176316_e = McMappingDatabase.getSRG("BlockPistonBase.func_176316_e");

	/**
	 * <p>
	 * Name: EXTENDED
	 * </p>
	 */
	public static McObfPair field_176320_b = McMappingDatabase.getSRG("field_176320_b");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockPistonBase.func_185496_a");

}
