package zdoctor.zcoremod.map.minecraft.server.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetHandlerStatusServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pd";
		else
			return "net/minecraft/server/network/NetHandlerStatusServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pd";
		else
			return "NetHandlerStatusServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpd;";
		else
			return "Lnet/minecraft/server/network/NetHandlerStatusServer;";
	}

	/**
	 * <p>
	 * Name: processServerQuery
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/status/client/CPacketServerQuery;)V]
	 * </p>
	 */
	public static McObfPair func_147312_a = McMappingDatabase.getSRG("NetHandlerStatusServer.func_147312_a");

	/**
	 * <p>
	 * Name: onDisconnect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_147231_a = McMappingDatabase.getSRG("NetHandlerStatusServer.func_147231_a");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_147314_a = McMappingDatabase.getSRG("field_147314_a");

	/**
	 * <p>
	 * Name: EXIT_MESSAGE
	 * </p>
	 */
	public static McObfPair field_183007_a = McMappingDatabase.getSRG("field_183007_a");

	/**
	 * <p>
	 * Name: processPing
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/status/client/CPacketPing;)V]
	 * </p>
	 */
	public static McObfPair func_147311_a = McMappingDatabase.getSRG("NetHandlerStatusServer.func_147311_a");

	/**
	 * <p>
	 * Name: networkManager
	 * </p>
	 */
	public static McObfPair field_147313_b = McMappingDatabase.getSRG("field_147313_b");

	/**
	 * <p>
	 * Name: handled
	 * </p>
	 */
	public static McObfPair field_183008_d = McMappingDatabase.getSRG("field_183008_d");

}
