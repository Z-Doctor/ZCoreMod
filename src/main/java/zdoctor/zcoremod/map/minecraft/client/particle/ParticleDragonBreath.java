package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleDragonBreath {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bso";
		else
			return "net/minecraft/client/particle/ParticleDragonBreath";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bso";
		else
			return "ParticleDragonBreath";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbso;";
		else
			return "Lnet/minecraft/client/particle/ParticleDragonBreath;";
	}

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleDragonBreath.func_180434_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleDragonBreath.func_189213_a");

	/**
	 * <p>
	 * Name: oSize
	 * </p>
	 */
	public static McObfPair field_187143_a = McMappingDatabase.getSRG("field_187143_a");

	/**
	 * <p>
	 * Name: hasHitGround
	 * </p>
	 */
	public static McObfPair field_187144_G = McMappingDatabase.getSRG("field_187144_G");

}
