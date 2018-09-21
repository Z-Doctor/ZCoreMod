package zdoctor.zcoremod.map.minecraft.client.gui.achievement;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiStats$Stats {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blu$e";
		else
			return "net/minecraft/client/gui/achievement/GuiStats$Stats";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blu$e";
		else
			return "GuiStats$Stats";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblu$e;";
		else
			return "Lnet/minecraft/client/gui/achievement/GuiStats$Stats;";
	}

	/**
	 * <p>
	 * Name: headerPressed
	 * </p>
	 */
	public static McObfPair field_148218_l = McMappingDatabase.getSRG("field_148218_l");

	/**
	 * <p>
	 * Name: drawListHeader
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/client/renderer/Tessellator;)V]
	 * </p>
	 */
	public static McObfPair func_148129_a = McMappingDatabase.getSRG("GuiStats$Stats.func_148129_a");

	/**
	 * <p>
	 * Name: clickedHeader
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_148132_a = McMappingDatabase.getSRG("GuiStats$Stats.func_148132_a");

	/**
	 * <p>
	 * Name: sortByColumn
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_148212_h = McMappingDatabase.getSRG("GuiStats$Stats.func_148212_h");

	/**
	 * <p>
	 * Name: renderMouseHoverToolTip
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/stats/StatCrafting;II)V]
	 * </p>
	 */
	public static McObfPair func_148213_a = McMappingDatabase.getSRG("GuiStats$Stats.func_148213_a");

	/**
	 * <p>
	 * Name: renderStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/stats/StatBase;IIZ)V]
	 * </p>
	 */
	public static McObfPair func_148209_a = McMappingDatabase.getSRG("GuiStats$Stats.func_148209_a");

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148123_a = McMappingDatabase.getSRG("GuiStats$Stats.func_148123_a");

	/**
	 * <p>
	 * Name: statSorter
	 * </p>
	 */
	public static McObfPair field_148216_n = McMappingDatabase.getSRG("field_148216_n");

	/**
	 * <p>
	 * Name: getScrollBarX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148137_d = McMappingDatabase.getSRG("GuiStats$Stats.func_148137_d");

	/**
	 * <p>
	 * Name: sortOrder
	 * </p>
	 */
	public static McObfPair field_148215_p = McMappingDatabase.getSRG("field_148215_p");

	/**
	 * <p>
	 * Name: getHeaderDescriptionId
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148210_b = McMappingDatabase.getSRG("GuiStats$Stats.func_148210_b");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiStats$Stats.func_148131_a");

	/**
	 * <p>
	 * Name: getSlotStat
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/stats/StatCrafting;]
	 * </p>
	 */
	public static McObfPair func_148211_c = McMappingDatabase.getSRG("GuiStats$Stats.func_148211_c");

	/**
	 * <p>
	 * Name: sortColumn
	 * </p>
	 */
	public static McObfPair field_148217_o = McMappingDatabase.getSRG("field_148217_o");

	/**
	 * <p>
	 * Name: elementClicked
	 * </p>
	 * <p>
	 * Desc: [(IZII)V]
	 * </p>
	 */
	public static McObfPair func_148144_a = McMappingDatabase.getSRG("GuiStats$Stats.func_148144_a");

	/**
	 * <p>
	 * Name: renderDecorations
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_148142_b = McMappingDatabase.getSRG("GuiStats$Stats.func_148142_b");

	/**
	 * <p>
	 * Name: statsHolder
	 * </p>
	 */
	public static McObfPair field_148219_m = McMappingDatabase.getSRG("field_148219_m");

	/**
	 * <p>
	 * Name: getListWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148139_c = McMappingDatabase.getSRG("GuiStats$Stats.func_148139_c");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiStats$Stats.func_148127_b");

}
