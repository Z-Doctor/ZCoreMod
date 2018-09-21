package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeTaiga {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aog";
		else
			return "net/minecraft/world/biome/BiomeTaiga";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aog";
		else
			return "BiomeTaiga";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laog;";
		else
			return "Lnet/minecraft/world/biome/BiomeTaiga;";
	}

	/**
	 * <p>
	 * Name: getRandomWorldGenForGrass
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenerator;]
	 * </p>
	 */
	public static McObfPair func_76730_b = McMappingDatabase.getSRG("BiomeTaiga.func_76730_b");

	/**
	 * <p>
	 * Name: getRandomTreeFeature
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;]
	 * </p>
	 */
	public static McObfPair func_150567_a = McMappingDatabase.getSRG("BiomeTaiga.func_150567_a");

	/**
	 * <p>
	 * Name: SPRUCE_GENERATOR
	 * </p>
	 */
	public static McObfPair field_150640_aD = McMappingDatabase.getSRG("field_150640_aD");

	/**
	 * <p>
	 * Name: MEGA_SPRUCE_GENERATOR
	 * </p>
	 */
	public static McObfPair field_150642_aF = McMappingDatabase.getSRG("field_150642_aF");

	/**
	 * <p>
	 * Name: genTerrainBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V]
	 * </p>
	 */
	public static McObfPair func_180622_a = McMappingDatabase.getSRG("BiomeTaiga.func_180622_a");

	/**
	 * <p>
	 * Name: FOREST_ROCK_GENERATOR
	 * </p>
	 */
	public static McObfPair field_150643_aG = McMappingDatabase.getSRG("field_150643_aG");

	/**
	 * <p>
	 * Name: decorate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180624_a = McMappingDatabase.getSRG("BiomeTaiga.func_180624_a");

	/**
	 * <p>
	 * Name: PINE_GENERATOR
	 * </p>
	 */
	public static McObfPair field_150639_aC = McMappingDatabase.getSRG("field_150639_aC");

	/**
	 * <p>
	 * Name: MEGA_PINE_GENERATOR
	 * </p>
	 */
	public static McObfPair field_150641_aE = McMappingDatabase.getSRG("field_150641_aE");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_150644_aH = McMappingDatabase.getSRG("field_150644_aH");

}
