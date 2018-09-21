package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapPopulator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fg";
		else
			return "net/minecraft/util/MapPopulator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fg";
		else
			return "MapPopulator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfg;";
		else
			return "Lnet/minecraft/util/MapPopulator;";
	}

	/**
	 * <p>
	 * Name: populateMap
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Iterable;Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_179399_a = McMappingDatabase.getSRG("MapPopulator.func_179399_a");

	/**
	 * <p>
	 * Name: createMap
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_179400_b = McMappingDatabase.getSRG("MapPopulator.func_179400_b");

}
