package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleMobAppearance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btd";
		else
			return "net/minecraft/client/particle/ParticleMobAppearance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btd";
		else
			return "ParticleMobAppearance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtd;";
		else
			return "Lnet/minecraft/client/particle/ParticleMobAppearance;";
	}

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleMobAppearance.func_180434_a");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_174844_a = McMappingDatabase.getSRG("field_174844_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleMobAppearance.func_189213_a");

	/**
	 * <p>
	 * Name: getFXLayer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70537_b = McMappingDatabase.getSRG("ParticleMobAppearance.func_70537_b");

}
