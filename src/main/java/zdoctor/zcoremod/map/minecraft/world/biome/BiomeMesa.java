package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeMesa {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anw";
		else
			return "net/minecraft/world/biome/BiomeMesa";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anw";
		else
			return "BiomeMesa";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanw;";
		else
			return "Lnet/minecraft/world/biome/BiomeMesa;";
	}

	/**
	 * <p>
	 * Name: getRandomTreeFeature
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;]
	 * </p>
	 */
	public static McObfPair func_150567_a = McMappingDatabase.getSRG("BiomeMesa.func_150567_a");

	/**
	 * <p>
	 * Name: clayBandsOffsetNoise
	 * </p>
	 */
	public static McObfPair field_150625_aG = McMappingDatabase.getSRG("field_150625_aG");

	/**
	 * <p>
	 * Name: COARSE_DIRT
	 * </p>
	 */
	public static McObfPair field_185385_y = McMappingDatabase.getSRG("field_185385_y");

	/**
	 * <p>
	 * Name: getBand
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180629_a = McMappingDatabase.getSRG("BiomeMesa.func_180629_a");

	/**
	 * <p>
	 * Name: generateBands
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_150619_a = McMappingDatabase.getSRG("BiomeMesa.func_150619_a");

	/**
	 * <p>
	 * Name: ORANGE_STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_185383_C = McMappingDatabase.getSRG("field_185383_C");

	/**
	 * <p>
	 * Name: STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_185382_B = McMappingDatabase.getSRG("field_185382_B");

	/**
	 * <p>
	 * Name: HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_185381_A = McMappingDatabase.getSRG("field_185381_A");

	/**
	 * <p>
	 * Name: GRASS
	 * </p>
	 */
	public static McObfPair field_185386_z = McMappingDatabase.getSRG("field_185386_z");

	/**
	 * <p>
	 * Name: clayBands
	 * </p>
	 */
	public static McObfPair field_150621_aC = McMappingDatabase.getSRG("field_150621_aC");

	/**
	 * <p>
	 * Name: RED_SAND
	 * </p>
	 */
	public static McObfPair field_185384_D = McMappingDatabase.getSRG("field_185384_D");

	/**
	 * <p>
	 * Name: getGrassColorAtPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180627_b = McMappingDatabase.getSRG("BiomeMesa.func_180627_b");

	/**
	 * <p>
	 * Name: pillarNoise
	 * </p>
	 */
	public static McObfPair field_150623_aE = McMappingDatabase.getSRG("field_150623_aE");

	/**
	 * <p>
	 * Name: hasForest
	 * </p>
	 */
	public static McObfPair field_150620_aI = McMappingDatabase.getSRG("field_150620_aI");

	/**
	 * <p>
	 * Name: genTerrainBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V]
	 * </p>
	 */
	public static McObfPair func_180622_a = McMappingDatabase.getSRG("BiomeMesa.func_180622_a");

	/**
	 * <p>
	 * Name: getFoliageColorAtPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180625_c = McMappingDatabase.getSRG("BiomeMesa.func_180625_c");

	/**
	 * <p>
	 * Name: createBiomeDecorator
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/biome/BiomeDecorator;]
	 * </p>
	 */
	public static McObfPair func_76729_a = McMappingDatabase.getSRG("BiomeMesa.func_76729_a");

	/**
	 * <p>
	 * Name: brycePillars
	 * </p>
	 */
	public static McObfPair field_150626_aH = McMappingDatabase.getSRG("field_150626_aH");

	/**
	 * <p>
	 * Name: pillarRoofNoise
	 * </p>
	 */
	public static McObfPair field_150624_aF = McMappingDatabase.getSRG("field_150624_aF");

	/**
	 * <p>
	 * Name: worldSeed
	 * </p>
	 */
	public static McObfPair field_150622_aD = McMappingDatabase.getSRG("field_150622_aD");

}
