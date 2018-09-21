package zdoctor.zcoremod.map.minecraft.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ClientBrandRetriever {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/client/ClientBrandRetriever";
		else
			return "net/minecraft/client/ClientBrandRetriever";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ClientBrandRetriever";
		else
			return "ClientBrandRetriever";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/client/ClientBrandRetriever;";
		else
			return "Lnet/minecraft/client/ClientBrandRetriever;";
	}

}
