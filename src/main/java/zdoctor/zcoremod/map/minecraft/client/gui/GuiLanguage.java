package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiLanguage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blc";
		else
			return "net/minecraft/client/gui/GuiLanguage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blc";
		else
			return "GuiLanguage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblc;";
		else
			return "Lnet/minecraft/client/gui/GuiLanguage;";
	}

	/**
	 * <p>
	 * Name: game_settings_3
	 * </p>
	 */
	public static McObfPair field_146451_g = McMappingDatabase.getSRG("field_146451_g");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiLanguage.func_146274_d");

	/**
	 * <p>
	 * Name: forceUnicodeFontBtn
	 * </p>
	 */
	public static McObfPair field_146455_i = McMappingDatabase.getSRG("field_146455_i");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiLanguage.func_73866_w_");

	/**
	 * <p>
	 * Name: confirmSettingsBtn
	 * </p>
	 */
	public static McObfPair field_146452_r = McMappingDatabase.getSRG("field_146452_r");

	/**
	 * <p>
	 * Name: list
	 * </p>
	 */
	public static McObfPair field_146450_f = McMappingDatabase.getSRG("field_146450_f");

	/**
	 * <p>
	 * Name: parentScreen
	 * </p>
	 */
	public static McObfPair field_146453_a = McMappingDatabase.getSRG("field_146453_a");

	/**
	 * <p>
	 * Name: languageManager
	 * </p>
	 */
	public static McObfPair field_146454_h = McMappingDatabase.getSRG("field_146454_h");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiLanguage.func_146284_a");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiLanguage.func_73863_a");

}
