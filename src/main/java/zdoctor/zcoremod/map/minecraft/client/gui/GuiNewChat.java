package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiNewChat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjb";
		else
			return "net/minecraft/client/gui/GuiNewChat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjb";
		else
			return "GuiNewChat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjb;";
		else
			return "Lnet/minecraft/client/gui/GuiNewChat;";
	}

	/**
	 * <p>
	 * Name: calculateChatboxWidth
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_146233_a = McMappingDatabase.getSRG("GuiNewChat.func_146233_a");

	/**
	 * <p>
	 * Name: calculateChatboxHeight
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_146243_b = McMappingDatabase.getSRG("GuiNewChat.func_146243_b");

	/**
	 * <p>
	 * Name: getChatOpen
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146241_e = McMappingDatabase.getSRG("GuiNewChat.func_146241_e");

	/**
	 * <p>
	 * Name: deleteChatLine
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146242_c = McMappingDatabase.getSRG("GuiNewChat.func_146242_c");

	/**
	 * <p>
	 * Name: clearChatMessages
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_146231_a = McMappingDatabase.getSRG("GuiNewChat.func_146231_a");

	/**
	 * <p>
	 * Name: getSentMessages
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_146238_c = McMappingDatabase.getSRG("GuiNewChat.func_146238_c");

	/**
	 * <p>
	 * Name: isScrolled
	 * </p>
	 */
	public static McObfPair field_146251_k = McMappingDatabase.getSRG("field_146251_k");

	/**
	 * <p>
	 * Name: drawnChatLines
	 * </p>
	 */
	public static McObfPair field_146253_i = McMappingDatabase.getSRG("field_146253_i");

	/**
	 * <p>
	 * Name: resetScroll
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146240_d = McMappingDatabase.getSRG("GuiNewChat.func_146240_d");

	/**
	 * <p>
	 * Name: setChatLine
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;IIZ)V]
	 * </p>
	 */
	public static McObfPair func_146237_a = McMappingDatabase.getSRG("GuiNewChat.func_146237_a");

	/**
	 * <p>
	 * Name: printChatMessageWithOptionalDeletion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;I)V]
	 * </p>
	 */
	public static McObfPair func_146234_a = McMappingDatabase.getSRG("GuiNewChat.func_146234_a");

	/**
	 * <p>
	 * Name: scroll
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146229_b = McMappingDatabase.getSRG("GuiNewChat.func_146229_b");

	/**
	 * <p>
	 * Name: getChatComponent
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_146236_a = McMappingDatabase.getSRG("GuiNewChat.func_146236_a");

	/**
	 * <p>
	 * Name: scrollPos
	 * </p>
	 */
	public static McObfPair field_146250_j = McMappingDatabase.getSRG("field_146250_j");

	/**
	 * <p>
	 * Name: getChatWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_146228_f = McMappingDatabase.getSRG("GuiNewChat.func_146228_f");

	/**
	 * <p>
	 * Name: addToSentMessages
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_146239_a = McMappingDatabase.getSRG("GuiNewChat.func_146239_a");

	/**
	 * <p>
	 * Name: getChatScale
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_146244_h = McMappingDatabase.getSRG("GuiNewChat.func_146244_h");

	/**
	 * <p>
	 * Name: printChatMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_146227_a = McMappingDatabase.getSRG("GuiNewChat.func_146227_a");

	/**
	 * <p>
	 * Name: refreshChat
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146245_b = McMappingDatabase.getSRG("GuiNewChat.func_146245_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_146249_a = McMappingDatabase.getSRG("field_146249_a");

	/**
	 * <p>
	 * Name: drawChat
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146230_a = McMappingDatabase.getSRG("GuiNewChat.func_146230_a");

	/**
	 * <p>
	 * Name: getChatHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_146246_g = McMappingDatabase.getSRG("GuiNewChat.func_146246_g");

	/**
	 * <p>
	 * Name: getLineCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_146232_i = McMappingDatabase.getSRG("GuiNewChat.func_146232_i");

	/**
	 * <p>
	 * Name: chatLines
	 * </p>
	 */
	public static McObfPair field_146252_h = McMappingDatabase.getSRG("field_146252_h");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_146247_f = McMappingDatabase.getSRG("field_146247_f");

	/**
	 * <p>
	 * Name: sentMessages
	 * </p>
	 */
	public static McObfPair field_146248_g = McMappingDatabase.getSRG("field_146248_g");

}
