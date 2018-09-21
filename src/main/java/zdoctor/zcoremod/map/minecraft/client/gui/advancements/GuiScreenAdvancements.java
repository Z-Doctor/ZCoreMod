package zdoctor.zcoremod.map.minecraft.client.gui.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenAdvancements {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmb";
		else
			return "net/minecraft/client/gui/advancements/GuiScreenAdvancements";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmb";
		else
			return "GuiScreenAdvancements";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmb;";
		else
			return "Lnet/minecraft/client/gui/advancements/GuiScreenAdvancements;";
	}

	/**
	 * <p>
	 * Name: rootAdvancementAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_191931_a = McMappingDatabase.getSRG("GuiScreenAdvancements.func_191931_a");

	/**
	 * <p>
	 * Name: scrollMouseX
	 * </p>
	 */
	public static McObfPair field_191941_t = McMappingDatabase.getSRG("field_191941_t");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiScreenAdvancements.func_73864_a");

	/**
	 * <p>
	 * Name: renderWindow
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_191934_b = McMappingDatabase.getSRG("GuiScreenAdvancements.func_191934_b");

	/**
	 * <p>
	 * Name: isScrolling
	 * </p>
	 */
	public static McObfPair field_191944_v = McMappingDatabase.getSRG("field_191944_v");

	/**
	 * <p>
	 * Name: renderToolTips
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_191937_d = McMappingDatabase.getSRG("GuiScreenAdvancements.func_191937_d");

	/**
	 * <p>
	 * Name: TABS
	 * </p>
	 */
	public static McObfPair field_191945_g = McMappingDatabase.getSRG("field_191945_g");

	/**
	 * <p>
	 * Name: advancementsCleared
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_191930_a = McMappingDatabase.getSRG("GuiScreenAdvancements.func_191930_a");

	/**
	 * <p>
	 * Name: nonRootAdvancementRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_191929_d = McMappingDatabase.getSRG("GuiScreenAdvancements.func_191929_d");

	/**
	 * <p>
	 * Name: tabs
	 * </p>
	 */
	public static McObfPair field_191947_i = McMappingDatabase.getSRG("field_191947_i");

	/**
	 * <p>
	 * Name: scrollMouseY
	 * </p>
	 */
	public static McObfPair field_191942_u = McMappingDatabase.getSRG("field_191942_u");

	/**
	 * <p>
	 * Name: setSelectedTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_193982_e = McMappingDatabase.getSRG("GuiScreenAdvancements.func_193982_e");

	/**
	 * <p>
	 * Name: selectedTab
	 * </p>
	 */
	public static McObfPair field_191940_s = McMappingDatabase.getSRG("field_191940_s");

	/**
	 * <p>
	 * Name: renderInside
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_191936_c = McMappingDatabase.getSRG("GuiScreenAdvancements.func_191936_c");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiScreenAdvancements.func_73869_a");

	/**
	 * <p>
	 * Name: nonRootAdvancementAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_191932_c = McMappingDatabase.getSRG("GuiScreenAdvancements.func_191932_c");

	/**
	 * <p>
	 * Name: getAdvancementGui
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)Lnet/minecraft/client/gui/advancements/GuiAdvancement;]
	 * </p>
	 */
	public static McObfPair func_191938_e = McMappingDatabase.getSRG("GuiScreenAdvancements.func_191938_e");

	/**
	 * <p>
	 * Name: rootAdvancementRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_191928_b = McMappingDatabase.getSRG("GuiScreenAdvancements.func_191928_b");

	/**
	 * <p>
	 * Name: clientAdvancementManager
	 * </p>
	 */
	public static McObfPair field_191946_h = McMappingDatabase.getSRG("field_191946_h");

	/**
	 * <p>
	 * Name: WINDOW
	 * </p>
	 */
	public static McObfPair field_191943_f = McMappingDatabase.getSRG("field_191943_f");

	/**
	 * <p>
	 * Name: onUpdateAdvancementProgress
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;Lnet/minecraft/advancements/AdvancementProgress;)V]
	 * </p>
	 */
	public static McObfPair func_191933_a = McMappingDatabase.getSRG("GuiScreenAdvancements.func_191933_a");

	/**
	 * <p>
	 * Name: getTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)Lnet/minecraft/client/gui/advancements/GuiAdvancementTab;]
	 * </p>
	 */
	public static McObfPair func_191935_f = McMappingDatabase.getSRG("GuiScreenAdvancements.func_191935_f");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiScreenAdvancements.func_146281_b");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiScreenAdvancements.func_73863_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiScreenAdvancements.func_73866_w_");

}
