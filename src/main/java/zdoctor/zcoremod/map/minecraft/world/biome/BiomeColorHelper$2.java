package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeColorHelper$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anj$2";
		else
			return "net/minecraft/world/biome/BiomeColorHelper$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anj$2";
		else
			return "BiomeColorHelper$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanj$2;";
		else
			return "Lnet/minecraft/world/biome/BiomeColorHelper$2;";
	}

	/**
	 * <p>
	 * Name: getColorAtPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180283_a = McMappingDatabase.getSRG("BiomeColorHelper$2.func_180283_a");

}
