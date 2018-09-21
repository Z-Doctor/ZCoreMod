package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiKeyBindingList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmd";
		else
			return "net/minecraft/client/gui/GuiKeyBindingList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmd";
		else
			return "GuiKeyBindingList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmd;";
		else
			return "Lnet/minecraft/client/gui/GuiKeyBindingList;";
	}

	/**
	 * <p>
	 * Name: getScrollBarX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148137_d = McMappingDatabase.getSRG("GuiKeyBindingList.func_148137_d");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiKeyBindingList.func_148127_b");

	/**
	 * <p>
	 * Name: getListWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148139_c = McMappingDatabase.getSRG("GuiKeyBindingList.func_148139_c");

	/**
	 * <p>
	 * Name: maxListLabelWidth
	 * </p>
	 */
	public static McObfPair field_148188_n = McMappingDatabase.getSRG("field_148188_n");

	/**
	 * <p>
	 * Name: getListEntry
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/gui/GuiListExtended$IGuiListEntry;]
	 * </p>
	 */
	public static McObfPair func_148180_b = McMappingDatabase.getSRG("GuiKeyBindingList.func_148180_b");

	/**
	 * <p>
	 * Name: listEntries
	 * </p>
	 */
	public static McObfPair field_148190_m = McMappingDatabase.getSRG("field_148190_m");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_148189_l = McMappingDatabase.getSRG("field_148189_l");

	/**
	 * <p>
	 * Name: controlsScreen
	 * </p>
	 */
	public static McObfPair field_148191_k = McMappingDatabase.getSRG("field_148191_k");

}
