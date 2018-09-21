package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeCache {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ani";
		else
			return "net/minecraft/world/biome/BiomeCache";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ani";
		else
			return "BiomeCache";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lani;";
		else
			return "Lnet/minecraft/world/biome/BiomeCache;";
	}

	/**
	 * <p>
	 * Name: getBiome
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/world/biome/Biome;)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_180284_a = McMappingDatabase.getSRG("BiomeCache.func_180284_a");

	/**
	 * <p>
	 * Name: lastCleanupTime
	 * </p>
	 */
	public static McObfPair field_76842_b = McMappingDatabase.getSRG("field_76842_b");

	/**
	 * <p>
	 * Name: cacheMap
	 * </p>
	 */
	public static McObfPair field_76843_c = McMappingDatabase.getSRG("field_76843_c");

	/**
	 * <p>
	 * Name: getEntry
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/biome/BiomeCache$Block;]
	 * </p>
	 */
	public static McObfPair func_76840_a = McMappingDatabase.getSRG("BiomeCache.func_76840_a");

	/**
	 * <p>
	 * Name: cache
	 * </p>
	 */
	public static McObfPair field_76841_d = McMappingDatabase.getSRG("field_76841_d");

	/**
	 * <p>
	 * Name: getCachedBiomes
	 * </p>
	 * <p>
	 * Desc: [(II)[Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_76839_e = McMappingDatabase.getSRG("BiomeCache.func_76839_e");

	/**
	 * <p>
	 * Name: provider
	 * </p>
	 */
	public static McObfPair field_76844_a = McMappingDatabase.getSRG("field_76844_a");

	/**
	 * <p>
	 * Name: cleanupCache
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76838_a = McMappingDatabase.getSRG("BiomeCache.func_76838_a");

}
