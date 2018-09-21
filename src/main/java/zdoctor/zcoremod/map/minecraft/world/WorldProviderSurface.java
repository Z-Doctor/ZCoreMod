package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldProviderSurface {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayp";
		else
			return "net/minecraft/world/WorldProviderSurface";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayp";
		else
			return "WorldProviderSurface";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layp;";
		else
			return "Lnet/minecraft/world/WorldProviderSurface;";
	}

	/**
	 * <p>
	 * Name: getDimensionType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/DimensionType;]
	 * </p>
	 */
	public static McObfPair func_186058_p = McMappingDatabase.getSRG("WorldProviderSurface.func_186058_p");

	/**
	 * <p>
	 * Name: canDropChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_186056_c = McMappingDatabase.getSRG("WorldProviderSurface.func_186056_c");

}
