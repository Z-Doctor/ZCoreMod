package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MusicTicker$MusicType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chl$a";
		else
			return "net/minecraft/client/audio/MusicTicker$MusicType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chl$a";
		else
			return "MusicTicker$MusicType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchl$a;";
		else
			return "Lnet/minecraft/client/audio/MusicTicker$MusicType;";
	}

	/**
	 * <p>
	 * Name: getMaxDelay
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148633_c = McMappingDatabase.getSRG("MusicTicker$MusicType.func_148633_c");

	/**
	 * <p>
	 * Name: getMusicLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_188768_a = McMappingDatabase.getSRG("MusicTicker$MusicType.func_188768_a");

	/**
	 * <p>
	 * Name: maxDelay
	 * </p>
	 */
	public static McObfPair field_148643_j = McMappingDatabase.getSRG("field_148643_j");

	/**
	 * <p>
	 * Name: getMinDelay
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148634_b = McMappingDatabase.getSRG("MusicTicker$MusicType.func_148634_b");

	/**
	 * <p>
	 * Name: minDelay
	 * </p>
	 */
	public static McObfPair field_148646_i = McMappingDatabase.getSRG("field_148646_i");

	/**
	 * <p>
	 * Name: musicLocation
	 * </p>
	 */
	public static McObfPair field_148645_h = McMappingDatabase.getSRG("field_148645_h");

}
