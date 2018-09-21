package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketConfirmTeleport {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ky";
		else
			return "net/minecraft/network/play/client/CPacketConfirmTeleport";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ky";
		else
			return "CPacketConfirmTeleport";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lky;";
		else
			return "Lnet/minecraft/network/play/client/CPacketConfirmTeleport;";
	}

	/**
	 * <p>
	 * Name: getTeleportId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186987_a = McMappingDatabase.getSRG("CPacketConfirmTeleport.func_186987_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketConfirmTeleport.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketConfirmTeleport.func_148840_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketConfirmTeleport.func_148833_a");

	/**
	 * <p>
	 * Name: telportId
	 * </p>
	 */
	public static McObfPair field_186988_a = McMappingDatabase.getSRG("field_186988_a");

}
