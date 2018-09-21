package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleCloud {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bti";
		else
			return "net/minecraft/client/particle/ParticleCloud";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bti";
		else
			return "ParticleCloud";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbti;";
		else
			return "Lnet/minecraft/client/particle/ParticleCloud;";
	}

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleCloud.func_189213_a");

	/**
	 * <p>
	 * Name: oSize
	 * </p>
	 */
	public static McObfPair field_70569_a = McMappingDatabase.getSRG("field_70569_a");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleCloud.func_180434_a");

}
