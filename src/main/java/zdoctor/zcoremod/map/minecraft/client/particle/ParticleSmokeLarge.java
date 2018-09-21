package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleSmokeLarge {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btb";
		else
			return "net/minecraft/client/particle/ParticleSmokeLarge";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btb";
		else
			return "ParticleSmokeLarge";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtb;";
		else
			return "Lnet/minecraft/client/particle/ParticleSmokeLarge;";
	}

}
