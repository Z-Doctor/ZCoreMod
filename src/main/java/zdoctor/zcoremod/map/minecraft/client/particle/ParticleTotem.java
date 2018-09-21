package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleTotem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btv";
		else
			return "net/minecraft/client/particle/ParticleTotem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btv";
		else
			return "ParticleTotem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtv;";
		else
			return "Lnet/minecraft/client/particle/ParticleTotem;";
	}

}
