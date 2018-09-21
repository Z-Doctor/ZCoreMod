package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldProviderHell$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayo$1";
		else
			return "net/minecraft/world/WorldProviderHell$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayo$1";
		else
			return "WorldProviderHell$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layo$1;";
		else
			return "Lnet/minecraft/world/WorldProviderHell$1;";
	}

	/**
	 * <p>
	 * Name: getCenterZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177721_g = McMappingDatabase.getSRG("WorldProviderHell$1.func_177721_g");

	/**
	 * <p>
	 * Name: getCenterX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177731_f = McMappingDatabase.getSRG("WorldProviderHell$1.func_177731_f");

}
