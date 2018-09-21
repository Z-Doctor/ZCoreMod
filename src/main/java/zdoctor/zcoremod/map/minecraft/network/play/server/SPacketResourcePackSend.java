package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketResourcePackSend {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jv";
		else
			return "net/minecraft/network/play/server/SPacketResourcePackSend";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jv";
		else
			return "SPacketResourcePackSend";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljv;";
		else
			return "Lnet/minecraft/network/play/server/SPacketResourcePackSend;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketResourcePackSend.func_148833_a");

	/**
	 * <p>
	 * Name: hash
	 * </p>
	 */
	public static McObfPair field_179785_b = McMappingDatabase.getSRG("field_179785_b");

	/**
	 * <p>
	 * Name: getURL
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179783_a = McMappingDatabase.getSRG("SPacketResourcePackSend.func_179783_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketResourcePackSend.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketResourcePackSend.func_148837_a");

	/**
	 * <p>
	 * Name: url
	 * </p>
	 */
	public static McObfPair field_179786_a = McMappingDatabase.getSRG("field_179786_a");

	/**
	 * <p>
	 * Name: getHash
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179784_b = McMappingDatabase.getSRG("SPacketResourcePackSend.func_179784_b");

}
