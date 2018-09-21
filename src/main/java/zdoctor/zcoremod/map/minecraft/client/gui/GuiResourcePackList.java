package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiResourcePackList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bod";
		else
			return "net/minecraft/client/gui/GuiResourcePackList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bod";
		else
			return "GuiResourcePackList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbod;";
		else
			return "Lnet/minecraft/client/gui/GuiResourcePackList;";
	}

	/**
	 * <p>
	 * Name: resourcePackEntries
	 * </p>
	 */
	public static McObfPair field_148204_l = McMappingDatabase.getSRG("field_148204_l");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiResourcePackList.func_148127_b");

	/**
	 * <p>
	 * Name: drawListHeader
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/client/renderer/Tessellator;)V]
	 * </p>
	 */
	public static McObfPair func_148129_a = McMappingDatabase.getSRG("GuiResourcePackList.func_148129_a");

	/**
	 * <p>
	 * Name: getListHeader
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148202_k = McMappingDatabase.getSRG("GuiResourcePackList.func_148202_k");

	/**
	 * <p>
	 * Name: getScrollBarX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148137_d = McMappingDatabase.getSRG("GuiResourcePackList.func_148137_d");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_148205_k = McMappingDatabase.getSRG("field_148205_k");

	/**
	 * <p>
	 * Name: getList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_148201_l = McMappingDatabase.getSRG("GuiResourcePackList.func_148201_l");

	/**
	 * <p>
	 * Name: getListEntry
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/gui/GuiListExtended$IGuiListEntry;, (I)Lnet/minecraft/client/resources/ResourcePackListEntry;]
	 * </p>
	 */
	public static McObfPair func_148180_b = McMappingDatabase.getSRG("GuiResourcePackList.func_148180_b");

	/**
	 * <p>
	 * Name: getListWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148139_c = McMappingDatabase.getSRG("GuiResourcePackList.func_148139_c");

}
