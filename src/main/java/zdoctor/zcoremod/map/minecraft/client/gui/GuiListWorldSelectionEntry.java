package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiListWorldSelectionEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bol";
		else
			return "net/minecraft/client/gui/GuiListWorldSelectionEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bol";
		else
			return "GuiListWorldSelectionEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbol;";
		else
			return "Lnet/minecraft/client/gui/GuiListWorldSelectionEntry;";
	}

	/**
	 * <p>
	 * Name: drawEntry
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIZF)V]
	 * </p>
	 */
	public static McObfPair func_192634_a = McMappingDatabase.getSRG("GuiListWorldSelectionEntry.func_192634_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_186780_a = McMappingDatabase.getSRG("field_186780_a");

	/**
	 * <p>
	 * Name: containingListSel
	 * </p>
	 */
	public static McObfPair field_186788_i = McMappingDatabase.getSRG("field_186788_i");

	/**
	 * <p>
	 * Name: ICON_MISSING
	 * </p>
	 */
	public static McObfPair field_186782_c = McMappingDatabase.getSRG("field_186782_c");

	/**
	 * <p>
	 * Name: recreateWorld
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186779_d = McMappingDatabase.getSRG("GuiListWorldSelectionEntry.func_186779_d");

	/**
	 * <p>
	 * Name: ICON_OVERLAY_LOCATION
	 * </p>
	 */
	public static McObfPair field_186783_d = McMappingDatabase.getSRG("field_186783_d");

	/**
	 * <p>
	 * Name: iconFile
	 * </p>
	 */
	public static McObfPair field_186789_j = McMappingDatabase.getSRG("field_186789_j");

	/**
	 * <p>
	 * Name: editWorld
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186778_c = McMappingDatabase.getSRG("GuiListWorldSelectionEntry.func_186778_c");

	/**
	 * <p>
	 * Name: worldSelScreen
	 * </p>
	 */
	public static McObfPair field_186785_f = McMappingDatabase.getSRG("field_186785_f");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_148277_b = McMappingDatabase.getSRG("GuiListWorldSelectionEntry.func_148277_b");

	/**
	 * <p>
	 * Name: DATE_FORMAT
	 * </p>
	 */
	public static McObfPair field_186781_b = McMappingDatabase.getSRG("field_186781_b");

	/**
	 * <p>
	 * Name: deleteWorld
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186776_b = McMappingDatabase.getSRG("GuiListWorldSelectionEntry.func_186776_b");

	/**
	 * <p>
	 * Name: worldSummary
	 * </p>
	 */
	public static McObfPair field_186786_g = McMappingDatabase.getSRG("field_186786_g");

	/**
	 * <p>
	 * Name: updatePosition
	 * </p>
	 * <p>
	 * Desc: [(IIIF)V]
	 * </p>
	 */
	public static McObfPair func_192633_a = McMappingDatabase.getSRG("GuiListWorldSelectionEntry.func_192633_a");

	/**
	 * <p>
	 * Name: icon
	 * </p>
	 */
	public static McObfPair field_186790_k = McMappingDatabase.getSRG("field_186790_k");

	/**
	 * <p>
	 * Name: client
	 * </p>
	 */
	public static McObfPair field_186784_e = McMappingDatabase.getSRG("field_186784_e");

	/**
	 * <p>
	 * Name: loadServerIcon
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186769_f = McMappingDatabase.getSRG("GuiListWorldSelectionEntry.func_186769_f");

	/**
	 * <p>
	 * Name: joinWorld
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186774_a = McMappingDatabase.getSRG("GuiListWorldSelectionEntry.func_186774_a");

	/**
	 * <p>
	 * Name: loadWorld
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186777_e = McMappingDatabase.getSRG("GuiListWorldSelectionEntry.func_186777_e");

	/**
	 * <p>
	 * Name: iconLocation
	 * </p>
	 */
	public static McObfPair field_186787_h = McMappingDatabase.getSRG("field_186787_h");

	/**
	 * <p>
	 * Name: lastClickTime
	 * </p>
	 */
	public static McObfPair field_186791_l = McMappingDatabase.getSRG("field_186791_l");

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_148278_a = McMappingDatabase.getSRG("GuiListWorldSelectionEntry.func_148278_a");

}
