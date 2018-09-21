package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRailPowered {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asv";
		else
			return "net/minecraft/block/BlockRailPowered";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asv";
		else
			return "BlockRailPowered";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasv;";
		else
			return "Lnet/minecraft/block/BlockRailPowered;";
	}

	/**
	 * <p>
	 * Name: SHAPE
	 * </p>
	 */
	public static McObfPair field_176568_b = McMappingDatabase.getSRG("field_176568_b");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockRailPowered.func_185471_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockRailPowered.func_176201_c");

	/**
	 * <p>
	 * Name: updateState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_189541_b = McMappingDatabase.getSRG("BlockRailPowered.func_189541_b");

	/**
	 * <p>
	 * Name: POWERED
	 * </p>
	 */
	public static McObfPair field_176569_M = McMappingDatabase.getSRG("field_176569_M");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockRailPowered.func_180661_e");

	/**
	 * <p>
	 * Name: findPoweredRailSignal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;ZI)Z]
	 * </p>
	 */
	public static McObfPair func_176566_a = McMappingDatabase.getSRG("BlockRailPowered.func_176566_a");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockRailPowered.func_176203_a");

	/**
	 * <p>
	 * Name: getShapeProperty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/properties/IProperty;]
	 * </p>
	 */
	public static McObfPair func_176560_l = McMappingDatabase.getSRG("BlockRailPowered.func_176560_l");

	/**
	 * <p>
	 * Name: isSameRailWithPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ZILnet/minecraft/block/BlockRailBase$EnumRailDirection;)Z]
	 * </p>
	 */
	public static McObfPair func_176567_a = McMappingDatabase.getSRG("BlockRailPowered.func_176567_a");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockRailPowered.func_185499_a");

}
