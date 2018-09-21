package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiControls {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bme";
		else
			return "net/minecraft/client/gui/GuiControls";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bme";
		else
			return "GuiControls";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbme;";
		else
			return "Lnet/minecraft/client/gui/GuiControls;";
	}

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_146286_b = McMappingDatabase.getSRG("GuiControls.func_146286_b");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiControls.func_73866_w_");

	/**
	 * <p>
	 * Name: time
	 * </p>
	 */
	public static McObfPair field_152177_g = McMappingDatabase.getSRG("field_152177_g");

	/**
	 * <p>
	 * Name: parentScreen
	 * </p>
	 */
	public static McObfPair field_146496_h = McMappingDatabase.getSRG("field_146496_h");

	/**
	 * <p>
	 * Name: options
	 * </p>
	 */
	public static McObfPair field_146497_i = McMappingDatabase.getSRG("field_146497_i");

	/**
	 * <p>
	 * Name: buttonReset
	 * </p>
	 */
	public static McObfPair field_146493_s = McMappingDatabase.getSRG("field_146493_s");

	/**
	 * <p>
	 * Name: buttonId
	 * </p>
	 */
	public static McObfPair field_146491_f = McMappingDatabase.getSRG("field_146491_f");

	/**
	 * <p>
	 * Name: keyBindingList
	 * </p>
	 */
	public static McObfPair field_146494_r = McMappingDatabase.getSRG("field_146494_r");

	/**
	 * <p>
	 * Name: screenTitle
	 * </p>
	 */
	public static McObfPair field_146495_a = McMappingDatabase.getSRG("field_146495_a");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiControls.func_73864_a");

	/**
	 * <p>
	 * Name: OPTIONS_ARR
	 * </p>
	 */
	public static McObfPair field_146492_g = McMappingDatabase.getSRG("field_146492_g");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiControls.func_73869_a");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiControls.func_146274_d");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiControls.func_73863_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiControls.func_146284_a");

}
