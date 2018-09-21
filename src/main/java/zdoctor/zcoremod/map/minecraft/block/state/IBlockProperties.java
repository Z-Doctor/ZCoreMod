package zdoctor.zcoremod.map.minecraft.block.state;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IBlockProperties {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aws";
		else
			return "net/minecraft/block/state/IBlockProperties";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aws";
		else
			return "IBlockProperties";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laws;";
		else
			return "Lnet/minecraft/block/state/IBlockProperties;";
	}

	/**
	 * <p>
	 * Name: getPackedLightmapCoords
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_185889_a = McMappingDatabase.getSRG("IBlockProperties.func_185889_a");

	/**
	 * <p>
	 * Name: hasCustomBreakingProgress
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191057_i = McMappingDatabase.getSRG("IBlockProperties.func_191057_i");

	/**
	 * <p>
	 * Name: getActualState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185899_b = McMappingDatabase.getSRG("IBlockProperties.func_185899_b");

	/**
	 * <p>
	 * Name: shouldSideBeRendered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_185894_c = McMappingDatabase.getSRG("IBlockProperties.func_185894_c");

	/**
	 * <p>
	 * Name: getWeakPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_185911_a = McMappingDatabase.getSRG("IBlockProperties.func_185911_a");

	/**
	 * <p>
	 * Name: isNormalCube
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185915_l = McMappingDatabase.getSRG("IBlockProperties.func_185915_l");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193401_d = McMappingDatabase.getSRG("IBlockProperties.func_193401_d");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185914_p = McMappingDatabase.getSRG("IBlockProperties.func_185914_p");

	/**
	 * <p>
	 * Name: getLightValue
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185906_d = McMappingDatabase.getSRG("IBlockProperties.func_185906_d");

	/**
	 * <p>
	 * Name: getMobilityFlag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/EnumPushReaction;]
	 * </p>
	 */
	public static McObfPair func_185905_o = McMappingDatabase.getSRG("IBlockProperties.func_185905_o");

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185890_d = McMappingDatabase.getSRG("IBlockProperties.func_185890_d");

	/**
	 * <p>
	 * Name: getSelectedBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185918_c = McMappingDatabase.getSRG("IBlockProperties.func_185918_c");

	/**
	 * <p>
	 * Name: canProvidePower
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185897_m = McMappingDatabase.getSRG("IBlockProperties.func_185897_m");

	/**
	 * <p>
	 * Name: addCollisionBoxToList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_185908_a = McMappingDatabase.getSRG("IBlockProperties.func_185908_a");

	/**
	 * <p>
	 * Name: getLightOpacity
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185891_c = McMappingDatabase.getSRG("IBlockProperties.func_185891_c");

	/**
	 * <p>
	 * Name: collisionRayTrace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;]
	 * </p>
	 */
	public static McObfPair func_185910_a = McMappingDatabase.getSRG("IBlockProperties.func_185910_a");

	/**
	 * <p>
	 * Name: causesSuffocation
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191058_s = McMappingDatabase.getSRG("IBlockProperties.func_191058_s");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185900_c = McMappingDatabase.getSRG("IBlockProperties.func_185900_c");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_185909_g = McMappingDatabase.getSRG("IBlockProperties.func_185909_g");

	/**
	 * <p>
	 * Name: hasComparatorInputOverride
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185912_n = McMappingDatabase.getSRG("IBlockProperties.func_185912_n");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185902_a = McMappingDatabase.getSRG("IBlockProperties.func_185902_a");

	/**
	 * <p>
	 * Name: getComparatorInputOverride
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_185888_a = McMappingDatabase.getSRG("IBlockProperties.func_185888_a");

	/**
	 * <p>
	 * Name: getOffset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_191059_e = McMappingDatabase.getSRG("IBlockProperties.func_191059_e");

	/**
	 * <p>
	 * Name: getMaterial
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/Material;]
	 * </p>
	 */
	public static McObfPair func_185904_a = McMappingDatabase.getSRG("IBlockProperties.func_185904_a");

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumBlockRenderType;]
	 * </p>
	 */
	public static McObfPair func_185901_i = McMappingDatabase.getSRG("IBlockProperties.func_185901_i");

	/**
	 * <p>
	 * Name: getAmbientOcclusionLightValue
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_185892_j = McMappingDatabase.getSRG("IBlockProperties.func_185892_j");

	/**
	 * <p>
	 * Name: isTopSolid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185896_q = McMappingDatabase.getSRG("IBlockProperties.func_185896_q");

	/**
	 * <p>
	 * Name: isBlockNormalCube
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185898_k = McMappingDatabase.getSRG("IBlockProperties.func_185898_k");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185907_a = McMappingDatabase.getSRG("IBlockProperties.func_185907_a");

	/**
	 * <p>
	 * Name: canEntitySpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_189884_a = McMappingDatabase.getSRG("IBlockProperties.func_189884_a");

	/**
	 * <p>
	 * Name: getPlayerRelativeBlockHardness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_185903_a = McMappingDatabase.getSRG("IBlockProperties.func_185903_a");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185917_h = McMappingDatabase.getSRG("IBlockProperties.func_185917_h");

	/**
	 * <p>
	 * Name: isFullBlock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185913_b = McMappingDatabase.getSRG("IBlockProperties.func_185913_b");

	/**
	 * <p>
	 * Name: getStrongPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_185893_b = McMappingDatabase.getSRG("IBlockProperties.func_185893_b");

	/**
	 * <p>
	 * Name: isTranslucent
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185895_e = McMappingDatabase.getSRG("IBlockProperties.func_185895_e");

	/**
	 * <p>
	 * Name: getBlockHardness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_185887_b = McMappingDatabase.getSRG("IBlockProperties.func_185887_b");

	/**
	 * <p>
	 * Name: useNeighborBrightness
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185916_f = McMappingDatabase.getSRG("IBlockProperties.func_185916_f");

}
