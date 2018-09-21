package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleDrip {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsp";
		else
			return "net/minecraft/client/particle/ParticleDrip";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsp";
		else
			return "ParticleDrip";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsp;";
		else
			return "Lnet/minecraft/client/particle/ParticleDrip;";
	}

	/**
	 * <p>
	 * Name: bobTimer
	 * </p>
	 */
	public static McObfPair field_70564_aq = McMappingDatabase.getSRG("field_70564_aq");

	/**
	 * <p>
	 * Name: materialType
	 * </p>
	 */
	public static McObfPair field_70563_a = McMappingDatabase.getSRG("field_70563_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleDrip.func_189213_a");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_189214_a = McMappingDatabase.getSRG("ParticleDrip.func_189214_a");

}
