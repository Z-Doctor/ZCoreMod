package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeSwamp {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aof";
		else
			return "net/minecraft/world/biome/BiomeSwamp";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aof";
		else
			return "BiomeSwamp";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laof;";
		else
			return "Lnet/minecraft/world/biome/BiomeSwamp;";
	}

	/**
	 * <p>
	 * Name: genTerrainBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V]
	 * </p>
	 */
	public static McObfPair func_180622_a = McMappingDatabase.getSRG("BiomeSwamp.func_180622_a");

	/**
	 * <p>
	 * Name: getGrassColorAtPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180627_b = McMappingDatabase.getSRG("BiomeSwamp.func_180627_b");

	/**
	 * <p>
	 * Name: getRandomTreeFeature
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;]
	 * </p>
	 */
	public static McObfPair func_150567_a = McMappingDatabase.getSRG("BiomeSwamp.func_150567_a");

	/**
	 * <p>
	 * Name: pickRandomFlower
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockFlower$EnumFlowerType;]
	 * </p>
	 */
	public static McObfPair func_180623_a = McMappingDatabase.getSRG("BiomeSwamp.func_180623_a");

	/**
	 * <p>
	 * Name: getFoliageColorAtPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180625_c = McMappingDatabase.getSRG("BiomeSwamp.func_180625_c");

	/**
	 * <p>
	 * Name: WATER_LILY
	 * </p>
	 */
	public static McObfPair field_185387_y = McMappingDatabase.getSRG("field_185387_y");

	/**
	 * <p>
	 * Name: decorate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180624_a = McMappingDatabase.getSRG("BiomeSwamp.func_180624_a");

}
