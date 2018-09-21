package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockDoor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqa";
		else
			return "net/minecraft/block/BlockDoor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqa";
		else
			return "BlockDoor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqa;";
		else
			return "Lnet/minecraft/block/BlockDoor;";
	}

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockDoor.func_185499_a");

	/**
	 * <p>
	 * Name: OPEN
	 * </p>
	 */
	public static McObfPair field_176519_b = McMappingDatabase.getSRG("field_176519_b");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockDoor.func_149662_c");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockDoor.func_176203_a");

	/**
	 * <p>
	 * Name: POWERED
	 * </p>
	 */
	public static McObfPair field_176522_N = McMappingDatabase.getSRG("field_176522_N");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockDoor.func_176201_c");

	/**
	 * <p>
	 * Name: canPlaceBlockAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176196_c = McMappingDatabase.getSRG("BlockDoor.func_176196_c");

	/**
	 * <p>
	 * Name: getBlockLayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/BlockRenderLayer;]
	 * </p>
	 */
	public static McObfPair func_180664_k = McMappingDatabase.getSRG("BlockDoor.func_180664_k");

	/**
	 * <p>
	 * Name: removeHalfBit
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_176510_b = McMappingDatabase.getSRG("BlockDoor.func_176510_b");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockDoor.func_193383_a");

	/**
	 * <p>
	 * Name: getMobilityFlag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/block/material/EnumPushReaction;]
	 * </p>
	 */
	public static McObfPair func_149656_h = McMappingDatabase.getSRG("BlockDoor.func_149656_h");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_176509_j = McMappingDatabase.getSRG("BlockDoor.func_176509_j");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("BlockDoor.func_189540_a");

	/**
	 * <p>
	 * Name: WEST_AABB
	 * </p>
	 */
	public static McObfPair field_185656_B = McMappingDatabase.getSRG("field_185656_B");

	/**
	 * <p>
	 * Name: FACING
	 * </p>
	 */
	public static McObfPair field_176520_a = McMappingDatabase.getSRG("field_176520_a");

	/**
	 * <p>
	 * Name: isTop
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_176518_i = McMappingDatabase.getSRG("BlockDoor.func_176518_i");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockDoor.func_180661_e");

	/**
	 * <p>
	 * Name: isOpen
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_176516_g = McMappingDatabase.getSRG("BlockDoor.func_176516_g");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockDoor.func_180660_a");

	/**
	 * <p>
	 * Name: isOpen
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176514_f = McMappingDatabase.getSRG("BlockDoor.func_176514_f");

	/**
	 * <p>
	 * Name: isPassable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176205_b = McMappingDatabase.getSRG("BlockDoor.func_176205_b");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockDoor.func_185496_a");

	/**
	 * <p>
	 * Name: EAST_AABB
	 * </p>
	 */
	public static McObfPair field_185657_C = McMappingDatabase.getSRG("field_185657_C");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176517_h = McMappingDatabase.getSRG("BlockDoor.func_176517_h");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockDoor.func_185471_a");

	/**
	 * <p>
	 * Name: combineMetadata
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_176515_e = McMappingDatabase.getSRG("BlockDoor.func_176515_e");

	/**
	 * <p>
	 * Name: onBlockHarvested
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_176208_a = McMappingDatabase.getSRG("BlockDoor.func_176208_a");

	/**
	 * <p>
	 * Name: toggleDoor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)V]
	 * </p>
	 */
	public static McObfPair func_176512_a = McMappingDatabase.getSRG("BlockDoor.func_176512_a");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185473_a = McMappingDatabase.getSRG("BlockDoor.func_185473_a");

	/**
	 * <p>
	 * Name: getCloseSound
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185654_e = McMappingDatabase.getSRG("BlockDoor.func_185654_e");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_180659_g = McMappingDatabase.getSRG("BlockDoor.func_180659_g");

	/**
	 * <p>
	 * Name: getActualState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176221_a = McMappingDatabase.getSRG("BlockDoor.func_176221_a");

	/**
	 * <p>
	 * Name: SOUTH_AABB
	 * </p>
	 */
	public static McObfPair field_185658_f = McMappingDatabase.getSRG("field_185658_f");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockDoor.func_149686_d");

	/**
	 * <p>
	 * Name: NORTH_AABB
	 * </p>
	 */
	public static McObfPair field_185659_g = McMappingDatabase.getSRG("field_185659_g");

	/**
	 * <p>
	 * Name: getOpenSound
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185655_g = McMappingDatabase.getSRG("BlockDoor.func_185655_g");

	/**
	 * <p>
	 * Name: onBlockActivated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z]
	 * </p>
	 */
	public static McObfPair func_180639_a = McMappingDatabase.getSRG("BlockDoor.func_180639_a");

	/**
	 * <p>
	 * Name: getLocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149732_F = McMappingDatabase.getSRG("BlockDoor.func_149732_F");

	/**
	 * <p>
	 * Name: HINGE
	 * </p>
	 */
	public static McObfPair field_176521_M = McMappingDatabase.getSRG("field_176521_M");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176511_f = McMappingDatabase.getSRG("BlockDoor.func_176511_f");

	/**
	 * <p>
	 * Name: HALF
	 * </p>
	 */
	public static McObfPair field_176523_O = McMappingDatabase.getSRG("field_176523_O");

}
