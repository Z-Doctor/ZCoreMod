package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStairs {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aud";
		else
			return "net/minecraft/block/BlockStairs";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aud";
		else
			return "BlockStairs";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laud;";
		else
			return "Lnet/minecraft/block/BlockStairs;";
	}

	/**
	 * <p>
	 * Name: AABB_QTR_TOP_EAST
	 * </p>
	 */
	public static McObfPair field_185716_f = McMappingDatabase.getSRG("field_185716_f");

	/**
	 * <p>
	 * Name: getBlockLayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/BlockRenderLayer;]
	 * </p>
	 */
	public static McObfPair func_180664_k = McMappingDatabase.getSRG("BlockStairs.func_180664_k");

	/**
	 * <p>
	 * Name: addCollisionBoxToList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_185477_a = McMappingDatabase.getSRG("BlockStairs.func_185477_a");

	/**
	 * <p>
	 * Name: onBlockAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176213_c = McMappingDatabase.getSRG("BlockStairs.func_176213_c");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockStairs.func_193383_a");

	/**
	 * <p>
	 * Name: FACING
	 * </p>
	 */
	public static McObfPair field_176309_a = McMappingDatabase.getSRG("field_176309_a");

	/**
	 * <p>
	 * Name: updateTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180650_b = McMappingDatabase.getSRG("BlockStairs.func_180650_b");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockStairs.func_180661_e");

	/**
	 * <p>
	 * Name: AABB_OCT_TOP_NE
	 * </p>
	 */
	public static McObfPair field_185713_D = McMappingDatabase.getSRG("field_185713_D");

	/**
	 * <p>
	 * Name: getActualState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176221_a = McMappingDatabase.getSRG("BlockStairs.func_176221_a");

	/**
	 * <p>
	 * Name: AABB_SLAB_BOTTOM
	 * </p>
	 */
	public static McObfPair field_185719_G = McMappingDatabase.getSRG("field_185719_G");

	/**
	 * <p>
	 * Name: AABB_QTR_BOT_WEST
	 * </p>
	 */
	public static McObfPair field_185720_H = McMappingDatabase.getSRG("field_185720_H");

	/**
	 * <p>
	 * Name: getExplosionResistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)F]
	 * </p>
	 */
	public static McObfPair func_149638_a = McMappingDatabase.getSRG("BlockStairs.func_149638_a");

	/**
	 * <p>
	 * Name: AABB_QTR_BOT_EAST
	 * </p>
	 */
	public static McObfPair field_185721_I = McMappingDatabase.getSRG("field_185721_I");

	/**
	 * <p>
	 * Name: onEntityWalk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_176199_a = McMappingDatabase.getSRG("BlockStairs.func_176199_a");

	/**
	 * <p>
	 * Name: AABB_QTR_TOP_NORTH
	 * </p>
	 */
	public static McObfPair field_185718_g = McMappingDatabase.getSRG("field_185718_g");

	/**
	 * <p>
	 * Name: AABB_OCT_BOT_SW
	 * </p>
	 */
	public static McObfPair field_185726_N = McMappingDatabase.getSRG("field_185726_N");

	/**
	 * <p>
	 * Name: getCollQuarterBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185707_y = McMappingDatabase.getSRG("BlockStairs.func_185707_y");

	/**
	 * <p>
	 * Name: randomDisplayTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180655_c = McMappingDatabase.getSRG("BlockStairs.func_180655_c");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockStairs.func_149662_c");

	/**
	 * <p>
	 * Name: isBlockStairs
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_185709_i = McMappingDatabase.getSRG("BlockStairs.func_185709_i");

	/**
	 * <p>
	 * Name: AABB_OCT_TOP_SE
	 * </p>
	 */
	public static McObfPair field_185717_F = McMappingDatabase.getSRG("field_185717_F");

	/**
	 * <p>
	 * Name: getStateForPlacement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFILnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180642_a = McMappingDatabase.getSRG("BlockStairs.func_180642_a");

	/**
	 * <p>
	 * Name: tickRate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)I]
	 * </p>
	 */
	public static McObfPair func_149738_a = McMappingDatabase.getSRG("BlockStairs.func_149738_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockStairs.func_176201_c");

	/**
	 * <p>
	 * Name: getCollEighthBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185705_z = McMappingDatabase.getSRG("BlockStairs.func_185705_z");

	/**
	 * <p>
	 * Name: AABB_OCT_BOT_NW
	 * </p>
	 */
	public static McObfPair field_185724_L = McMappingDatabase.getSRG("field_185724_L");

	/**
	 * <p>
	 * Name: getPackedLightmapCoords
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_185484_c = McMappingDatabase.getSRG("BlockStairs.func_185484_c");

	/**
	 * <p>
	 * Name: modifyAcceleration
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_176197_a = McMappingDatabase.getSRG("BlockStairs.func_176197_a");

	/**
	 * <p>
	 * Name: AABB_OCT_BOT_SE
	 * </p>
	 */
	public static McObfPair field_185727_O = McMappingDatabase.getSRG("field_185727_O");

	/**
	 * <p>
	 * Name: modelState
	 * </p>
	 */
	public static McObfPair field_150151_M = McMappingDatabase.getSRG("field_150151_M");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockStairs.func_149686_d");

	/**
	 * <p>
	 * Name: AABB_SLAB_TOP
	 * </p>
	 */
	public static McObfPair field_185712_d = McMappingDatabase.getSRG("field_185712_d");

	/**
	 * <p>
	 * Name: AABB_OCT_TOP_NW
	 * </p>
	 */
	public static McObfPair field_185711_C = McMappingDatabase.getSRG("field_185711_C");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockStairs.func_185499_a");

	/**
	 * <p>
	 * Name: AABB_QTR_TOP_WEST
	 * </p>
	 */
	public static McObfPair field_185714_e = McMappingDatabase.getSRG("field_185714_e");

	/**
	 * <p>
	 * Name: onBlockClicked
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_180649_a = McMappingDatabase.getSRG("BlockStairs.func_180649_a");

	/**
	 * <p>
	 * Name: AABB_OCT_TOP_SW
	 * </p>
	 */
	public static McObfPair field_185715_E = McMappingDatabase.getSRG("field_185715_E");

	/**
	 * <p>
	 * Name: getCollisionBoxList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_185708_x = McMappingDatabase.getSRG("BlockStairs.func_185708_x");

	/**
	 * <p>
	 * Name: breakBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180663_b = McMappingDatabase.getSRG("BlockStairs.func_180663_b");

	/**
	 * <p>
	 * Name: AABB_QTR_TOP_SOUTH
	 * </p>
	 */
	public static McObfPair field_185710_B = McMappingDatabase.getSRG("field_185710_B");

	/**
	 * <p>
	 * Name: getSelectedBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_180640_a = McMappingDatabase.getSRG("BlockStairs.func_180640_a");

	/**
	 * <p>
	 * Name: HALF
	 * </p>
	 */
	public static McObfPair field_176308_b = McMappingDatabase.getSRG("field_176308_b");

	/**
	 * <p>
	 * Name: SHAPE
	 * </p>
	 */
	public static McObfPair field_176310_M = McMappingDatabase.getSRG("field_176310_M");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockStairs.func_185471_a");

	/**
	 * <p>
	 * Name: onBlockActivated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z]
	 * </p>
	 */
	public static McObfPair func_180639_a = McMappingDatabase.getSRG("BlockStairs.func_180639_a");

	/**
	 * <p>
	 * Name: collisionRayTrace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;]
	 * </p>
	 */
	public static McObfPair func_180636_a = McMappingDatabase.getSRG("BlockStairs.func_180636_a");

	/**
	 * <p>
	 * Name: modelBlock
	 * </p>
	 */
	public static McObfPair field_150149_b = McMappingDatabase.getSRG("field_150149_b");

	/**
	 * <p>
	 * Name: isTopSolid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_185481_k = McMappingDatabase.getSRG("BlockStairs.func_185481_k");

	/**
	 * <p>
	 * Name: isCollidable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149703_v = McMappingDatabase.getSRG("BlockStairs.func_149703_v");

	/**
	 * <p>
	 * Name: AABB_QTR_BOT_NORTH
	 * </p>
	 */
	public static McObfPair field_185722_J = McMappingDatabase.getSRG("field_185722_J");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockStairs.func_176203_a");

	/**
	 * <p>
	 * Name: isDifferentStairs
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_185704_d = McMappingDatabase.getSRG("BlockStairs.func_185704_d");

	/**
	 * <p>
	 * Name: onBlockDestroyedByExplosion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/Explosion;)V]
	 * </p>
	 */
	public static McObfPair func_180652_a = McMappingDatabase.getSRG("BlockStairs.func_180652_a");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_180659_g = McMappingDatabase.getSRG("BlockStairs.func_180659_g");

	/**
	 * <p>
	 * Name: AABB_QTR_BOT_SOUTH
	 * </p>
	 */
	public static McObfPair field_185723_K = McMappingDatabase.getSRG("field_185723_K");

	/**
	 * <p>
	 * Name: onBlockDestroyedByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176206_d = McMappingDatabase.getSRG("BlockStairs.func_176206_d");

	/**
	 * <p>
	 * Name: canPlaceBlockAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176196_c = McMappingDatabase.getSRG("BlockStairs.func_176196_c");

	/**
	 * <p>
	 * Name: canCollideCheck
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Z)Z]
	 * </p>
	 */
	public static McObfPair func_176209_a = McMappingDatabase.getSRG("BlockStairs.func_176209_a");

	/**
	 * <p>
	 * Name: AABB_OCT_BOT_NE
	 * </p>
	 */
	public static McObfPair field_185725_M = McMappingDatabase.getSRG("field_185725_M");

	/**
	 * <p>
	 * Name: getStairsShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockStairs$EnumShape;]
	 * </p>
	 */
	public static McObfPair func_185706_d = McMappingDatabase.getSRG("BlockStairs.func_185706_d");

}
