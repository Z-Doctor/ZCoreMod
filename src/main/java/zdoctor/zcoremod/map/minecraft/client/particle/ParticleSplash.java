package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleSplash {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btq";
		else
			return "net/minecraft/client/particle/ParticleSplash";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btq";
		else
			return "ParticleSplash";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtq;";
		else
			return "Lnet/minecraft/client/particle/ParticleSplash;";
	}

}
