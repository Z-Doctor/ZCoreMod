package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleDigging {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btu";
		else
			return "net/minecraft/client/particle/ParticleDigging";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btu";
		else
			return "ParticleDigging";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtu;";
		else
			return "Lnet/minecraft/client/particle/ParticleDigging;";
	}

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleDigging.func_180434_a");

	/**
	 * <p>
	 * Name: getFXLayer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70537_b = McMappingDatabase.getSRG("ParticleDigging.func_70537_b");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_189214_a = McMappingDatabase.getSRG("ParticleDigging.func_189214_a");

	/**
	 * <p>
	 * Name: sourceState
	 * </p>
	 */
	public static McObfPair field_174847_a = McMappingDatabase.getSRG("field_174847_a");

	/**
	 * <p>
	 * Name: multiplyColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_187154_b = McMappingDatabase.getSRG("ParticleDigging.func_187154_b");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/particle/ParticleDigging;]
	 * </p>
	 */
	public static McObfPair func_174845_l = McMappingDatabase.getSRG("ParticleDigging.func_174845_l");

	/**
	 * <p>
	 * Name: sourcePos
	 * </p>
	 */
	public static McObfPair field_181019_az = McMappingDatabase.getSRG("field_181019_az");

	/**
	 * <p>
	 * Name: setBlockPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/client/particle/ParticleDigging;]
	 * </p>
	 */
	public static McObfPair func_174846_a = McMappingDatabase.getSRG("ParticleDigging.func_174846_a");

}
