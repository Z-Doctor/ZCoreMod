package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerSelectionList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnj";
		else
			return "net/minecraft/client/gui/ServerSelectionList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnj";
		else
			return "ServerSelectionList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnj;";
		else
			return "Lnet/minecraft/client/gui/ServerSelectionList;";
	}

	/**
	 * <p>
	 * Name: getSelected
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148193_k = McMappingDatabase.getSRG("ServerSelectionList.func_148193_k");

	/**
	 * <p>
	 * Name: setSelectedSlotIndex
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_148192_c = McMappingDatabase.getSRG("ServerSelectionList.func_148192_c");

	/**
	 * <p>
	 * Name: updateNetworkServers
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_148194_a = McMappingDatabase.getSRG("ServerSelectionList.func_148194_a");

	/**
	 * <p>
	 * Name: serverListInternet
	 * </p>
	 */
	public static McObfPair field_148198_l = McMappingDatabase.getSRG("field_148198_l");

	/**
	 * <p>
	 * Name: serverListLan
	 * </p>
	 */
	public static McObfPair field_148199_m = McMappingDatabase.getSRG("field_148199_m");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("ServerSelectionList.func_148131_a");

	/**
	 * <p>
	 * Name: getListEntry
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/gui/GuiListExtended$IGuiListEntry;]
	 * </p>
	 */
	public static McObfPair func_148180_b = McMappingDatabase.getSRG("ServerSelectionList.func_148180_b");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("ServerSelectionList.func_148127_b");

	/**
	 * <p>
	 * Name: getScrollBarX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148137_d = McMappingDatabase.getSRG("ServerSelectionList.func_148137_d");

	/**
	 * <p>
	 * Name: owner
	 * </p>
	 */
	public static McObfPair field_148200_k = McMappingDatabase.getSRG("field_148200_k");

	/**
	 * <p>
	 * Name: updateOnlineServers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/ServerList;)V]
	 * </p>
	 */
	public static McObfPair func_148195_a = McMappingDatabase.getSRG("ServerSelectionList.func_148195_a");

	/**
	 * <p>
	 * Name: selectedSlotIndex
	 * </p>
	 */
	public static McObfPair field_148197_o = McMappingDatabase.getSRG("field_148197_o");

	/**
	 * <p>
	 * Name: getListWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148139_c = McMappingDatabase.getSRG("ServerSelectionList.func_148139_c");

	/**
	 * <p>
	 * Name: lanScanEntry
	 * </p>
	 */
	public static McObfPair field_148196_n = McMappingDatabase.getSRG("field_148196_n");

}
