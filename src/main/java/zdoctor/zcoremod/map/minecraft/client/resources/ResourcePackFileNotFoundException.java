package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ResourcePackFileNotFoundException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cet";
		else
			return "net/minecraft/client/resources/ResourcePackFileNotFoundException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cet";
		else
			return "ResourcePackFileNotFoundException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcet;";
		else
			return "Lnet/minecraft/client/resources/ResourcePackFileNotFoundException;";
	}

}
