package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleSpell {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bto";
		else
			return "net/minecraft/client/particle/ParticleSpell";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bto";
		else
			return "ParticleSpell";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbto;";
		else
			return "Lnet/minecraft/client/particle/ParticleSpell;";
	}

	/**
	 * <p>
	 * Name: shouldDisableDepth
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187111_c = McMappingDatabase.getSRG("ParticleSpell.func_187111_c");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleSpell.func_189213_a");

	/**
	 * <p>
	 * Name: RANDOM
	 * </p>
	 */
	public static McObfPair field_174848_a = McMappingDatabase.getSRG("field_174848_a");

	/**
	 * <p>
	 * Name: baseSpellTextureIndex
	 * </p>
	 */
	public static McObfPair field_70590_a = McMappingDatabase.getSRG("field_70590_a");

	/**
	 * <p>
	 * Name: setBaseSpellTextureIndex
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70589_b = McMappingDatabase.getSRG("ParticleSpell.func_70589_b");

}
