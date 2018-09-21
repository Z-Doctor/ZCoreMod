package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleItemPickup {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bta";
		else
			return "net/minecraft/client/particle/ParticleItemPickup";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bta";
		else
			return "ParticleItemPickup";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbta;";
		else
			return "Lnet/minecraft/client/particle/ParticleItemPickup;";
	}

	/**
	 * <p>
	 * Name: maxAge
	 * </p>
	 */
	public static McObfPair field_70593_as = McMappingDatabase.getSRG("field_70593_as");

	/**
	 * <p>
	 * Name: renderManager
	 * </p>
	 */
	public static McObfPair field_174842_aB = McMappingDatabase.getSRG("field_174842_aB");

	/**
	 * <p>
	 * Name: target
	 * </p>
	 */
	public static McObfPair field_174843_ax = McMappingDatabase.getSRG("field_174843_ax");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleItemPickup.func_180434_a");

	/**
	 * <p>
	 * Name: yOffset
	 * </p>
	 */
	public static McObfPair field_174841_aA = McMappingDatabase.getSRG("field_174841_aA");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleItemPickup.func_189213_a");

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_174840_a = McMappingDatabase.getSRG("field_174840_a");

	/**
	 * <p>
	 * Name: getFXLayer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70537_b = McMappingDatabase.getSRG("ParticleItemPickup.func_70537_b");

	/**
	 * <p>
	 * Name: age
	 * </p>
	 */
	public static McObfPair field_70594_ar = McMappingDatabase.getSRG("field_70594_ar");

}
