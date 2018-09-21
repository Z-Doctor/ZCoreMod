package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleFootStep {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsw";
		else
			return "net/minecraft/client/particle/ParticleFootStep";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsw";
		else
			return "ParticleFootStep";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsw;";
		else
			return "Lnet/minecraft/client/particle/ParticleFootStep;";
	}

	/**
	 * <p>
	 * Name: currentFootSteps
	 * </p>
	 */
	public static McObfPair field_70577_ar = McMappingDatabase.getSRG("field_70577_ar");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleFootStep.func_180434_a");

	/**
	 * <p>
	 * Name: footstepMaxAge
	 * </p>
	 */
	public static McObfPair field_70578_aq = McMappingDatabase.getSRG("field_70578_aq");

	/**
	 * <p>
	 * Name: footstepAge
	 * </p>
	 */
	public static McObfPair field_70576_a = McMappingDatabase.getSRG("field_70576_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleFootStep.func_189213_a");

	/**
	 * <p>
	 * Name: getFXLayer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70537_b = McMappingDatabase.getSRG("ParticleFootStep.func_70537_b");

	/**
	 * <p>
	 * Name: FOOTPRINT_TEXTURE
	 * </p>
	 */
	public static McObfPair field_110126_a = McMappingDatabase.getSRG("field_110126_a");

}
