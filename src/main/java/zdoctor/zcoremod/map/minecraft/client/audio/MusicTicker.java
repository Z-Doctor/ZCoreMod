package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MusicTicker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chl";
		else
			return "net/minecraft/client/audio/MusicTicker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chl";
		else
			return "MusicTicker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchl;";
		else
			return "Lnet/minecraft/client/audio/MusicTicker;";
	}

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_147679_a = McMappingDatabase.getSRG("field_147679_a");

	/**
	 * <p>
	 * Name: playMusic
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/MusicTicker$MusicType;)V]
	 * </p>
	 */
	public static McObfPair func_181558_a = McMappingDatabase.getSRG("MusicTicker.func_181558_a");

	/**
	 * <p>
	 * Name: currentMusic
	 * </p>
	 */
	public static McObfPair field_147678_c = McMappingDatabase.getSRG("field_147678_c");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_147677_b = McMappingDatabase.getSRG("field_147677_b");

	/**
	 * <p>
	 * Name: timeUntilNextMusic
	 * </p>
	 */
	public static McObfPair field_147676_d = McMappingDatabase.getSRG("field_147676_d");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("MusicTicker.func_73660_a");

}
