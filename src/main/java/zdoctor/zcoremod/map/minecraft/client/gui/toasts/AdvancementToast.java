package zdoctor.zcoremod.map.minecraft.client.gui.toasts;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementToast {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjy";
		else
			return "net/minecraft/client/gui/toasts/AdvancementToast";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjy";
		else
			return "AdvancementToast";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjy;";
		else
			return "Lnet/minecraft/client/gui/toasts/AdvancementToast;";
	}

	/**
	 * <p>
	 * Name: hasPlayedSound
	 * </p>
	 */
	public static McObfPair field_194168_d = McMappingDatabase.getSRG("field_194168_d");

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/toasts/GuiToast;J)Lnet/minecraft/client/gui/toasts/IToast$Visibility;]
	 * </p>
	 */
	public static McObfPair func_193653_a = McMappingDatabase.getSRG("AdvancementToast.func_193653_a");

	/**
	 * <p>
	 * Name: advancement
	 * </p>
	 */
	public static McObfPair field_193679_c = McMappingDatabase.getSRG("field_193679_c");

}
