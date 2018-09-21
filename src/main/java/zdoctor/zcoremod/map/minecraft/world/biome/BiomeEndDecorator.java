package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeEndDecorator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoi";
		else
			return "net/minecraft/world/biome/BiomeEndDecorator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoi";
		else
			return "BiomeEndDecorator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laoi;";
		else
			return "Lnet/minecraft/world/biome/BiomeEndDecorator;";
	}

	/**
	 * <p>
	 * Name: genDecorations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_150513_a = McMappingDatabase.getSRG("BiomeEndDecorator.func_150513_a");

	/**
	 * <p>
	 * Name: spikeGen
	 * </p>
	 */
	public static McObfPair field_76835_L = McMappingDatabase.getSRG("field_76835_L");

	/**
	 * <p>
	 * Name: getSpikesForWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)[Lnet/minecraft/world/gen/feature/WorldGenSpikes$EndSpike;]
	 * </p>
	 */
	public static McObfPair func_185426_a = McMappingDatabase.getSRG("BiomeEndDecorator.func_185426_a");

	/**
	 * <p>
	 * Name: SPIKE_CACHE
	 * </p>
	 */
	public static McObfPair field_185427_L = McMappingDatabase.getSRG("field_185427_L");

}
