package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeOcean {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoa";
		else
			return "net/minecraft/world/biome/BiomeOcean";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoa";
		else
			return "BiomeOcean";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laoa;";
		else
			return "Lnet/minecraft/world/biome/BiomeOcean;";
	}

	/**
	 * <p>
	 * Name: getTempCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/biome/Biome$TempCategory;]
	 * </p>
	 */
	public static McObfPair func_150561_m = McMappingDatabase.getSRG("BiomeOcean.func_150561_m");

}
