package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiLabel {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjh";
		else
			return "net/minecraft/client/gui/GuiLabel";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjh";
		else
			return "GuiLabel";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjh;";
		else
			return "Lnet/minecraft/client/gui/GuiLabel;";
	}

	/**
	 * <p>
	 * Name: drawLabel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)V]
	 * </p>
	 */
	public static McObfPair func_146159_a = McMappingDatabase.getSRG("GuiLabel.func_146159_a");

	/**
	 * <p>
	 * Name: border
	 * </p>
	 */
	public static McObfPair field_146163_s = McMappingDatabase.getSRG("field_146163_s");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_146162_g = McMappingDatabase.getSRG("field_146162_g");

	/**
	 * <p>
	 * Name: centered
	 * </p>
	 */
	public static McObfPair field_146170_l = McMappingDatabase.getSRG("field_146170_l");

	/**
	 * <p>
	 * Name: backColor
	 * </p>
	 */
	public static McObfPair field_146169_o = McMappingDatabase.getSRG("field_146169_o");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_146167_a = McMappingDatabase.getSRG("field_146167_a");

	/**
	 * <p>
	 * Name: ulColor
	 * </p>
	 */
	public static McObfPair field_146166_p = McMappingDatabase.getSRG("field_146166_p");

	/**
	 * <p>
	 * Name: drawLabelBackground
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)V]
	 * </p>
	 */
	public static McObfPair func_146160_b = McMappingDatabase.getSRG("GuiLabel.func_146160_b");

	/**
	 * <p>
	 * Name: labelBgEnabled
	 * </p>
	 */
	public static McObfPair field_146171_m = McMappingDatabase.getSRG("field_146171_m");

	/**
	 * <p>
	 * Name: addLine
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_175202_a = McMappingDatabase.getSRG("GuiLabel.func_175202_a");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_175204_i = McMappingDatabase.getSRG("field_175204_i");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_146174_h = McMappingDatabase.getSRG("field_146174_h");

	/**
	 * <p>
	 * Name: visible
	 * </p>
	 */
	public static McObfPair field_146172_j = McMappingDatabase.getSRG("field_146172_j");

	/**
	 * <p>
	 * Name: labels
	 * </p>
	 */
	public static McObfPair field_146173_k = McMappingDatabase.getSRG("field_146173_k");

	/**
	 * <p>
	 * Name: brColor
	 * </p>
	 */
	public static McObfPair field_146165_q = McMappingDatabase.getSRG("field_146165_q");

	/**
	 * <p>
	 * Name: textColor
	 * </p>
	 */
	public static McObfPair field_146168_n = McMappingDatabase.getSRG("field_146168_n");

	/**
	 * <p>
	 * Name: fontRenderer
	 * </p>
	 */
	public static McObfPair field_146164_r = McMappingDatabase.getSRG("field_146164_r");

	/**
	 * <p>
	 * Name: setCentered
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/GuiLabel;]
	 * </p>
	 */
	public static McObfPair func_175203_a = McMappingDatabase.getSRG("GuiLabel.func_175203_a");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_146161_f = McMappingDatabase.getSRG("field_146161_f");

}
