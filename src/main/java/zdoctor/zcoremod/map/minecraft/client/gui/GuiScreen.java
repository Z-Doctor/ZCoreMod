package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreen {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blk";
		else
			return "net/minecraft/client/gui/GuiScreen";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blk";
		else
			return "GuiScreen";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblk;";
		else
			return "Lnet/minecraft/client/gui/GuiScreen;";
	}

	/**
	 * <p>
	 * Name: drawHoveringText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;II)V]
	 * </p>
	 */
	public static McObfPair func_146279_a = McMappingDatabase.getSRG("GuiScreen.func_146279_a");

	/**
	 * <p>
	 * Name: handleInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146269_k = McMappingDatabase.getSRG("GuiScreen.func_146269_k");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiScreen.func_73864_a");

	/**
	 * <p>
	 * Name: NEWLINE_SPLITTER
	 * </p>
	 */
	public static McObfPair field_175285_g = McMappingDatabase.getSRG("field_175285_g");

	/**
	 * <p>
	 * Name: getClipboardString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_146277_j = McMappingDatabase.getSRG("GuiScreen.func_146277_j");

	/**
	 * <p>
	 * Name: addButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)Lnet/minecraft/client/gui/GuiButton;]
	 * </p>
	 */
	public static McObfPair func_189646_b = McMappingDatabase.getSRG("GuiScreen.func_189646_b");

	/**
	 * <p>
	 * Name: clickedLinkURI
	 * </p>
	 */
	public static McObfPair field_175286_t = McMappingDatabase.getSRG("field_175286_t");

	/**
	 * <p>
	 * Name: confirmClicked
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_73878_a = McMappingDatabase.getSRG("GuiScreen.func_73878_a");

	/**
	 * <p>
	 * Name: isShiftKeyDown
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146272_n = McMappingDatabase.getSRG("GuiScreen.func_146272_n");

	/**
	 * <p>
	 * Name: lastMouseEvent
	 * </p>
	 */
	public static McObfPair field_146288_g = McMappingDatabase.getSRG("field_146288_g");

	/**
	 * <p>
	 * Name: sendChatMessage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_175275_f = McMappingDatabase.getSRG("GuiScreen.func_175275_f");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_146297_k = McMappingDatabase.getSRG("field_146297_k");

	/**
	 * <p>
	 * Name: handleKeyboardInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146282_l = McMappingDatabase.getSRG("GuiScreen.func_146282_l");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiScreen.func_73876_c");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiScreen.func_73869_a");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_146294_l = McMappingDatabase.getSRG("field_146294_l");

	/**
	 * <p>
	 * Name: fontRenderer
	 * </p>
	 */
	public static McObfPair field_146289_q = McMappingDatabase.getSRG("field_146289_q");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_146286_b = McMappingDatabase.getSRG("GuiScreen.func_146286_b");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiScreen.func_73866_w_");

	/**
	 * <p>
	 * Name: isFocused
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193976_p = McMappingDatabase.getSRG("GuiScreen.func_193976_p");

	/**
	 * <p>
	 * Name: drawHoveringText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;II)V]
	 * </p>
	 */
	public static McObfPair func_146283_a = McMappingDatabase.getSRG("GuiScreen.func_146283_a");

	/**
	 * <p>
	 * Name: handleComponentHover
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;II)V]
	 * </p>
	 */
	public static McObfPair func_175272_a = McMappingDatabase.getSRG("GuiScreen.func_175272_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_175287_a = McMappingDatabase.getSRG("field_175287_a");

	/**
	 * <p>
	 * Name: openWebLink
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/URI;)V]
	 * </p>
	 */
	public static McObfPair func_175282_a = McMappingDatabase.getSRG("GuiScreen.func_175282_a");

	/**
	 * <p>
	 * Name: allowUserInput
	 * </p>
	 */
	public static McObfPair field_146291_p = McMappingDatabase.getSRG("field_146291_p");

	/**
	 * <p>
	 * Name: doesGuiPauseGame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73868_f = McMappingDatabase.getSRG("GuiScreen.func_73868_f");

	/**
	 * <p>
	 * Name: setGuiSize
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_183500_a = McMappingDatabase.getSRG("GuiScreen.func_183500_a");

	/**
	 * <p>
	 * Name: touchValue
	 * </p>
	 */
	public static McObfPair field_146298_h = McMappingDatabase.getSRG("field_146298_h");

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146278_c = McMappingDatabase.getSRG("GuiScreen.func_146278_c");

	/**
	 * <p>
	 * Name: getItemToolTip
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_191927_a = McMappingDatabase.getSRG("GuiScreen.func_191927_a");

	/**
	 * <p>
	 * Name: mouseClickMove
	 * </p>
	 * <p>
	 * Desc: [(IIIJ)V]
	 * </p>
	 */
	public static McObfPair func_146273_a = McMappingDatabase.getSRG("GuiScreen.func_146273_a");

	/**
	 * <p>
	 * Name: focused
	 * </p>
	 */
	public static McObfPair field_193977_u = McMappingDatabase.getSRG("field_193977_u");

	/**
	 * <p>
	 * Name: drawDefaultBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146276_q_ = McMappingDatabase.getSRG("GuiScreen.func_146276_q_");

	/**
	 * <p>
	 * Name: isKeyComboCtrlV
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_175279_e = McMappingDatabase.getSRG("GuiScreen.func_175279_e");

	/**
	 * <p>
	 * Name: isCtrlKeyDown
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146271_m = McMappingDatabase.getSRG("GuiScreen.func_146271_m");

	/**
	 * <p>
	 * Name: buttonList
	 * </p>
	 */
	public static McObfPair field_146292_n = McMappingDatabase.getSRG("field_146292_n");

	/**
	 * <p>
	 * Name: isAltKeyDown
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175283_s = McMappingDatabase.getSRG("GuiScreen.func_175283_s");

	/**
	 * <p>
	 * Name: isKeyComboCtrlC
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_175280_f = McMappingDatabase.getSRG("GuiScreen.func_175280_f");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_146295_m = McMappingDatabase.getSRG("field_146295_m");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiScreen.func_73863_a");

	/**
	 * <p>
	 * Name: setFocused
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_193975_a = McMappingDatabase.getSRG("GuiScreen.func_193975_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiScreen.func_146284_a");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiScreen.func_146281_b");

	/**
	 * <p>
	 * Name: handleComponentClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)Z]
	 * </p>
	 */
	public static McObfPair func_175276_a = McMappingDatabase.getSRG("GuiScreen.func_175276_a");

	/**
	 * <p>
	 * Name: setText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Z)V]
	 * </p>
	 */
	public static McObfPair func_175274_a = McMappingDatabase.getSRG("GuiScreen.func_175274_a");

	/**
	 * <p>
	 * Name: isKeyComboCtrlA
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_175278_g = McMappingDatabase.getSRG("GuiScreen.func_175278_g");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiScreen.func_146274_d");

	/**
	 * <p>
	 * Name: labelList
	 * </p>
	 */
	public static McObfPair field_146293_o = McMappingDatabase.getSRG("field_146293_o");

	/**
	 * <p>
	 * Name: eventButton
	 * </p>
	 */
	public static McObfPair field_146287_f = McMappingDatabase.getSRG("field_146287_f");

	/**
	 * <p>
	 * Name: selectedButton
	 * </p>
	 */
	public static McObfPair field_146290_a = McMappingDatabase.getSRG("field_146290_a");

	/**
	 * <p>
	 * Name: sendChatMessage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Z)V]
	 * </p>
	 */
	public static McObfPair func_175281_b = McMappingDatabase.getSRG("GuiScreen.func_175281_b");

	/**
	 * <p>
	 * Name: isKeyComboCtrlX
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_175277_d = McMappingDatabase.getSRG("GuiScreen.func_175277_d");

	/**
	 * <p>
	 * Name: setClipboardString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_146275_d = McMappingDatabase.getSRG("GuiScreen.func_146275_d");

	/**
	 * <p>
	 * Name: renderToolTip
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;II)V]
	 * </p>
	 */
	public static McObfPair func_146285_a = McMappingDatabase.getSRG("GuiScreen.func_146285_a");

	/**
	 * <p>
	 * Name: setWorldAndResolution
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)V]
	 * </p>
	 */
	public static McObfPair func_146280_a = McMappingDatabase.getSRG("GuiScreen.func_146280_a");

	/**
	 * <p>
	 * Name: drawWorldBackground
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146270_b = McMappingDatabase.getSRG("GuiScreen.func_146270_b");

	/**
	 * <p>
	 * Name: PROTOCOLS
	 * </p>
	 */
	public static McObfPair field_175284_f = McMappingDatabase.getSRG("field_175284_f");

	/**
	 * <p>
	 * Name: itemRender
	 * </p>
	 */
	public static McObfPair field_146296_j = McMappingDatabase.getSRG("field_146296_j");

	/**
	 * <p>
	 * Name: onResize
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)V]
	 * </p>
	 */
	public static McObfPair func_175273_b = McMappingDatabase.getSRG("GuiScreen.func_175273_b");

}
