package zdoctor.zcoremod.map.minecraft.client.gui.toasts;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiToast$ToastInstance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkc$a";
		else
			return "net/minecraft/client/gui/toasts/GuiToast$ToastInstance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkc$a";
		else
			return "GuiToast$ToastInstance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkc$a;";
		else
			return "Lnet/minecraft/client/gui/toasts/GuiToast$ToastInstance;";
	}

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_193684_a = McMappingDatabase.getSRG("GuiToast$ToastInstance.func_193684_a");

	/**
	 * <p>
	 * Name: visibleTime
	 * </p>
	 */
	public static McObfPair field_193690_d = McMappingDatabase.getSRG("field_193690_d");

	/**
	 * <p>
	 * Name: animationTime
	 * </p>
	 */
	public static McObfPair field_193689_c = McMappingDatabase.getSRG("field_193689_c");

	/**
	 * <p>
	 * Name: getToast
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/toasts/IToast;]
	 * </p>
	 */
	public static McObfPair func_193685_a = McMappingDatabase.getSRG("GuiToast$ToastInstance.func_193685_a");

	/**
	 * <p>
	 * Name: toast
	 * </p>
	 */
	public static McObfPair field_193688_b = McMappingDatabase.getSRG("field_193688_b");

	/**
	 * <p>
	 * Name: getVisibility
	 * </p>
	 * <p>
	 * Desc: [(J)F]
	 * </p>
	 */
	public static McObfPair func_193686_a = McMappingDatabase.getSRG("GuiToast$ToastInstance.func_193686_a");

	/**
	 * <p>
	 * Name: visibility
	 * </p>
	 */
	public static McObfPair field_193691_e = McMappingDatabase.getSRG("field_193691_e");

}
