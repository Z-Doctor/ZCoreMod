package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkGeneratorDebug {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayy";
		else
			return "net/minecraft/world/gen/ChunkGeneratorDebug";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayy";
		else
			return "ChunkGeneratorDebug";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layy;";
		else
			return "Lnet/minecraft/world/gen/ChunkGeneratorDebug;";
	}

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180513_a = McMappingDatabase.getSRG("ChunkGeneratorDebug.func_180513_a");

	/**
	 * <p>
	 * Name: AIR
	 * </p>
	 */
	public static McObfPair field_185934_a = McMappingDatabase.getSRG("field_185934_a");

	/**
	 * <p>
	 * Name: getPossibleCreatures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EnumCreatureType;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177458_a = McMappingDatabase.getSRG("ChunkGeneratorDebug.func_177458_a");

	/**
	 * <p>
	 * Name: ALL_VALID_STATES
	 * </p>
	 */
	public static McObfPair field_177464_a = McMappingDatabase.getSRG("field_177464_a");

	/**
	 * <p>
	 * Name: GRID_WIDTH
	 * </p>
	 */
	public static McObfPair field_177462_b = McMappingDatabase.getSRG("field_177462_b");

	/**
	 * <p>
	 * Name: generateChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_185932_a = McMappingDatabase.getSRG("ChunkGeneratorDebug.func_185932_a");

	/**
	 * <p>
	 * Name: recreateStructures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;II)V]
	 * </p>
	 */
	public static McObfPair func_180514_a = McMappingDatabase.getSRG("ChunkGeneratorDebug.func_180514_a");

	/**
	 * <p>
	 * Name: generateStructures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;II)Z]
	 * </p>
	 */
	public static McObfPair func_185933_a = McMappingDatabase.getSRG("ChunkGeneratorDebug.func_185933_a");

	/**
	 * <p>
	 * Name: isInsideStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_193414_a = McMappingDatabase.getSRG("ChunkGeneratorDebug.func_193414_a");

	/**
	 * <p>
	 * Name: getBlockStateFor
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_177461_b = McMappingDatabase.getSRG("ChunkGeneratorDebug.func_177461_b");

	/**
	 * <p>
	 * Name: GRID_HEIGHT
	 * </p>
	 */
	public static McObfPair field_181039_c = McMappingDatabase.getSRG("field_181039_c");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_177463_c = McMappingDatabase.getSRG("field_177463_c");

	/**
	 * <p>
	 * Name: populate
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_185931_b = McMappingDatabase.getSRG("ChunkGeneratorDebug.func_185931_b");

	/**
	 * <p>
	 * Name: BARRIER
	 * </p>
	 */
	public static McObfPair field_185935_b = McMappingDatabase.getSRG("field_185935_b");

}
