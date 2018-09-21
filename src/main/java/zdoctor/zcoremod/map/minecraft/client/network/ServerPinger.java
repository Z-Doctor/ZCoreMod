package zdoctor.zcoremod.map.minecraft.client.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerPinger {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsg";
		else
			return "net/minecraft/client/network/ServerPinger";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsg";
		else
			return "ServerPinger";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsg;";
		else
			return "Lnet/minecraft/client/network/ServerPinger;";
	}

	/**
	 * <p>
	 * Name: pingDestinations
	 * </p>
	 */
	public static McObfPair field_147229_c = McMappingDatabase.getSRG("field_147229_c");

	/**
	 * <p>
	 * Name: clearPendingNetworks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147226_b = McMappingDatabase.getSRG("ServerPinger.func_147226_b");

	/**
	 * <p>
	 * Name: ping
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/ServerData;)V]
	 * </p>
	 */
	public static McObfPair func_147224_a = McMappingDatabase.getSRG("ServerPinger.func_147224_a");

	/**
	 * <p>
	 * Name: pingPendingNetworks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147223_a = McMappingDatabase.getSRG("ServerPinger.func_147223_a");

	/**
	 * <p>
	 * Name: PING_RESPONSE_SPLITTER
	 * </p>
	 */
	public static McObfPair field_147230_a = McMappingDatabase.getSRG("field_147230_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147228_b = McMappingDatabase.getSRG("field_147228_b");

	/**
	 * <p>
	 * Name: tryCompatibilityPing
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/ServerData;)V]
	 * </p>
	 */
	public static McObfPair func_147225_b = McMappingDatabase.getSRG("ServerPinger.func_147225_b");

}
