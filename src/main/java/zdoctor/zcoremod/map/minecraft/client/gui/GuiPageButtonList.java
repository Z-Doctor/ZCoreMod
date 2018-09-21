package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiPageButtonList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp";
		else
			return "net/minecraft/client/gui/GuiPageButtonList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp";
		else
			return "GuiPageButtonList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjp;";
		else
			return "Lnet/minecraft/client/gui/GuiPageButtonList;";
	}

	/**
	 * <p>
	 * Name: createTextField
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/client/gui/GuiPageButtonList$EditBoxEntry;)Lnet/minecraft/client/gui/GuiTextField;]
	 * </p>
	 */
	public static McObfPair func_178068_a = McMappingDatabase.getSRG("GuiPageButtonList.func_178068_a");

	/**
	 * <p>
	 * Name: createButton
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/client/gui/GuiPageButtonList$GuiButtonEntry;)Lnet/minecraft/client/gui/GuiListButton;]
	 * </p>
	 */
	public static McObfPair func_178065_a = McMappingDatabase.getSRG("GuiPageButtonList.func_178065_a");

	/**
	 * <p>
	 * Name: getListWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148139_c = McMappingDatabase.getSRG("GuiPageButtonList.func_148139_c");

	/**
	 * <p>
	 * Name: responder
	 * </p>
	 */
	public static McObfPair field_178076_z = McMappingDatabase.getSRG("field_178076_z");

	/**
	 * <p>
	 * Name: createSlider
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/client/gui/GuiPageButtonList$GuiSlideEntry;)Lnet/minecraft/client/gui/GuiSlider;]
	 * </p>
	 */
	public static McObfPair func_178067_a = McMappingDatabase.getSRG("GuiPageButtonList.func_178067_a");

	/**
	 * <p>
	 * Name: createLabel
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/client/gui/GuiPageButtonList$GuiLabelEntry;Z)Lnet/minecraft/client/gui/GuiLabel;]
	 * </p>
	 */
	public static McObfPair func_178063_a = McMappingDatabase.getSRG("GuiPageButtonList.func_178063_a");

	/**
	 * <p>
	 * Name: nextPage
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178064_i = McMappingDatabase.getSRG("GuiPageButtonList.func_178064_i");

	/**
	 * <p>
	 * Name: setPage
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_181156_c = McMappingDatabase.getSRG("GuiPageButtonList.func_181156_c");

	/**
	 * <p>
	 * Name: pages
	 * </p>
	 */
	public static McObfPair field_178078_x = McMappingDatabase.getSRG("field_178078_x");

	/**
	 * <p>
	 * Name: getScrollBarX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148137_d = McMappingDatabase.getSRG("GuiPageButtonList.func_148137_d");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)Z]
	 * </p>
	 */
	public static McObfPair func_148179_a = McMappingDatabase.getSRG("GuiPageButtonList.func_148179_a");

	/**
	 * <p>
	 * Name: getPage
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178059_e = McMappingDatabase.getSRG("GuiPageButtonList.func_178059_e");

	/**
	 * <p>
	 * Name: markVisibility
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_178060_e = McMappingDatabase.getSRG("GuiPageButtonList.func_178060_e");

	/**
	 * <p>
	 * Name: setComponentVisibility
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/Gui;Z)V]
	 * </p>
	 */
	public static McObfPair func_178066_a = McMappingDatabase.getSRG("GuiPageButtonList.func_178066_a");

	/**
	 * <p>
	 * Name: focusedControl
	 * </p>
	 */
	public static McObfPair field_178075_A = McMappingDatabase.getSRG("field_178075_A");

	/**
	 * <p>
	 * Name: getPageCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178057_f = McMappingDatabase.getSRG("GuiPageButtonList.func_178057_f");

	/**
	 * <p>
	 * Name: populateComponents
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178069_s = McMappingDatabase.getSRG("GuiPageButtonList.func_178069_s");

	/**
	 * <p>
	 * Name: createEntry
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiPageButtonList$GuiListEntry;IZ)Lnet/minecraft/client/gui/Gui;]
	 * </p>
	 */
	public static McObfPair func_178058_a = McMappingDatabase.getSRG("GuiPageButtonList.func_178058_a");

	/**
	 * <p>
	 * Name: componentMap
	 * </p>
	 */
	public static McObfPair field_178073_v = McMappingDatabase.getSRG("field_178073_v");

	/**
	 * <p>
	 * Name: previousPage
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178071_h = McMappingDatabase.getSRG("GuiPageButtonList.func_178071_h");

	/**
	 * <p>
	 * Name: page
	 * </p>
	 */
	public static McObfPair field_178077_y = McMappingDatabase.getSRG("field_178077_y");

	/**
	 * <p>
	 * Name: getListEntry
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/gui/GuiListExtended$IGuiListEntry;, (I)Lnet/minecraft/client/gui/GuiPageButtonList$GuiEntry;]
	 * </p>
	 */
	public static McObfPair func_148180_b = McMappingDatabase.getSRG("GuiPageButtonList.func_148180_b");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiPageButtonList.func_148127_b");

	/**
	 * <p>
	 * Name: setActive
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_181155_a = McMappingDatabase.getSRG("GuiPageButtonList.func_181155_a");

	/**
	 * <p>
	 * Name: getComponent
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/gui/Gui;]
	 * </p>
	 */
	public static McObfPair func_178061_c = McMappingDatabase.getSRG("GuiPageButtonList.func_178061_c");

	/**
	 * <p>
	 * Name: onKeyPressed
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_178062_a = McMappingDatabase.getSRG("GuiPageButtonList.func_178062_a");

	/**
	 * <p>
	 * Name: populateEntries
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178055_t = McMappingDatabase.getSRG("GuiPageButtonList.func_178055_t");

	/**
	 * <p>
	 * Name: editBoxes
	 * </p>
	 */
	public static McObfPair field_178072_w = McMappingDatabase.getSRG("field_178072_w");

	/**
	 * <p>
	 * Name: entries
	 * </p>
	 */
	public static McObfPair field_178074_u = McMappingDatabase.getSRG("field_178074_u");

	/**
	 * <p>
	 * Name: getFocusedControl
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/Gui;]
	 * </p>
	 */
	public static McObfPair func_178056_g = McMappingDatabase.getSRG("GuiPageButtonList.func_178056_g");

}
