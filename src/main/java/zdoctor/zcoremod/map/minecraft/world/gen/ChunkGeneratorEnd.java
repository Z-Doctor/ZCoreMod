package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkGeneratorEnd {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azf";
		else
			return "net/minecraft/world/gen/ChunkGeneratorEnd";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azf";
		else
			return "ChunkGeneratorEnd";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazf;";
		else
			return "Lnet/minecraft/world/gen/ChunkGeneratorEnd;";
	}

	/**
	 * <p>
	 * Name: endCityGen
	 * </p>
	 */
	public static McObfPair field_185972_n = McMappingDatabase.getSRG("field_185972_n");

	/**
	 * <p>
	 * Name: br
	 * </p>
	 */
	public static McObfPair field_185968_g = McMappingDatabase.getSRG("field_185968_g");

	/**
	 * <p>
	 * Name: getHeights
	 * </p>
	 * <p>
	 * Desc: [([DIIIIII)[D]
	 * </p>
	 */
	public static McObfPair func_185963_a = McMappingDatabase.getSRG("ChunkGeneratorEnd.func_185963_a");

	/**
	 * <p>
	 * Name: perlinNoise1
	 * </p>
	 */
	public static McObfPair field_185971_k = McMappingDatabase.getSRG("field_185971_k");

	/**
	 * <p>
	 * Name: generateStructures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;II)Z]
	 * </p>
	 */
	public static McObfPair func_185933_a = McMappingDatabase.getSRG("ChunkGeneratorEnd.func_185933_a");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180513_a = McMappingDatabase.getSRG("ChunkGeneratorEnd.func_180513_a");

	/**
	 * <p>
	 * Name: getPossibleCreatures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EnumCreatureType;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177458_a = McMappingDatabase.getSRG("ChunkGeneratorEnd.func_177458_a");

	/**
	 * <p>
	 * Name: noiseGen5
	 * </p>
	 */
	public static McObfPair field_73214_a = McMappingDatabase.getSRG("field_73214_a");

	/**
	 * <p>
	 * Name: lperlinNoise2
	 * </p>
	 */
	public static McObfPair field_185970_j = McMappingDatabase.getSRG("field_185970_j");

	/**
	 * <p>
	 * Name: isInsideStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_193414_a = McMappingDatabase.getSRG("ChunkGeneratorEnd.func_193414_a");

	/**
	 * <p>
	 * Name: AIR
	 * </p>
	 */
	public static McObfPair field_185965_b = McMappingDatabase.getSRG("field_185965_b");

	/**
	 * <p>
	 * Name: biomesForGeneration
	 * </p>
	 */
	public static McObfPair field_73231_z = McMappingDatabase.getSRG("field_73231_z");

	/**
	 * <p>
	 * Name: buildSurfaces
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/ChunkPrimer;)V]
	 * </p>
	 */
	public static McObfPair func_185962_a = McMappingDatabase.getSRG("ChunkGeneratorEnd.func_185962_a");

	/**
	 * <p>
	 * Name: recreateStructures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;II)V]
	 * </p>
	 */
	public static McObfPair func_180514_a = McMappingDatabase.getSRG("ChunkGeneratorEnd.func_180514_a");

	/**
	 * <p>
	 * Name: mapFeaturesEnabled
	 * </p>
	 */
	public static McObfPair field_73229_q = McMappingDatabase.getSRG("field_73229_q");

	/**
	 * <p>
	 * Name: generateChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_185932_a = McMappingDatabase.getSRG("ChunkGeneratorEnd.func_185932_a");

	/**
	 * <p>
	 * Name: noiseGen6
	 * </p>
	 */
	public static McObfPair field_73212_b = McMappingDatabase.getSRG("field_73212_b");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_73230_p = McMappingDatabase.getSRG("field_73230_p");

	/**
	 * <p>
	 * Name: END_STONE
	 * </p>
	 */
	public static McObfPair field_185964_a = McMappingDatabase.getSRG("field_185964_a");

	/**
	 * <p>
	 * Name: getIslandHeightValue
	 * </p>
	 * <p>
	 * Desc: [(IIII)F]
	 * </p>
	 */
	public static McObfPair func_185960_a = McMappingDatabase.getSRG("ChunkGeneratorEnd.func_185960_a");

	/**
	 * <p>
	 * Name: lperlinNoise1
	 * </p>
	 */
	public static McObfPair field_185969_i = McMappingDatabase.getSRG("field_185969_i");

	/**
	 * <p>
	 * Name: populate
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_185931_b = McMappingDatabase.getSRG("ChunkGeneratorEnd.func_185931_b");

	/**
	 * <p>
	 * Name: isIslandChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_185961_c = McMappingDatabase.getSRG("ChunkGeneratorEnd.func_185961_c");

	/**
	 * <p>
	 * Name: ar
	 * </p>
	 */
	public static McObfPair field_185967_f = McMappingDatabase.getSRG("field_185967_f");

	/**
	 * <p>
	 * Name: pnr
	 * </p>
	 */
	public static McObfPair field_185966_e = McMappingDatabase.getSRG("field_185966_e");

	/**
	 * <p>
	 * Name: buffer
	 * </p>
	 */
	public static McObfPair field_185974_p = McMappingDatabase.getSRG("field_185974_p");

	/**
	 * <p>
	 * Name: islandNoise
	 * </p>
	 */
	public static McObfPair field_185973_o = McMappingDatabase.getSRG("field_185973_o");

	/**
	 * <p>
	 * Name: setBlocksInChunk
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/world/chunk/ChunkPrimer;)V]
	 * </p>
	 */
	public static McObfPair func_180518_a = McMappingDatabase.getSRG("ChunkGeneratorEnd.func_180518_a");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_73220_k = McMappingDatabase.getSRG("field_73220_k");

	/**
	 * <p>
	 * Name: endIslands
	 * </p>
	 */
	public static McObfPair field_185975_r = McMappingDatabase.getSRG("field_185975_r");

	/**
	 * <p>
	 * Name: spawnPoint
	 * </p>
	 */
	public static McObfPair field_191061_n = McMappingDatabase.getSRG("field_191061_n");

}
