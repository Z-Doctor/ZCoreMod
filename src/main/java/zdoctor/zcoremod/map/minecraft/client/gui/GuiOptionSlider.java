package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiOptionSlider {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjs";
		else
			return "net/minecraft/client/gui/GuiOptionSlider";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjs";
		else
			return "GuiOptionSlider";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjs;";
		else
			return "Lnet/minecraft/client/gui/GuiOptionSlider;";
	}

	/**
	 * <p>
	 * Name: maxValue
	 * </p>
	 */
	public static McObfPair field_146131_s = McMappingDatabase.getSRG("field_146131_s");

	/**
	 * <p>
	 * Name: options
	 * </p>
	 */
	public static McObfPair field_146133_q = McMappingDatabase.getSRG("field_146133_q");

	/**
	 * <p>
	 * Name: dragging
	 * </p>
	 */
	public static McObfPair field_146135_o = McMappingDatabase.getSRG("field_146135_o");

	/**
	 * <p>
	 * Name: mouseDragged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)V]
	 * </p>
	 */
	public static McObfPair func_146119_b = McMappingDatabase.getSRG("GuiOptionSlider.func_146119_b");

	/**
	 * <p>
	 * Name: getHoverState
	 * </p>
	 * <p>
	 * Desc: [(Z)I]
	 * </p>
	 */
	public static McObfPair func_146114_a = McMappingDatabase.getSRG("GuiOptionSlider.func_146114_a");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146118_a = McMappingDatabase.getSRG("GuiOptionSlider.func_146118_a");

	/**
	 * <p>
	 * Name: sliderValue
	 * </p>
	 */
	public static McObfPair field_146134_p = McMappingDatabase.getSRG("field_146134_p");

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)Z]
	 * </p>
	 */
	public static McObfPair func_146116_c = McMappingDatabase.getSRG("GuiOptionSlider.func_146116_c");

	/**
	 * <p>
	 * Name: minValue
	 * </p>
	 */
	public static McObfPair field_146132_r = McMappingDatabase.getSRG("field_146132_r");

}
