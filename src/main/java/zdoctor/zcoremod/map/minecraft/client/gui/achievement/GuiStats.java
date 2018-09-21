package zdoctor.zcoremod.map.minecraft.client.gui.achievement;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiStats {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blu";
		else
			return "net/minecraft/client/gui/achievement/GuiStats";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blu";
		else
			return "GuiStats";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblu;";
		else
			return "Lnet/minecraft/client/gui/achievement/GuiStats;";
	}

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiStats.func_73863_a");

	/**
	 * <p>
	 * Name: itemStats
	 * </p>
	 */
	public static McObfPair field_146551_i = McMappingDatabase.getSRG("field_146551_i");

	/**
	 * <p>
	 * Name: mobStats
	 * </p>
	 */
	public static McObfPair field_146547_s = McMappingDatabase.getSRG("field_146547_s");

	/**
	 * <p>
	 * Name: blockStats
	 * </p>
	 */
	public static McObfPair field_146548_r = McMappingDatabase.getSRG("field_146548_r");

	/**
	 * <p>
	 * Name: generalStats
	 * </p>
	 */
	public static McObfPair field_146550_h = McMappingDatabase.getSRG("field_146550_h");

	/**
	 * <p>
	 * Name: displaySlot
	 * </p>
	 */
	public static McObfPair field_146545_u = McMappingDatabase.getSRG("field_146545_u");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiStats.func_146284_a");

	/**
	 * <p>
	 * Name: drawButtonBackground
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146531_b = McMappingDatabase.getSRG("GuiStats.func_146531_b");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiStats.func_146274_d");

	/**
	 * <p>
	 * Name: parentScreen
	 * </p>
	 */
	public static McObfPair field_146549_a = McMappingDatabase.getSRG("field_146549_a");

	/**
	 * <p>
	 * Name: doesGuiPauseGame
	 * </p>
	 */
	public static McObfPair field_146543_v = McMappingDatabase.getSRG("field_146543_v");

	/**
	 * <p>
	 * Name: stats
	 * </p>
	 */
	public static McObfPair field_146546_t = McMappingDatabase.getSRG("field_146546_t");

	/**
	 * <p>
	 * Name: initButtons
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193029_f = McMappingDatabase.getSRG("GuiStats.func_193029_f");

	/**
	 * <p>
	 * Name: onStatsUpdated
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193026_g = McMappingDatabase.getSRG("GuiStats.func_193026_g");

	/**
	 * <p>
	 * Name: doesGuiPauseGame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73868_f = McMappingDatabase.getSRG("GuiStats.func_73868_f");

	/**
	 * <p>
	 * Name: drawStatsScreen
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/item/Item;)V]
	 * </p>
	 */
	public static McObfPair func_146521_a = McMappingDatabase.getSRG("GuiStats.func_146521_a");

	/**
	 * <p>
	 * Name: drawSprite
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_146527_c = McMappingDatabase.getSRG("GuiStats.func_146527_c");

	/**
	 * <p>
	 * Name: initLists
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193028_a = McMappingDatabase.getSRG("GuiStats.func_193028_a");

	/**
	 * <p>
	 * Name: screenTitle
	 * </p>
	 */
	public static McObfPair field_146542_f = McMappingDatabase.getSRG("field_146542_f");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiStats.func_73866_w_");

}
