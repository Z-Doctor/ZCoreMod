package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Block {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aow";
		else
			return "net/minecraft/block/Block";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aow";
		else
			return "Block";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laow;";
		else
			return "Lnet/minecraft/block/Block;";
	}

	/**
	 * <p>
	 * Name: modifyAcceleration
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_176197_a = McMappingDatabase.getSRG("Block.func_176197_a");

	/**
	 * <p>
	 * Name: getOffset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_190949_e = McMappingDatabase.getSRG("Block.func_190949_e");

	/**
	 * <p>
	 * Name: isTranslucent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149751_l = McMappingDatabase.getSRG("Block.func_149751_l");

	/**
	 * <p>
	 * Name: translucent
	 * </p>
	 */
	public static McObfPair field_149785_s = McMappingDatabase.getSRG("field_149785_s");

	/**
	 * <p>
	 * Name: isBlockNormalCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149637_q = McMappingDatabase.getSRG("Block.func_149637_q");

	/**
	 * <p>
	 * Name: onBlockDestroyedByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176206_d = McMappingDatabase.getSRG("Block.func_176206_d");

	/**
	 * <p>
	 * Name: onEntityCollidedWithBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_180634_a = McMappingDatabase.getSRG("Block.func_180634_a");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_149770_b = McMappingDatabase.getSRG("field_149770_b");

	/**
	 * <p>
	 * Name: getSubBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_149666_a = McMappingDatabase.getSRG("Block.func_149666_a");

	/**
	 * <p>
	 * Name: breakBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180663_b = McMappingDatabase.getSRG("Block.func_180663_b");

	/**
	 * <p>
	 * Name: getCreativeTabToDisplayOn
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/creativetab/CreativeTabs;]
	 * </p>
	 */
	public static McObfPair func_149708_J = McMappingDatabase.getSRG("Block.func_149708_J");

	/**
	 * <p>
	 * Name: onBlockPlacedBy
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_180633_a = McMappingDatabase.getSRG("Block.func_180633_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("Block.func_176201_c");

	/**
	 * <p>
	 * Name: canSilkHarvest
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149700_E = McMappingDatabase.getSRG("Block.func_149700_E");

	/**
	 * <p>
	 * Name: isExceptBlockForAttachWithPiston
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_193382_c = McMappingDatabase.getSRG("Block.func_193382_c");

	/**
	 * <p>
	 * Name: registerBlock
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_176219_a = McMappingDatabase.getSRG("Block.func_176219_a");

	/**
	 * <p>
	 * Name: isEqualTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_149680_a = McMappingDatabase.getSRG("Block.func_149680_a");

	/**
	 * <p>
	 * Name: shouldSideBeRendered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176225_a = McMappingDatabase.getSRG("Block.func_176225_a");

	/**
	 * <p>
	 * Name: hasTileEntity
	 * </p>
	 */
	public static McObfPair field_149758_A = McMappingDatabase.getSRG("field_149758_A");

	/**
	 * <p>
	 * Name: getOffsetType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block$EnumOffsetType;]
	 * </p>
	 */
	public static McObfPair func_176218_Q = McMappingDatabase.getSRG("Block.func_176218_Q");

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/util/EnumBlockRenderType;]
	 * </p>
	 */
	public static McObfPair func_149645_b = McMappingDatabase.getSRG("Block.func_149645_b");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("Block.func_185496_a");

	/**
	 * <p>
	 * Name: getLightValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_149750_m = McMappingDatabase.getSRG("Block.func_149750_m");

	/**
	 * <p>
	 * Name: spawnAsEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_180635_a = McMappingDatabase.getSRG("Block.func_180635_a");

	/**
	 * <p>
	 * Name: getPlayerRelativeBlockHardness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_180647_a = McMappingDatabase.getSRG("Block.func_180647_a");

	/**
	 * <p>
	 * Name: setCreativeTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149647_a = McMappingDatabase.getSRG("Block.func_149647_a");

	/**
	 * <p>
	 * Name: dropXpOnBlockBreak
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_180637_b = McMappingDatabase.getSRG("Block.func_180637_b");

	/**
	 * <p>
	 * Name: blockState
	 * </p>
	 */
	public static McObfPair field_176227_L = McMappingDatabase.getSRG("field_176227_L");

	/**
	 * <p>
	 * Name: rayTrace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/AxisAlignedBB;)Lnet/minecraft/util/math/RayTraceResult;]
	 * </p>
	 */
	public static McObfPair func_185503_a = McMappingDatabase.getSRG("Block.func_185503_a");

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_180646_a = McMappingDatabase.getSRG("Block.func_180646_a");

	/**
	 * <p>
	 * Name: fullBlock
	 * </p>
	 */
	public static McObfPair field_149787_q = McMappingDatabase.getSRG("field_149787_q");

	/**
	 * <p>
	 * Name: getComparatorInputOverride
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180641_l = McMappingDatabase.getSRG("Block.func_180641_l");

	/**
	 * <p>
	 * Name: canCollideCheck
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Z)Z]
	 * </p>
	 */
	public static McObfPair func_176209_a = McMappingDatabase.getSRG("Block.func_176209_a");

	/**
	 * <p>
	 * Name: canEntitySpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_189872_a = McMappingDatabase.getSRG("Block.func_189872_a");

	/**
	 * <p>
	 * Name: updateTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180650_b = McMappingDatabase.getSRG("Block.func_180650_b");

	/**
	 * <p>
	 * Name: setLightLevel
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149715_a = McMappingDatabase.getSRG("Block.func_149715_a");

	/**
	 * <p>
	 * Name: blockMaterial
	 * </p>
	 */
	public static McObfPair field_149764_J = McMappingDatabase.getSRG("field_149764_J");

	/**
	 * <p>
	 * Name: getSelectedBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_180640_a = McMappingDatabase.getSRG("Block.func_180640_a");

	/**
	 * <p>
	 * Name: addCollisionBoxToList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/util/math/AxisAlignedBB;)V]
	 * </p>
	 */
	public static McObfPair func_185492_a = McMappingDatabase.getSRG("Block.func_185492_a");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("Block.func_189540_a");

	/**
	 * <p>
	 * Name: fillWithRain
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_176224_k = McMappingDatabase.getSRG("Block.func_176224_k");

	/**
	 * <p>
	 * Name: randomTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180645_a = McMappingDatabase.getSRG("Block.func_180645_a");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("Block.func_176203_a");

	/**
	 * <p>
	 * Name: slipperiness
	 * </p>
	 */
	public static McObfPair field_149765_K = McMappingDatabase.getSRG("field_149765_K");

	/**
	 * <p>
	 * Name: setUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149663_c = McMappingDatabase.getSRG("Block.func_149663_c");

	/**
	 * <p>
	 * Name: disableStats
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149649_H = McMappingDatabase.getSRG("Block.func_149649_H");

	/**
	 * <p>
	 * Name: addInformation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Ljava/util/List;Lnet/minecraft/client/util/ITooltipFlag;)V]
	 * </p>
	 */
	public static McObfPair func_190948_a = McMappingDatabase.getSRG("Block.func_190948_a");

	/**
	 * <p>
	 * Name: REGISTRY
	 * </p>
	 */
	public static McObfPair field_149771_c = McMappingDatabase.getSRG("field_149771_c");

	/**
	 * <p>
	 * Name: getActualState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176221_a = McMappingDatabase.getSRG("Block.func_176221_a");

	/**
	 * <p>
	 * Name: setHardness
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149711_c = McMappingDatabase.getSRG("Block.func_149711_c");

	/**
	 * <p>
	 * Name: isNormalCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149721_r = McMappingDatabase.getSRG("Block.func_149721_r");

	/**
	 * <p>
	 * Name: harvestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/tileentity/TileEntity;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_180657_a = McMappingDatabase.getSRG("Block.func_180657_a");

	/**
	 * <p>
	 * Name: getIdFromBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)I]
	 * </p>
	 */
	public static McObfPair func_149682_b = McMappingDatabase.getSRG("Block.func_149682_b");

	/**
	 * <p>
	 * Name: hasTileEntity
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149716_u = McMappingDatabase.getSRG("Block.func_149716_u");

	/**
	 * <p>
	 * Name: getStateForPlacement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFILnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180642_a = McMappingDatabase.getSRG("Block.func_180642_a");

	/**
	 * <p>
	 * Name: setSoundType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/SoundType;)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149672_a = McMappingDatabase.getSRG("Block.func_149672_a");

	/**
	 * <p>
	 * Name: collisionRayTrace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;]
	 * </p>
	 */
	public static McObfPair func_180636_a = McMappingDatabase.getSRG("Block.func_180636_a");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("Block.func_180661_e");

	/**
	 * <p>
	 * Name: getAmbientOcclusionLightValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_185485_f = McMappingDatabase.getSRG("Block.func_185485_f");

	/**
	 * <p>
	 * Name: blockHardness
	 * </p>
	 */
	public static McObfPair field_149782_v = McMappingDatabase.getSRG("field_149782_v");

	/**
	 * <p>
	 * Name: tickRate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)I]
	 * </p>
	 */
	public static McObfPair func_149738_a = McMappingDatabase.getSRG("Block.func_149738_a");

	/**
	 * <p>
	 * Name: isExceptionBlockForAttaching
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_193384_b = McMappingDatabase.getSRG("Block.func_193384_b");

	/**
	 * <p>
	 * Name: isCollidable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149703_v = McMappingDatabase.getSRG("Block.func_149703_v");

	/**
	 * <p>
	 * Name: isReplaceable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176200_f = McMappingDatabase.getSRG("Block.func_176200_f");

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_176194_O = McMappingDatabase.getSRG("Block.func_176194_O");

	/**
	 * <p>
	 * Name: registerBlocks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_149671_p = McMappingDatabase.getSRG("Block.func_149671_p");

	/**
	 * <p>
	 * Name: dropBlockAsItemWithChance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;FI)V]
	 * </p>
	 */
	public static McObfPair func_180653_a = McMappingDatabase.getSRG("Block.func_180653_a");

	/**
	 * <p>
	 * Name: lightOpacity
	 * </p>
	 */
	public static McObfPair field_149786_r = McMappingDatabase.getSRG("field_149786_r");

	/**
	 * <p>
	 * Name: getBlockFromName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149684_b = McMappingDatabase.getSRG("Block.func_149684_b");

	/**
	 * <p>
	 * Name: useNeighborBrightness
	 * </p>
	 */
	public static McObfPair field_149783_u = McMappingDatabase.getSRG("field_149783_u");

	/**
	 * <p>
	 * Name: getStateById
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176220_d = McMappingDatabase.getSRG("Block.func_176220_d");

	/**
	 * <p>
	 * Name: AIR_ID
	 * </p>
	 */
	public static McObfPair field_176230_a = McMappingDatabase.getSRG("field_176230_a");

	/**
	 * <p>
	 * Name: quantityDropped
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_149745_a = McMappingDatabase.getSRG("Block.func_149745_a");

	/**
	 * <p>
	 * Name: blockResistance
	 * </p>
	 */
	public static McObfPair field_149781_w = McMappingDatabase.getSRG("field_149781_w");

	/**
	 * <p>
	 * Name: damageDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_180651_a = McMappingDatabase.getSRG("Block.func_180651_a");

	/**
	 * <p>
	 * Name: isTopSolid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_185481_k = McMappingDatabase.getSRG("Block.func_185481_k");

	/**
	 * <p>
	 * Name: onBlockActivated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z]
	 * </p>
	 */
	public static McObfPair func_180639_a = McMappingDatabase.getSRG("Block.func_180639_a");

	/**
	 * <p>
	 * Name: onLanded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_176216_a = McMappingDatabase.getSRG("Block.func_176216_a");

	/**
	 * <p>
	 * Name: quantityDroppedWithBonus
	 * </p>
	 * <p>
	 * Desc: [(ILjava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_149679_a = McMappingDatabase.getSRG("Block.func_149679_a");

	/**
	 * <p>
	 * Name: setResistance
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149752_b = McMappingDatabase.getSRG("Block.func_149752_b");

	/**
	 * <p>
	 * Name: causesSuffocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_176214_u = McMappingDatabase.getSRG("Block.func_176214_u");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_180659_g = McMappingDatabase.getSRG("Block.func_180659_g");

	/**
	 * <p>
	 * Name: getUseNeighborBrightness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149710_n = McMappingDatabase.getSRG("Block.func_149710_n");

	/**
	 * <p>
	 * Name: setBlockUnbreakable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149722_s = McMappingDatabase.getSRG("Block.func_149722_s");

	/**
	 * <p>
	 * Name: canSpawnInBlock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181623_g = McMappingDatabase.getSRG("Block.func_181623_g");

	/**
	 * <p>
	 * Name: hasComparatorInputOverride
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149740_M = McMappingDatabase.getSRG("Block.func_149740_M");

	/**
	 * <p>
	 * Name: getStateId
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176210_f = McMappingDatabase.getSRG("Block.func_176210_f");

	/**
	 * <p>
	 * Name: canProvidePower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149744_f = McMappingDatabase.getSRG("Block.func_149744_f");

	/**
	 * <p>
	 * Name: enableStats
	 * </p>
	 */
	public static McObfPair field_149790_y = McMappingDatabase.getSRG("field_149790_y");

	/**
	 * <p>
	 * Name: setDefaultState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180632_j = McMappingDatabase.getSRG("Block.func_180632_j");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("Block.func_185499_a");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("Block.func_193383_a");

	/**
	 * <p>
	 * Name: onBlockAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176213_c = McMappingDatabase.getSRG("Block.func_176213_c");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149739_a = McMappingDatabase.getSRG("Block.func_149739_a");

	/**
	 * <p>
	 * Name: getStrongPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_176211_b = McMappingDatabase.getSRG("Block.func_176211_b");

	/**
	 * <p>
	 * Name: canPlaceBlockOnSide
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_176198_a = McMappingDatabase.getSRG("Block.func_176198_a");

	/**
	 * <p>
	 * Name: blockSoundType
	 * </p>
	 */
	public static McObfPair field_149762_H = McMappingDatabase.getSRG("field_149762_H");

	/**
	 * <p>
	 * Name: onFallenUpon
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;F)V]
	 * </p>
	 */
	public static McObfPair func_180658_a = McMappingDatabase.getSRG("Block.func_180658_a");

	/**
	 * <p>
	 * Name: registerBlock
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/ResourceLocation;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_176215_a = McMappingDatabase.getSRG("Block.func_176215_a");

	/**
	 * <p>
	 * Name: setLightOpacity
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149713_g = McMappingDatabase.getSRG("Block.func_149713_g");

	/**
	 * <p>
	 * Name: onEntityWalk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_176199_a = McMappingDatabase.getSRG("Block.func_176199_a");

	/**
	 * <p>
	 * Name: dropBlockAsItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V]
	 * </p>
	 */
	public static McObfPair func_176226_b = McMappingDatabase.getSRG("Block.func_176226_b");

	/**
	 * <p>
	 * Name: eventReceived
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;II)Z]
	 * </p>
	 */
	public static McObfPair func_189539_a = McMappingDatabase.getSRG("Block.func_189539_a");

	/**
	 * <p>
	 * Name: getLocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149732_F = McMappingDatabase.getSRG("Block.func_149732_F");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("Block.func_149662_c");

	/**
	 * <p>
	 * Name: getEnableStats
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149652_G = McMappingDatabase.getSRG("Block.func_149652_G");

	/**
	 * <p>
	 * Name: defaultBlockState
	 * </p>
	 */
	public static McObfPair field_176228_M = McMappingDatabase.getSRG("field_176228_M");

	/**
	 * <p>
	 * Name: onBlockDestroyedByExplosion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/Explosion;)V]
	 * </p>
	 */
	public static McObfPair func_180652_a = McMappingDatabase.getSRG("Block.func_180652_a");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("Block.func_185471_a");

	/**
	 * <p>
	 * Name: getDefaultState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176223_P = McMappingDatabase.getSRG("Block.func_176223_P");

	/**
	 * <p>
	 * Name: canPlaceBlockAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176196_c = McMappingDatabase.getSRG("Block.func_176196_c");

	/**
	 * <p>
	 * Name: onBlockHarvested
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_176208_a = McMappingDatabase.getSRG("Block.func_176208_a");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185473_a = McMappingDatabase.getSRG("Block.func_185473_a");

	/**
	 * <p>
	 * Name: getExplosionResistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)F]
	 * </p>
	 */
	public static McObfPair func_149638_a = McMappingDatabase.getSRG("Block.func_149638_a");

	/**
	 * <p>
	 * Name: blockParticleGravity
	 * </p>
	 */
	public static McObfPair field_149763_I = McMappingDatabase.getSRG("field_149763_I");

	/**
	 * <p>
	 * Name: NULL_AABB
	 * </p>
	 */
	public static McObfPair field_185506_k = McMappingDatabase.getSRG("field_185506_k");

	/**
	 * <p>
	 * Name: FULL_BLOCK_AABB
	 * </p>
	 */
	public static McObfPair field_185505_j = McMappingDatabase.getSRG("field_185505_j");

	/**
	 * <p>
	 * Name: isFullBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149730_j = McMappingDatabase.getSRG("Block.func_149730_j");

	/**
	 * <p>
	 * Name: randomDisplayTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180655_c = McMappingDatabase.getSRG("Block.func_180655_c");

	/**
	 * <p>
	 * Name: hasCustomBreakingProgress
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_190946_v = McMappingDatabase.getSRG("Block.func_190946_v");

	/**
	 * <p>
	 * Name: getBlockHardness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_176195_g = McMappingDatabase.getSRG("Block.func_176195_g");

	/**
	 * <p>
	 * Name: getSilkTouchDrop
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_180643_i = McMappingDatabase.getSRG("Block.func_180643_i");

	/**
	 * <p>
	 * Name: BLOCK_STATE_IDS
	 * </p>
	 */
	public static McObfPair field_176229_d = McMappingDatabase.getSRG("field_176229_d");

	/**
	 * <p>
	 * Name: getTickRandomly
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149653_t = McMappingDatabase.getSRG("Block.func_149653_t");

	/**
	 * <p>
	 * Name: displayOnCreativeTab
	 * </p>
	 */
	public static McObfPair field_149772_a = McMappingDatabase.getSRG("field_149772_a");

	/**
	 * <p>
	 * Name: onBlockClicked
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_180649_a = McMappingDatabase.getSRG("Block.func_180649_a");

	/**
	 * <p>
	 * Name: requiresUpdates
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149698_L = McMappingDatabase.getSRG("Block.func_149698_L");

	/**
	 * <p>
	 * Name: addCollisionBoxToList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_185477_a = McMappingDatabase.getSRG("Block.func_185477_a");

	/**
	 * <p>
	 * Name: getMobilityFlag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/block/material/EnumPushReaction;]
	 * </p>
	 */
	public static McObfPair func_149656_h = McMappingDatabase.getSRG("Block.func_149656_h");

	/**
	 * <p>
	 * Name: canDropFromExplosion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/Explosion;)Z]
	 * </p>
	 */
	public static McObfPair func_149659_a = McMappingDatabase.getSRG("Block.func_149659_a");

	/**
	 * <p>
	 * Name: lightValue
	 * </p>
	 */
	public static McObfPair field_149784_t = McMappingDatabase.getSRG("field_149784_t");

	/**
	 * <p>
	 * Name: setTickRandomly
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149675_a = McMappingDatabase.getSRG("Block.func_149675_a");

	/**
	 * <p>
	 * Name: blockMapColor
	 * </p>
	 */
	public static McObfPair field_181083_K = McMappingDatabase.getSRG("field_181083_K");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("Block.func_149686_d");

	/**
	 * <p>
	 * Name: getLightOpacity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_149717_k = McMappingDatabase.getSRG("Block.func_149717_k");

	/**
	 * <p>
	 * Name: getBlockFromItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149634_a = McMappingDatabase.getSRG("Block.func_149634_a");

	/**
	 * <p>
	 * Name: getMaterial
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/block/material/Material;]
	 * </p>
	 */
	public static McObfPair func_149688_o = McMappingDatabase.getSRG("Block.func_149688_o");

	/**
	 * <p>
	 * Name: getSoundType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/SoundType;]
	 * </p>
	 */
	public static McObfPair func_185467_w = McMappingDatabase.getSRG("Block.func_185467_w");

	/**
	 * <p>
	 * Name: getWeakPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_180656_a = McMappingDatabase.getSRG("Block.func_180656_a");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("Block.func_180660_a");

	/**
	 * <p>
	 * Name: getBlockById
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_149729_e = McMappingDatabase.getSRG("Block.func_149729_e");

	/**
	 * <p>
	 * Name: isAssociatedBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_149667_c = McMappingDatabase.getSRG("Block.func_149667_c");

	/**
	 * <p>
	 * Name: getPackedLightmapCoords
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_185484_c = McMappingDatabase.getSRG("Block.func_185484_c");

	/**
	 * <p>
	 * Name: getBlockLayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/BlockRenderLayer;]
	 * </p>
	 */
	public static McObfPair func_180664_k = McMappingDatabase.getSRG("Block.func_180664_k");

	/**
	 * <p>
	 * Name: needsRandomTick
	 * </p>
	 */
	public static McObfPair field_149789_z = McMappingDatabase.getSRG("field_149789_z");

	/**
	 * <p>
	 * Name: isPassable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176205_b = McMappingDatabase.getSRG("Block.func_176205_b");

}
