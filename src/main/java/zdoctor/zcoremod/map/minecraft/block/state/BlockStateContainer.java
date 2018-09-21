package zdoctor.zcoremod.map.minecraft.block.state;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStateContainer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awu";
		else
			return "net/minecraft/block/state/BlockStateContainer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awu";
		else
			return "BlockStateContainer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawu;";
		else
			return "Lnet/minecraft/block/state/BlockStateContainer;";
	}

	/**
	 * <p>
	 * Name: getAllowedValues
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177620_e = McMappingDatabase.getSRG("BlockStateContainer.func_177620_e");

	/**
	 * <p>
	 * Name: getProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/block/properties/IProperty;]
	 * </p>
	 */
	public static McObfPair func_185920_a = McMappingDatabase.getSRG("BlockStateContainer.func_185920_a");

	/**
	 * <p>
	 * Name: validateProperty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;Lnet/minecraft/block/properties/IProperty;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_185919_a = McMappingDatabase.getSRG("BlockStateContainer.func_185919_a");

	/**
	 * <p>
	 * Name: getValidStates
	 * </p>
	 * <p>
	 * Desc: [()Lcom/google/common/collect/ImmutableList;]
	 * </p>
	 */
	public static McObfPair func_177619_a = McMappingDatabase.getSRG("BlockStateContainer.func_177619_a");

	/**
	 * <p>
	 * Name: getProperties
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_177623_d = McMappingDatabase.getSRG("BlockStateContainer.func_177623_d");

	/**
	 * <p>
	 * Name: getBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_177622_c = McMappingDatabase.getSRG("BlockStateContainer.func_177622_c");

	/**
	 * <p>
	 * Name: GET_NAME_FUNC
	 * </p>
	 */
	public static McObfPair field_177626_b = McMappingDatabase.getSRG("field_177626_b");

	/**
	 * <p>
	 * Name: validStates
	 * </p>
	 */
	public static McObfPair field_177625_e = McMappingDatabase.getSRG("field_177625_e");

	/**
	 * <p>
	 * Name: NAME_PATTERN
	 * </p>
	 */
	public static McObfPair field_185921_a = McMappingDatabase.getSRG("field_185921_a");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_177627_c = McMappingDatabase.getSRG("field_177627_c");

	/**
	 * <p>
	 * Name: properties
	 * </p>
	 */
	public static McObfPair field_177624_d = McMappingDatabase.getSRG("field_177624_d");

	/**
	 * <p>
	 * Name: getBaseState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_177621_b = McMappingDatabase.getSRG("BlockStateContainer.func_177621_b");

}
