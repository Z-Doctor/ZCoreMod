package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkGeneratorOverworld {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aze";
		else
			return "net/minecraft/world/gen/ChunkGeneratorOverworld";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aze";
		else
			return "ChunkGeneratorOverworld";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laze;";
		else
			return "Lnet/minecraft/world/gen/ChunkGeneratorOverworld;";
	}

	/**
	 * <p>
	 * Name: depthNoise
	 * </p>
	 */
	public static McObfPair field_185984_c = McMappingDatabase.getSRG("field_185984_c");

	/**
	 * <p>
	 * Name: mainPerlinNoise
	 * </p>
	 */
	public static McObfPair field_185993_l = McMappingDatabase.getSRG("field_185993_l");

	/**
	 * <p>
	 * Name: woodlandMansionGenerator
	 * </p>
	 */
	public static McObfPair field_191060_C = McMappingDatabase.getSRG("field_191060_C");

	/**
	 * <p>
	 * Name: scatteredFeatureGenerator
	 * </p>
	 */
	public static McObfPair field_186007_z = McMappingDatabase.getSRG("field_186007_z");

	/**
	 * <p>
	 * Name: caveGenerator
	 * </p>
	 */
	public static McObfPair field_186003_v = McMappingDatabase.getSRG("field_186003_v");

	/**
	 * <p>
	 * Name: mineshaftGenerator
	 * </p>
	 */
	public static McObfPair field_186006_y = McMappingDatabase.getSRG("field_186006_y");

	/**
	 * <p>
	 * Name: mapFeaturesEnabled
	 * </p>
	 */
	public static McObfPair field_185996_o = McMappingDatabase.getSRG("field_185996_o");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_185995_n = McMappingDatabase.getSRG("field_185995_n");

	/**
	 * <p>
	 * Name: biomesForGeneration
	 * </p>
	 */
	public static McObfPair field_185981_C = McMappingDatabase.getSRG("field_185981_C");

	/**
	 * <p>
	 * Name: biomeWeights
	 * </p>
	 */
	public static McObfPair field_185999_r = McMappingDatabase.getSRG("field_185999_r");

	/**
	 * <p>
	 * Name: maxLimitRegion
	 * </p>
	 */
	public static McObfPair field_185988_g = McMappingDatabase.getSRG("field_185988_g");

	/**
	 * <p>
	 * Name: strongholdGenerator
	 * </p>
	 */
	public static McObfPair field_186004_w = McMappingDatabase.getSRG("field_186004_w");

	/**
	 * <p>
	 * Name: heightMap
	 * </p>
	 */
	public static McObfPair field_185998_q = McMappingDatabase.getSRG("field_185998_q");

	/**
	 * <p>
	 * Name: populate
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_185931_b = McMappingDatabase.getSRG("ChunkGeneratorOverworld.func_185931_b");

	/**
	 * <p>
	 * Name: isInsideStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_193414_a = McMappingDatabase.getSRG("ChunkGeneratorOverworld.func_193414_a");

	/**
	 * <p>
	 * Name: mainNoiseRegion
	 * </p>
	 */
	public static McObfPair field_185986_e = McMappingDatabase.getSRG("field_185986_e");

	/**
	 * <p>
	 * Name: replaceBiomeBlocks
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/world/chunk/ChunkPrimer;[Lnet/minecraft/world/biome/Biome;)V]
	 * </p>
	 */
	public static McObfPair func_185977_a = McMappingDatabase.getSRG("ChunkGeneratorOverworld.func_185977_a");

	/**
	 * <p>
	 * Name: minLimitRegion
	 * </p>
	 */
	public static McObfPair field_185987_f = McMappingDatabase.getSRG("field_185987_f");

	/**
	 * <p>
	 * Name: scaleNoise
	 * </p>
	 */
	public static McObfPair field_185983_b = McMappingDatabase.getSRG("field_185983_b");

	/**
	 * <p>
	 * Name: ravineGenerator
	 * </p>
	 */
	public static McObfPair field_185979_A = McMappingDatabase.getSRG("field_185979_A");

	/**
	 * <p>
	 * Name: minLimitPerlinNoise
	 * </p>
	 */
	public static McObfPair field_185991_j = McMappingDatabase.getSRG("field_185991_j");

	/**
	 * <p>
	 * Name: depthBuffer
	 * </p>
	 */
	public static McObfPair field_186002_u = McMappingDatabase.getSRG("field_186002_u");

	/**
	 * <p>
	 * Name: depthRegion
	 * </p>
	 */
	public static McObfPair field_185989_h = McMappingDatabase.getSRG("field_185989_h");

	/**
	 * <p>
	 * Name: maxLimitPerlinNoise
	 * </p>
	 */
	public static McObfPair field_185992_k = McMappingDatabase.getSRG("field_185992_k");

	/**
	 * <p>
	 * Name: generateHeightmap
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_185978_a = McMappingDatabase.getSRG("ChunkGeneratorOverworld.func_185978_a");

	/**
	 * <p>
	 * Name: recreateStructures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;II)V]
	 * </p>
	 */
	public static McObfPair func_180514_a = McMappingDatabase.getSRG("ChunkGeneratorOverworld.func_180514_a");

	/**
	 * <p>
	 * Name: oceanMonumentGenerator
	 * </p>
	 */
	public static McObfPair field_185980_B = McMappingDatabase.getSRG("field_185980_B");

	/**
	 * <p>
	 * Name: STONE
	 * </p>
	 */
	public static McObfPair field_185982_a = McMappingDatabase.getSRG("field_185982_a");

	/**
	 * <p>
	 * Name: oceanBlock
	 * </p>
	 */
	public static McObfPair field_186001_t = McMappingDatabase.getSRG("field_186001_t");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_185990_i = McMappingDatabase.getSRG("field_185990_i");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180513_a = McMappingDatabase.getSRG("ChunkGeneratorOverworld.func_180513_a");

	/**
	 * <p>
	 * Name: setBlocksInChunk
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/world/chunk/ChunkPrimer;)V]
	 * </p>
	 */
	public static McObfPair func_185976_a = McMappingDatabase.getSRG("ChunkGeneratorOverworld.func_185976_a");

	/**
	 * <p>
	 * Name: generateStructures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;II)Z]
	 * </p>
	 */
	public static McObfPair func_185933_a = McMappingDatabase.getSRG("ChunkGeneratorOverworld.func_185933_a");

	/**
	 * <p>
	 * Name: settings
	 * </p>
	 */
	public static McObfPair field_186000_s = McMappingDatabase.getSRG("field_186000_s");

	/**
	 * <p>
	 * Name: getPossibleCreatures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EnumCreatureType;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177458_a = McMappingDatabase.getSRG("ChunkGeneratorOverworld.func_177458_a");

	/**
	 * <p>
	 * Name: terrainType
	 * </p>
	 */
	public static McObfPair field_185997_p = McMappingDatabase.getSRG("field_185997_p");

	/**
	 * <p>
	 * Name: surfaceNoise
	 * </p>
	 */
	public static McObfPair field_185994_m = McMappingDatabase.getSRG("field_185994_m");

	/**
	 * <p>
	 * Name: generateChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_185932_a = McMappingDatabase.getSRG("ChunkGeneratorOverworld.func_185932_a");

	/**
	 * <p>
	 * Name: villageGenerator
	 * </p>
	 */
	public static McObfPair field_186005_x = McMappingDatabase.getSRG("field_186005_x");

	/**
	 * <p>
	 * Name: forestNoise
	 * </p>
	 */
	public static McObfPair field_185985_d = McMappingDatabase.getSRG("field_185985_d");

}
