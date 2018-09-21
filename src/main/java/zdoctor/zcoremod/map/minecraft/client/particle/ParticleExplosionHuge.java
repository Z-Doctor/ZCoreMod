package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleExplosionHuge {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsz";
		else
			return "net/minecraft/client/particle/ParticleExplosionHuge";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsz";
		else
			return "ParticleExplosionHuge";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsz;";
		else
			return "Lnet/minecraft/client/particle/ParticleExplosionHuge;";
	}

	/**
	 * <p>
	 * Name: timeSinceStart
	 * </p>
	 */
	public static McObfPair field_70579_a = McMappingDatabase.getSRG("field_70579_a");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleExplosionHuge.func_180434_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleExplosionHuge.func_189213_a");

	/**
	 * <p>
	 * Name: maximumTime
	 * </p>
	 */
	public static McObfPair field_70580_aq = McMappingDatabase.getSRG("field_70580_aq");

	/**
	 * <p>
	 * Name: getFXLayer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70537_b = McMappingDatabase.getSRG("ParticleExplosionHuge.func_70537_b");

}
