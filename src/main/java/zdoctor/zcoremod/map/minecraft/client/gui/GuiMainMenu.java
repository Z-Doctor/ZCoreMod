package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiMainMenu {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blr";
		else
			return "net/minecraft/client/gui/GuiMainMenu";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blr";
		else
			return "GuiMainMenu";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblr;";
		else
			return "Lnet/minecraft/client/gui/GuiMainMenu;";
	}

	/**
	 * <p>
	 * Name: openGLWarning2
	 * </p>
	 */
	public static McObfPair field_146972_A = McMappingDatabase.getSRG("field_146972_A");

	/**
	 * <p>
	 * Name: realmsButton
	 * </p>
	 */
	public static McObfPair field_175372_K = McMappingDatabase.getSRG("field_175372_K");

	/**
	 * <p>
	 * Name: splashText
	 * </p>
	 */
	public static McObfPair field_73975_c = McMappingDatabase.getSRG("field_73975_c");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiMainMenu.func_73866_w_");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_146974_g = McMappingDatabase.getSRG("field_146974_g");

	/**
	 * <p>
	 * Name: openGLWarningX1
	 * </p>
	 */
	public static McObfPair field_92022_t = McMappingDatabase.getSRG("field_92022_t");

	/**
	 * <p>
	 * Name: viewportTexture
	 * </p>
	 */
	public static McObfPair field_73977_n = McMappingDatabase.getSRG("field_73977_n");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiMainMenu.func_73863_a");

	/**
	 * <p>
	 * Name: openGLWarning2Width
	 * </p>
	 */
	public static McObfPair field_92024_r = McMappingDatabase.getSRG("field_92024_r");

	/**
	 * <p>
	 * Name: confirmClicked
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_73878_a = McMappingDatabase.getSRG("GuiMainMenu.func_73878_a");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiMainMenu.func_73864_a");

	/**
	 * <p>
	 * Name: openGLWarningY2
	 * </p>
	 */
	public static McObfPair field_92019_w = McMappingDatabase.getSRG("field_92019_w");

	/**
	 * <p>
	 * Name: widthCopyright
	 * </p>
	 */
	public static McObfPair field_193978_M = McMappingDatabase.getSRG("field_193978_M");

	/**
	 * <p>
	 * Name: openGLWarningLink
	 * </p>
	 */
	public static McObfPair field_104024_v = McMappingDatabase.getSRG("field_104024_v");

	/**
	 * <p>
	 * Name: addDemoButtons
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_73972_b = McMappingDatabase.getSRG("GuiMainMenu.func_73972_b");

	/**
	 * <p>
	 * Name: threadLock
	 * </p>
	 */
	public static McObfPair field_104025_t = McMappingDatabase.getSRG("field_104025_t");

	/**
	 * <p>
	 * Name: doesGuiPauseGame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73868_f = McMappingDatabase.getSRG("GuiMainMenu.func_73868_f");

	/**
	 * <p>
	 * Name: hasCheckedForRealmsNotification
	 * </p>
	 */
	public static McObfPair field_183502_L = McMappingDatabase.getSRG("field_183502_L");

	/**
	 * <p>
	 * Name: rotateAndBlurSkybox
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73968_a = McMappingDatabase.getSRG("GuiMainMenu.func_73968_a");

	/**
	 * <p>
	 * Name: widthCopyrightRest
	 * </p>
	 */
	public static McObfPair field_193979_N = McMappingDatabase.getSRG("field_193979_N");

	/**
	 * <p>
	 * Name: addSingleplayerMultiplayerButtons
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_73969_a = McMappingDatabase.getSRG("GuiMainMenu.func_73969_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiMainMenu.func_146284_a");

	/**
	 * <p>
	 * Name: switchToRealms
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_140005_i = McMappingDatabase.getSRG("GuiMainMenu.func_140005_i");

	/**
	 * <p>
	 * Name: openGLWarning1Width
	 * </p>
	 */
	public static McObfPair field_92023_s = McMappingDatabase.getSRG("field_92023_s");

	/**
	 * <p>
	 * Name: openGLWarning1
	 * </p>
	 */
	public static McObfPair field_92025_p = McMappingDatabase.getSRG("field_92025_p");

	/**
	 * <p>
	 * Name: panoramaTimer
	 * </p>
	 */
	public static McObfPair field_73979_m = McMappingDatabase.getSRG("field_73979_m");

	/**
	 * <p>
	 * Name: areRealmsNotificationsEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_183501_a = McMappingDatabase.getSRG("GuiMainMenu.func_183501_a");

	/**
	 * <p>
	 * Name: renderSkybox
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73971_c = McMappingDatabase.getSRG("GuiMainMenu.func_73971_c");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiMainMenu.func_146281_b");

	/**
	 * <p>
	 * Name: MINECRAFT_TITLE_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110352_y = McMappingDatabase.getSRG("field_110352_y");

	/**
	 * <p>
	 * Name: MORE_INFO_TEXT
	 * </p>
	 */
	public static McObfPair field_96138_a = McMappingDatabase.getSRG("field_96138_a");

	/**
	 * <p>
	 * Name: drawPanorama
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73970_b = McMappingDatabase.getSRG("GuiMainMenu.func_73970_b");

	/**
	 * <p>
	 * Name: minceraftRoll
	 * </p>
	 */
	public static McObfPair field_73974_b = McMappingDatabase.getSRG("field_73974_b");

	/**
	 * <p>
	 * Name: openGLWarningX2
	 * </p>
	 */
	public static McObfPair field_92020_v = McMappingDatabase.getSRG("field_92020_v");

	/**
	 * <p>
	 * Name: RANDOM
	 * </p>
	 */
	public static McObfPair field_175374_h = McMappingDatabase.getSRG("field_175374_h");

	/**
	 * <p>
	 * Name: TITLE_PANORAMA_PATHS
	 * </p>
	 */
	public static McObfPair field_73978_o = McMappingDatabase.getSRG("field_73978_o");

	/**
	 * <p>
	 * Name: buttonResetDemo
	 * </p>
	 */
	public static McObfPair field_73973_d = McMappingDatabase.getSRG("field_73973_d");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiMainMenu.func_73869_a");

	/**
	 * <p>
	 * Name: realmsNotification
	 * </p>
	 */
	public static McObfPair field_183503_M = McMappingDatabase.getSRG("field_183503_M");

	/**
	 * <p>
	 * Name: openGLWarningY1
	 * </p>
	 */
	public static McObfPair field_92021_u = McMappingDatabase.getSRG("field_92021_u");

	/**
	 * <p>
	 * Name: backgroundTexture
	 * </p>
	 */
	public static McObfPair field_110351_G = McMappingDatabase.getSRG("field_110351_G");

	/**
	 * <p>
	 * Name: SPLASH_TEXTS
	 * </p>
	 */
	public static McObfPair field_110353_x = McMappingDatabase.getSRG("field_110353_x");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiMainMenu.func_73876_c");

}
