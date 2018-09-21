package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeProviderSingle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anq";
		else
			return "net/minecraft/world/biome/BiomeProviderSingle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anq";
		else
			return "BiomeProviderSingle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanq;";
		else
			return "Lnet/minecraft/world/biome/BiomeProviderSingle;";
	}

	/**
	 * <p>
	 * Name: getBiomes
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/world/biome/Biome;IIIIZ)[Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_76931_a = McMappingDatabase.getSRG("BiomeProviderSingle.func_76931_a");

	/**
	 * <p>
	 * Name: isFixedBiome
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190944_c = McMappingDatabase.getSRG("BiomeProviderSingle.func_190944_c");

	/**
	 * <p>
	 * Name: getFixedBiome
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_190943_d = McMappingDatabase.getSRG("BiomeProviderSingle.func_190943_d");

	/**
	 * <p>
	 * Name: areBiomesViable
	 * </p>
	 * <p>
	 * Desc: [(IIILjava/util/List;)Z]
	 * </p>
	 */
	public static McObfPair func_76940_a = McMappingDatabase.getSRG("BiomeProviderSingle.func_76940_a");

	/**
	 * <p>
	 * Name: getBiomesForGeneration
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/world/biome/Biome;IIII)[Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_76937_a = McMappingDatabase.getSRG("BiomeProviderSingle.func_76937_a");

	/**
	 * <p>
	 * Name: findBiomePosition
	 * </p>
	 * <p>
	 * Desc: [(IIILjava/util/List;Ljava/util/Random;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180630_a = McMappingDatabase.getSRG("BiomeProviderSingle.func_180630_a");

	/**
	 * <p>
	 * Name: getBiome
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_180631_a = McMappingDatabase.getSRG("BiomeProviderSingle.func_180631_a");

	/**
	 * <p>
	 * Name: biome
	 * </p>
	 */
	public static McObfPair field_76947_d = McMappingDatabase.getSRG("field_76947_d");

	/**
	 * <p>
	 * Name: getBiomes
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/world/biome/Biome;IIII)[Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_76933_b = McMappingDatabase.getSRG("BiomeProviderSingle.func_76933_b");

}
