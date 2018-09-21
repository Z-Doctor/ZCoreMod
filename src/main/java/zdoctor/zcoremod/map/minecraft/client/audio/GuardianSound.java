package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuardianSound {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgm";
		else
			return "net/minecraft/client/audio/GuardianSound";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgm";
		else
			return "GuardianSound";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgm;";
		else
			return "Lnet/minecraft/client/audio/GuardianSound;";
	}

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("GuardianSound.func_73660_a");

	/**
	 * <p>
	 * Name: guardian
	 * </p>
	 */
	public static McObfPair field_174934_k = McMappingDatabase.getSRG("field_174934_k");

}
