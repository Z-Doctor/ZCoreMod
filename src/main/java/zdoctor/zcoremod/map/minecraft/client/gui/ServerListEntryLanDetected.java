package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerListEntryLanDetected {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnh";
		else
			return "net/minecraft/client/gui/ServerListEntryLanDetected";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnh";
		else
			return "ServerListEntryLanDetected";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnh;";
		else
			return "Lnet/minecraft/client/gui/ServerListEntryLanDetected;";
	}

	/**
	 * <p>
	 * Name: screen
	 * </p>
	 */
	public static McObfPair field_148292_c = McMappingDatabase.getSRG("field_148292_c");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_148277_b = McMappingDatabase.getSRG("ServerListEntryLanDetected.func_148277_b");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_148293_a = McMappingDatabase.getSRG("field_148293_a");

	/**
	 * <p>
	 * Name: getServerData
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/network/LanServerInfo;]
	 * </p>
	 */
	public static McObfPair func_189995_a = McMappingDatabase.getSRG("ServerListEntryLanDetected.func_189995_a");

	/**
	 * <p>
	 * Name: updatePosition
	 * </p>
	 * <p>
	 * Desc: [(IIIF)V]
	 * </p>
	 */
	public static McObfPair func_192633_a = McMappingDatabase.getSRG("ServerListEntryLanDetected.func_192633_a");

	/**
	 * <p>
	 * Name: drawEntry
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIZF)V]
	 * </p>
	 */
	public static McObfPair func_192634_a = McMappingDatabase.getSRG("ServerListEntryLanDetected.func_192634_a");

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_148278_a = McMappingDatabase.getSRG("ServerListEntryLanDetected.func_148278_a");

	/**
	 * <p>
	 * Name: lastClickTime
	 * </p>
	 */
	public static McObfPair field_148290_d = McMappingDatabase.getSRG("field_148290_d");

	/**
	 * <p>
	 * Name: serverData
	 * </p>
	 */
	public static McObfPair field_148291_b = McMappingDatabase.getSRG("field_148291_b");

}
