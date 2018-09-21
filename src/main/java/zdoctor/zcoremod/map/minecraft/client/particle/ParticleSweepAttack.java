package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleSweepAttack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsj";
		else
			return "net/minecraft/client/particle/ParticleSweepAttack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsj";
		else
			return "ParticleSweepAttack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsj;";
		else
			return "Lnet/minecraft/client/particle/ParticleSweepAttack;";
	}

	/**
	 * <p>
	 * Name: lifeTime
	 * </p>
	 */
	public static McObfPair field_187140_I = McMappingDatabase.getSRG("field_187140_I");

	/**
	 * <p>
	 * Name: life
	 * </p>
	 */
	public static McObfPair field_187139_H = McMappingDatabase.getSRG("field_187139_H");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleSweepAttack.func_189213_a");

	/**
	 * <p>
	 * Name: textureManager
	 * </p>
	 */
	public static McObfPair field_187141_J = McMappingDatabase.getSRG("field_187141_J");

	/**
	 * <p>
	 * Name: SWEEP_TEXTURE
	 * </p>
	 */
	public static McObfPair field_187137_a = McMappingDatabase.getSRG("field_187137_a");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleSweepAttack.func_180434_a");

	/**
	 * <p>
	 * Name: getFXLayer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70537_b = McMappingDatabase.getSRG("ParticleSweepAttack.func_70537_b");

	/**
	 * <p>
	 * Name: size
	 * </p>
	 */
	public static McObfPair field_187142_K = McMappingDatabase.getSRG("field_187142_K");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_189214_a = McMappingDatabase.getSRG("ParticleSweepAttack.func_189214_a");

	/**
	 * <p>
	 * Name: VERTEX_FORMAT
	 * </p>
	 */
	public static McObfPair field_187138_G = McMappingDatabase.getSRG("field_187138_G");

}
