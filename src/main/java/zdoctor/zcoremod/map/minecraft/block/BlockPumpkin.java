package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPumpkin {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asy";
		else
			return "net/minecraft/block/BlockPumpkin";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asy";
		else
			return "BlockPumpkin";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasy;";
		else
			return "Lnet/minecraft/block/BlockPumpkin;";
	}

	/**
	 * <p>
	 * Name: getGolemPattern
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/pattern/BlockPattern;]
	 * </p>
	 */
	public static McObfPair func_176388_T = McMappingDatabase.getSRG("BlockPumpkin.func_176388_T");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockPumpkin.func_176201_c");

	/**
	 * <p>
	 * Name: IS_PUMPKIN
	 * </p>
	 */
	public static McObfPair field_181085_Q = McMappingDatabase.getSRG("field_181085_Q");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockPumpkin.func_176203_a");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockPumpkin.func_180661_e");

	/**
	 * <p>
	 * Name: canPlaceBlockAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176196_c = McMappingDatabase.getSRG("BlockPumpkin.func_176196_c");

	/**
	 * <p>
	 * Name: onBlockAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176213_c = McMappingDatabase.getSRG("BlockPumpkin.func_176213_c");

	/**
	 * <p>
	 * Name: snowmanBasePattern
	 * </p>
	 */
	public static McObfPair field_176394_a = McMappingDatabase.getSRG("field_176394_a");

	/**
	 * <p>
	 * Name: getSnowmanPattern
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/pattern/BlockPattern;]
	 * </p>
	 */
	public static McObfPair func_176391_l = McMappingDatabase.getSRG("BlockPumpkin.func_176391_l");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockPumpkin.func_185471_a");

	/**
	 * <p>
	 * Name: golemPattern
	 * </p>
	 */
	public static McObfPair field_176396_O = McMappingDatabase.getSRG("field_176396_O");

	/**
	 * <p>
	 * Name: golemBasePattern
	 * </p>
	 */
	public static McObfPair field_176395_M = McMappingDatabase.getSRG("field_176395_M");

	/**
	 * <p>
	 * Name: getGolemBasePattern
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/pattern/BlockPattern;]
	 * </p>
	 */
	public static McObfPair func_176389_S = McMappingDatabase.getSRG("BlockPumpkin.func_176389_S");

	/**
	 * <p>
	 * Name: canDispenserPlace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176390_d = McMappingDatabase.getSRG("BlockPumpkin.func_176390_d");

	/**
	 * <p>
	 * Name: getSnowmanBasePattern
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/pattern/BlockPattern;]
	 * </p>
	 */
	public static McObfPair func_176392_j = McMappingDatabase.getSRG("BlockPumpkin.func_176392_j");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockPumpkin.func_185499_a");

	/**
	 * <p>
	 * Name: getStateForPlacement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFILnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180642_a = McMappingDatabase.getSRG("BlockPumpkin.func_180642_a");

	/**
	 * <p>
	 * Name: trySpawnGolem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180673_e = McMappingDatabase.getSRG("BlockPumpkin.func_180673_e");

	/**
	 * <p>
	 * Name: snowmanPattern
	 * </p>
	 */
	public static McObfPair field_176393_b = McMappingDatabase.getSRG("field_176393_b");

}
