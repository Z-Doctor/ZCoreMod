package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiDisconnected {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bky";
		else
			return "net/minecraft/client/gui/GuiDisconnected";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bky";
		else
			return "GuiDisconnected";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbky;";
		else
			return "Lnet/minecraft/client/gui/GuiDisconnected;";
	}

	/**
	 * <p>
	 * Name: message
	 * </p>
	 */
	public static McObfPair field_146304_f = McMappingDatabase.getSRG("field_146304_f");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiDisconnected.func_73869_a");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiDisconnected.func_73863_a");

	/**
	 * <p>
	 * Name: parentScreen
	 * </p>
	 */
	public static McObfPair field_146307_h = McMappingDatabase.getSRG("field_146307_h");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiDisconnected.func_146284_a");

	/**
	 * <p>
	 * Name: multilineMessage
	 * </p>
	 */
	public static McObfPair field_146305_g = McMappingDatabase.getSRG("field_146305_g");

	/**
	 * <p>
	 * Name: textHeight
	 * </p>
	 */
	public static McObfPair field_175353_i = McMappingDatabase.getSRG("field_175353_i");

	/**
	 * <p>
	 * Name: reason
	 * </p>
	 */
	public static McObfPair field_146306_a = McMappingDatabase.getSRG("field_146306_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiDisconnected.func_73866_w_");

}
