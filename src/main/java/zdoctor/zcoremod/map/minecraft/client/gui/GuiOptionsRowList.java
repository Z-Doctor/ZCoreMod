package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiOptionsRowList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjo";
		else
			return "net/minecraft/client/gui/GuiOptionsRowList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjo";
		else
			return "GuiOptionsRowList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjo;";
		else
			return "Lnet/minecraft/client/gui/GuiOptionsRowList;";
	}

	/**
	 * <p>
	 * Name: options
	 * </p>
	 */
	public static McObfPair field_148184_k = McMappingDatabase.getSRG("field_148184_k");

	/**
	 * <p>
	 * Name: getListWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148139_c = McMappingDatabase.getSRG("GuiOptionsRowList.func_148139_c");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiOptionsRowList.func_148127_b");

	/**
	 * <p>
	 * Name: createButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IILnet/minecraft/client/settings/GameSettings$Options;)Lnet/minecraft/client/gui/GuiButton;]
	 * </p>
	 */
	public static McObfPair func_148182_a = McMappingDatabase.getSRG("GuiOptionsRowList.func_148182_a");

	/**
	 * <p>
	 * Name: getScrollBarX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148137_d = McMappingDatabase.getSRG("GuiOptionsRowList.func_148137_d");

	/**
	 * <p>
	 * Name: getListEntry
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/gui/GuiListExtended$IGuiListEntry;, (I)Lnet/minecraft/client/gui/GuiOptionsRowList$Row;]
	 * </p>
	 */
	public static McObfPair func_148180_b = McMappingDatabase.getSRG("GuiOptionsRowList.func_148180_b");

}
