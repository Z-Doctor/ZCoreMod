package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketKeepAlive {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jd";
		else
			return "net/minecraft/network/play/server/SPacketKeepAlive";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jd";
		else
			return "SPacketKeepAlive";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljd;";
		else
			return "Lnet/minecraft/network/play/server/SPacketKeepAlive;";
	}

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_149136_a = McMappingDatabase.getSRG("field_149136_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketKeepAlive.func_148833_a");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_149134_c = McMappingDatabase.getSRG("SPacketKeepAlive.func_149134_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketKeepAlive.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketKeepAlive.func_148840_b");

}
