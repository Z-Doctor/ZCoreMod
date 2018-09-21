package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiErrorScreen {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bla";
		else
			return "net/minecraft/client/gui/GuiErrorScreen";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bla";
		else
			return "GuiErrorScreen";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbla;";
		else
			return "Lnet/minecraft/client/gui/GuiErrorScreen;";
	}

	/**
	 * <p>
	 * Name: message
	 * </p>
	 */
	public static McObfPair field_146312_f = McMappingDatabase.getSRG("field_146312_f");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiErrorScreen.func_73869_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiErrorScreen.func_73866_w_");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiErrorScreen.func_146284_a");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_146313_a = McMappingDatabase.getSRG("field_146313_a");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiErrorScreen.func_73863_a");

}
