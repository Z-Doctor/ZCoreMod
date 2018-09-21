package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketResourcePackStatus {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lt";
		else
			return "net/minecraft/network/play/client/CPacketResourcePackStatus";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lt";
		else
			return "CPacketResourcePackStatus";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llt;";
		else
			return "Lnet/minecraft/network/play/client/CPacketResourcePackStatus;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketResourcePackStatus.func_148840_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketResourcePackStatus.func_148833_a");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_179719_b = McMappingDatabase.getSRG("field_179719_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketResourcePackStatus.func_148837_a");

}
