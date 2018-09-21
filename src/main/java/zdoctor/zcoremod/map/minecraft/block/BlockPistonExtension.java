package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPistonExtension {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awk";
		else
			return "net/minecraft/block/BlockPistonExtension";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awk";
		else
			return "BlockPistonExtension";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawk;";
		else
			return "Lnet/minecraft/block/BlockPistonExtension;";
	}

	/**
	 * <p>
	 * Name: canPlaceBlockAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176196_c = McMappingDatabase.getSRG("BlockPistonExtension.func_176196_c");

	/**
	 * <p>
	 * Name: NORTH_ARM_AABB
	 * </p>
	 */
	public static McObfPair field_185642_F = McMappingDatabase.getSRG("field_185642_F");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockPistonExtension.func_180661_e");

	/**
	 * <p>
	 * Name: TYPE
	 * </p>
	 */
	public static McObfPair field_176325_b = McMappingDatabase.getSRG("field_176325_b");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockPistonExtension.func_176201_c");

	/**
	 * <p>
	 * Name: WEST_ARM_AABB
	 * </p>
	 */
	public static McObfPair field_185645_I = McMappingDatabase.getSRG("field_185645_I");

	/**
	 * <p>
	 * Name: quantityDropped
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_149745_a = McMappingDatabase.getSRG("BlockPistonExtension.func_149745_a");

	/**
	 * <p>
	 * Name: breakBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180663_b = McMappingDatabase.getSRG("BlockPistonExtension.func_180663_b");

	/**
	 * <p>
	 * Name: PISTON_EXTENSION_SOUTH_AABB
	 * </p>
	 */
	public static McObfPair field_185639_e = McMappingDatabase.getSRG("field_185639_e");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockPistonExtension.func_149662_c");

	/**
	 * <p>
	 * Name: PISTON_EXTENSION_UP_AABB
	 * </p>
	 */
	public static McObfPair field_185643_g = McMappingDatabase.getSRG("field_185643_g");

	/**
	 * <p>
	 * Name: DOWN_ARM_AABB
	 * </p>
	 */
	public static McObfPair field_185638_D = McMappingDatabase.getSRG("field_185638_D");

	/**
	 * <p>
	 * Name: getArmShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185633_i = McMappingDatabase.getSRG("BlockPistonExtension.func_185633_i");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockPistonExtension.func_149686_d");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("BlockPistonExtension.func_189540_a");

	/**
	 * <p>
	 * Name: SHORT_WEST_ARM_AABB
	 * </p>
	 */
	public static McObfPair field_190969_O = McMappingDatabase.getSRG("field_190969_O");

	/**
	 * <p>
	 * Name: canPlaceBlockOnSide
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176198_a = McMappingDatabase.getSRG("BlockPistonExtension.func_176198_a");

	/**
	 * <p>
	 * Name: PISTON_EXTENSION_WEST_AABB
	 * </p>
	 */
	public static McObfPair field_185637_d = McMappingDatabase.getSRG("field_185637_d");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176322_b = McMappingDatabase.getSRG("BlockPistonExtension.func_176322_b");

	/**
	 * <p>
	 * Name: SHORT
	 * </p>
	 */
	public static McObfPair field_176327_M = McMappingDatabase.getSRG("field_176327_M");

	/**
	 * <p>
	 * Name: PISTON_EXTENSION_DOWN_AABB
	 * </p>
	 */
	public static McObfPair field_185634_B = McMappingDatabase.getSRG("field_185634_B");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185473_a = McMappingDatabase.getSRG("BlockPistonExtension.func_185473_a");

	/**
	 * <p>
	 * Name: PISTON_EXTENSION_NORTH_AABB
	 * </p>
	 */
	public static McObfPair field_185641_f = McMappingDatabase.getSRG("field_185641_f");

	/**
	 * <p>
	 * Name: onBlockHarvested
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_176208_a = McMappingDatabase.getSRG("BlockPistonExtension.func_176208_a");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockPistonExtension.func_176203_a");

	/**
	 * <p>
	 * Name: SOUTH_ARM_AABB
	 * </p>
	 */
	public static McObfPair field_185640_E = McMappingDatabase.getSRG("field_185640_E");

	/**
	 * <p>
	 * Name: EAST_ARM_AABB
	 * </p>
	 */
	public static McObfPair field_185644_G = McMappingDatabase.getSRG("field_185644_G");

	/**
	 * <p>
	 * Name: isTopSolid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_185481_k = McMappingDatabase.getSRG("BlockPistonExtension.func_185481_k");

	/**
	 * <p>
	 * Name: PISTON_EXTENSION_EAST_AABB
	 * </p>
	 */
	public static McObfPair field_185635_c = McMappingDatabase.getSRG("field_185635_c");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockPistonExtension.func_185496_a");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockPistonExtension.func_193383_a");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockPistonExtension.func_185499_a");

	/**
	 * <p>
	 * Name: shouldSideBeRendered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176225_a = McMappingDatabase.getSRG("BlockPistonExtension.func_176225_a");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockPistonExtension.func_185471_a");

	/**
	 * <p>
	 * Name: SHORT_DOWN_ARM_AABB
	 * </p>
	 */
	public static McObfPair field_190965_K = McMappingDatabase.getSRG("field_190965_K");

	/**
	 * <p>
	 * Name: SHORT_UP_ARM_AABB
	 * </p>
	 */
	public static McObfPair field_190964_J = McMappingDatabase.getSRG("field_190964_J");

	/**
	 * <p>
	 * Name: UP_ARM_AABB
	 * </p>
	 */
	public static McObfPair field_185636_C = McMappingDatabase.getSRG("field_185636_C");

	/**
	 * <p>
	 * Name: addCollisionBoxToList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_185477_a = McMappingDatabase.getSRG("BlockPistonExtension.func_185477_a");

	/**
	 * <p>
	 * Name: SHORT_SOUTH_ARM_AABB
	 * </p>
	 */
	public static McObfPair field_190966_L = McMappingDatabase.getSRG("field_190966_L");

	/**
	 * <p>
	 * Name: SHORT_NORTH_ARM_AABB
	 * </p>
	 */
	public static McObfPair field_190967_M = McMappingDatabase.getSRG("field_190967_M");

	/**
	 * <p>
	 * Name: SHORT_EAST_ARM_AABB
	 * </p>
	 */
	public static McObfPair field_190968_N = McMappingDatabase.getSRG("field_190968_N");

}
