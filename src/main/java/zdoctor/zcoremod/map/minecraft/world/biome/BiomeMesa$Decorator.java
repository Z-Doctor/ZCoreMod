package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeMesa$Decorator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anw$a";
		else
			return "net/minecraft/world/biome/BiomeMesa$Decorator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anw$a";
		else
			return "BiomeMesa$Decorator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanw$a;";
		else
			return "Lnet/minecraft/world/biome/BiomeMesa$Decorator;";
	}

	/**
	 * <p>
	 * Name: generateOres
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_76797_b = McMappingDatabase.getSRG("BiomeMesa$Decorator.func_76797_b");

}
