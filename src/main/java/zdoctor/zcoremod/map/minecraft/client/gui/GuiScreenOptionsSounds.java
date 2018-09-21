package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenOptionsSounds {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blo";
		else
			return "net/minecraft/client/gui/GuiScreenOptionsSounds";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blo";
		else
			return "GuiScreenOptionsSounds";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblo;";
		else
			return "Lnet/minecraft/client/gui/GuiScreenOptionsSounds;";
	}

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiScreenOptionsSounds.func_146284_a");

	/**
	 * <p>
	 * Name: game_settings_4
	 * </p>
	 */
	public static McObfPair field_146506_g = McMappingDatabase.getSRG("field_146506_g");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiScreenOptionsSounds.func_73869_a");

	/**
	 * <p>
	 * Name: getDisplayString
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundCategory;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_184097_a = McMappingDatabase.getSRG("GuiScreenOptionsSounds.func_184097_a");

	/**
	 * <p>
	 * Name: parent
	 * </p>
	 */
	public static McObfPair field_146505_f = McMappingDatabase.getSRG("field_146505_f");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiScreenOptionsSounds.func_73863_a");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_146507_a = McMappingDatabase.getSRG("field_146507_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiScreenOptionsSounds.func_73866_w_");

	/**
	 * <p>
	 * Name: offDisplayString
	 * </p>
	 */
	public static McObfPair field_146508_h = McMappingDatabase.getSRG("field_146508_h");

}
