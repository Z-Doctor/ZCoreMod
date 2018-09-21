package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IntCache {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdo";
		else
			return "net/minecraft/world/gen/layer/IntCache";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdo";
		else
			return "IntCache";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbdo;";
		else
			return "Lnet/minecraft/world/gen/layer/IntCache;";
	}

	/**
	 * <p>
	 * Name: getCacheSizes
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_85144_b = McMappingDatabase.getSRG("IntCache.func_85144_b");

	/**
	 * <p>
	 * Name: intCacheSize
	 * </p>
	 */
	public static McObfPair field_76451_a = McMappingDatabase.getSRG("field_76451_a");

	/**
	 * <p>
	 * Name: freeSmallArrays
	 * </p>
	 */
	public static McObfPair field_76449_b = McMappingDatabase.getSRG("field_76449_b");

	/**
	 * <p>
	 * Name: inUseLargeArrays
	 * </p>
	 */
	public static McObfPair field_76448_e = McMappingDatabase.getSRG("field_76448_e");

	/**
	 * <p>
	 * Name: getIntCache
	 * </p>
	 * <p>
	 * Desc: [(I)[I]
	 * </p>
	 */
	public static McObfPair func_76445_a = McMappingDatabase.getSRG("IntCache.func_76445_a");

	/**
	 * <p>
	 * Name: freeLargeArrays
	 * </p>
	 */
	public static McObfPair field_76447_d = McMappingDatabase.getSRG("field_76447_d");

	/**
	 * <p>
	 * Name: inUseSmallArrays
	 * </p>
	 */
	public static McObfPair field_76450_c = McMappingDatabase.getSRG("field_76450_c");

	/**
	 * <p>
	 * Name: resetIntCache
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76446_a = McMappingDatabase.getSRG("IntCache.func_76446_a");

}
