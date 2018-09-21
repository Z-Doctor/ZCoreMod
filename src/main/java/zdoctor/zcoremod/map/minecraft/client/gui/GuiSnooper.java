package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiSnooper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bln";
		else
			return "net/minecraft/client/gui/GuiSnooper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bln";
		else
			return "GuiSnooper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbln;";
		else
			return "Lnet/minecraft/client/gui/GuiSnooper;";
	}

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_146610_i = McMappingDatabase.getSRG("field_146610_i");

	/**
	 * <p>
	 * Name: values
	 * </p>
	 */
	public static McObfPair field_146609_h = McMappingDatabase.getSRG("field_146609_h");

	/**
	 * <p>
	 * Name: toggleButton
	 * </p>
	 */
	public static McObfPair field_146605_t = McMappingDatabase.getSRG("field_146605_t");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiSnooper.func_146274_d");

	/**
	 * <p>
	 * Name: desc
	 * </p>
	 */
	public static McObfPair field_146607_r = McMappingDatabase.getSRG("field_146607_r");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiSnooper.func_146284_a");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiSnooper.func_73863_a");

	/**
	 * <p>
	 * Name: lastScreen
	 * </p>
	 */
	public static McObfPair field_146608_a = McMappingDatabase.getSRG("field_146608_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiSnooper.func_73866_w_");

	/**
	 * <p>
	 * Name: list
	 * </p>
	 */
	public static McObfPair field_146606_s = McMappingDatabase.getSRG("field_146606_s");

	/**
	 * <p>
	 * Name: keys
	 * </p>
	 */
	public static McObfPair field_146604_g = McMappingDatabase.getSRG("field_146604_g");

	/**
	 * <p>
	 * Name: game_settings_2
	 * </p>
	 */
	public static McObfPair field_146603_f = McMappingDatabase.getSRG("field_146603_f");

}
