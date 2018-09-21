package zdoctor.zcoremod.map.minecraft.client.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerPinger$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsg$1";
		else
			return "net/minecraft/client/network/ServerPinger$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsg$1";
		else
			return "ServerPinger$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsg$1;";
		else
			return "Lnet/minecraft/client/network/ServerPinger$1;";
	}

	/**
	 * <p>
	 * Name: handlePong
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/status/server/SPacketPong;)V]
	 * </p>
	 */
	public static McObfPair func_147398_a = McMappingDatabase.getSRG("ServerPinger$1.func_147398_a");

	/**
	 * <p>
	 * Name: pingSentAt
	 * </p>
	 */
	public static McObfPair field_175092_e = McMappingDatabase.getSRG("field_175092_e");

	/**
	 * <p>
	 * Name: successful
	 * </p>
	 */
	public static McObfPair field_147403_d = McMappingDatabase.getSRG("field_147403_d");

	/**
	 * <p>
	 * Name: receivedStatus
	 * </p>
	 */
	public static McObfPair field_183009_e = McMappingDatabase.getSRG("field_183009_e");

	/**
	 * <p>
	 * Name: handleServerInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/status/server/SPacketServerInfo;)V]
	 * </p>
	 */
	public static McObfPair func_147397_a = McMappingDatabase.getSRG("ServerPinger$1.func_147397_a");

	/**
	 * <p>
	 * Name: onDisconnect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_147231_a = McMappingDatabase.getSRG("ServerPinger$1.func_147231_a");

}
