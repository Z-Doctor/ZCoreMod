package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenCustomizePresets {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkt";
		else
			return "net/minecraft/client/gui/GuiScreenCustomizePresets";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkt";
		else
			return "GuiScreenCustomizePresets";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkt;";
		else
			return "Lnet/minecraft/client/gui/GuiScreenCustomizePresets;";
	}

	/**
	 * <p>
	 * Name: PRESETS
	 * </p>
	 */
	public static McObfPair field_175310_f = McMappingDatabase.getSRG("field_175310_f");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiScreenCustomizePresets.func_73863_a");

	/**
	 * <p>
	 * Name: parent
	 * </p>
	 */
	public static McObfPair field_175314_r = McMappingDatabase.getSRG("field_175314_r");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiScreenCustomizePresets.func_146281_b");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_175315_a = McMappingDatabase.getSRG("field_175315_a");

	/**
	 * <p>
	 * Name: list
	 * </p>
	 */
	public static McObfPair field_175311_g = McMappingDatabase.getSRG("field_175311_g");

	/**
	 * <p>
	 * Name: listText
	 * </p>
	 */
	public static McObfPair field_175312_t = McMappingDatabase.getSRG("field_175312_t");

	/**
	 * <p>
	 * Name: select
	 * </p>
	 */
	public static McObfPair field_175316_h = McMappingDatabase.getSRG("field_175316_h");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiScreenCustomizePresets.func_146274_d");

	/**
	 * <p>
	 * Name: shareText
	 * </p>
	 */
	public static McObfPair field_175313_s = McMappingDatabase.getSRG("field_175313_s");

	/**
	 * <p>
	 * Name: updateButtonValidity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175304_a = McMappingDatabase.getSRG("GuiScreenCustomizePresets.func_175304_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiScreenCustomizePresets.func_146284_a");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiScreenCustomizePresets.func_73864_a");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiScreenCustomizePresets.func_73869_a");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiScreenCustomizePresets.func_73876_c");

	/**
	 * <p>
	 * Name: export
	 * </p>
	 */
	public static McObfPair field_175317_i = McMappingDatabase.getSRG("field_175317_i");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiScreenCustomizePresets.func_73866_w_");

	/**
	 * <p>
	 * Name: hasValidSelection
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175305_g = McMappingDatabase.getSRG("GuiScreenCustomizePresets.func_175305_g");

}
