package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleEndRod {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsr";
		else
			return "net/minecraft/client/particle/ParticleEndRod";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsr";
		else
			return "ParticleEndRod";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsr;";
		else
			return "Lnet/minecraft/client/particle/ParticleEndRod;";
	}

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_187110_a = McMappingDatabase.getSRG("ParticleEndRod.func_187110_a");

}
