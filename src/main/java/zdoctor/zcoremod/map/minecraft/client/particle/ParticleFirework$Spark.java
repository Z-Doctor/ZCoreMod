package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleFirework$Spark {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsu$b";
		else
			return "net/minecraft/client/particle/ParticleFirework$Spark";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsu$b";
		else
			return "ParticleFirework$Spark";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsu$b;";
		else
			return "Lnet/minecraft/client/particle/ParticleFirework$Spark;";
	}

	/**
	 * <p>
	 * Name: setTwinkle
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_92043_f = McMappingDatabase.getSRG("ParticleFirework$Spark.func_92043_f");

	/**
	 * <p>
	 * Name: fadeColourBlue
	 * </p>
	 */
	public static McObfPair field_92052_aC = McMappingDatabase.getSRG("field_92052_aC");

	/**
	 * <p>
	 * Name: fadeColourGreen
	 * </p>
	 */
	public static McObfPair field_92051_aB = McMappingDatabase.getSRG("field_92051_aB");

	/**
	 * <p>
	 * Name: fadeColourRed
	 * </p>
	 */
	public static McObfPair field_92050_aA = McMappingDatabase.getSRG("field_92050_aA");

	/**
	 * <p>
	 * Name: trail
	 * </p>
	 */
	public static McObfPair field_92054_ax = McMappingDatabase.getSRG("field_92054_ax");

	/**
	 * <p>
	 * Name: twinkle
	 * </p>
	 */
	public static McObfPair field_92048_ay = McMappingDatabase.getSRG("field_92048_ay");

	/**
	 * <p>
	 * Name: setTrail
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_92045_e = McMappingDatabase.getSRG("ParticleFirework$Spark.func_92045_e");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleFirework$Spark.func_189213_a");

	/**
	 * <p>
	 * Name: hasFadeColour
	 * </p>
	 */
	public static McObfPair field_92053_aD = McMappingDatabase.getSRG("field_92053_aD");

	/**
	 * <p>
	 * Name: shouldDisableDepth
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187111_c = McMappingDatabase.getSRG("ParticleFirework$Spark.func_187111_c");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleFirework$Spark.func_180434_a");

	/**
	 * <p>
	 * Name: effectRenderer
	 * </p>
	 */
	public static McObfPair field_92047_az = McMappingDatabase.getSRG("field_92047_az");

}
