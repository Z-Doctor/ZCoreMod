package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntityAttach {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ke";
		else
			return "net/minecraft/network/play/server/SPacketEntityAttach";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ke";
		else
			return "SPacketEntityAttach";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lke;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntityAttach;";
	}

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149406_b = McMappingDatabase.getSRG("field_149406_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEntityAttach.func_148833_a");

	/**
	 * <p>
	 * Name: vehicleEntityId
	 * </p>
	 */
	public static McObfPair field_149407_c = McMappingDatabase.getSRG("field_149407_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEntityAttach.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEntityAttach.func_148837_a");

	/**
	 * <p>
	 * Name: getEntityId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149403_d = McMappingDatabase.getSRG("SPacketEntityAttach.func_149403_d");

	/**
	 * <p>
	 * Name: getVehicleEntityId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149402_e = McMappingDatabase.getSRG("SPacketEntityAttach.func_149402_e");

}
