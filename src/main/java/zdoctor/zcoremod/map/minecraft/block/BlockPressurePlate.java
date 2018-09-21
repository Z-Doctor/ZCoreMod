package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPressurePlate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asw";
		else
			return "net/minecraft/block/BlockPressurePlate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asw";
		else
			return "BlockPressurePlate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasw;";
		else
			return "Lnet/minecraft/block/BlockPressurePlate;";
	}

	/**
	 * <p>
	 * Name: playClickOffSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185508_c = McMappingDatabase.getSRG("BlockPressurePlate.func_185508_c");

	/**
	 * <p>
	 * Name: playClickOnSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185507_b = McMappingDatabase.getSRG("BlockPressurePlate.func_185507_b");

	/**
	 * <p>
	 * Name: getRedstoneStrength
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176576_e = McMappingDatabase.getSRG("BlockPressurePlate.func_176576_e");

	/**
	 * <p>
	 * Name: sensitivity
	 * </p>
	 */
	public static McObfPair field_150069_a = McMappingDatabase.getSRG("field_150069_a");

	/**
	 * <p>
	 * Name: POWERED
	 * </p>
	 */
	public static McObfPair field_176580_a = McMappingDatabase.getSRG("field_176580_a");

	/**
	 * <p>
	 * Name: setRedstoneStrength
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176575_a = McMappingDatabase.getSRG("BlockPressurePlate.func_176575_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockPressurePlate.func_176201_c");

	/**
	 * <p>
	 * Name: computeRedstoneStrength
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180669_e = McMappingDatabase.getSRG("BlockPressurePlate.func_180669_e");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockPressurePlate.func_180661_e");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockPressurePlate.func_176203_a");

}
