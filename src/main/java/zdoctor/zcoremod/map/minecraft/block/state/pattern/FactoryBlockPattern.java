package zdoctor.zcoremod.map.minecraft.block.state.pattern;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FactoryBlockPattern {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awy";
		else
			return "net/minecraft/block/state/pattern/FactoryBlockPattern";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awy";
		else
			return "FactoryBlockPattern";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawy;";
		else
			return "Lnet/minecraft/block/state/pattern/FactoryBlockPattern;";
	}

	/**
	 * <p>
	 * Name: rowWidth
	 * </p>
	 */
	public static McObfPair field_177664_e = McMappingDatabase.getSRG("field_177664_e");

	/**
	 * <p>
	 * Name: makePredicateArray
	 * </p>
	 * <p>
	 * Desc: [()[[[Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_177658_c = McMappingDatabase.getSRG("FactoryBlockPattern.func_177658_c");

	/**
	 * <p>
	 * Name: checkMissingPredicates
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177657_d = McMappingDatabase.getSRG("FactoryBlockPattern.func_177657_d");

	/**
	 * <p>
	 * Name: COMMA_JOIN
	 * </p>
	 */
	public static McObfPair field_177667_a = McMappingDatabase.getSRG("field_177667_a");

	/**
	 * <p>
	 * Name: symbolMap
	 * </p>
	 */
	public static McObfPair field_177666_c = McMappingDatabase.getSRG("field_177666_c");

	/**
	 * <p>
	 * Name: depth
	 * </p>
	 */
	public static McObfPair field_177665_b = McMappingDatabase.getSRG("field_177665_b");

	/**
	 * <p>
	 * Name: where
	 * </p>
	 * <p>
	 * Desc: [(CLcom/google/common/base/Predicate;)Lnet/minecraft/block/state/pattern/FactoryBlockPattern;]
	 * </p>
	 */
	public static McObfPair func_177662_a = McMappingDatabase.getSRG("FactoryBlockPattern.func_177662_a");

	/**
	 * <p>
	 * Name: build
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/pattern/BlockPattern;]
	 * </p>
	 */
	public static McObfPair func_177661_b = McMappingDatabase.getSRG("FactoryBlockPattern.func_177661_b");

	/**
	 * <p>
	 * Name: aisleHeight
	 * </p>
	 */
	public static McObfPair field_177663_d = McMappingDatabase.getSRG("field_177663_d");

	/**
	 * <p>
	 * Name: start
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/pattern/FactoryBlockPattern;]
	 * </p>
	 */
	public static McObfPair func_177660_a = McMappingDatabase.getSRG("FactoryBlockPattern.func_177660_a");

	/**
	 * <p>
	 * Name: aisle
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;)Lnet/minecraft/block/state/pattern/FactoryBlockPattern;]
	 * </p>
	 */
	public static McObfPair func_177659_a = McMappingDatabase.getSRG("FactoryBlockPattern.func_177659_a");

}
