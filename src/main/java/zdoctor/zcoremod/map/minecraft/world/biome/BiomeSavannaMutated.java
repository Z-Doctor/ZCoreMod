package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeSavannaMutated {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anz";
		else
			return "net/minecraft/world/biome/BiomeSavannaMutated";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anz";
		else
			return "BiomeSavannaMutated";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanz;";
		else
			return "Lnet/minecraft/world/biome/BiomeSavannaMutated;";
	}

	/**
	 * <p>
	 * Name: decorate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180624_a = McMappingDatabase.getSRG("BiomeSavannaMutated.func_180624_a");

	/**
	 * <p>
	 * Name: genTerrainBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V]
	 * </p>
	 */
	public static McObfPair func_180622_a = McMappingDatabase.getSRG("BiomeSavannaMutated.func_180622_a");

}
