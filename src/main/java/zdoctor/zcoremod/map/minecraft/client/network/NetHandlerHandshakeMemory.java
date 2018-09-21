package zdoctor.zcoremod.map.minecraft.client.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetHandlerHandshakeMemory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oy";
		else
			return "net/minecraft/client/network/NetHandlerHandshakeMemory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oy";
		else
			return "NetHandlerHandshakeMemory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loy;";
		else
			return "Lnet/minecraft/client/network/NetHandlerHandshakeMemory;";
	}

	/**
	 * <p>
	 * Name: processHandshake
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/handshake/client/C00Handshake;)V]
	 * </p>
	 */
	public static McObfPair func_147383_a = McMappingDatabase.getSRG("NetHandlerHandshakeMemory.func_147383_a");

	/**
	 * <p>
	 * Name: networkManager
	 * </p>
	 */
	public static McObfPair field_147384_b = McMappingDatabase.getSRG("field_147384_b");

	/**
	 * <p>
	 * Name: onDisconnect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_147231_a = McMappingDatabase.getSRG("NetHandlerHandshakeMemory.func_147231_a");

	/**
	 * <p>
	 * Name: mcServer
	 * </p>
	 */
	public static McObfPair field_147385_a = McMappingDatabase.getSRG("field_147385_a");

}
