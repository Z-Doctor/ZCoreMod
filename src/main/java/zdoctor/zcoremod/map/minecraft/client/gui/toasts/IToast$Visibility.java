package zdoctor.zcoremod.map.minecraft.client.gui.toasts;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IToast$Visibility {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkb$a";
		else
			return "net/minecraft/client/gui/toasts/IToast$Visibility";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkb$a";
		else
			return "IToast$Visibility";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkb$a;";
		else
			return "Lnet/minecraft/client/gui/toasts/IToast$Visibility;";
	}

	/**
	 * <p>
	 * Name: sound
	 * </p>
	 */
	public static McObfPair field_194170_c = McMappingDatabase.getSRG("field_194170_c");

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/SoundHandler;)V]
	 * </p>
	 */
	public static McObfPair func_194169_a = McMappingDatabase.getSRG("IToast$Visibility.func_194169_a");

}
