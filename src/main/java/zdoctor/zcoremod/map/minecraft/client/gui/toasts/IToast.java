package zdoctor.zcoremod.map.minecraft.client.gui.toasts;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IToast {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkb";
		else
			return "net/minecraft/client/gui/toasts/IToast";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkb";
		else
			return "IToast";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkb;";
		else
			return "Lnet/minecraft/client/gui/toasts/IToast;";
	}

	/**
	 * <p>
	 * Name: NO_TOKEN
	 * </p>
	 */
	public static McObfPair field_193655_b = McMappingDatabase.getSRG("field_193655_b");

	/**
	 * <p>
	 * Name: TEXTURE_TOASTS
	 * </p>
	 */
	public static McObfPair field_193654_a = McMappingDatabase.getSRG("field_193654_a");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_193652_b = McMappingDatabase.getSRG("IToast.func_193652_b");

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/toasts/GuiToast;J)Lnet/minecraft/client/gui/toasts/IToast$Visibility;]
	 * </p>
	 */
	public static McObfPair func_193653_a = McMappingDatabase.getSRG("IToast.func_193653_a");

}
