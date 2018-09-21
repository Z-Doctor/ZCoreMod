package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeJungle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anv";
		else
			return "net/minecraft/world/biome/BiomeJungle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anv";
		else
			return "BiomeJungle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanv;";
		else
			return "Lnet/minecraft/world/biome/BiomeJungle;";
	}

	/**
	 * <p>
	 * Name: decorate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180624_a = McMappingDatabase.getSRG("BiomeJungle.func_180624_a");

	/**
	 * <p>
	 * Name: getRandomWorldGenForGrass
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenerator;]
	 * </p>
	 */
	public static McObfPair func_76730_b = McMappingDatabase.getSRG("BiomeJungle.func_76730_b");

	/**
	 * <p>
	 * Name: OAK_LEAF
	 * </p>
	 */
	public static McObfPair field_181622_aG = McMappingDatabase.getSRG("field_181622_aG");

	/**
	 * <p>
	 * Name: JUNGLE_LEAF
	 * </p>
	 */
	public static McObfPair field_181621_aF = McMappingDatabase.getSRG("field_181621_aF");

	/**
	 * <p>
	 * Name: JUNGLE_LOG
	 * </p>
	 */
	public static McObfPair field_181620_aE = McMappingDatabase.getSRG("field_181620_aE");

	/**
	 * <p>
	 * Name: isEdge
	 * </p>
	 */
	public static McObfPair field_150614_aC = McMappingDatabase.getSRG("field_150614_aC");

	/**
	 * <p>
	 * Name: getRandomTreeFeature
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;]
	 * </p>
	 */
	public static McObfPair func_150567_a = McMappingDatabase.getSRG("BiomeJungle.func_150567_a");

}
