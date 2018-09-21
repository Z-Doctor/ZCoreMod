package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumSkyBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ana";
		else
			return "net/minecraft/world/EnumSkyBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ana";
		else
			return "EnumSkyBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lana;";
		else
			return "Lnet/minecraft/world/EnumSkyBlock;";
	}

	/**
	 * <p>
	 * Name: defaultLightValue
	 * </p>
	 */
	public static McObfPair field_77198_c = McMappingDatabase.getSRG("field_77198_c");

}
