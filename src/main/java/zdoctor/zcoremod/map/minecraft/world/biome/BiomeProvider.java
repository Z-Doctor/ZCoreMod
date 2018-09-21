package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeProvider {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anl";
		else
			return "net/minecraft/world/biome/BiomeProvider";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anl";
		else
			return "BiomeProvider";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanl;";
		else
			return "Lnet/minecraft/world/biome/BiomeProvider;";
	}

	/**
	 * <p>
	 * Name: findBiomePosition
	 * </p>
	 * <p>
	 * Desc: [(IIILjava/util/List;Ljava/util/Random;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180630_a = McMappingDatabase.getSRG("BiomeProvider.func_180630_a");

	/**
	 * <p>
	 * Name: settings
	 * </p>
	 */
	public static McObfPair field_190945_a = McMappingDatabase.getSRG("field_190945_a");

	/**
	 * <p>
	 * Name: getTemperatureAtHeight
	 * </p>
	 * <p>
	 * Desc: [(FI)F]
	 * </p>
	 */
	public static McObfPair func_76939_a = McMappingDatabase.getSRG("BiomeProvider.func_76939_a");

	/**
	 * <p>
	 * Name: getBiomesToSpawnIn
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_76932_a = McMappingDatabase.getSRG("BiomeProvider.func_76932_a");

	/**
	 * <p>
	 * Name: getBiomes
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/world/biome/Biome;IIII)[Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_76933_b = McMappingDatabase.getSRG("BiomeProvider.func_76933_b");

	/**
	 * <p>
	 * Name: areBiomesViable
	 * </p>
	 * <p>
	 * Desc: [(IIILjava/util/List;)Z]
	 * </p>
	 */
	public static McObfPair func_76940_a = McMappingDatabase.getSRG("BiomeProvider.func_76940_a");

	/**
	 * <p>
	 * Name: getBiome
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/biome/Biome;)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_180300_a = McMappingDatabase.getSRG("BiomeProvider.func_180300_a");

	/**
	 * <p>
	 * Name: getBiome
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_180631_a = McMappingDatabase.getSRG("BiomeProvider.func_180631_a");

	/**
	 * <p>
	 * Name: biomeCache
	 * </p>
	 */
	public static McObfPair field_76942_f = McMappingDatabase.getSRG("field_76942_f");

	/**
	 * <p>
	 * Name: getFixedBiome
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_190943_d = McMappingDatabase.getSRG("BiomeProvider.func_190943_d");

	/**
	 * <p>
	 * Name: cleanupCache
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76938_b = McMappingDatabase.getSRG("BiomeProvider.func_76938_b");

	/**
	 * <p>
	 * Name: getBiomesForGeneration
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/world/biome/Biome;IIII)[Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_76937_a = McMappingDatabase.getSRG("BiomeProvider.func_76937_a");

	/**
	 * <p>
	 * Name: biomesToSpawnIn
	 * </p>
	 */
	public static McObfPair field_76943_g = McMappingDatabase.getSRG("field_76943_g");

	/**
	 * <p>
	 * Name: getBiomes
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/world/biome/Biome;IIIIZ)[Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_76931_a = McMappingDatabase.getSRG("BiomeProvider.func_76931_a");

	/**
	 * <p>
	 * Name: biomeIndexLayer
	 * </p>
	 */
	public static McObfPair field_76945_e = McMappingDatabase.getSRG("field_76945_e");

	/**
	 * <p>
	 * Name: genBiomes
	 * </p>
	 */
	public static McObfPair field_76944_d = McMappingDatabase.getSRG("field_76944_d");

	/**
	 * <p>
	 * Name: isFixedBiome
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190944_c = McMappingDatabase.getSRG("BiomeProvider.func_190944_c");

}
