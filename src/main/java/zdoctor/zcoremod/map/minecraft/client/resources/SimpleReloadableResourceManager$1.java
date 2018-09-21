package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SimpleReloadableResourceManager$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cev$1";
		else
			return "net/minecraft/client/resources/SimpleReloadableResourceManager$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cev$1";
		else
			return "SimpleReloadableResourceManager$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcev$1;";
		else
			return "Lnet/minecraft/client/resources/SimpleReloadableResourceManager$1;";
	}

}
