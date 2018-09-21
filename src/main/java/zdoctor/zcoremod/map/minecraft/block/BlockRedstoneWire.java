package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRedstoneWire {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atf";
		else
			return "net/minecraft/block/BlockRedstoneWire";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atf";
		else
			return "BlockRedstoneWire";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Latf;";
		else
			return "Lnet/minecraft/block/BlockRedstoneWire;";
	}

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185473_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_185473_a");

	/**
	 * <p>
	 * Name: breakBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180663_b = McMappingDatabase.getSRG("BlockRedstoneWire.func_180663_b");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockRedstoneWire.func_149662_c");

	/**
	 * <p>
	 * Name: getStrongPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_176211_b = McMappingDatabase.getSRG("BlockRedstoneWire.func_176211_b");

	/**
	 * <p>
	 * Name: canProvidePower
	 * </p>
	 */
	public static McObfPair field_150181_a = McMappingDatabase.getSRG("field_150181_a");

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_180646_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_180646_a");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_185496_a");

	/**
	 * <p>
	 * Name: canConnectTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176343_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_176343_a");

	/**
	 * <p>
	 * Name: getAttachPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/BlockRedstoneWire$EnumAttachPosition;]
	 * </p>
	 */
	public static McObfPair func_176341_c = McMappingDatabase.getSRG("BlockRedstoneWire.func_176341_c");

	/**
	 * <p>
	 * Name: getMaxCurrentStrength
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)I]
	 * </p>
	 */
	public static McObfPair func_176342_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_176342_a");

	/**
	 * <p>
	 * Name: EAST
	 * </p>
	 */
	public static McObfPair field_176347_b = McMappingDatabase.getSRG("field_176347_b");

	/**
	 * <p>
	 * Name: SOUTH
	 * </p>
	 */
	public static McObfPair field_176349_M = McMappingDatabase.getSRG("field_176349_M");

	/**
	 * <p>
	 * Name: blocksNeedingUpdate
	 * </p>
	 */
	public static McObfPair field_150179_b = McMappingDatabase.getSRG("field_150179_b");

	/**
	 * <p>
	 * Name: WEST
	 * </p>
	 */
	public static McObfPair field_176350_N = McMappingDatabase.getSRG("field_176350_N");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockRedstoneWire.func_176201_c");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockRedstoneWire.func_149686_d");

	/**
	 * <p>
	 * Name: getWeakPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_180656_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_180656_a");

	/**
	 * <p>
	 * Name: canProvidePower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149744_f = McMappingDatabase.getSRG("BlockRedstoneWire.func_149744_f");

	/**
	 * <p>
	 * Name: colorMultiplier
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_176337_b = McMappingDatabase.getSRG("BlockRedstoneWire.func_176337_b");

	/**
	 * <p>
	 * Name: notifyWireNeighborsOfStateChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_176344_d = McMappingDatabase.getSRG("BlockRedstoneWire.func_176344_d");

	/**
	 * <p>
	 * Name: NORTH
	 * </p>
	 */
	public static McObfPair field_176348_a = McMappingDatabase.getSRG("field_176348_a");

	/**
	 * <p>
	 * Name: randomDisplayTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180655_c = McMappingDatabase.getSRG("BlockRedstoneWire.func_180655_c");

	/**
	 * <p>
	 * Name: REDSTONE_WIRE_AABB
	 * </p>
	 */
	public static McObfPair field_185700_f = McMappingDatabase.getSRG("field_185700_f");

	/**
	 * <p>
	 * Name: onBlockAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176213_c = McMappingDatabase.getSRG("BlockRedstoneWire.func_176213_c");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_185471_a");

	/**
	 * <p>
	 * Name: updateSurroundingRedstone
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176338_e = McMappingDatabase.getSRG("BlockRedstoneWire.func_176338_e");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_185499_a");

	/**
	 * <p>
	 * Name: calculateCurrentChanges
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176345_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_176345_a");

	/**
	 * <p>
	 * Name: canConnectUpwardsTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_176346_d = McMappingDatabase.getSRG("BlockRedstoneWire.func_176346_d");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_180660_a");

	/**
	 * <p>
	 * Name: canPlaceBlockAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176196_c = McMappingDatabase.getSRG("BlockRedstoneWire.func_176196_c");

	/**
	 * <p>
	 * Name: POWER
	 * </p>
	 */
	public static McObfPair field_176351_O = McMappingDatabase.getSRG("field_176351_O");

	/**
	 * <p>
	 * Name: getBlockLayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/BlockRenderLayer;]
	 * </p>
	 */
	public static McObfPair func_180664_k = McMappingDatabase.getSRG("BlockRedstoneWire.func_180664_k");

	/**
	 * <p>
	 * Name: getActualState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176221_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_176221_a");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockRedstoneWire.func_180661_e");

	/**
	 * <p>
	 * Name: canConnectUpwardsTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176340_e = McMappingDatabase.getSRG("BlockRedstoneWire.func_176340_e");

	/**
	 * <p>
	 * Name: isPowerSourceAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176339_d = McMappingDatabase.getSRG("BlockRedstoneWire.func_176339_d");

	/**
	 * <p>
	 * Name: getAABBIndex
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_185699_x = McMappingDatabase.getSRG("BlockRedstoneWire.func_185699_x");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_189540_a");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_193383_a");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockRedstoneWire.func_176203_a");

}
