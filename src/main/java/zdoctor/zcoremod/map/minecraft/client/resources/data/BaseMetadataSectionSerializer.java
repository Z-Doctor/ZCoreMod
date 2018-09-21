package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BaseMetadataSectionSerializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfd";
		else
			return "net/minecraft/client/resources/data/BaseMetadataSectionSerializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfd";
		else
			return "BaseMetadataSectionSerializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfd;";
		else
			return "Lnet/minecraft/client/resources/data/BaseMetadataSectionSerializer;";
	}

}
