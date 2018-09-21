package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleSpit {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btp";
		else
			return "net/minecraft/client/particle/ParticleSpit";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btp";
		else
			return "ParticleSpit";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtp;";
		else
			return "Lnet/minecraft/client/particle/ParticleSpit;";
	}

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleSpit.func_189213_a");

}
