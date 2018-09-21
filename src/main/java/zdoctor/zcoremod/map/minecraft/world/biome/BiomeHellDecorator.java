package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeHellDecorator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ant";
		else
			return "net/minecraft/world/biome/BiomeHellDecorator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ant";
		else
			return "BiomeHellDecorator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lant;";
		else
			return "Lnet/minecraft/world/biome/BiomeHellDecorator;";
	}

	/**
	 * <p>
	 * Name: decorate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/biome/Biome;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180292_a = McMappingDatabase.getSRG("BiomeHellDecorator.func_180292_a");

}
