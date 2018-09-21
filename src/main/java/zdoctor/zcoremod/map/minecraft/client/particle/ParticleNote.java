package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleNote {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bte";
		else
			return "net/minecraft/client/particle/ParticleNote";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bte";
		else
			return "ParticleNote";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbte;";
		else
			return "Lnet/minecraft/client/particle/ParticleNote;";
	}

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleNote.func_189213_a");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("ParticleNote.func_180434_a");

	/**
	 * <p>
	 * Name: noteParticleScale
	 * </p>
	 */
	public static McObfPair field_70585_a = McMappingDatabase.getSRG("field_70585_a");

}
