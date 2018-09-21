package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeForest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anr";
		else
			return "net/minecraft/world/biome/BiomeForest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anr";
		else
			return "BiomeForest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanr;";
		else
			return "Lnet/minecraft/world/biome/BiomeForest;";
	}

	/**
	 * <p>
	 * Name: getBiomeClass
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_150562_l = McMappingDatabase.getSRG("BiomeForest.func_150562_l");

	/**
	 * <p>
	 * Name: pickRandomFlower
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockFlower$EnumFlowerType;]
	 * </p>
	 */
	public static McObfPair func_180623_a = McMappingDatabase.getSRG("BiomeForest.func_180623_a");

	/**
	 * <p>
	 * Name: ROOF_TREE
	 * </p>
	 */
	public static McObfPair field_150631_aE = McMappingDatabase.getSRG("field_150631_aE");

	/**
	 * <p>
	 * Name: BIRCH_TREE
	 * </p>
	 */
	public static McObfPair field_150630_aD = McMappingDatabase.getSRG("field_150630_aD");

	/**
	 * <p>
	 * Name: decorate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180624_a = McMappingDatabase.getSRG("BiomeForest.func_180624_a");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_150632_aF = McMappingDatabase.getSRG("field_150632_aF");

	/**
	 * <p>
	 * Name: addMushrooms
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185379_b = McMappingDatabase.getSRG("BiomeForest.func_185379_b");

	/**
	 * <p>
	 * Name: getGrassColorAtPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180627_b = McMappingDatabase.getSRG("BiomeForest.func_180627_b");

	/**
	 * <p>
	 * Name: getRandomTreeFeature
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;]
	 * </p>
	 */
	public static McObfPair func_150567_a = McMappingDatabase.getSRG("BiomeForest.func_150567_a");

	/**
	 * <p>
	 * Name: SUPER_BIRCH_TREE
	 * </p>
	 */
	public static McObfPair field_150629_aC = McMappingDatabase.getSRG("field_150629_aC");

	/**
	 * <p>
	 * Name: addDoublePlants
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_185378_a = McMappingDatabase.getSRG("BiomeForest.func_185378_a");

}
