package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleSnowShovel {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btn";
		else
			return "net/minecraft/client/particle/ParticleSnowShovel";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btn";
		else
			return "ParticleSnowShovel";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtn;";
		else
			return "Lnet/minecraft/client/particle/ParticleSnowShovel;";
	}

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleSnowShovel.func_180434_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleSnowShovel.func_189213_a");

	/**
	 * <p>
	 * Name: snowDigParticleScale
	 * </p>
	 */
	public static McObfPair field_70588_a = McMappingDatabase.getSRG("field_70588_a");

}
