package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiEditStructure {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnc";
		else
			return "net/minecraft/client/gui/inventory/GuiEditStructure";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnc";
		else
			return "GuiEditStructure";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnc;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiEditStructure;";
	}

	/**
	 * <p>
	 * Name: showBoundingBoxButton
	 * </p>
	 */
	public static McObfPair field_189842_R = McMappingDatabase.getSRG("field_189842_R");

	/**
	 * <p>
	 * Name: rotateZeroDegreesButton
	 * </p>
	 */
	public static McObfPair field_189833_I = McMappingDatabase.getSRG("field_189833_I");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiEditStructure.func_73876_c");

	/**
	 * <p>
	 * Name: showAir
	 * </p>
	 */
	public static McObfPair field_189851_s = McMappingDatabase.getSRG("field_189851_s");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiEditStructure.func_73863_a");

	/**
	 * <p>
	 * Name: modeButton
	 * </p>
	 */
	public static McObfPair field_189837_M = McMappingDatabase.getSRG("field_189837_M");

	/**
	 * <p>
	 * Name: loadButton
	 * </p>
	 */
	public static McObfPair field_189832_H = McMappingDatabase.getSRG("field_189832_H");

	/**
	 * <p>
	 * Name: seedEdit
	 * </p>
	 */
	public static McObfPair field_189827_C = McMappingDatabase.getSRG("field_189827_C");

	/**
	 * <p>
	 * Name: updateDirectionButtons
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189824_i = McMappingDatabase.getSRG("GuiEditStructure.func_189824_i");

	/**
	 * <p>
	 * Name: cancelButton
	 * </p>
	 */
	public static McObfPair field_189830_F = McMappingDatabase.getSRG("field_189830_F");

	/**
	 * <p>
	 * Name: rotate180DegreesButton
	 * </p>
	 */
	public static McObfPair field_189835_K = McMappingDatabase.getSRG("field_189835_K");

	/**
	 * <p>
	 * Name: rotate270DegressButton
	 * </p>
	 */
	public static McObfPair field_189836_L = McMappingDatabase.getSRG("field_189836_L");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiEditStructure.func_73869_a");

	/**
	 * <p>
	 * Name: mirror
	 * </p>
	 */
	public static McObfPair field_189847_g = McMappingDatabase.getSRG("field_189847_g");

	/**
	 * <p>
	 * Name: tileStructure
	 * </p>
	 */
	public static McObfPair field_189846_f = McMappingDatabase.getSRG("field_189846_f");

	/**
	 * <p>
	 * Name: parseCoordinate
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_189817_c = McMappingDatabase.getSRG("GuiEditStructure.func_189817_c");

	/**
	 * <p>
	 * Name: doesGuiPauseGame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73868_f = McMappingDatabase.getSRG("GuiEditStructure.func_73868_f");

	/**
	 * <p>
	 * Name: nameEdit
	 * </p>
	 */
	public static McObfPair field_189853_u = McMappingDatabase.getSRG("field_189853_u");

	/**
	 * <p>
	 * Name: ignoreEntities
	 * </p>
	 */
	public static McObfPair field_189850_r = McMappingDatabase.getSRG("field_189850_r");

	/**
	 * <p>
	 * Name: showEntitiesButton
	 * </p>
	 */
	public static McObfPair field_189839_O = McMappingDatabase.getSRG("field_189839_O");

	/**
	 * <p>
	 * Name: parseSeed
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)J]
	 * </p>
	 */
	public static McObfPair func_189821_a = McMappingDatabase.getSRG("GuiEditStructure.func_189821_a");

	/**
	 * <p>
	 * Name: sendToServer
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_189820_b = McMappingDatabase.getSRG("GuiEditStructure.func_189820_b");

	/**
	 * <p>
	 * Name: updateMirrorButton
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189816_h = McMappingDatabase.getSRG("GuiEditStructure.func_189816_h");

	/**
	 * <p>
	 * Name: updateToggleBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189815_g = McMappingDatabase.getSRG("GuiEditStructure.func_189815_g");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiEditStructure.func_73864_a");

	/**
	 * <p>
	 * Name: isValidCharacterForName
	 * </p>
	 * <p>
	 * Desc: [(CI)Z]
	 * </p>
	 */
	public static McObfPair func_190301_b = McMappingDatabase.getSRG("GuiEditStructure.func_190301_b");

	/**
	 * <p>
	 * Name: mirrorButton
	 * </p>
	 */
	public static McObfPair field_189840_P = McMappingDatabase.getSRG("field_189840_P");

	/**
	 * <p>
	 * Name: posYEdit
	 * </p>
	 */
	public static McObfPair field_189855_w = McMappingDatabase.getSRG("field_189855_w");

	/**
	 * <p>
	 * Name: showBoundingBox
	 * </p>
	 */
	public static McObfPair field_189852_t = McMappingDatabase.getSRG("field_189852_t");

	/**
	 * <p>
	 * Name: updateEntitiesButton
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189822_a = McMappingDatabase.getSRG("GuiEditStructure.func_189822_a");

	/**
	 * <p>
	 * Name: sizeXEdit
	 * </p>
	 */
	public static McObfPair field_189857_y = McMappingDatabase.getSRG("field_189857_y");

	/**
	 * <p>
	 * Name: LEGAL_KEY_CODES
	 * </p>
	 */
	public static McObfPair field_190302_a = McMappingDatabase.getSRG("field_190302_a");

	/**
	 * <p>
	 * Name: posZEdit
	 * </p>
	 */
	public static McObfPair field_189856_x = McMappingDatabase.getSRG("field_189856_x");

	/**
	 * <p>
	 * Name: sizeYEdit
	 * </p>
	 */
	public static McObfPair field_189858_z = McMappingDatabase.getSRG("field_189858_z");

	/**
	 * <p>
	 * Name: integrityEdit
	 * </p>
	 */
	public static McObfPair field_189826_B = McMappingDatabase.getSRG("field_189826_B");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiEditStructure.func_146284_a");

	/**
	 * <p>
	 * Name: showAirButton
	 * </p>
	 */
	public static McObfPair field_189841_Q = McMappingDatabase.getSRG("field_189841_Q");

	/**
	 * <p>
	 * Name: decimalFormat
	 * </p>
	 */
	public static McObfPair field_189844_T = McMappingDatabase.getSRG("field_189844_T");

	/**
	 * <p>
	 * Name: updateToggleAirButton
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189814_f = McMappingDatabase.getSRG("GuiEditStructure.func_189814_f");

	/**
	 * <p>
	 * Name: parseIntegrity
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)F]
	 * </p>
	 */
	public static McObfPair func_189819_b = McMappingDatabase.getSRG("GuiEditStructure.func_189819_b");

	/**
	 * <p>
	 * Name: mode
	 * </p>
	 */
	public static McObfPair field_189849_i = McMappingDatabase.getSRG("field_189849_i");

	/**
	 * <p>
	 * Name: sizeZEdit
	 * </p>
	 */
	public static McObfPair field_189825_A = McMappingDatabase.getSRG("field_189825_A");

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_189848_h = McMappingDatabase.getSRG("field_189848_h");

	/**
	 * <p>
	 * Name: detectSizeButton
	 * </p>
	 */
	public static McObfPair field_189838_N = McMappingDatabase.getSRG("field_189838_N");

	/**
	 * <p>
	 * Name: rotateNinetyDegreesButton
	 * </p>
	 */
	public static McObfPair field_189834_J = McMappingDatabase.getSRG("field_189834_J");

	/**
	 * <p>
	 * Name: saveButton
	 * </p>
	 */
	public static McObfPair field_189831_G = McMappingDatabase.getSRG("field_189831_G");

	/**
	 * <p>
	 * Name: tabOrder
	 * </p>
	 */
	public static McObfPair field_189843_S = McMappingDatabase.getSRG("field_189843_S");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiEditStructure.func_73866_w_");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiEditStructure.func_146281_b");

	/**
	 * <p>
	 * Name: posXEdit
	 * </p>
	 */
	public static McObfPair field_189854_v = McMappingDatabase.getSRG("field_189854_v");

	/**
	 * <p>
	 * Name: doneButton
	 * </p>
	 */
	public static McObfPair field_189829_E = McMappingDatabase.getSRG("field_189829_E");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_189845_a = McMappingDatabase.getSRG("field_189845_a");

	/**
	 * <p>
	 * Name: dataEdit
	 * </p>
	 */
	public static McObfPair field_189828_D = McMappingDatabase.getSRG("field_189828_D");

	/**
	 * <p>
	 * Name: updateMode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189823_j = McMappingDatabase.getSRG("GuiEditStructure.func_189823_j");

}
