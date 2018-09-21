package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomePlains {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aob";
		else
			return "net/minecraft/world/biome/BiomePlains";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aob";
		else
			return "BiomePlains";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laob;";
		else
			return "Lnet/minecraft/world/biome/BiomePlains;";
	}

	/**
	 * <p>
	 * Name: pickRandomFlower
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockFlower$EnumFlowerType;]
	 * </p>
	 */
	public static McObfPair func_180623_a = McMappingDatabase.getSRG("BiomePlains.func_180623_a");

	/**
	 * <p>
	 * Name: sunflowers
	 * </p>
	 */
	public static McObfPair field_150628_aC = McMappingDatabase.getSRG("field_150628_aC");

	/**
	 * <p>
	 * Name: decorate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180624_a = McMappingDatabase.getSRG("BiomePlains.func_180624_a");

	/**
	 * <p>
	 * Name: getRandomTreeFeature
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;]
	 * </p>
	 */
	public static McObfPair func_150567_a = McMappingDatabase.getSRG("BiomePlains.func_150567_a");

}
