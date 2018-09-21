package zdoctor.zcoremod.map.minecraft.block.state;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStateBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awp";
		else
			return "net/minecraft/block/state/BlockStateBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awp";
		else
			return "BlockStateBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawp;";
		else
			return "Lnet/minecraft/block/state/BlockStateBase;";
	}

	/**
	 * <p>
	 * Name: cyclePropertyValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;Ljava/lang/Object;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_177232_a = McMappingDatabase.getSRG("BlockStateBase.func_177232_a");

	/**
	 * <p>
	 * Name: MAP_ENTRY_TO_STRING
	 * </p>
	 */
	public static McObfPair field_177233_b = McMappingDatabase.getSRG("field_177233_b");

	/**
	 * <p>
	 * Name: COMMA_JOINER
	 * </p>
	 */
	public static McObfPair field_177234_a = McMappingDatabase.getSRG("field_177234_a");

	/**
	 * <p>
	 * Name: cycleProperty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_177231_a = McMappingDatabase.getSRG("BlockStateBase.func_177231_a");

}
