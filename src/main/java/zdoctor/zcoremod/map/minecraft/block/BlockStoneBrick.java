package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStoneBrick {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aui";
		else
			return "net/minecraft/block/BlockStoneBrick";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aui";
		else
			return "BlockStoneBrick";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laui;";
		else
			return "Lnet/minecraft/block/BlockStoneBrick;";
	}

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockStoneBrick.func_180661_e");

	/**
	 * <p>
	 * Name: CHISELED_META
	 * </p>
	 */
	public static McObfPair field_176252_O = McMappingDatabase.getSRG("field_176252_O");

	/**
	 * <p>
	 * Name: MOSSY_META
	 * </p>
	 */
	public static McObfPair field_176250_M = McMappingDatabase.getSRG("field_176250_M");

	/**
	 * <p>
	 * Name: CRACKED_META
	 * </p>
	 */
	public static McObfPair field_176251_N = McMappingDatabase.getSRG("field_176251_N");

	/**
	 * <p>
	 * Name: damageDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_180651_a = McMappingDatabase.getSRG("BlockStoneBrick.func_180651_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockStoneBrick.func_176201_c");

	/**
	 * <p>
	 * Name: DEFAULT_META
	 * </p>
	 */
	public static McObfPair field_176248_b = McMappingDatabase.getSRG("field_176248_b");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockStoneBrick.func_176203_a");

	/**
	 * <p>
	 * Name: getSubBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_149666_a = McMappingDatabase.getSRG("BlockStoneBrick.func_149666_a");

	/**
	 * <p>
	 * Name: VARIANT
	 * </p>
	 */
	public static McObfPair field_176249_a = McMappingDatabase.getSRG("field_176249_a");

}
