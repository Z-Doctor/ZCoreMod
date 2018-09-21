package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeVoid {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoj";
		else
			return "net/minecraft/world/biome/BiomeVoid";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoj";
		else
			return "BiomeVoid";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laoj;";
		else
			return "Lnet/minecraft/world/biome/BiomeVoid;";
	}

	/**
	 * <p>
	 * Name: ignorePlayerSpawnSuitability
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185352_i = McMappingDatabase.getSRG("BiomeVoid.func_185352_i");

}
