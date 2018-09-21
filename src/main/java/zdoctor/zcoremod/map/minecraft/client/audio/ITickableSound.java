package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ITickableSound {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgu";
		else
			return "net/minecraft/client/audio/ITickableSound";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgu";
		else
			return "ITickableSound";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgu;";
		else
			return "Lnet/minecraft/client/audio/ITickableSound;";
	}

	/**
	 * <p>
	 * Name: isDonePlaying
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_147667_k = McMappingDatabase.getSRG("ITickableSound.func_147667_k");

}
