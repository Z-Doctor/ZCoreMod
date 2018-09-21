package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LowerStringMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "re";
		else
			return "net/minecraft/util/LowerStringMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "re";
		else
			return "LowerStringMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lre;";
		else
			return "Lnet/minecraft/util/LowerStringMap;";
	}

	/**
	 * <p>
	 * Name: internalMap
	 * </p>
	 */
	public static McObfPair field_76117_a = McMappingDatabase.getSRG("field_76117_a");

}
