package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockTrapDoor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aur";
		else
			return "net/minecraft/block/BlockTrapDoor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aur";
		else
			return "BlockTrapDoor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laur;";
		else
			return "Lnet/minecraft/block/BlockTrapDoor;";
	}

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockTrapDoor.func_176203_a");

	/**
	 * <p>
	 * Name: TOP_AABB
	 * </p>
	 */
	public static McObfPair field_185733_C = McMappingDatabase.getSRG("field_185733_C");

	/**
	 * <p>
	 * Name: NORTH_OPEN_AABB
	 * </p>
	 */
	public static McObfPair field_185737_g = McMappingDatabase.getSRG("field_185737_g");

	/**
	 * <p>
	 * Name: FACING
	 * </p>
	 */
	public static McObfPair field_176284_a = McMappingDatabase.getSRG("field_176284_a");

	/**
	 * <p>
	 * Name: onBlockActivated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z]
	 * </p>
	 */
	public static McObfPair func_180639_a = McMappingDatabase.getSRG("BlockTrapDoor.func_180639_a");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockTrapDoor.func_149662_c");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockTrapDoor.func_193383_a");

	/**
	 * <p>
	 * Name: getBlockLayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/BlockRenderLayer;]
	 * </p>
	 */
	public static McObfPair func_180664_k = McMappingDatabase.getSRG("BlockTrapDoor.func_180664_k");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockTrapDoor.func_149686_d");

	/**
	 * <p>
	 * Name: SOUTH_OPEN_AABB
	 * </p>
	 */
	public static McObfPair field_185736_f = McMappingDatabase.getSRG("field_185736_f");

	/**
	 * <p>
	 * Name: WEST_OPEN_AABB
	 * </p>
	 */
	public static McObfPair field_185735_e = McMappingDatabase.getSRG("field_185735_e");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockTrapDoor.func_185496_a");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockTrapDoor.func_180661_e");

	/**
	 * <p>
	 * Name: OPEN
	 * </p>
	 */
	public static McObfPair field_176283_b = McMappingDatabase.getSRG("field_176283_b");

	/**
	 * <p>
	 * Name: getMetaForFacing
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_176282_a = McMappingDatabase.getSRG("BlockTrapDoor.func_176282_a");

	/**
	 * <p>
	 * Name: EAST_OPEN_AABB
	 * </p>
	 */
	public static McObfPair field_185734_d = McMappingDatabase.getSRG("field_185734_d");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("BlockTrapDoor.func_189540_a");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockTrapDoor.func_185471_a");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockTrapDoor.func_185499_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockTrapDoor.func_176201_c");

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)V]
	 * </p>
	 */
	public static McObfPair func_185731_a = McMappingDatabase.getSRG("BlockTrapDoor.func_185731_a");

	/**
	 * <p>
	 * Name: canPlaceBlockOnSide
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176198_a = McMappingDatabase.getSRG("BlockTrapDoor.func_176198_a");

	/**
	 * <p>
	 * Name: getStateForPlacement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFILnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180642_a = McMappingDatabase.getSRG("BlockTrapDoor.func_180642_a");

	/**
	 * <p>
	 * Name: HALF
	 * </p>
	 */
	public static McObfPair field_176285_M = McMappingDatabase.getSRG("field_176285_M");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176281_b = McMappingDatabase.getSRG("BlockTrapDoor.func_176281_b");

	/**
	 * <p>
	 * Name: isPassable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176205_b = McMappingDatabase.getSRG("BlockTrapDoor.func_176205_b");

	/**
	 * <p>
	 * Name: BOTTOM_AABB
	 * </p>
	 */
	public static McObfPair field_185732_B = McMappingDatabase.getSRG("field_185732_B");

}
