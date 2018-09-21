package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ScreenChatOptions {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkm";
		else
			return "net/minecraft/client/gui/ScreenChatOptions";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkm";
		else
			return "ScreenChatOptions";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkm;";
		else
			return "Lnet/minecraft/client/gui/ScreenChatOptions;";
	}

	/**
	 * <p>
	 * Name: chatTitle
	 * </p>
	 */
	public static McObfPair field_146401_i = McMappingDatabase.getSRG("field_146401_i");

	/**
	 * <p>
	 * Name: parentScreen
	 * </p>
	 */
	public static McObfPair field_146396_g = McMappingDatabase.getSRG("field_146396_g");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("ScreenChatOptions.func_73869_a");

	/**
	 * <p>
	 * Name: updateNarratorButton
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193024_a = McMappingDatabase.getSRG("ScreenChatOptions.func_193024_a");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("ScreenChatOptions.func_73863_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("ScreenChatOptions.func_146284_a");

	/**
	 * <p>
	 * Name: narratorButton
	 * </p>
	 */
	public static McObfPair field_193025_i = McMappingDatabase.getSRG("field_193025_i");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("ScreenChatOptions.func_73866_w_");

	/**
	 * <p>
	 * Name: game_settings
	 * </p>
	 */
	public static McObfPair field_146400_h = McMappingDatabase.getSRG("field_146400_h");

	/**
	 * <p>
	 * Name: CHAT_OPTIONS
	 * </p>
	 */
	public static McObfPair field_146399_a = McMappingDatabase.getSRG("field_146399_a");

}
