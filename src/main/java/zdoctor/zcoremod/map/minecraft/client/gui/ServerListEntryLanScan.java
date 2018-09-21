package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerListEntryLanScan {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bng";
		else
			return "net/minecraft/client/gui/ServerListEntryLanScan";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bng";
		else
			return "ServerListEntryLanScan";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbng;";
		else
			return "Lnet/minecraft/client/gui/ServerListEntryLanScan;";
	}

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_148278_a = McMappingDatabase.getSRG("ServerListEntryLanScan.func_148278_a");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_148288_a = McMappingDatabase.getSRG("field_148288_a");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_148277_b = McMappingDatabase.getSRG("ServerListEntryLanScan.func_148277_b");

	/**
	 * <p>
	 * Name: drawEntry
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIZF)V]
	 * </p>
	 */
	public static McObfPair func_192634_a = McMappingDatabase.getSRG("ServerListEntryLanScan.func_192634_a");

	/**
	 * <p>
	 * Name: updatePosition
	 * </p>
	 * <p>
	 * Desc: [(IIIF)V]
	 * </p>
	 */
	public static McObfPair func_192633_a = McMappingDatabase.getSRG("ServerListEntryLanScan.func_192633_a");

}
