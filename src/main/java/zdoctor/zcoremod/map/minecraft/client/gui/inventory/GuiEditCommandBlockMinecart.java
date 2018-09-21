package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiEditCommandBlockMinecart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmz";
		else
			return "net/minecraft/client/gui/inventory/GuiEditCommandBlockMinecart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmz";
		else
			return "GuiEditCommandBlockMinecart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmz;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiEditCommandBlockMinecart;";
	}

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiEditCommandBlockMinecart.func_73866_w_");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiEditCommandBlockMinecart.func_73869_a");

	/**
	 * <p>
	 * Name: doneButton
	 * </p>
	 */
	public static McObfPair field_184094_h = McMappingDatabase.getSRG("field_184094_h");

	/**
	 * <p>
	 * Name: trackOutput
	 * </p>
	 */
	public static McObfPair field_184090_s = McMappingDatabase.getSRG("field_184090_s");

	/**
	 * <p>
	 * Name: outputButton
	 * </p>
	 */
	public static McObfPair field_184089_r = McMappingDatabase.getSRG("field_184089_r");

	/**
	 * <p>
	 * Name: previousEdit
	 * </p>
	 */
	public static McObfPair field_184092_f = McMappingDatabase.getSRG("field_184092_f");

	/**
	 * <p>
	 * Name: tabCompleter
	 * </p>
	 */
	public static McObfPair field_184091_t = McMappingDatabase.getSRG("field_184091_t");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiEditCommandBlockMinecart.func_146281_b");

	/**
	 * <p>
	 * Name: cancelButton
	 * </p>
	 */
	public static McObfPair field_184095_i = McMappingDatabase.getSRG("field_184095_i");

	/**
	 * <p>
	 * Name: commandBlockLogic
	 * </p>
	 */
	public static McObfPair field_184093_g = McMappingDatabase.getSRG("field_184093_g");

	/**
	 * <p>
	 * Name: updateCommandOutput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184087_a = McMappingDatabase.getSRG("GuiEditCommandBlockMinecart.func_184087_a");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiEditCommandBlockMinecart.func_73863_a");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiEditCommandBlockMinecart.func_73864_a");

	/**
	 * <p>
	 * Name: commandField
	 * </p>
	 */
	public static McObfPair field_184088_a = McMappingDatabase.getSRG("field_184088_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiEditCommandBlockMinecart.func_146284_a");

	/**
	 * <p>
	 * Name: setCompletions
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184072_a = McMappingDatabase.getSRG("GuiEditCommandBlockMinecart.func_184072_a");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiEditCommandBlockMinecart.func_73876_c");

}
