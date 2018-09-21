package zdoctor.zcoremod.map.minecraft.client.gui.toasts;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TutorialToast$Icons {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkd$a";
		else
			return "net/minecraft/client/gui/toasts/TutorialToast$Icons";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkd$a";
		else
			return "TutorialToast$Icons";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkd$a;";
		else
			return "Lnet/minecraft/client/gui/toasts/TutorialToast$Icons;";
	}

	/**
	 * <p>
	 * Name: row
	 * </p>
	 */
	public static McObfPair field_193704_g = McMappingDatabase.getSRG("field_193704_g");

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/Gui;II)V]
	 * </p>
	 */
	public static McObfPair func_193697_a = McMappingDatabase.getSRG("TutorialToast$Icons.func_193697_a");

	/**
	 * <p>
	 * Name: column
	 * </p>
	 */
	public static McObfPair field_193703_f = McMappingDatabase.getSRG("field_193703_f");

}
