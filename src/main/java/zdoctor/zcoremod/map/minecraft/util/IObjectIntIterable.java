package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IObjectIntIterable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fc";
		else
			return "net/minecraft/util/IObjectIntIterable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fc";
		else
			return "IObjectIntIterable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfc;";
		else
			return "Lnet/minecraft/util/IObjectIntIterable;";
	}

}
