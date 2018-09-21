package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleEmitter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btw";
		else
			return "net/minecraft/client/particle/ParticleEmitter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btw";
		else
			return "ParticleEmitter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtw;";
		else
			return "Lnet/minecraft/client/particle/ParticleEmitter;";
	}

	/**
	 * <p>
	 * Name: lifetime
	 * </p>
	 */
	public static McObfPair field_174850_ay = McMappingDatabase.getSRG("field_174850_ay");

	/**
	 * <p>
	 * Name: age
	 * </p>
	 */
	public static McObfPair field_174852_ax = McMappingDatabase.getSRG("field_174852_ax");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleEmitter.func_189213_a");

	/**
	 * <p>
	 * Name: attachedEntity
	 * </p>
	 */
	public static McObfPair field_174851_a = McMappingDatabase.getSRG("field_174851_a");

	/**
	 * <p>
	 * Name: particleTypes
	 * </p>
	 */
	public static McObfPair field_174849_az = McMappingDatabase.getSRG("field_174849_az");

	/**
	 * <p>
	 * Name: getFXLayer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70537_b = McMappingDatabase.getSRG("ParticleEmitter.func_70537_b");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleEmitter.func_180434_a");

}
