package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiButton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bja";
		else
			return "net/minecraft/client/gui/GuiButton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bja";
		else
			return "GuiButton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbja;";
		else
			return "Lnet/minecraft/client/gui/GuiButton;";
	}

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_146129_i = McMappingDatabase.getSRG("field_146129_i");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146118_a = McMappingDatabase.getSRG("GuiButton.func_146118_a");

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)Z]
	 * </p>
	 */
	public static McObfPair func_146116_c = McMappingDatabase.getSRG("GuiButton.func_146116_c");

	/**
	 * <p>
	 * Name: hovered
	 * </p>
	 */
	public static McObfPair field_146123_n = McMappingDatabase.getSRG("field_146123_n");

	/**
	 * <p>
	 * Name: visible
	 * </p>
	 */
	public static McObfPair field_146125_m = McMappingDatabase.getSRG("field_146125_m");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_146128_h = McMappingDatabase.getSRG("field_146128_h");

	/**
	 * <p>
	 * Name: drawButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IIF)V]
	 * </p>
	 */
	public static McObfPair func_191745_a = McMappingDatabase.getSRG("GuiButton.func_191745_a");

	/**
	 * <p>
	 * Name: isMouseOver
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146115_a = McMappingDatabase.getSRG("GuiButton.func_146115_a");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_146120_f = McMappingDatabase.getSRG("field_146120_f");

	/**
	 * <p>
	 * Name: getButtonWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_146117_b = McMappingDatabase.getSRG("GuiButton.func_146117_b");

	/**
	 * <p>
	 * Name: playPressSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/SoundHandler;)V]
	 * </p>
	 */
	public static McObfPair func_146113_a = McMappingDatabase.getSRG("GuiButton.func_146113_a");

	/**
	 * <p>
	 * Name: displayString
	 * </p>
	 */
	public static McObfPair field_146126_j = McMappingDatabase.getSRG("field_146126_j");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_146121_g = McMappingDatabase.getSRG("field_146121_g");

	/**
	 * <p>
	 * Name: getHoverState
	 * </p>
	 * <p>
	 * Desc: [(Z)I]
	 * </p>
	 */
	public static McObfPair func_146114_a = McMappingDatabase.getSRG("GuiButton.func_146114_a");

	/**
	 * <p>
	 * Name: enabled
	 * </p>
	 */
	public static McObfPair field_146124_l = McMappingDatabase.getSRG("field_146124_l");

	/**
	 * <p>
	 * Name: drawButtonForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146111_b = McMappingDatabase.getSRG("GuiButton.func_146111_b");

	/**
	 * <p>
	 * Name: setWidth
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_175211_a = McMappingDatabase.getSRG("GuiButton.func_175211_a");

	/**
	 * <p>
	 * Name: BUTTON_TEXTURES
	 * </p>
	 */
	public static McObfPair field_146122_a = McMappingDatabase.getSRG("field_146122_a");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_146127_k = McMappingDatabase.getSRG("field_146127_k");

	/**
	 * <p>
	 * Name: mouseDragged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)V]
	 * </p>
	 */
	public static McObfPair func_146119_b = McMappingDatabase.getSRG("GuiButton.func_146119_b");

}
