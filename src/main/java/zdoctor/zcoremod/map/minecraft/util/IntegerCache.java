package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IntegerCache {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rf";
		else
			return "net/minecraft/util/IntegerCache";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rf";
		else
			return "IntegerCache";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrf;";
		else
			return "Lnet/minecraft/util/IntegerCache;";
	}

	/**
	 * <p>
	 * Name: CACHE
	 * </p>
	 */
	public static McObfPair field_181757_a = McMappingDatabase.getSRG("field_181757_a");

	/**
	 * <p>
	 * Name: getInteger
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/Integer;]
	 * </p>
	 */
	public static McObfPair func_181756_a = McMappingDatabase.getSRG("IntegerCache.func_181756_a");

}
