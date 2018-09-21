package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeSnow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anu";
		else
			return "net/minecraft/world/biome/BiomeSnow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anu";
		else
			return "BiomeSnow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanu;";
		else
			return "Lnet/minecraft/world/biome/BiomeSnow;";
	}

	/**
	 * <p>
	 * Name: iceSpike
	 * </p>
	 */
	public static McObfPair field_150616_aD = McMappingDatabase.getSRG("field_150616_aD");

	/**
	 * <p>
	 * Name: icePatch
	 * </p>
	 */
	public static McObfPair field_150617_aE = McMappingDatabase.getSRG("field_150617_aE");

	/**
	 * <p>
	 * Name: getRandomTreeFeature
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;]
	 * </p>
	 */
	public static McObfPair func_150567_a = McMappingDatabase.getSRG("BiomeSnow.func_150567_a");

	/**
	 * <p>
	 * Name: decorate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180624_a = McMappingDatabase.getSRG("BiomeSnow.func_180624_a");

	/**
	 * <p>
	 * Name: superIcy
	 * </p>
	 */
	public static McObfPair field_150615_aC = McMappingDatabase.getSRG("field_150615_aC");

	/**
	 * <p>
	 * Name: getSpawningChance
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_76741_f = McMappingDatabase.getSRG("BiomeSnow.func_76741_f");

}
