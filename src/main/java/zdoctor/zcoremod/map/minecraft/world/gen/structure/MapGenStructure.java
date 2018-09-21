package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenStructure {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbu";
		else
			return "net/minecraft/world/gen/structure/MapGenStructure";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbu";
		else
			return "MapGenStructure";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbu;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenStructure;";
	}

	/**
	 * <p>
	 * Name: getStructureStart
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/gen/structure/StructureStart;]
	 * </p>
	 */
	public static McObfPair func_75049_b = McMappingDatabase.getSRG("MapGenStructure.func_75049_b");

	/**
	 * <p>
	 * Name: canSpawnStructureAtCoords
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_75047_a = McMappingDatabase.getSRG("MapGenStructure.func_75047_a");

	/**
	 * <p>
	 * Name: recursiveGenerate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V]
	 * </p>
	 */
	public static McObfPair func_180701_a = McMappingDatabase.getSRG("MapGenStructure.func_180701_a");

	/**
	 * <p>
	 * Name: findNearestStructurePosBySpacing
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_191069_a = McMappingDatabase.getSRG("MapGenStructure.func_191069_a");

	/**
	 * <p>
	 * Name: setStructureStart
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/world/gen/structure/StructureStart;)V]
	 * </p>
	 */
	public static McObfPair func_143026_a = McMappingDatabase.getSRG("MapGenStructure.func_143026_a");

	/**
	 * <p>
	 * Name: isPositionInStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175796_a = McMappingDatabase.getSRG("MapGenStructure.func_175796_a");

	/**
	 * <p>
	 * Name: initializeStructureData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_143027_a = McMappingDatabase.getSRG("MapGenStructure.func_143027_a");

	/**
	 * <p>
	 * Name: isInsideStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175795_b = McMappingDatabase.getSRG("MapGenStructure.func_175795_b");

	/**
	 * <p>
	 * Name: structureData
	 * </p>
	 */
	public static McObfPair field_143029_e = McMappingDatabase.getSRG("field_143029_e");

	/**
	 * <p>
	 * Name: structureMap
	 * </p>
	 */
	public static McObfPair field_75053_d = McMappingDatabase.getSRG("field_75053_d");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180706_b = McMappingDatabase.getSRG("MapGenStructure.func_180706_b");

	/**
	 * <p>
	 * Name: getStructureAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/gen/structure/StructureStart;]
	 * </p>
	 */
	public static McObfPair func_175797_c = McMappingDatabase.getSRG("MapGenStructure.func_175797_c");

	/**
	 * <p>
	 * Name: generateStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/ChunkPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175794_a = McMappingDatabase.getSRG("MapGenStructure.func_175794_a");

	/**
	 * <p>
	 * Name: getStructureName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_143025_a = McMappingDatabase.getSRG("MapGenStructure.func_143025_a");

}
