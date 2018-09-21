package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiTextField {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bje";
		else
			return "net/minecraft/client/gui/GuiTextField";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bje";
		else
			return "GuiTextField";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbje;";
		else
			return "Lnet/minecraft/client/gui/GuiTextField;";
	}

	/**
	 * <p>
	 * Name: getVisible
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146176_q = McMappingDatabase.getSRG("GuiTextField.func_146176_q");

	/**
	 * <p>
	 * Name: getNthWordFromPosWS
	 * </p>
	 * <p>
	 * Desc: [(IIZ)I]
	 * </p>
	 */
	public static McObfPair func_146197_a = McMappingDatabase.getSRG("GuiTextField.func_146197_a");

	/**
	 * <p>
	 * Name: getMaxStringLength
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_146208_g = McMappingDatabase.getSRG("GuiTextField.func_146208_g");

	/**
	 * <p>
	 * Name: setVisible
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_146189_e = McMappingDatabase.getSRG("GuiTextField.func_146189_e");

	/**
	 * <p>
	 * Name: getNthWordFromCursor
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_146187_c = McMappingDatabase.getSRG("GuiTextField.func_146187_c");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175206_d = McMappingDatabase.getSRG("GuiTextField.func_175206_d");

	/**
	 * <p>
	 * Name: writeText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_146191_b = McMappingDatabase.getSRG("GuiTextField.func_146191_b");

	/**
	 * <p>
	 * Name: isFocused
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146206_l = McMappingDatabase.getSRG("GuiTextField.func_146206_l");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_146218_h = McMappingDatabase.getSRG("field_146218_h");

	/**
	 * <p>
	 * Name: setMaxStringLength
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146203_f = McMappingDatabase.getSRG("GuiTextField.func_146203_f");

	/**
	 * <p>
	 * Name: enableBackgroundDrawing
	 * </p>
	 */
	public static McObfPair field_146215_m = McMappingDatabase.getSRG("field_146215_m");

	/**
	 * <p>
	 * Name: visible
	 * </p>
	 */
	public static McObfPair field_146220_v = McMappingDatabase.getSRG("field_146220_v");

	/**
	 * <p>
	 * Name: setCanLoseFocus
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_146205_d = McMappingDatabase.getSRG("GuiTextField.func_146205_d");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)Z]
	 * </p>
	 */
	public static McObfPair func_146192_a = McMappingDatabase.getSRG("GuiTextField.func_146192_a");

	/**
	 * <p>
	 * Name: fontRenderer
	 * </p>
	 */
	public static McObfPair field_146211_a = McMappingDatabase.getSRG("field_146211_a");

	/**
	 * <p>
	 * Name: getSelectionEnd
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_146186_n = McMappingDatabase.getSRG("GuiTextField.func_146186_n");

	/**
	 * <p>
	 * Name: deleteWords
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146177_a = McMappingDatabase.getSRG("GuiTextField.func_146177_a");

	/**
	 * <p>
	 * Name: setSelectionPos
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146199_i = McMappingDatabase.getSRG("GuiTextField.func_146199_i");

	/**
	 * <p>
	 * Name: drawTextBox
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146194_f = McMappingDatabase.getSRG("GuiTextField.func_146194_f");

	/**
	 * <p>
	 * Name: getEnableBackgroundDrawing
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146181_i = McMappingDatabase.getSRG("GuiTextField.func_146181_i");

	/**
	 * <p>
	 * Name: setGuiResponder
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiPageButtonList$GuiResponder;)V]
	 * </p>
	 */
	public static McObfPair func_175207_a = McMappingDatabase.getSRG("GuiTextField.func_175207_a");

	/**
	 * <p>
	 * Name: isFocused
	 * </p>
	 */
	public static McObfPair field_146213_o = McMappingDatabase.getSRG("field_146213_o");

	/**
	 * <p>
	 * Name: setText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_146180_a = McMappingDatabase.getSRG("GuiTextField.func_146180_a");

	/**
	 * <p>
	 * Name: text
	 * </p>
	 */
	public static McObfPair field_146216_j = McMappingDatabase.getSRG("field_146216_j");

	/**
	 * <p>
	 * Name: setCursorPositionZero
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146196_d = McMappingDatabase.getSRG("GuiTextField.func_146196_d");

	/**
	 * <p>
	 * Name: getText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_146179_b = McMappingDatabase.getSRG("GuiTextField.func_146179_b");

	/**
	 * <p>
	 * Name: lineScrollOffset
	 * </p>
	 */
	public static McObfPair field_146225_q = McMappingDatabase.getSRG("field_146225_q");

	/**
	 * <p>
	 * Name: getNthWordFromPos
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_146183_a = McMappingDatabase.getSRG("GuiTextField.func_146183_a");

	/**
	 * <p>
	 * Name: setCursorPositionEnd
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146202_e = McMappingDatabase.getSRG("GuiTextField.func_146202_e");

	/**
	 * <p>
	 * Name: setResponderEntryValue
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_190516_a = McMappingDatabase.getSRG("GuiTextField.func_190516_a");

	/**
	 * <p>
	 * Name: setTextColor
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146193_g = McMappingDatabase.getSRG("GuiTextField.func_146193_g");

	/**
	 * <p>
	 * Name: getWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_146200_o = McMappingDatabase.getSRG("GuiTextField.func_146200_o");

	/**
	 * <p>
	 * Name: isEnabled
	 * </p>
	 */
	public static McObfPair field_146226_p = McMappingDatabase.getSRG("field_146226_p");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_175208_g = McMappingDatabase.getSRG("field_175208_g");

	/**
	 * <p>
	 * Name: enabledColor
	 * </p>
	 */
	public static McObfPair field_146222_t = McMappingDatabase.getSRG("field_146222_t");

	/**
	 * <p>
	 * Name: selectionEnd
	 * </p>
	 */
	public static McObfPair field_146223_s = McMappingDatabase.getSRG("field_146223_s");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_146209_f = McMappingDatabase.getSRG("field_146209_f");

	/**
	 * <p>
	 * Name: cursorCounter
	 * </p>
	 */
	public static McObfPair field_146214_l = McMappingDatabase.getSRG("field_146214_l");

	/**
	 * <p>
	 * Name: textboxKeyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)Z]
	 * </p>
	 */
	public static McObfPair func_146201_a = McMappingDatabase.getSRG("GuiTextField.func_146201_a");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_146219_i = McMappingDatabase.getSRG("field_146219_i");

	/**
	 * <p>
	 * Name: cursorPosition
	 * </p>
	 */
	public static McObfPair field_146224_r = McMappingDatabase.getSRG("field_146224_r");

	/**
	 * <p>
	 * Name: setEnableBackgroundDrawing
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_146185_a = McMappingDatabase.getSRG("GuiTextField.func_146185_a");

	/**
	 * <p>
	 * Name: setDisabledTextColour
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146204_h = McMappingDatabase.getSRG("GuiTextField.func_146204_h");

	/**
	 * <p>
	 * Name: getCursorPosition
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_146198_h = McMappingDatabase.getSRG("GuiTextField.func_146198_h");

	/**
	 * <p>
	 * Name: guiResponder
	 * </p>
	 */
	public static McObfPair field_175210_x = McMappingDatabase.getSRG("field_175210_x");

	/**
	 * <p>
	 * Name: validator
	 * </p>
	 */
	public static McObfPair field_175209_y = McMappingDatabase.getSRG("field_175209_y");

	/**
	 * <p>
	 * Name: getSelectedText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_146207_c = McMappingDatabase.getSRG("GuiTextField.func_146207_c");

	/**
	 * <p>
	 * Name: maxStringLength
	 * </p>
	 */
	public static McObfPair field_146217_k = McMappingDatabase.getSRG("field_146217_k");

	/**
	 * <p>
	 * Name: setEnabled
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_146184_c = McMappingDatabase.getSRG("GuiTextField.func_146184_c");

	/**
	 * <p>
	 * Name: setValidator
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/common/base/Predicate;)V]
	 * </p>
	 */
	public static McObfPair func_175205_a = McMappingDatabase.getSRG("GuiTextField.func_175205_a");

	/**
	 * <p>
	 * Name: canLoseFocus
	 * </p>
	 */
	public static McObfPair field_146212_n = McMappingDatabase.getSRG("field_146212_n");

	/**
	 * <p>
	 * Name: setFocused
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_146195_b = McMappingDatabase.getSRG("GuiTextField.func_146195_b");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_146210_g = McMappingDatabase.getSRG("field_146210_g");

	/**
	 * <p>
	 * Name: disabledColor
	 * </p>
	 */
	public static McObfPair field_146221_u = McMappingDatabase.getSRG("field_146221_u");

	/**
	 * <p>
	 * Name: drawSelectionBox
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_146188_c = McMappingDatabase.getSRG("GuiTextField.func_146188_c");

	/**
	 * <p>
	 * Name: deleteFromCursor
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146175_b = McMappingDatabase.getSRG("GuiTextField.func_146175_b");

	/**
	 * <p>
	 * Name: updateCursorCounter
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146178_a = McMappingDatabase.getSRG("GuiTextField.func_146178_a");

	/**
	 * <p>
	 * Name: moveCursorBy
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146182_d = McMappingDatabase.getSRG("GuiTextField.func_146182_d");

	/**
	 * <p>
	 * Name: setCursorPosition
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146190_e = McMappingDatabase.getSRG("GuiTextField.func_146190_e");

}
