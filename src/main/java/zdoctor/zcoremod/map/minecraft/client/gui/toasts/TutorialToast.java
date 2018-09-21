package zdoctor.zcoremod.map.minecraft.client.gui.toasts;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TutorialToast {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkd";
		else
			return "net/minecraft/client/gui/toasts/TutorialToast";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkd";
		else
			return "TutorialToast";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkd;";
		else
			return "Lnet/minecraft/client/gui/toasts/TutorialToast;";
	}

	/**
	 * <p>
	 * Name: hasProgressBar
	 * </p>
	 */
	public static McObfPair field_193678_j = McMappingDatabase.getSRG("field_193678_j");

	/**
	 * <p>
	 * Name: displayedProgress
	 * </p>
	 */
	public static McObfPair field_193676_h = McMappingDatabase.getSRG("field_193676_h");

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/toasts/GuiToast;J)Lnet/minecraft/client/gui/toasts/IToast$Visibility;]
	 * </p>
	 */
	public static McObfPair func_193653_a = McMappingDatabase.getSRG("TutorialToast.func_193653_a");

	/**
	 * <p>
	 * Name: icon
	 * </p>
	 */
	public static McObfPair field_193671_c = McMappingDatabase.getSRG("field_193671_c");

	/**
	 * <p>
	 * Name: currentProgress
	 * </p>
	 */
	public static McObfPair field_193677_i = McMappingDatabase.getSRG("field_193677_i");

	/**
	 * <p>
	 * Name: lastDelta
	 * </p>
	 */
	public static McObfPair field_193675_g = McMappingDatabase.getSRG("field_193675_g");

	/**
	 * <p>
	 * Name: visibility
	 * </p>
	 */
	public static McObfPair field_193674_f = McMappingDatabase.getSRG("field_193674_f");

	/**
	 * <p>
	 * Name: setProgress
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_193669_a = McMappingDatabase.getSRG("TutorialToast.func_193669_a");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_193672_d = McMappingDatabase.getSRG("field_193672_d");

	/**
	 * <p>
	 * Name: subtitle
	 * </p>
	 */
	public static McObfPair field_193673_e = McMappingDatabase.getSRG("field_193673_e");

	/**
	 * <p>
	 * Name: hide
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193670_a = McMappingDatabase.getSRG("TutorialToast.func_193670_a");

}
