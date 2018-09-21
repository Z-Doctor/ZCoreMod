package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiOptions {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ble";
		else
			return "net/minecraft/client/gui/GuiOptions";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ble";
		else
			return "GuiOptions";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lble;";
		else
			return "Lnet/minecraft/client/gui/GuiOptions;";
	}

	/**
	 * <p>
	 * Name: SCREEN_OPTIONS
	 * </p>
	 */
	public static McObfPair field_146440_f = McMappingDatabase.getSRG("field_146440_f");

	/**
	 * <p>
	 * Name: difficultyButton
	 * </p>
	 */
	public static McObfPair field_175357_i = McMappingDatabase.getSRG("field_175357_i");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiOptions.func_73863_a");

	/**
	 * <p>
	 * Name: lastScreen
	 * </p>
	 */
	public static McObfPair field_146441_g = McMappingDatabase.getSRG("field_146441_g");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiOptions.func_146284_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiOptions.func_73866_w_");

	/**
	 * <p>
	 * Name: settings
	 * </p>
	 */
	public static McObfPair field_146443_h = McMappingDatabase.getSRG("field_146443_h");

	/**
	 * <p>
	 * Name: getDifficultyText
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumDifficulty;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175355_a = McMappingDatabase.getSRG("GuiOptions.func_175355_a");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_146442_a = McMappingDatabase.getSRG("field_146442_a");

	/**
	 * <p>
	 * Name: lockButton
	 * </p>
	 */
	public static McObfPair field_175356_r = McMappingDatabase.getSRG("field_175356_r");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiOptions.func_73869_a");

	/**
	 * <p>
	 * Name: confirmClicked
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_73878_a = McMappingDatabase.getSRG("GuiOptions.func_73878_a");

}
