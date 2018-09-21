package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiCustomizeWorldScreen {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bku";
		else
			return "net/minecraft/client/gui/GuiCustomizeWorldScreen";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bku";
		else
			return "GuiCustomizeWorldScreen";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbku;";
		else
			return "Lnet/minecraft/client/gui/GuiCustomizeWorldScreen;";
	}

	/**
	 * <p>
	 * Name: setSettingsModified
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_181031_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_181031_a");

	/**
	 * <p>
	 * Name: confirm
	 * </p>
	 */
	public static McObfPair field_175352_x = McMappingDatabase.getSRG("field_175352_x");

	/**
	 * <p>
	 * Name: settings
	 * </p>
	 */
	public static McObfPair field_175336_F = McMappingDatabase.getSRG("field_175336_F");

	/**
	 * <p>
	 * Name: list
	 * </p>
	 */
	public static McObfPair field_175349_r = McMappingDatabase.getSRG("field_175349_r");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_146286_b = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_146286_b");

	/**
	 * <p>
	 * Name: cancel
	 * </p>
	 */
	public static McObfPair field_175351_y = McMappingDatabase.getSRG("field_175351_y");

	/**
	 * <p>
	 * Name: exitConfirmation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175331_h = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175331_h");

	/**
	 * <p>
	 * Name: pageTitle
	 * </p>
	 */
	public static McObfPair field_175335_g = McMappingDatabase.getSRG("field_175335_g");

	/**
	 * <p>
	 * Name: getText
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;F)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175318_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175318_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_146284_a");

	/**
	 * <p>
	 * Name: setEntryValue
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_175319_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175319_a");

	/**
	 * <p>
	 * Name: defaultSettings
	 * </p>
	 */
	public static McObfPair field_175334_E = McMappingDatabase.getSRG("field_175334_E");

	/**
	 * <p>
	 * Name: setEntryValue
	 * </p>
	 * <p>
	 * Desc: [(IF)V]
	 * </p>
	 */
	public static McObfPair func_175320_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175320_a");

	/**
	 * <p>
	 * Name: presets
	 * </p>
	 */
	public static McObfPair field_175350_z = McMappingDatabase.getSRG("field_175350_z");

	/**
	 * <p>
	 * Name: random
	 * </p>
	 */
	public static McObfPair field_175337_G = McMappingDatabase.getSRG("field_175337_G");

	/**
	 * <p>
	 * Name: done
	 * </p>
	 */
	public static McObfPair field_175348_s = McMappingDatabase.getSRG("field_175348_s");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_73864_a");

	/**
	 * <p>
	 * Name: loadValues
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_175324_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175324_a");

	/**
	 * <p>
	 * Name: saveValues
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175323_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175323_a");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_175341_a = McMappingDatabase.getSRG("field_175341_a");

	/**
	 * <p>
	 * Name: enterConfirmation
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_175322_b = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175322_b");

	/**
	 * <p>
	 * Name: getFormattedValue
	 * </p>
	 * <p>
	 * Desc: [(IF)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175330_b = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175330_b");

	/**
	 * <p>
	 * Name: parent
	 * </p>
	 */
	public static McObfPair field_175343_i = McMappingDatabase.getSRG("field_175343_i");

	/**
	 * <p>
	 * Name: modifyFocusValue
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_175327_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175327_a");

	/**
	 * <p>
	 * Name: pageNames
	 * </p>
	 */
	public static McObfPair field_175342_h = McMappingDatabase.getSRG("field_175342_h");

	/**
	 * <p>
	 * Name: setConfirmationControls
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_175329_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175329_a");

	/**
	 * <p>
	 * Name: createPagedList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175325_f = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175325_f");

	/**
	 * <p>
	 * Name: setEntryValue
	 * </p>
	 * <p>
	 * Desc: [(IZ)V]
	 * </p>
	 */
	public static McObfPair func_175321_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175321_a");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_73863_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_73866_w_");

	/**
	 * <p>
	 * Name: updatePageControls
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175328_i = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175328_i");

	/**
	 * <p>
	 * Name: confirmMode
	 * </p>
	 */
	public static McObfPair field_175339_B = McMappingDatabase.getSRG("field_175339_B");

	/**
	 * <p>
	 * Name: numberFilter
	 * </p>
	 */
	public static McObfPair field_175332_D = McMappingDatabase.getSRG("field_175332_D");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_146274_d");

	/**
	 * <p>
	 * Name: nextPage
	 * </p>
	 */
	public static McObfPair field_175344_w = McMappingDatabase.getSRG("field_175344_w");

	/**
	 * <p>
	 * Name: settingsModified
	 * </p>
	 */
	public static McObfPair field_175338_A = McMappingDatabase.getSRG("field_175338_A");

	/**
	 * <p>
	 * Name: randomize
	 * </p>
	 */
	public static McObfPair field_175347_t = McMappingDatabase.getSRG("field_175347_t");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_73869_a");

	/**
	 * <p>
	 * Name: defaults
	 * </p>
	 */
	public static McObfPair field_175346_u = McMappingDatabase.getSRG("field_175346_u");

	/**
	 * <p>
	 * Name: restoreDefaults
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175326_g = McMappingDatabase.getSRG("GuiCustomizeWorldScreen.func_175326_g");

	/**
	 * <p>
	 * Name: subtitle
	 * </p>
	 */
	public static McObfPair field_175333_f = McMappingDatabase.getSRG("field_175333_f");

	/**
	 * <p>
	 * Name: previousPage
	 * </p>
	 */
	public static McObfPair field_175345_v = McMappingDatabase.getSRG("field_175345_v");

	/**
	 * <p>
	 * Name: confirmDismissed
	 * </p>
	 */
	public static McObfPair field_175340_C = McMappingDatabase.getSRG("field_175340_C");

}
