package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleBlockDust {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btt";
		else
			return "net/minecraft/client/particle/ParticleBlockDust";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btt";
		else
			return "ParticleBlockDust";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtt;";
		else
			return "Lnet/minecraft/client/particle/ParticleBlockDust;";
	}

}
