package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkGeneratorFlat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayz";
		else
			return "net/minecraft/world/gen/ChunkGeneratorFlat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayz";
		else
			return "ChunkGeneratorFlat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layz;";
		else
			return "Lnet/minecraft/world/gen/ChunkGeneratorFlat;";
	}

	/**
	 * <p>
	 * Name: getPossibleCreatures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EnumCreatureType;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177458_a = McMappingDatabase.getSRG("ChunkGeneratorFlat.func_177458_a");

	/**
	 * <p>
	 * Name: structureGenerators
	 * </p>
	 */
	public static McObfPair field_82696_f = McMappingDatabase.getSRG("field_82696_f");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_73163_a = McMappingDatabase.getSRG("field_73163_a");

	/**
	 * <p>
	 * Name: isInsideStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_193414_a = McMappingDatabase.getSRG("ChunkGeneratorFlat.func_193414_a");

	/**
	 * <p>
	 * Name: waterLakeGenerator
	 * </p>
	 */
	public static McObfPair field_82703_i = McMappingDatabase.getSRG("field_82703_i");

	/**
	 * <p>
	 * Name: lavaLakeGenerator
	 * </p>
	 */
	public static McObfPair field_82701_j = McMappingDatabase.getSRG("field_82701_j");

	/**
	 * <p>
	 * Name: hasDecoration
	 * </p>
	 */
	public static McObfPair field_82697_g = McMappingDatabase.getSRG("field_82697_g");

	/**
	 * <p>
	 * Name: cachedBlockIDs
	 * </p>
	 */
	public static McObfPair field_82700_c = McMappingDatabase.getSRG("field_82700_c");

	/**
	 * <p>
	 * Name: recreateStructures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;II)V]
	 * </p>
	 */
	public static McObfPair func_180514_a = McMappingDatabase.getSRG("ChunkGeneratorFlat.func_180514_a");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180513_a = McMappingDatabase.getSRG("ChunkGeneratorFlat.func_180513_a");

	/**
	 * <p>
	 * Name: random
	 * </p>
	 */
	public static McObfPair field_73161_b = McMappingDatabase.getSRG("field_73161_b");

	/**
	 * <p>
	 * Name: flatWorldGenInfo
	 * </p>
	 */
	public static McObfPair field_82699_e = McMappingDatabase.getSRG("field_82699_e");

	/**
	 * <p>
	 * Name: generateChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_185932_a = McMappingDatabase.getSRG("ChunkGeneratorFlat.func_185932_a");

	/**
	 * <p>
	 * Name: populate
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_185931_b = McMappingDatabase.getSRG("ChunkGeneratorFlat.func_185931_b");

	/**
	 * <p>
	 * Name: hasDungeons
	 * </p>
	 */
	public static McObfPair field_82702_h = McMappingDatabase.getSRG("field_82702_h");

	/**
	 * <p>
	 * Name: generateStructures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;II)Z]
	 * </p>
	 */
	public static McObfPair func_185933_a = McMappingDatabase.getSRG("ChunkGeneratorFlat.func_185933_a");

}
