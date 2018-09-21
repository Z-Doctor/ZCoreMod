package zdoctor.zcoremod.map.minecraft.client.gui.toasts;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiToast {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkc";
		else
			return "net/minecraft/client/gui/toasts/GuiToast";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkc";
		else
			return "GuiToast";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkc;";
		else
			return "Lnet/minecraft/client/gui/toasts/GuiToast;";
	}

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_191788_b = McMappingDatabase.getSRG("GuiToast.func_191788_b");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/toasts/IToast;)V]
	 * </p>
	 */
	public static McObfPair func_192988_a = McMappingDatabase.getSRG("GuiToast.func_192988_a");

	/**
	 * <p>
	 * Name: getToast
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Ljava/lang/Object;)Lnet/minecraft/client/gui/toasts/IToast;]
	 * </p>
	 */
	public static McObfPair func_192990_a = McMappingDatabase.getSRG("GuiToast.func_192990_a");

	/**
	 * <p>
	 * Name: getMinecraft
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/Minecraft;]
	 * </p>
	 */
	public static McObfPair func_192989_b = McMappingDatabase.getSRG("GuiToast.func_192989_b");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_191790_f = McMappingDatabase.getSRG("field_191790_f");

	/**
	 * <p>
	 * Name: drawToast
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_191783_a = McMappingDatabase.getSRG("GuiToast.func_191783_a");

	/**
	 * <p>
	 * Name: visible
	 * </p>
	 */
	public static McObfPair field_191791_g = McMappingDatabase.getSRG("field_191791_g");

	/**
	 * <p>
	 * Name: toastsQueue
	 * </p>
	 */
	public static McObfPair field_191792_h = McMappingDatabase.getSRG("field_191792_h");

}
