package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleFallingDust {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bst";
		else
			return "net/minecraft/client/particle/ParticleFallingDust";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bst";
		else
			return "ParticleFallingDust";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbst;";
		else
			return "Lnet/minecraft/client/particle/ParticleFallingDust;";
	}

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleFallingDust.func_180434_a");

	/**
	 * <p>
	 * Name: oSize
	 * </p>
	 */
	public static McObfPair field_190018_a = McMappingDatabase.getSRG("field_190018_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleFallingDust.func_189213_a");

	/**
	 * <p>
	 * Name: rotSpeed
	 * </p>
	 */
	public static McObfPair field_190019_b = McMappingDatabase.getSRG("field_190019_b");

}
