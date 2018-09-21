package zdoctor.zcoremod.map.minecraft.block.state.pattern;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStateMatcher {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axc";
		else
			return "net/minecraft/block/state/pattern/BlockStateMatcher";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axc";
		else
			return "BlockStateMatcher";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxc;";
		else
			return "Lnet/minecraft/block/state/pattern/BlockStateMatcher;";
	}

	/**
	 * <p>
	 * Name: blockstate
	 * </p>
	 */
	public static McObfPair field_177641_a = McMappingDatabase.getSRG("field_177641_a");

	/**
	 * <p>
	 * Name: ANY
	 * </p>
	 */
	public static McObfPair field_185928_a = McMappingDatabase.getSRG("field_185928_a");

	/**
	 * <p>
	 * Name: where
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;Lcom/google/common/base/Predicate;)Lnet/minecraft/block/state/pattern/BlockStateMatcher;]
	 * </p>
	 */
	public static McObfPair func_177637_a = McMappingDatabase.getSRG("BlockStateMatcher.func_177637_a");

	/**
	 * <p>
	 * Name: propertyPredicates
	 * </p>
	 */
	public static McObfPair field_177640_b = McMappingDatabase.getSRG("field_177640_b");

	/**
	 * <p>
	 * Name: forBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Lnet/minecraft/block/state/pattern/BlockStateMatcher;]
	 * </p>
	 */
	public static McObfPair func_177638_a = McMappingDatabase.getSRG("BlockStateMatcher.func_177638_a");

	/**
	 * <p>
	 * Name: matches
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/properties/IProperty;Lcom/google/common/base/Predicate;)Z]
	 * </p>
	 */
	public static McObfPair func_185927_a = McMappingDatabase.getSRG("BlockStateMatcher.func_185927_a");

}
