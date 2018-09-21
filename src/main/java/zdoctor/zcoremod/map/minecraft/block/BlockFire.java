package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockFire {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqq";
		else
			return "net/minecraft/block/BlockFire";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqq";
		else
			return "BlockFire";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqq;";
		else
			return "Lnet/minecraft/block/BlockFire;";
	}

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_149843_e = McMappingDatabase.getSRG("BlockFire.func_149843_e");

	/**
	 * <p>
	 * Name: canCatchFire
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176535_e = McMappingDatabase.getSRG("BlockFire.func_176535_e");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockFire.func_180661_e");

	/**
	 * <p>
	 * Name: setFireInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;II)V]
	 * </p>
	 */
	public static McObfPair func_180686_a = McMappingDatabase.getSRG("BlockFire.func_180686_a");

	/**
	 * <p>
	 * Name: randomDisplayTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180655_c = McMappingDatabase.getSRG("BlockFire.func_180655_c");

	/**
	 * <p>
	 * Name: catchOnFire
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILjava/util/Random;I)V]
	 * </p>
	 */
	public static McObfPair func_176536_a = McMappingDatabase.getSRG("BlockFire.func_176536_a");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockFire.func_149686_d");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockFire.func_176201_c");

	/**
	 * <p>
	 * Name: UPPER
	 * </p>
	 */
	public static McObfPair field_176542_R = McMappingDatabase.getSRG("field_176542_R");

	/**
	 * <p>
	 * Name: onBlockAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176213_c = McMappingDatabase.getSRG("BlockFire.func_176213_c");

	/**
	 * <p>
	 * Name: canDie
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176537_d = McMappingDatabase.getSRG("BlockFire.func_176537_d");

	/**
	 * <p>
	 * Name: isCollidable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149703_v = McMappingDatabase.getSRG("BlockFire.func_149703_v");

	/**
	 * <p>
	 * Name: canPlaceBlockAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176196_c = McMappingDatabase.getSRG("BlockFire.func_176196_c");

	/**
	 * <p>
	 * Name: getNeighborEncouragement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_176538_m = McMappingDatabase.getSRG("BlockFire.func_176538_m");

	/**
	 * <p>
	 * Name: getEncouragement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)I]
	 * </p>
	 */
	public static McObfPair func_176534_d = McMappingDatabase.getSRG("BlockFire.func_176534_d");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_180659_g = McMappingDatabase.getSRG("BlockFire.func_180659_g");

	/**
	 * <p>
	 * Name: NORTH
	 * </p>
	 */
	public static McObfPair field_176545_N = McMappingDatabase.getSRG("field_176545_N");

	/**
	 * <p>
	 * Name: requiresUpdates
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149698_L = McMappingDatabase.getSRG("BlockFire.func_149698_L");

	/**
	 * <p>
	 * Name: canNeighborCatchFire
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176533_e = McMappingDatabase.getSRG("BlockFire.func_176533_e");

	/**
	 * <p>
	 * Name: updateTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180650_b = McMappingDatabase.getSRG("BlockFire.func_180650_b");

	/**
	 * <p>
	 * Name: SOUTH
	 * </p>
	 */
	public static McObfPair field_176541_P = McMappingDatabase.getSRG("field_176541_P");

	/**
	 * <p>
	 * Name: getBlockLayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/BlockRenderLayer;]
	 * </p>
	 */
	public static McObfPair func_180664_k = McMappingDatabase.getSRG("BlockFire.func_180664_k");

	/**
	 * <p>
	 * Name: getFlammability
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)I]
	 * </p>
	 */
	public static McObfPair func_176532_c = McMappingDatabase.getSRG("BlockFire.func_176532_c");

	/**
	 * <p>
	 * Name: EAST
	 * </p>
	 */
	public static McObfPair field_176546_O = McMappingDatabase.getSRG("field_176546_O");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockFire.func_193383_a");

	/**
	 * <p>
	 * Name: encouragements
	 * </p>
	 */
	public static McObfPair field_149849_a = McMappingDatabase.getSRG("field_149849_a");

	/**
	 * <p>
	 * Name: flammabilities
	 * </p>
	 */
	public static McObfPair field_149848_b = McMappingDatabase.getSRG("field_149848_b");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockFire.func_176203_a");

	/**
	 * <p>
	 * Name: AGE
	 * </p>
	 */
	public static McObfPair field_176543_a = McMappingDatabase.getSRG("field_176543_a");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("BlockFire.func_189540_a");

	/**
	 * <p>
	 * Name: WEST
	 * </p>
	 */
	public static McObfPair field_176539_Q = McMappingDatabase.getSRG("field_176539_Q");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockFire.func_149662_c");

	/**
	 * <p>
	 * Name: tickRate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)I]
	 * </p>
	 */
	public static McObfPair func_149738_a = McMappingDatabase.getSRG("BlockFire.func_149738_a");

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_180646_a = McMappingDatabase.getSRG("BlockFire.func_180646_a");

	/**
	 * <p>
	 * Name: getActualState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176221_a = McMappingDatabase.getSRG("BlockFire.func_176221_a");

	/**
	 * <p>
	 * Name: quantityDropped
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_149745_a = McMappingDatabase.getSRG("BlockFire.func_149745_a");

}
