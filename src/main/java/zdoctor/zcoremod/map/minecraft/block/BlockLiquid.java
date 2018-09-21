package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockLiquid {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aru";
		else
			return "net/minecraft/block/BlockLiquid";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aru";
		else
			return "BlockLiquid";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laru;";
		else
			return "Lnet/minecraft/block/BlockLiquid;";
	}

	/**
	 * <p>
	 * Name: randomDisplayTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180655_c = McMappingDatabase.getSRG("BlockLiquid.func_180655_c");

	/**
	 * <p>
	 * Name: getSlopeAngle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/material/Material;Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_189544_a = McMappingDatabase.getSRG("BlockLiquid.func_189544_a");

	/**
	 * <p>
	 * Name: getLiquidHeightPercent
	 * </p>
	 * <p>
	 * Desc: [(I)F]
	 * </p>
	 */
	public static McObfPair func_149801_b = McMappingDatabase.getSRG("BlockLiquid.func_149801_b");

	/**
	 * <p>
	 * Name: getLiquidHeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_190972_g = McMappingDatabase.getSRG("BlockLiquid.func_190972_g");

	/**
	 * <p>
	 * Name: getFlowingBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/material/Material;)Lnet/minecraft/block/BlockDynamicLiquid;]
	 * </p>
	 */
	public static McObfPair func_176361_a = McMappingDatabase.getSRG("BlockLiquid.func_176361_a");

	/**
	 * <p>
	 * Name: causesDownwardCurrent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176212_b = McMappingDatabase.getSRG("BlockLiquid.func_176212_b");

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_180646_a = McMappingDatabase.getSRG("BlockLiquid.func_180646_a");

	/**
	 * <p>
	 * Name: triggerMixEffects
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180688_d = McMappingDatabase.getSRG("BlockLiquid.func_180688_d");

	/**
	 * <p>
	 * Name: getPackedLightmapCoords
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_185484_c = McMappingDatabase.getSRG("BlockLiquid.func_185484_c");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockLiquid.func_185496_a");

	/**
	 * <p>
	 * Name: canCollideCheck
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Z)Z]
	 * </p>
	 */
	public static McObfPair func_176209_a = McMappingDatabase.getSRG("BlockLiquid.func_176209_a");

	/**
	 * <p>
	 * Name: getStaticBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/material/Material;)Lnet/minecraft/block/BlockStaticLiquid;]
	 * </p>
	 */
	public static McObfPair func_176363_b = McMappingDatabase.getSRG("BlockLiquid.func_176363_b");

	/**
	 * <p>
	 * Name: modifyAcceleration
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_176197_a = McMappingDatabase.getSRG("BlockLiquid.func_176197_a");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockLiquid.func_176203_a");

	/**
	 * <p>
	 * Name: onBlockAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176213_c = McMappingDatabase.getSRG("BlockLiquid.func_176213_c");

	/**
	 * <p>
	 * Name: isPassable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176205_b = McMappingDatabase.getSRG("BlockLiquid.func_176205_b");

	/**
	 * <p>
	 * Name: quantityDropped
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_149745_a = McMappingDatabase.getSRG("BlockLiquid.func_149745_a");

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/util/EnumBlockRenderType;]
	 * </p>
	 */
	public static McObfPair func_149645_b = McMappingDatabase.getSRG("BlockLiquid.func_149645_b");

	/**
	 * <p>
	 * Name: getRenderedDepth
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_189545_x = McMappingDatabase.getSRG("BlockLiquid.func_189545_x");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockLiquid.func_149662_c");

	/**
	 * <p>
	 * Name: getBlockLayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/BlockRenderLayer;]
	 * </p>
	 */
	public static McObfPair func_180664_k = McMappingDatabase.getSRG("BlockLiquid.func_180664_k");

	/**
	 * <p>
	 * Name: getBlockLiquidHeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_190973_f = McMappingDatabase.getSRG("BlockLiquid.func_190973_f");

	/**
	 * <p>
	 * Name: getDepth
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_189542_i = McMappingDatabase.getSRG("BlockLiquid.func_189542_i");

	/**
	 * <p>
	 * Name: getFlow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_189543_a = McMappingDatabase.getSRG("BlockLiquid.func_189543_a");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("BlockLiquid.func_189540_a");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockLiquid.func_193383_a");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockLiquid.func_149686_d");

	/**
	 * <p>
	 * Name: checkForMixing
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_176365_e = McMappingDatabase.getSRG("BlockLiquid.func_176365_e");

	/**
	 * <p>
	 * Name: tickRate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)I]
	 * </p>
	 */
	public static McObfPair func_149738_a = McMappingDatabase.getSRG("BlockLiquid.func_149738_a");

	/**
	 * <p>
	 * Name: shouldRenderSides
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176364_g = McMappingDatabase.getSRG("BlockLiquid.func_176364_g");

	/**
	 * <p>
	 * Name: shouldSideBeRendered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176225_a = McMappingDatabase.getSRG("BlockLiquid.func_176225_a");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockLiquid.func_180661_e");

	/**
	 * <p>
	 * Name: LEVEL
	 * </p>
	 */
	public static McObfPair field_176367_b = McMappingDatabase.getSRG("field_176367_b");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockLiquid.func_176201_c");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockLiquid.func_180660_a");

}
