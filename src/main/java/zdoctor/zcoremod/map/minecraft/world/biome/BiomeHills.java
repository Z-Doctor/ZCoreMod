package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeHills {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anp";
		else
			return "net/minecraft/world/biome/BiomeHills";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anp";
		else
			return "BiomeHills";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanp;";
		else
			return "Lnet/minecraft/world/biome/BiomeHills;";
	}

	/**
	 * <p>
	 * Name: spruceGenerator
	 * </p>
	 */
	public static McObfPair field_150634_aD = McMappingDatabase.getSRG("field_150634_aD");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_150638_aH = McMappingDatabase.getSRG("field_150638_aH");

	/**
	 * <p>
	 * Name: getRandomTreeFeature
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;]
	 * </p>
	 */
	public static McObfPair func_150567_a = McMappingDatabase.getSRG("BiomeHills.func_150567_a");

	/**
	 * <p>
	 * Name: decorate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180624_a = McMappingDatabase.getSRG("BiomeHills.func_180624_a");

	/**
	 * <p>
	 * Name: genTerrainBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V]
	 * </p>
	 */
	public static McObfPair func_180622_a = McMappingDatabase.getSRG("BiomeHills.func_180622_a");

	/**
	 * <p>
	 * Name: silverfishSpawner
	 * </p>
	 */
	public static McObfPair field_82915_S = McMappingDatabase.getSRG("field_82915_S");

}
