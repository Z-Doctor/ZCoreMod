package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiSlider {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjf";
		else
			return "net/minecraft/client/gui/GuiSlider";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjf";
		else
			return "GuiSlider";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjf;";
		else
			return "Lnet/minecraft/client/gui/GuiSlider;";
	}

	/**
	 * <p>
	 * Name: setSliderValue
	 * </p>
	 * <p>
	 * Desc: [(FZ)V]
	 * </p>
	 */
	public static McObfPair func_175218_a = McMappingDatabase.getSRG("GuiSlider.func_175218_a");

	/**
	 * <p>
	 * Name: mouseDragged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)V]
	 * </p>
	 */
	public static McObfPair func_146119_b = McMappingDatabase.getSRG("GuiSlider.func_146119_b");

	/**
	 * <p>
	 * Name: isMouseDown
	 * </p>
	 */
	public static McObfPair field_175228_o = McMappingDatabase.getSRG("field_175228_o");

	/**
	 * <p>
	 * Name: sliderPosition
	 * </p>
	 */
	public static McObfPair field_175227_p = McMappingDatabase.getSRG("field_175227_p");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146118_a = McMappingDatabase.getSRG("GuiSlider.func_146118_a");

	/**
	 * <p>
	 * Name: formatHelper
	 * </p>
	 */
	public static McObfPair field_175222_u = McMappingDatabase.getSRG("field_175222_u");

	/**
	 * <p>
	 * Name: min
	 * </p>
	 */
	public static McObfPair field_175225_r = McMappingDatabase.getSRG("field_175225_r");

	/**
	 * <p>
	 * Name: getDisplayString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175221_e = McMappingDatabase.getSRG("GuiSlider.func_175221_e");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_175226_q = McMappingDatabase.getSRG("field_175226_q");

	/**
	 * <p>
	 * Name: setSliderPosition
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_175219_a = McMappingDatabase.getSRG("GuiSlider.func_175219_a");

	/**
	 * <p>
	 * Name: getSliderPosition
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_175217_d = McMappingDatabase.getSRG("GuiSlider.func_175217_d");

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)Z]
	 * </p>
	 */
	public static McObfPair func_146116_c = McMappingDatabase.getSRG("GuiSlider.func_146116_c");

	/**
	 * <p>
	 * Name: getSliderValue
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_175220_c = McMappingDatabase.getSRG("GuiSlider.func_175220_c");

	/**
	 * <p>
	 * Name: responder
	 * </p>
	 */
	public static McObfPair field_175223_t = McMappingDatabase.getSRG("field_175223_t");

	/**
	 * <p>
	 * Name: max
	 * </p>
	 */
	public static McObfPair field_175224_s = McMappingDatabase.getSRG("field_175224_s");

	/**
	 * <p>
	 * Name: getHoverState
	 * </p>
	 * <p>
	 * Desc: [(Z)I]
	 * </p>
	 */
	public static McObfPair func_146114_a = McMappingDatabase.getSRG("GuiSlider.func_146114_a");

}
