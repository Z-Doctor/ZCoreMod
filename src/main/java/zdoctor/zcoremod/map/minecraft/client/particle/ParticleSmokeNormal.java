package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleSmokeNormal {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btm";
		else
			return "net/minecraft/client/particle/ParticleSmokeNormal";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btm";
		else
			return "ParticleSmokeNormal";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtm;";
		else
			return "Lnet/minecraft/client/particle/ParticleSmokeNormal;";
	}

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleSmokeNormal.func_189213_a");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleSmokeNormal.func_180434_a");

	/**
	 * <p>
	 * Name: smokeParticleScale
	 * </p>
	 */
	public static McObfPair field_70587_a = McMappingDatabase.getSRG("field_70587_a");

}
