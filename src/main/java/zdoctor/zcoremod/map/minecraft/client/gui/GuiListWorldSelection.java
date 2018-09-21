package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiListWorldSelection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bom";
		else
			return "net/minecraft/client/gui/GuiListWorldSelection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bom";
		else
			return "GuiListWorldSelection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbom;";
		else
			return "Lnet/minecraft/client/gui/GuiListWorldSelection;";
	}

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiListWorldSelection.func_148131_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_186797_u = McMappingDatabase.getSRG("field_186797_u");

	/**
	 * <p>
	 * Name: entries
	 * </p>
	 */
	public static McObfPair field_186799_w = McMappingDatabase.getSRG("field_186799_w");

	/**
	 * <p>
	 * Name: getListWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148139_c = McMappingDatabase.getSRG("GuiListWorldSelection.func_148139_c");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiListWorldSelection.func_148127_b");

	/**
	 * <p>
	 * Name: getGuiWorldSelection
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/GuiWorldSelection;]
	 * </p>
	 */
	public static McObfPair func_186796_g = McMappingDatabase.getSRG("GuiListWorldSelection.func_186796_g");

	/**
	 * <p>
	 * Name: selectedIdx
	 * </p>
	 */
	public static McObfPair field_186800_x = McMappingDatabase.getSRG("field_186800_x");

	/**
	 * <p>
	 * Name: worldSelection
	 * </p>
	 */
	public static McObfPair field_186798_v = McMappingDatabase.getSRG("field_186798_v");

	/**
	 * <p>
	 * Name: getSelectedWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/GuiListWorldSelectionEntry;]
	 * </p>
	 */
	public static McObfPair func_186794_f = McMappingDatabase.getSRG("GuiListWorldSelection.func_186794_f");

	/**
	 * <p>
	 * Name: refreshList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186795_e = McMappingDatabase.getSRG("GuiListWorldSelection.func_186795_e");

	/**
	 * <p>
	 * Name: getListEntry
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/gui/GuiListExtended$IGuiListEntry;, (I)Lnet/minecraft/client/gui/GuiListWorldSelectionEntry;]
	 * </p>
	 */
	public static McObfPair func_148180_b = McMappingDatabase.getSRG("GuiListWorldSelection.func_148180_b");

	/**
	 * <p>
	 * Name: selectWorld
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_186792_d = McMappingDatabase.getSRG("GuiListWorldSelection.func_186792_d");

	/**
	 * <p>
	 * Name: getScrollBarX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148137_d = McMappingDatabase.getSRG("GuiListWorldSelection.func_148137_d");

}
