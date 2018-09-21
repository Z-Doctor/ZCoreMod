package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPressurePlateWeighted {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ava";
		else
			return "net/minecraft/block/BlockPressurePlateWeighted";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ava";
		else
			return "BlockPressurePlateWeighted";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lava;";
		else
			return "Lnet/minecraft/block/BlockPressurePlateWeighted;";
	}

	/**
	 * <p>
	 * Name: tickRate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)I]
	 * </p>
	 */
	public static McObfPair func_149738_a = McMappingDatabase.getSRG("BlockPressurePlateWeighted.func_149738_a");

	/**
	 * <p>
	 * Name: getRedstoneStrength
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176576_e = McMappingDatabase.getSRG("BlockPressurePlateWeighted.func_176576_e");

	/**
	 * <p>
	 * Name: maxWeight
	 * </p>
	 */
	public static McObfPair field_150068_a = McMappingDatabase.getSRG("field_150068_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockPressurePlateWeighted.func_176201_c");

	/**
	 * <p>
	 * Name: POWER
	 * </p>
	 */
	public static McObfPair field_176579_a = McMappingDatabase.getSRG("field_176579_a");

	/**
	 * <p>
	 * Name: setRedstoneStrength
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176575_a = McMappingDatabase.getSRG("BlockPressurePlateWeighted.func_176575_a");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockPressurePlateWeighted.func_180661_e");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockPressurePlateWeighted.func_176203_a");

	/**
	 * <p>
	 * Name: playClickOffSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185508_c = McMappingDatabase.getSRG("BlockPressurePlateWeighted.func_185508_c");

	/**
	 * <p>
	 * Name: computeRedstoneStrength
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180669_e = McMappingDatabase.getSRG("BlockPressurePlateWeighted.func_180669_e");

	/**
	 * <p>
	 * Name: playClickOnSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185507_b = McMappingDatabase.getSRG("BlockPressurePlateWeighted.func_185507_b");

}
