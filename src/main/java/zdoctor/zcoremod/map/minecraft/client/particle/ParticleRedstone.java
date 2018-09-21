package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleRedstone {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btk";
		else
			return "net/minecraft/client/particle/ParticleRedstone";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btk";
		else
			return "ParticleRedstone";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtk;";
		else
			return "Lnet/minecraft/client/particle/ParticleRedstone;";
	}

	/**
	 * <p>
	 * Name: reddustParticleScale
	 * </p>
	 */
	public static McObfPair field_70570_a = McMappingDatabase.getSRG("field_70570_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleRedstone.func_189213_a");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleRedstone.func_180434_a");

}
