package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsf";
		else
			return "net/minecraft/client/multiplayer/ServerList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsf";
		else
			return "ServerList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsf;";
		else
			return "Lnet/minecraft/client/multiplayer/ServerList;";
	}

	/**
	 * <p>
	 * Name: swapServers
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_78857_a = McMappingDatabase.getSRG("ServerList.func_78857_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/client/multiplayer/ServerData;)V]
	 * </p>
	 */
	public static McObfPair func_147413_a = McMappingDatabase.getSRG("ServerList.func_147413_a");

	/**
	 * <p>
	 * Name: removeServerData
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_78851_b = McMappingDatabase.getSRG("ServerList.func_78851_b");

	/**
	 * <p>
	 * Name: saveServerList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78855_b = McMappingDatabase.getSRG("ServerList.func_78855_b");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_78859_a = McMappingDatabase.getSRG("field_78859_a");

	/**
	 * <p>
	 * Name: servers
	 * </p>
	 */
	public static McObfPair field_78858_b = McMappingDatabase.getSRG("field_78858_b");

	/**
	 * <p>
	 * Name: saveSingleServer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/ServerData;)V]
	 * </p>
	 */
	public static McObfPair func_147414_b = McMappingDatabase.getSRG("ServerList.func_147414_b");

	/**
	 * <p>
	 * Name: loadServerList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78853_a = McMappingDatabase.getSRG("ServerList.func_78853_a");

	/**
	 * <p>
	 * Name: addServerData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/ServerData;)V]
	 * </p>
	 */
	public static McObfPair func_78849_a = McMappingDatabase.getSRG("ServerList.func_78849_a");

	/**
	 * <p>
	 * Name: getServerData
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/multiplayer/ServerData;]
	 * </p>
	 */
	public static McObfPair func_78850_a = McMappingDatabase.getSRG("ServerList.func_78850_a");

	/**
	 * <p>
	 * Name: countServers
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_78856_c = McMappingDatabase.getSRG("ServerList.func_78856_c");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147415_a = McMappingDatabase.getSRG("field_147415_a");

}
