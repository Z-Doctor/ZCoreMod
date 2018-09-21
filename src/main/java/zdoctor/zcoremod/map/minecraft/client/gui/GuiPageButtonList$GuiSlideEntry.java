package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiPageButtonList$GuiSlideEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp$g";
		else
			return "net/minecraft/client/gui/GuiPageButtonList$GuiSlideEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp$g";
		else
			return "GuiPageButtonList$GuiSlideEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjp$g;";
		else
			return "Lnet/minecraft/client/gui/GuiPageButtonList$GuiSlideEntry;";
	}

	/**
	 * <p>
	 * Name: getMinValue
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_178943_e = McMappingDatabase.getSRG("GuiPageButtonList$GuiSlideEntry.func_178943_e");

	/**
	 * <p>
	 * Name: maxValue
	 * </p>
	 */
	public static McObfPair field_178948_c = McMappingDatabase.getSRG("field_178948_c");

	/**
	 * <p>
	 * Name: getMaxValue
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_178944_f = McMappingDatabase.getSRG("GuiPageButtonList$GuiSlideEntry.func_178944_f");

	/**
	 * <p>
	 * Name: getInitalValue
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_178942_g = McMappingDatabase.getSRG("GuiPageButtonList$GuiSlideEntry.func_178942_g");

	/**
	 * <p>
	 * Name: getFormatter
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/GuiSlider$FormatHelper;]
	 * </p>
	 */
	public static McObfPair func_178945_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiSlideEntry.func_178945_a");

	/**
	 * <p>
	 * Name: formatter
	 * </p>
	 */
	public static McObfPair field_178949_a = McMappingDatabase.getSRG("field_178949_a");

	/**
	 * <p>
	 * Name: initialValue
	 * </p>
	 */
	public static McObfPair field_178946_d = McMappingDatabase.getSRG("field_178946_d");

	/**
	 * <p>
	 * Name: minValue
	 * </p>
	 */
	public static McObfPair field_178947_b = McMappingDatabase.getSRG("field_178947_b");

}
