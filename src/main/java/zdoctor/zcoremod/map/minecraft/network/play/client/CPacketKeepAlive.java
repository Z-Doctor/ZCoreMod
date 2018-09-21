package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketKeepAlive {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lj";
		else
			return "net/minecraft/network/play/client/CPacketKeepAlive";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lj";
		else
			return "CPacketKeepAlive";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llj;";
		else
			return "Lnet/minecraft/network/play/client/CPacketKeepAlive;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketKeepAlive.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketKeepAlive.func_148840_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketKeepAlive.func_148833_a");

	/**
	 * <p>
	 * Name: getKey
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_149460_c = McMappingDatabase.getSRG("CPacketKeepAlive.func_149460_c");

	/**
	 * <p>
	 * Name: key
	 * </p>
	 */
	public static McObfPair field_149461_a = McMappingDatabase.getSRG("field_149461_a");

}
