package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSetPassengers {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kk";
		else
			return "net/minecraft/network/play/server/SPacketSetPassengers";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kk";
		else
			return "SPacketSetPassengers";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkk;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSetPassengers;";
	}

	/**
	 * <p>
	 * Name: passengerIds
	 * </p>
	 */
	public static McObfPair field_186974_b = McMappingDatabase.getSRG("field_186974_b");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSetPassengers.func_148840_b");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_186973_a = McMappingDatabase.getSRG("field_186973_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSetPassengers.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSetPassengers.func_148837_a");

	/**
	 * <p>
	 * Name: getPassengerIds
	 * </p>
	 * <p>
	 * Desc: [()[I]
	 * </p>
	 */
	public static McObfPair func_186971_a = McMappingDatabase.getSRG("SPacketSetPassengers.func_186971_a");

	/**
	 * <p>
	 * Name: getEntityId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186972_b = McMappingDatabase.getSRG("SPacketSetPassengers.func_186972_b");

}
