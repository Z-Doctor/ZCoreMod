package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockFence {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqo";
		else
			return "net/minecraft/block/BlockFence";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqo";
		else
			return "BlockFence";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqo;";
		else
			return "Lnet/minecraft/block/BlockFence;";
	}

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockFence.func_149662_c");

	/**
	 * <p>
	 * Name: canConnectTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176524_e = McMappingDatabase.getSRG("BlockFence.func_176524_e");

	/**
	 * <p>
	 * Name: WEST
	 * </p>
	 */
	public static McObfPair field_176528_N = McMappingDatabase.getSRG("field_176528_N");

	/**
	 * <p>
	 * Name: BOUNDING_BOXES
	 * </p>
	 */
	public static McObfPair field_185670_e = McMappingDatabase.getSRG("field_185670_e");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockFence.func_193383_a");

	/**
	 * <p>
	 * Name: NORTH
	 * </p>
	 */
	public static McObfPair field_176526_a = McMappingDatabase.getSRG("field_176526_a");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockFence.func_185496_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockFence.func_176201_c");

	/**
	 * <p>
	 * Name: addCollisionBoxToList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_185477_a = McMappingDatabase.getSRG("BlockFence.func_185477_a");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockFence.func_180661_e");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockFence.func_149686_d");

	/**
	 * <p>
	 * Name: SOUTH_AABB
	 * </p>
	 */
	public static McObfPair field_185672_g = McMappingDatabase.getSRG("field_185672_g");

	/**
	 * <p>
	 * Name: shouldSideBeRendered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176225_a = McMappingDatabase.getSRG("BlockFence.func_176225_a");

	/**
	 * <p>
	 * Name: isExcepBlockForAttachWithPiston
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_194142_e = McMappingDatabase.getSRG("BlockFence.func_194142_e");

	/**
	 * <p>
	 * Name: getActualState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176221_a = McMappingDatabase.getSRG("BlockFence.func_176221_a");

	/**
	 * <p>
	 * Name: PILLAR_AABB
	 * </p>
	 */
	public static McObfPair field_185671_f = McMappingDatabase.getSRG("field_185671_f");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockFence.func_185499_a");

	/**
	 * <p>
	 * Name: onBlockActivated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z]
	 * </p>
	 */
	public static McObfPair func_180639_a = McMappingDatabase.getSRG("BlockFence.func_180639_a");

	/**
	 * <p>
	 * Name: EAST_AABB
	 * </p>
	 */
	public static McObfPair field_185669_D = McMappingDatabase.getSRG("field_185669_D");

	/**
	 * <p>
	 * Name: WEST_AABB
	 * </p>
	 */
	public static McObfPair field_185667_B = McMappingDatabase.getSRG("field_185667_B");

	/**
	 * <p>
	 * Name: EAST
	 * </p>
	 */
	public static McObfPair field_176525_b = McMappingDatabase.getSRG("field_176525_b");

	/**
	 * <p>
	 * Name: getBoundingBoxIdx
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_185666_i = McMappingDatabase.getSRG("BlockFence.func_185666_i");

	/**
	 * <p>
	 * Name: NORTH_AABB
	 * </p>
	 */
	public static McObfPair field_185668_C = McMappingDatabase.getSRG("field_185668_C");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockFence.func_185471_a");

	/**
	 * <p>
	 * Name: SOUTH
	 * </p>
	 */
	public static McObfPair field_176527_M = McMappingDatabase.getSRG("field_176527_M");

	/**
	 * <p>
	 * Name: isPassable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176205_b = McMappingDatabase.getSRG("BlockFence.func_176205_b");

}
