package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MovingSound {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgk";
		else
			return "net/minecraft/client/audio/MovingSound";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgk";
		else
			return "MovingSound";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgk;";
		else
			return "Lnet/minecraft/client/audio/MovingSound;";
	}

	/**
	 * <p>
	 * Name: donePlaying
	 * </p>
	 */
	public static McObfPair field_147668_j = McMappingDatabase.getSRG("field_147668_j");

	/**
	 * <p>
	 * Name: isDonePlaying
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_147667_k = McMappingDatabase.getSRG("MovingSound.func_147667_k");

}
