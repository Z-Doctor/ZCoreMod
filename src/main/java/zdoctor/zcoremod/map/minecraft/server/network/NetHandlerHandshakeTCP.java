package zdoctor.zcoremod.map.minecraft.server.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetHandlerHandshakeTCP {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pb";
		else
			return "net/minecraft/server/network/NetHandlerHandshakeTCP";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pb";
		else
			return "NetHandlerHandshakeTCP";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpb;";
		else
			return "Lnet/minecraft/server/network/NetHandlerHandshakeTCP;";
	}

	/**
	 * <p>
	 * Name: processHandshake
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/handshake/client/C00Handshake;)V]
	 * </p>
	 */
	public static McObfPair func_147383_a = McMappingDatabase.getSRG("NetHandlerHandshakeTCP.func_147383_a");

	/**
	 * <p>
	 * Name: networkManager
	 * </p>
	 */
	public static McObfPair field_147386_b = McMappingDatabase.getSRG("field_147386_b");

	/**
	 * <p>
	 * Name: onDisconnect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_147231_a = McMappingDatabase.getSRG("NetHandlerHandshakeTCP.func_147231_a");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_147387_a = McMappingDatabase.getSRG("field_147387_a");

}
