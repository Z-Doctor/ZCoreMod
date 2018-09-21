package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleEnchantmentTable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsq";
		else
			return "net/minecraft/client/particle/ParticleEnchantmentTable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsq";
		else
			return "ParticleEnchantmentTable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsq;";
		else
			return "Lnet/minecraft/client/particle/ParticleEnchantmentTable;";
	}

	/**
	 * <p>
	 * Name: oSize
	 * </p>
	 */
	public static McObfPair field_70565_a = McMappingDatabase.getSRG("field_70565_a");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_187110_a = McMappingDatabase.getSRG("ParticleEnchantmentTable.func_187110_a");

	/**
	 * <p>
	 * Name: coordX
	 * </p>
	 */
	public static McObfPair field_70568_aq = McMappingDatabase.getSRG("field_70568_aq");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleEnchantmentTable.func_189213_a");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_189214_a = McMappingDatabase.getSRG("ParticleEnchantmentTable.func_189214_a");

	/**
	 * <p>
	 * Name: coordZ
	 * </p>
	 */
	public static McObfPair field_70566_as = McMappingDatabase.getSRG("field_70566_as");

	/**
	 * <p>
	 * Name: coordY
	 * </p>
	 */
	public static McObfPair field_70567_ar = McMappingDatabase.getSRG("field_70567_ar");

}
