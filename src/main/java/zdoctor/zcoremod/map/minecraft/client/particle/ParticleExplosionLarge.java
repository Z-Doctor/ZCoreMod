package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleExplosionLarge {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsy";
		else
			return "net/minecraft/client/particle/ParticleExplosionLarge";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsy";
		else
			return "ParticleExplosionLarge";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsy;";
		else
			return "Lnet/minecraft/client/particle/ParticleExplosionLarge;";
	}

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_189214_a = McMappingDatabase.getSRG("ParticleExplosionLarge.func_189214_a");

	/**
	 * <p>
	 * Name: lifeTime
	 * </p>
	 */
	public static McObfPair field_70584_aq = McMappingDatabase.getSRG("field_70584_aq");

	/**
	 * <p>
	 * Name: VERTEX_FORMAT
	 * </p>
	 */
	public static McObfPair field_181549_az = McMappingDatabase.getSRG("field_181549_az");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleExplosionLarge.func_180434_a");

	/**
	 * <p>
	 * Name: life
	 * </p>
	 */
	public static McObfPair field_70581_a = McMappingDatabase.getSRG("field_70581_a");

	/**
	 * <p>
	 * Name: textureManager
	 * </p>
	 */
	public static McObfPair field_70583_ar = McMappingDatabase.getSRG("field_70583_ar");

	/**
	 * <p>
	 * Name: size
	 * </p>
	 */
	public static McObfPair field_70582_as = McMappingDatabase.getSRG("field_70582_as");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleExplosionLarge.func_189213_a");

	/**
	 * <p>
	 * Name: EXPLOSION_TEXTURE
	 * </p>
	 */
	public static McObfPair field_110127_a = McMappingDatabase.getSRG("field_110127_a");

	/**
	 * <p>
	 * Name: getFXLayer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70537_b = McMappingDatabase.getSRG("ParticleExplosionLarge.func_70537_b");

}
