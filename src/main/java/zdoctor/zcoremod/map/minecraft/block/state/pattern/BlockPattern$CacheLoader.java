package zdoctor.zcoremod.map.minecraft.block.state.pattern;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPattern$CacheLoader {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awx$a";
		else
			return "net/minecraft/block/state/pattern/BlockPattern$CacheLoader";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awx$a";
		else
			return "BlockPattern$CacheLoader";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawx$a;";
		else
			return "Lnet/minecraft/block/state/pattern/BlockPattern$CacheLoader;";
	}

	/**
	 * <p>
	 * Name: forceLoad
	 * </p>
	 */
	public static McObfPair field_181626_b = McMappingDatabase.getSRG("field_181626_b");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_177680_a = McMappingDatabase.getSRG("field_177680_a");

}
