package zdoctor.zcoremod.map.minecraft.block.state;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IBlockState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awt";
		else
			return "net/minecraft/block/state/IBlockState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awt";
		else
			return "IBlockState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawt;";
		else
			return "Lnet/minecraft/block/state/IBlockState;";
	}

	/**
	 * <p>
	 * Name: withProperty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;Ljava/lang/Comparable;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_177226_a = McMappingDatabase.getSRG("IBlockState.func_177226_a");

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;)Ljava/lang/Comparable;]
	 * </p>
	 */
	public static McObfPair func_177229_b = McMappingDatabase.getSRG("IBlockState.func_177229_b");

	/**
	 * <p>
	 * Name: getPropertyKeys
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_177227_a = McMappingDatabase.getSRG("IBlockState.func_177227_a");

	/**
	 * <p>
	 * Name: cycleProperty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_177231_a = McMappingDatabase.getSRG("IBlockState.func_177231_a");

	/**
	 * <p>
	 * Name: getBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_177230_c = McMappingDatabase.getSRG("IBlockState.func_177230_c");

	/**
	 * <p>
	 * Name: getProperties
	 * </p>
	 * <p>
	 * Desc: [()Lcom/google/common/collect/ImmutableMap;]
	 * </p>
	 */
	public static McObfPair func_177228_b = McMappingDatabase.getSRG("IBlockState.func_177228_b");

}
