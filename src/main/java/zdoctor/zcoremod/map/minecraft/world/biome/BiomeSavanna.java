package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeSavanna {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aod";
		else
			return "net/minecraft/world/biome/BiomeSavanna";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aod";
		else
			return "BiomeSavanna";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laod;";
		else
			return "Lnet/minecraft/world/biome/BiomeSavanna;";
	}

	/**
	 * <p>
	 * Name: getRandomTreeFeature
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;]
	 * </p>
	 */
	public static McObfPair func_150567_a = McMappingDatabase.getSRG("BiomeSavanna.func_150567_a");

	/**
	 * <p>
	 * Name: decorate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180624_a = McMappingDatabase.getSRG("BiomeSavanna.func_180624_a");

	/**
	 * <p>
	 * Name: getBiomeClass
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_150562_l = McMappingDatabase.getSRG("BiomeSavanna.func_150562_l");

	/**
	 * <p>
	 * Name: SAVANNA_TREE
	 * </p>
	 */
	public static McObfPair field_150627_aC = McMappingDatabase.getSRG("field_150627_aC");

}
