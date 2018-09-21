package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPane {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auo";
		else
			return "net/minecraft/block/BlockPane";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auo";
		else
			return "BlockPane";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lauo;";
		else
			return "Lnet/minecraft/block/BlockPane;";
	}

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockPane.func_180661_e");

	/**
	 * <p>
	 * Name: attachesTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_193393_b = McMappingDatabase.getSRG("BlockPane.func_193393_b");

	/**
	 * <p>
	 * Name: canDrop
	 * </p>
	 */
	public static McObfPair field_150099_b = McMappingDatabase.getSRG("field_150099_b");

	/**
	 * <p>
	 * Name: NORTH
	 * </p>
	 */
	public static McObfPair field_176241_b = McMappingDatabase.getSRG("field_176241_b");

	/**
	 * <p>
	 * Name: getBlockLayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/BlockRenderLayer;]
	 * </p>
	 */
	public static McObfPair func_180664_k = McMappingDatabase.getSRG("BlockPane.func_180664_k");

	/**
	 * <p>
	 * Name: EAST
	 * </p>
	 */
	public static McObfPair field_176242_M = McMappingDatabase.getSRG("field_176242_M");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockPane.func_149686_d");

	/**
	 * <p>
	 * Name: shouldSideBeRendered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176225_a = McMappingDatabase.getSRG("BlockPane.func_176225_a");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockPane.func_149662_c");

	/**
	 * <p>
	 * Name: WEST
	 * </p>
	 */
	public static McObfPair field_176244_O = McMappingDatabase.getSRG("field_176244_O");

	/**
	 * <p>
	 * Name: getBoundingBoxIndex
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_185728_i = McMappingDatabase.getSRG("BlockPane.func_185728_i");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockPane.func_193383_a");

	/**
	 * <p>
	 * Name: getActualState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176221_a = McMappingDatabase.getSRG("BlockPane.func_176221_a");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockPane.func_185499_a");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockPane.func_180660_a");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockPane.func_185471_a");

	/**
	 * <p>
	 * Name: isExcepBlockForAttachWithPiston
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_193394_e = McMappingDatabase.getSRG("BlockPane.func_193394_e");

	/**
	 * <p>
	 * Name: getBoundingBoxIndex
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_185729_a = McMappingDatabase.getSRG("BlockPane.func_185729_a");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockPane.func_185496_a");

	/**
	 * <p>
	 * Name: addCollisionBoxToList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_185477_a = McMappingDatabase.getSRG("BlockPane.func_185477_a");

	/**
	 * <p>
	 * Name: canSilkHarvest
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149700_E = McMappingDatabase.getSRG("BlockPane.func_149700_E");

	/**
	 * <p>
	 * Name: SOUTH
	 * </p>
	 */
	public static McObfPair field_176243_N = McMappingDatabase.getSRG("field_176243_N");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockPane.func_176201_c");

	/**
	 * <p>
	 * Name: AABB_BY_INDEX
	 * </p>
	 */
	public static McObfPair field_185730_f = McMappingDatabase.getSRG("field_185730_f");

}
