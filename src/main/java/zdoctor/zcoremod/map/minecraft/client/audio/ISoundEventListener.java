package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ISoundEventListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chn";
		else
			return "net/minecraft/client/audio/ISoundEventListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chn";
		else
			return "ISoundEventListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchn;";
		else
			return "Lnet/minecraft/client/audio/ISoundEventListener;";
	}

	/**
	 * <p>
	 * Name: soundPlay
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISound;Lnet/minecraft/client/audio/SoundEventAccessor;)V]
	 * </p>
	 */
	public static McObfPair func_184067_a = McMappingDatabase.getSRG("ISoundEventListener.func_184067_a");

}
