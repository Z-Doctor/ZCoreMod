package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleWaterWake {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btx";
		else
			return "net/minecraft/client/particle/ParticleWaterWake";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btx";
		else
			return "ParticleWaterWake";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtx;";
		else
			return "Lnet/minecraft/client/particle/ParticleWaterWake;";
	}

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleWaterWake.func_189213_a");

}
