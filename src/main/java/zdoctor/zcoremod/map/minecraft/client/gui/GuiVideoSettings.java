package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiVideoSettings {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bls";
		else
			return "net/minecraft/client/gui/GuiVideoSettings";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bls";
		else
			return "GuiVideoSettings";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbls;";
		else
			return "Lnet/minecraft/client/gui/GuiVideoSettings;";
	}

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiVideoSettings.func_73863_a");

	/**
	 * <p>
	 * Name: screenTitle
	 * </p>
	 */
	public static McObfPair field_146500_a = McMappingDatabase.getSRG("field_146500_a");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_146286_b = McMappingDatabase.getSRG("GuiVideoSettings.func_146286_b");

	/**
	 * <p>
	 * Name: guiGameSettings
	 * </p>
	 */
	public static McObfPair field_146499_g = McMappingDatabase.getSRG("field_146499_g");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiVideoSettings.func_146274_d");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiVideoSettings.func_73869_a");

	/**
	 * <p>
	 * Name: optionsRowList
	 * </p>
	 */
	public static McObfPair field_146501_h = McMappingDatabase.getSRG("field_146501_h");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiVideoSettings.func_146284_a");

	/**
	 * <p>
	 * Name: VIDEO_OPTIONS
	 * </p>
	 */
	public static McObfPair field_146502_i = McMappingDatabase.getSRG("field_146502_i");

	/**
	 * <p>
	 * Name: parentGuiScreen
	 * </p>
	 */
	public static McObfPair field_146498_f = McMappingDatabase.getSRG("field_146498_f");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiVideoSettings.func_73866_w_");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiVideoSettings.func_73864_a");

}
