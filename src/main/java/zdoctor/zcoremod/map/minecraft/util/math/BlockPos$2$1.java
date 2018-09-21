package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPos$2$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "et$2$1";
		else
			return "net/minecraft/util/math/BlockPos$2$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "et$2$1";
		else
			return "BlockPos$2$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Let$2$1;";
		else
			return "Lnet/minecraft/util/math/BlockPos$2$1;";
	}

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 */
	public static McObfPair field_179314_b = McMappingDatabase.getSRG("field_179314_b");

}
