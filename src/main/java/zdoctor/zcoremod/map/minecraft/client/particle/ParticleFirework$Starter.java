package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleFirework$Starter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsu$c";
		else
			return "net/minecraft/client/particle/ParticleFirework$Starter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsu$c";
		else
			return "ParticleFirework$Starter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsu$c;";
		else
			return "Lnet/minecraft/client/particle/ParticleFirework$Starter;";
	}

	/**
	 * <p>
	 * Name: fireworkAge
	 * </p>
	 */
	public static McObfPair field_92042_ax = McMappingDatabase.getSRG("field_92042_ax");

	/**
	 * <p>
	 * Name: isFarFromCamera
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_92037_i = McMappingDatabase.getSRG("ParticleFirework$Starter.func_92037_i");

	/**
	 * <p>
	 * Name: createBurst
	 * </p>
	 * <p>
	 * Desc: [([I[IZZ)V]
	 * </p>
	 */
	public static McObfPair func_92036_a = McMappingDatabase.getSRG("ParticleFirework$Starter.func_92036_a");

	/**
	 * <p>
	 * Name: createParticle
	 * </p>
	 * <p>
	 * Desc: [(DDDDDD[I[IZZ)V]
	 * </p>
	 */
	public static McObfPair func_92034_a = McMappingDatabase.getSRG("ParticleFirework$Starter.func_92034_a");

	/**
	 * <p>
	 * Name: twinkle
	 * </p>
	 */
	public static McObfPair field_92041_a = McMappingDatabase.getSRG("field_92041_a");

	/**
	 * <p>
	 * Name: manager
	 * </p>
	 */
	public static McObfPair field_92040_ay = McMappingDatabase.getSRG("field_92040_ay");

	/**
	 * <p>
	 * Name: createShaped
	 * </p>
	 * <p>
	 * Desc: [(D[[D[I[IZZZ)V]
	 * </p>
	 */
	public static McObfPair func_92038_a = McMappingDatabase.getSRG("ParticleFirework$Starter.func_92038_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleFirework$Starter.func_189213_a");

	/**
	 * <p>
	 * Name: fireworkExplosions
	 * </p>
	 */
	public static McObfPair field_92039_az = McMappingDatabase.getSRG("field_92039_az");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleFirework$Starter.func_180434_a");

	/**
	 * <p>
	 * Name: createBall
	 * </p>
	 * <p>
	 * Desc: [(DI[I[IZZ)V]
	 * </p>
	 */
	public static McObfPair func_92035_a = McMappingDatabase.getSRG("ParticleFirework$Starter.func_92035_a");

	/**
	 * <p>
	 * Name: getFXLayer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70537_b = McMappingDatabase.getSRG("ParticleFirework$Starter.func_70537_b");

}
