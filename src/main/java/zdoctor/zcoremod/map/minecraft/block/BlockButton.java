package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockButton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apd";
		else
			return "net/minecraft/block/BlockButton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apd";
		else
			return "BlockButton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lapd;";
		else
			return "Lnet/minecraft/block/BlockButton;";
	}

	/**
	 * <p>
	 * Name: getWeakPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_180656_a = McMappingDatabase.getSRG("BlockButton.func_180656_a");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockButton.func_176203_a");

	/**
	 * <p>
	 * Name: AABB_EAST_ON
	 * </p>
	 */
	public static McObfPair field_185629_G = McMappingDatabase.getSRG("field_185629_G");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockButton.func_193383_a");

	/**
	 * <p>
	 * Name: AABB_NORTH_ON
	 * </p>
	 */
	public static McObfPair field_185623_D = McMappingDatabase.getSRG("field_185623_D");

	/**
	 * <p>
	 * Name: AABB_WEST_ON
	 * </p>
	 */
	public static McObfPair field_185627_F = McMappingDatabase.getSRG("field_185627_F");

	/**
	 * <p>
	 * Name: AABB_NORTH_OFF
	 * </p>
	 */
	public static McObfPair field_185622_d = McMappingDatabase.getSRG("field_185622_d");

	/**
	 * <p>
	 * Name: onEntityCollidedWithBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_180634_a = McMappingDatabase.getSRG("BlockButton.func_180634_a");

	/**
	 * <p>
	 * Name: canPlaceBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_181088_a = McMappingDatabase.getSRG("BlockButton.func_181088_a");

	/**
	 * <p>
	 * Name: canProvidePower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149744_f = McMappingDatabase.getSRG("BlockButton.func_149744_f");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockButton.func_185471_a");

	/**
	 * <p>
	 * Name: tickRate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)I]
	 * </p>
	 */
	public static McObfPair func_149738_a = McMappingDatabase.getSRG("BlockButton.func_149738_a");

	/**
	 * <p>
	 * Name: AABB_UP_OFF
	 * </p>
	 */
	public static McObfPair field_185620_c = McMappingDatabase.getSRG("field_185620_c");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockButton.func_180661_e");

	/**
	 * <p>
	 * Name: wooden
	 * </p>
	 */
	public static McObfPair field_150047_a = McMappingDatabase.getSRG("field_150047_a");

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_180646_a = McMappingDatabase.getSRG("BlockButton.func_180646_a");

	/**
	 * <p>
	 * Name: breakBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180663_b = McMappingDatabase.getSRG("BlockButton.func_180663_b");

	/**
	 * <p>
	 * Name: AABB_SOUTH_ON
	 * </p>
	 */
	public static McObfPair field_185625_E = McMappingDatabase.getSRG("field_185625_E");

	/**
	 * <p>
	 * Name: onBlockActivated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z]
	 * </p>
	 */
	public static McObfPair func_180639_a = McMappingDatabase.getSRG("BlockButton.func_180639_a");

	/**
	 * <p>
	 * Name: AABB_WEST_OFF
	 * </p>
	 */
	public static McObfPair field_185626_f = McMappingDatabase.getSRG("field_185626_f");

	/**
	 * <p>
	 * Name: canPlaceBlockAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176196_c = McMappingDatabase.getSRG("BlockButton.func_176196_c");

	/**
	 * <p>
	 * Name: checkForDrop
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_176583_e = McMappingDatabase.getSRG("BlockButton.func_176583_e");

	/**
	 * <p>
	 * Name: updateTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180650_b = McMappingDatabase.getSRG("BlockButton.func_180650_b");

	/**
	 * <p>
	 * Name: canPlaceBlockOnSide
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176198_a = McMappingDatabase.getSRG("BlockButton.func_176198_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockButton.func_176201_c");

	/**
	 * <p>
	 * Name: playReleaseSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185617_b = McMappingDatabase.getSRG("BlockButton.func_185617_b");

	/**
	 * <p>
	 * Name: getStateForPlacement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFILnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180642_a = McMappingDatabase.getSRG("BlockButton.func_180642_a");

	/**
	 * <p>
	 * Name: getStrongPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_176211_b = McMappingDatabase.getSRG("BlockButton.func_176211_b");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("BlockButton.func_189540_a");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockButton.func_149662_c");

	/**
	 * <p>
	 * Name: playClickSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185615_a = McMappingDatabase.getSRG("BlockButton.func_185615_a");

	/**
	 * <p>
	 * Name: POWERED
	 * </p>
	 */
	public static McObfPair field_176584_b = McMappingDatabase.getSRG("field_176584_b");

	/**
	 * <p>
	 * Name: AABB_SOUTH_OFF
	 * </p>
	 */
	public static McObfPair field_185624_e = McMappingDatabase.getSRG("field_185624_e");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockButton.func_185499_a");

	/**
	 * <p>
	 * Name: randomTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180645_a = McMappingDatabase.getSRG("BlockButton.func_180645_a");

	/**
	 * <p>
	 * Name: AABB_EAST_OFF
	 * </p>
	 */
	public static McObfPair field_185628_g = McMappingDatabase.getSRG("field_185628_g");

	/**
	 * <p>
	 * Name: AABB_DOWN_OFF
	 * </p>
	 */
	public static McObfPair field_185618_b = McMappingDatabase.getSRG("field_185618_b");

	/**
	 * <p>
	 * Name: AABB_UP_ON
	 * </p>
	 */
	public static McObfPair field_185621_C = McMappingDatabase.getSRG("field_185621_C");

	/**
	 * <p>
	 * Name: AABB_DOWN_ON
	 * </p>
	 */
	public static McObfPair field_185619_B = McMappingDatabase.getSRG("field_185619_B");

	/**
	 * <p>
	 * Name: checkPressed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185616_e = McMappingDatabase.getSRG("BlockButton.func_185616_e");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockButton.func_149686_d");

	/**
	 * <p>
	 * Name: notifyNeighbors
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_176582_b = McMappingDatabase.getSRG("BlockButton.func_176582_b");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockButton.func_185496_a");

}
