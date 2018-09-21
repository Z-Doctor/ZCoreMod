package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiCommandBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bml";
		else
			return "net/minecraft/client/gui/GuiCommandBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bml";
		else
			return "GuiCommandBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbml;";
		else
			return "Lnet/minecraft/client/gui/GuiCommandBlock;";
	}

	/**
	 * <p>
	 * Name: updateGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184075_a = McMappingDatabase.getSRG("GuiCommandBlock.func_184075_a");

	/**
	 * <p>
	 * Name: updateConditional
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184077_i = McMappingDatabase.getSRG("GuiCommandBlock.func_184077_i");

	/**
	 * <p>
	 * Name: nextMode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184074_h = McMappingDatabase.getSRG("GuiCommandBlock.func_184074_h");

	/**
	 * <p>
	 * Name: automatic
	 * </p>
	 */
	public static McObfPair field_184085_z = McMappingDatabase.getSRG("field_184085_z");

	/**
	 * <p>
	 * Name: updateMode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184073_g = McMappingDatabase.getSRG("GuiCommandBlock.func_184073_g");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiCommandBlock.func_146284_a");

	/**
	 * <p>
	 * Name: doneBtn
	 * </p>
	 */
	public static McObfPair field_146490_i = McMappingDatabase.getSRG("field_146490_i");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiCommandBlock.func_73863_a");

	/**
	 * <p>
	 * Name: setCompletions
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184072_a = McMappingDatabase.getSRG("GuiCommandBlock.func_184072_a");

	/**
	 * <p>
	 * Name: commandTextField
	 * </p>
	 */
	public static McObfPair field_146485_f = McMappingDatabase.getSRG("field_146485_f");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiCommandBlock.func_73864_a");

	/**
	 * <p>
	 * Name: outputBtn
	 * </p>
	 */
	public static McObfPair field_175390_s = McMappingDatabase.getSRG("field_175390_s");

	/**
	 * <p>
	 * Name: trackOutput
	 * </p>
	 */
	public static McObfPair field_175389_t = McMappingDatabase.getSRG("field_175389_t");

	/**
	 * <p>
	 * Name: autoExecBtn
	 * </p>
	 */
	public static McObfPair field_184081_u = McMappingDatabase.getSRG("field_184081_u");

	/**
	 * <p>
	 * Name: conditionalBtn
	 * </p>
	 */
	public static McObfPair field_184080_t = McMappingDatabase.getSRG("field_184080_t");

	/**
	 * <p>
	 * Name: cancelBtn
	 * </p>
	 */
	public static McObfPair field_146487_r = McMappingDatabase.getSRG("field_146487_r");

	/**
	 * <p>
	 * Name: tabCompleter
	 * </p>
	 */
	public static McObfPair field_184083_x = McMappingDatabase.getSRG("field_184083_x");

	/**
	 * <p>
	 * Name: conditional
	 * </p>
	 */
	public static McObfPair field_184084_y = McMappingDatabase.getSRG("field_184084_y");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiCommandBlock.func_73866_w_");

	/**
	 * <p>
	 * Name: updateCmdOutput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175388_a = McMappingDatabase.getSRG("GuiCommandBlock.func_175388_a");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiCommandBlock.func_73876_c");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiCommandBlock.func_73869_a");

	/**
	 * <p>
	 * Name: updateAutoExec
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184076_j = McMappingDatabase.getSRG("GuiCommandBlock.func_184076_j");

	/**
	 * <p>
	 * Name: commandBlock
	 * </p>
	 */
	public static McObfPair field_184078_g = McMappingDatabase.getSRG("field_184078_g");

	/**
	 * <p>
	 * Name: previousOutputTextField
	 * </p>
	 */
	public static McObfPair field_146486_g = McMappingDatabase.getSRG("field_146486_g");

	/**
	 * <p>
	 * Name: modeBtn
	 * </p>
	 */
	public static McObfPair field_184079_s = McMappingDatabase.getSRG("field_184079_s");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiCommandBlock.func_146281_b");

	/**
	 * <p>
	 * Name: commandBlockMode
	 * </p>
	 */
	public static McObfPair field_184082_w = McMappingDatabase.getSRG("field_184082_w");

}
