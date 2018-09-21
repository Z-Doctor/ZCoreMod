package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ElytraSound {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgl";
		else
			return "net/minecraft/client/audio/ElytraSound";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgl";
		else
			return "ElytraSound";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgl;";
		else
			return "Lnet/minecraft/client/audio/ElytraSound;";
	}

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("ElytraSound.func_73660_a");

	/**
	 * <p>
	 * Name: time
	 * </p>
	 */
	public static McObfPair field_189406_n = McMappingDatabase.getSRG("field_189406_n");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_189405_m = McMappingDatabase.getSRG("field_189405_m");

}
