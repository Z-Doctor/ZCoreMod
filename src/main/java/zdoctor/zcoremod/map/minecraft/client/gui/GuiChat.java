package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiChat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkn";
		else
			return "net/minecraft/client/gui/GuiChat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkn";
		else
			return "GuiChat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkn;";
		else
			return "Lnet/minecraft/client/gui/GuiChat;";
	}

	/**
	 * <p>
	 * Name: setText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Z)V]
	 * </p>
	 */
	public static McObfPair func_175274_a = McMappingDatabase.getSRG("GuiChat.func_175274_a");

	/**
	 * <p>
	 * Name: tabCompleter
	 * </p>
	 */
	public static McObfPair field_184096_i = McMappingDatabase.getSRG("field_184096_i");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiChat.func_73864_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiChat.func_73866_w_");

	/**
	 * <p>
	 * Name: historyBuffer
	 * </p>
	 */
	public static McObfPair field_146410_g = McMappingDatabase.getSRG("field_146410_g");

	/**
	 * <p>
	 * Name: doesGuiPauseGame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73868_f = McMappingDatabase.getSRG("GuiChat.func_73868_f");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiChat.func_73863_a");

	/**
	 * <p>
	 * Name: sentHistoryCursor
	 * </p>
	 */
	public static McObfPair field_146416_h = McMappingDatabase.getSRG("field_146416_h");

	/**
	 * <p>
	 * Name: inputField
	 * </p>
	 */
	public static McObfPair field_146415_a = McMappingDatabase.getSRG("field_146415_a");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiChat.func_146281_b");

	/**
	 * <p>
	 * Name: setCompletions
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184072_a = McMappingDatabase.getSRG("GuiChat.func_184072_a");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiChat.func_73869_a");

	/**
	 * <p>
	 * Name: getSentHistory
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146402_a = McMappingDatabase.getSRG("GuiChat.func_146402_a");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiChat.func_73876_c");

	/**
	 * <p>
	 * Name: defaultInputFieldText
	 * </p>
	 */
	public static McObfPair field_146409_v = McMappingDatabase.getSRG("field_146409_v");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_146408_f = McMappingDatabase.getSRG("field_146408_f");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiChat.func_146274_d");

}
