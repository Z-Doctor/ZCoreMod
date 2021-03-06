package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IParticleFactory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bth";
		else
			return "net/minecraft/client/particle/IParticleFactory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bth";
		else
			return "IParticleFactory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbth;";
		else
			return "Lnet/minecraft/client/particle/IParticleFactory;";
	}

	/**
	 * <p>
	 * Name: createParticle
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/world/World;DDDDDD[I)Lnet/minecraft/client/particle/Particle;]
	 * </p>
	 */
	public static McObfPair func_178902_a = McMappingDatabase.getSRG("IParticleFactory.func_178902_a");

}
