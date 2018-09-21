package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticlePortal {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btj";
		else
			return "net/minecraft/client/particle/ParticlePortal";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btj";
		else
			return "ParticlePortal";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtj;";
		else
			return "Lnet/minecraft/client/particle/ParticlePortal;";
	}

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticlePortal.func_189213_a");

	/**
	 * <p>
	 * Name: portalPosZ
	 * </p>
	 */
	public static McObfPair field_70572_as = McMappingDatabase.getSRG("field_70572_as");

	/**
	 * <p>
	 * Name: portalParticleScale
	 * </p>
	 */
	public static McObfPair field_70571_a = McMappingDatabase.getSRG("field_70571_a");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_187110_a = McMappingDatabase.getSRG("ParticlePortal.func_187110_a");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_189214_a = McMappingDatabase.getSRG("ParticlePortal.func_189214_a");

	/**
	 * <p>
	 * Name: portalPosY
	 * </p>
	 */
	public static McObfPair field_70573_ar = McMappingDatabase.getSRG("field_70573_ar");

	/**
	 * <p>
	 * Name: portalPosX
	 * </p>
	 */
	public static McObfPair field_70574_aq = McMappingDatabase.getSRG("field_70574_aq");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticlePortal.func_180434_a");

}
