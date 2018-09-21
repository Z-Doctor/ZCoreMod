package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiYesNo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkq";
		else
			return "net/minecraft/client/gui/GuiYesNo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkq";
		else
			return "GuiYesNo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkq;";
		else
			return "Lnet/minecraft/client/gui/GuiYesNo;";
	}

	/**
	 * <p>
	 * Name: setButtonDelay
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_146350_a = McMappingDatabase.getSRG("GuiYesNo.func_146350_a");

	/**
	 * <p>
	 * Name: cancelButtonText
	 * </p>
	 */
	public static McObfPair field_146356_h = McMappingDatabase.getSRG("field_146356_h");

	/**
	 * <p>
	 * Name: confirmButtonText
	 * </p>
	 */
	public static McObfPair field_146352_g = McMappingDatabase.getSRG("field_146352_g");

	/**
	 * <p>
	 * Name: messageLine1
	 * </p>
	 */
	public static McObfPair field_146351_f = McMappingDatabase.getSRG("field_146351_f");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiYesNo.func_73863_a");

	/**
	 * <p>
	 * Name: messageLine2
	 * </p>
	 */
	public static McObfPair field_146354_r = McMappingDatabase.getSRG("field_146354_r");

	/**
	 * <p>
	 * Name: parentScreen
	 * </p>
	 */
	public static McObfPair field_146355_a = McMappingDatabase.getSRG("field_146355_a");

	/**
	 * <p>
	 * Name: ticksUntilEnable
	 * </p>
	 */
	public static McObfPair field_146353_s = McMappingDatabase.getSRG("field_146353_s");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiYesNo.func_146284_a");

	/**
	 * <p>
	 * Name: listLines
	 * </p>
	 */
	public static McObfPair field_175298_s = McMappingDatabase.getSRG("field_175298_s");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiYesNo.func_73876_c");

	/**
	 * <p>
	 * Name: parentButtonClickedId
	 * </p>
	 */
	public static McObfPair field_146357_i = McMappingDatabase.getSRG("field_146357_i");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiYesNo.func_73866_w_");

}
