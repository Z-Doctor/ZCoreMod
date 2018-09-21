package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleSweepAttack$Factory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsj$a";
		else
			return "net/minecraft/client/particle/ParticleSweepAttack$Factory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsj$a";
		else
			return "ParticleSweepAttack$Factory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsj$a;";
		else
			return "Lnet/minecraft/client/particle/ParticleSweepAttack$Factory;";
	}

	/**
	 * <p>
	 * Name: createParticle
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/world/World;DDDDDD[I)Lnet/minecraft/client/particle/Particle;]
	 * </p>
	 */
	public static McObfPair func_178902_a = McMappingDatabase.getSRG("ParticleSweepAttack$Factory.func_178902_a");

}
