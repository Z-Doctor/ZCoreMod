package zdoctor.zcoremod.map.minecraft.block.state;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStateContainer$StateImplementation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awu$a";
		else
			return "net/minecraft/block/state/BlockStateContainer$StateImplementation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awu$a";
		else
			return "BlockStateContainer$StateImplementation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawu$a;";
		else
			return "Lnet/minecraft/block/state/BlockStateContainer$StateImplementation;";
	}

	/**
	 * <p>
	 * Name: properties
	 * </p>
	 */
	public static McObfPair field_177237_b = McMappingDatabase.getSRG("field_177237_b");

	/**
	 * <p>
	 * Name: canEntitySpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_189884_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_189884_a");

	/**
	 * <p>
	 * Name: getMaterial
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/Material;]
	 * </p>
	 */
	public static McObfPair func_185904_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185904_a");

	/**
	 * <p>
	 * Name: getStrongPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_185893_b = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185893_b");

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumBlockRenderType;]
	 * </p>
	 */
	public static McObfPair func_185901_i = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185901_i");

	/**
	 * <p>
	 * Name: onBlockEventReceived
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;II)Z]
	 * </p>
	 */
	public static McObfPair func_189547_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_189547_a");

	/**
	 * <p>
	 * Name: causesSuffocation
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191058_s = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_191058_s");

	/**
	 * <p>
	 * Name: getLightOpacity
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185891_c = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185891_c");

	/**
	 * <p>
	 * Name: getPackedLightmapCoords
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_185889_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185889_a");

	/**
	 * <p>
	 * Name: getMobilityFlag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/EnumPushReaction;]
	 * </p>
	 */
	public static McObfPair func_185905_o = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185905_o");

	/**
	 * <p>
	 * Name: getPropertyKeys
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_177227_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_177227_a");

	/**
	 * <p>
	 * Name: getWeakPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_185911_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185911_a");

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185890_d = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185890_d");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_177239_a = McMappingDatabase.getSRG("field_177239_a");

	/**
	 * <p>
	 * Name: getProperties
	 * </p>
	 * <p>
	 * Desc: [()Lcom/google/common/collect/ImmutableMap;]
	 * </p>
	 */
	public static McObfPair func_177228_b = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_177228_b");

	/**
	 * <p>
	 * Name: canProvidePower
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185897_m = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185897_m");

	/**
	 * <p>
	 * Name: getSelectedBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185918_c = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185918_c");

	/**
	 * <p>
	 * Name: buildPropertyValueTable
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)V]
	 * </p>
	 */
	public static McObfPair func_177235_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_177235_a");

	/**
	 * <p>
	 * Name: shouldSideBeRendered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_185894_c = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185894_c");

	/**
	 * <p>
	 * Name: hasCustomBreakingProgress
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191057_i = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_191057_i");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185902_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185902_a");

	/**
	 * <p>
	 * Name: isTopSolid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185896_q = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185896_q");

	/**
	 * <p>
	 * Name: withProperty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;Ljava/lang/Comparable;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_177226_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_177226_a");

	/**
	 * <p>
	 * Name: addCollisionBoxToList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_185908_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185908_a");

	/**
	 * <p>
	 * Name: getAmbientOcclusionLightValue
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_185892_j = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185892_j");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189546_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_189546_a");

	/**
	 * <p>
	 * Name: collisionRayTrace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;]
	 * </p>
	 */
	public static McObfPair func_185910_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185910_a");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185907_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185907_a");

	/**
	 * <p>
	 * Name: hasComparatorInputOverride
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185912_n = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185912_n");

	/**
	 * <p>
	 * Name: isNormalCube
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185915_l = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185915_l");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193401_d = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_193401_d");

	/**
	 * <p>
	 * Name: isFullBlock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185913_b = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185913_b");

	/**
	 * <p>
	 * Name: getBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_177230_c = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_177230_c");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185900_c = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185900_c");

	/**
	 * <p>
	 * Name: isBlockNormalCube
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185898_k = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185898_k");

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;)Ljava/lang/Comparable;]
	 * </p>
	 */
	public static McObfPair func_177229_b = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_177229_b");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185917_h = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185917_h");

	/**
	 * <p>
	 * Name: isTranslucent
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185895_e = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185895_e");

	/**
	 * <p>
	 * Name: getActualState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185899_b = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185899_b");

	/**
	 * <p>
	 * Name: getPropertiesWithValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;Ljava/lang/Comparable;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_177236_b = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_177236_b");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_185909_g = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185909_g");

	/**
	 * <p>
	 * Name: propertyValueTable
	 * </p>
	 */
	public static McObfPair field_177238_c = McMappingDatabase.getSRG("field_177238_c");

	/**
	 * <p>
	 * Name: useNeighborBrightness
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185916_f = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185916_f");

	/**
	 * <p>
	 * Name: getLightValue
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185906_d = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185906_d");

	/**
	 * <p>
	 * Name: getComparatorInputOverride
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_185888_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185888_a");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185914_p = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185914_p");

	/**
	 * <p>
	 * Name: getBlockHardness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_185887_b = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185887_b");

	/**
	 * <p>
	 * Name: getPlayerRelativeBlockHardness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_185903_a = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_185903_a");

	/**
	 * <p>
	 * Name: getOffset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_191059_e = McMappingDatabase.getSRG("BlockStateContainer$StateImplementation.func_191059_e");

}
