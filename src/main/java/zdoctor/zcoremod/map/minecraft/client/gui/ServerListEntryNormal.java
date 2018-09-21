package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerListEntryNormal {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bni";
		else
			return "net/minecraft/client/gui/ServerListEntryNormal";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bni";
		else
			return "ServerListEntryNormal";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbni;";
		else
			return "Lnet/minecraft/client/gui/ServerListEntryNormal;";
	}

	/**
	 * <p>
	 * Name: EXECUTOR
	 * </p>
	 */
	public static McObfPair field_148302_b = McMappingDatabase.getSRG("field_148302_b");

	/**
	 * <p>
	 * Name: lastIconB64
	 * </p>
	 */
	public static McObfPair field_148299_g = McMappingDatabase.getSRG("field_148299_g");

	/**
	 * <p>
	 * Name: prepareServerIcon
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148297_b = McMappingDatabase.getSRG("ServerListEntryNormal.func_148297_b");

	/**
	 * <p>
	 * Name: getServerData
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/multiplayer/ServerData;]
	 * </p>
	 */
	public static McObfPair func_148296_a = McMappingDatabase.getSRG("ServerListEntryNormal.func_148296_a");

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_148278_a = McMappingDatabase.getSRG("ServerListEntryNormal.func_148278_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_148304_a = McMappingDatabase.getSRG("field_148304_a");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_148277_b = McMappingDatabase.getSRG("ServerListEntryNormal.func_148277_b");

	/**
	 * <p>
	 * Name: owner
	 * </p>
	 */
	public static McObfPair field_148303_c = McMappingDatabase.getSRG("field_148303_c");

	/**
	 * <p>
	 * Name: drawTextureAt
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_178012_a = McMappingDatabase.getSRG("ServerListEntryNormal.func_178012_a");

	/**
	 * <p>
	 * Name: icon
	 * </p>
	 */
	public static McObfPair field_148305_h = McMappingDatabase.getSRG("field_148305_h");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_148300_d = McMappingDatabase.getSRG("field_148300_d");

	/**
	 * <p>
	 * Name: drawEntry
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIZF)V]
	 * </p>
	 */
	public static McObfPair func_192634_a = McMappingDatabase.getSRG("ServerListEntryNormal.func_192634_a");

	/**
	 * <p>
	 * Name: updatePosition
	 * </p>
	 * <p>
	 * Desc: [(IIIF)V]
	 * </p>
	 */
	public static McObfPair func_192633_a = McMappingDatabase.getSRG("ServerListEntryNormal.func_192633_a");

	/**
	 * <p>
	 * Name: UNKNOWN_SERVER
	 * </p>
	 */
	public static McObfPair field_178015_c = McMappingDatabase.getSRG("field_178015_c");

	/**
	 * <p>
	 * Name: SERVER_SELECTION_BUTTONS
	 * </p>
	 */
	public static McObfPair field_178014_d = McMappingDatabase.getSRG("field_178014_d");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_148301_e = McMappingDatabase.getSRG("field_148301_e");

	/**
	 * <p>
	 * Name: serverIcon
	 * </p>
	 */
	public static McObfPair field_148306_i = McMappingDatabase.getSRG("field_148306_i");

	/**
	 * <p>
	 * Name: canJoin
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178013_b = McMappingDatabase.getSRG("ServerListEntryNormal.func_178013_b");

	/**
	 * <p>
	 * Name: lastClickTime
	 * </p>
	 */
	public static McObfPair field_148298_f = McMappingDatabase.getSRG("field_148298_f");

}
