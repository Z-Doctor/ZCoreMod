package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiCreateWorld {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boi";
		else
			return "net/minecraft/client/gui/GuiCreateWorld";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boi";
		else
			return "GuiCreateWorld";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboi;";
		else
			return "Lnet/minecraft/client/gui/GuiCreateWorld;";
	}

	/**
	 * <p>
	 * Name: generateStructuresEnabled
	 * </p>
	 */
	public static McObfPair field_146341_s = McMappingDatabase.getSRG("field_146341_s");

	/**
	 * <p>
	 * Name: allowCheatsWasSetByUser
	 * </p>
	 */
	public static McObfPair field_146339_u = McMappingDatabase.getSRG("field_146339_u");

	/**
	 * <p>
	 * Name: saveDirName
	 * </p>
	 */
	public static McObfPair field_146336_i = McMappingDatabase.getSRG("field_146336_i");

	/**
	 * <p>
	 * Name: btnCustomizeType
	 * </p>
	 */
	public static McObfPair field_146322_F = McMappingDatabase.getSRG("field_146322_F");

	/**
	 * <p>
	 * Name: btnMapType
	 * </p>
	 */
	public static McObfPair field_146320_D = McMappingDatabase.getSRG("field_146320_D");

	/**
	 * <p>
	 * Name: showMoreWorldOptions
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_146316_a = McMappingDatabase.getSRG("GuiCreateWorld.func_146316_a");

	/**
	 * <p>
	 * Name: worldSeedField
	 * </p>
	 */
	public static McObfPair field_146335_h = McMappingDatabase.getSRG("field_146335_h");

	/**
	 * <p>
	 * Name: recreateFromExistingWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/WorldInfo;)V]
	 * </p>
	 */
	public static McObfPair func_146318_a = McMappingDatabase.getSRG("GuiCreateWorld.func_146318_a");

	/**
	 * <p>
	 * Name: btnGameMode
	 * </p>
	 */
	public static McObfPair field_146343_z = McMappingDatabase.getSRG("field_146343_z");

	/**
	 * <p>
	 * Name: selectedIndex
	 * </p>
	 */
	public static McObfPair field_146331_K = McMappingDatabase.getSRG("field_146331_K");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiCreateWorld.func_146281_b");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiCreateWorld.func_146284_a");

	/**
	 * <p>
	 * Name: canSelectCurWorldType
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175299_g = McMappingDatabase.getSRG("GuiCreateWorld.func_175299_g");

	/**
	 * <p>
	 * Name: btnAllowCommands
	 * </p>
	 */
	public static McObfPair field_146321_E = McMappingDatabase.getSRG("field_146321_E");

	/**
	 * <p>
	 * Name: chunkProviderSettingsJson
	 * </p>
	 */
	public static McObfPair field_146334_a = McMappingDatabase.getSRG("field_146334_a");

	/**
	 * <p>
	 * Name: gameModeDesc2
	 * </p>
	 */
	public static McObfPair field_146328_H = McMappingDatabase.getSRG("field_146328_H");

	/**
	 * <p>
	 * Name: bonusChestEnabled
	 * </p>
	 */
	public static McObfPair field_146338_v = McMappingDatabase.getSRG("field_146338_v");

	/**
	 * <p>
	 * Name: inMoreWorldOptionsDisplay
	 * </p>
	 */
	public static McObfPair field_146344_y = McMappingDatabase.getSRG("field_146344_y");

	/**
	 * <p>
	 * Name: getUncollidingSaveDirName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/ISaveFormat;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_146317_a = McMappingDatabase.getSRG("GuiCreateWorld.func_146317_a");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiCreateWorld.func_73864_a");

	/**
	 * <p>
	 * Name: btnMapFeatures
	 * </p>
	 */
	public static McObfPair field_146325_B = McMappingDatabase.getSRG("field_146325_B");

	/**
	 * <p>
	 * Name: alreadyGenerated
	 * </p>
	 */
	public static McObfPair field_146345_x = McMappingDatabase.getSRG("field_146345_x");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiCreateWorld.func_73869_a");

	/**
	 * <p>
	 * Name: allowCheats
	 * </p>
	 */
	public static McObfPair field_146340_t = McMappingDatabase.getSRG("field_146340_t");

	/**
	 * <p>
	 * Name: savedGameMode
	 * </p>
	 */
	public static McObfPair field_175300_s = McMappingDatabase.getSRG("field_175300_s");

	/**
	 * <p>
	 * Name: parentScreen
	 * </p>
	 */
	public static McObfPair field_146332_f = McMappingDatabase.getSRG("field_146332_f");

	/**
	 * <p>
	 * Name: toggleMoreWorldOptions
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146315_i = McMappingDatabase.getSRG("GuiCreateWorld.func_146315_i");

	/**
	 * <p>
	 * Name: worldNameField
	 * </p>
	 */
	public static McObfPair field_146333_g = McMappingDatabase.getSRG("field_146333_g");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiCreateWorld.func_73863_a");

	/**
	 * <p>
	 * Name: gameMode
	 * </p>
	 */
	public static McObfPair field_146342_r = McMappingDatabase.getSRG("field_146342_r");

	/**
	 * <p>
	 * Name: DISALLOWED_FILENAMES
	 * </p>
	 */
	public static McObfPair field_146327_L = McMappingDatabase.getSRG("field_146327_L");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiCreateWorld.func_73866_w_");

	/**
	 * <p>
	 * Name: worldName
	 * </p>
	 */
	public static McObfPair field_146330_J = McMappingDatabase.getSRG("field_146330_J");

	/**
	 * <p>
	 * Name: gameModeDesc1
	 * </p>
	 */
	public static McObfPair field_146323_G = McMappingDatabase.getSRG("field_146323_G");

	/**
	 * <p>
	 * Name: btnBonusItems
	 * </p>
	 */
	public static McObfPair field_146326_C = McMappingDatabase.getSRG("field_146326_C");

	/**
	 * <p>
	 * Name: btnMoreOptions
	 * </p>
	 */
	public static McObfPair field_146324_A = McMappingDatabase.getSRG("field_146324_A");

	/**
	 * <p>
	 * Name: calcSaveDirName
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146314_g = McMappingDatabase.getSRG("GuiCreateWorld.func_146314_g");

	/**
	 * <p>
	 * Name: worldSeed
	 * </p>
	 */
	public static McObfPair field_146329_I = McMappingDatabase.getSRG("field_146329_I");

	/**
	 * <p>
	 * Name: hardCoreMode
	 * </p>
	 */
	public static McObfPair field_146337_w = McMappingDatabase.getSRG("field_146337_w");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiCreateWorld.func_73876_c");

	/**
	 * <p>
	 * Name: updateDisplayState
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146319_h = McMappingDatabase.getSRG("GuiCreateWorld.func_146319_h");

}
