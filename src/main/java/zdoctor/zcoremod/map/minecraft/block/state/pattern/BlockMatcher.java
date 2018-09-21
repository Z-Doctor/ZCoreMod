package zdoctor.zcoremod.map.minecraft.block.state.pattern;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockMatcher {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axb";
		else
			return "net/minecraft/block/state/pattern/BlockMatcher";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axb";
		else
			return "BlockMatcher";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxb;";
		else
			return "Lnet/minecraft/block/state/pattern/BlockMatcher;";
	}

	/**
	 * <p>
	 * Name: forBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Lnet/minecraft/block/state/pattern/BlockMatcher;]
	 * </p>
	 */
	public static McObfPair func_177642_a = McMappingDatabase.getSRG("BlockMatcher.func_177642_a");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_177644_a = McMappingDatabase.getSRG("field_177644_a");

}
