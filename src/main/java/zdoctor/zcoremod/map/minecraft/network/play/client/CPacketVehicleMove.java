package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketVehicleMove {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ll";
		else
			return "net/minecraft/network/play/client/CPacketVehicleMove";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ll";
		else
			return "CPacketVehicleMove";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lll;";
		else
			return "Lnet/minecraft/network/play/client/CPacketVehicleMove;";
	}

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_187011_e = McMappingDatabase.getSRG("field_187011_e");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_187005_e = McMappingDatabase.getSRG("CPacketVehicleMove.func_187005_e");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketVehicleMove.func_148840_b");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_187002_b = McMappingDatabase.getSRG("CPacketVehicleMove.func_187002_b");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_187004_a = McMappingDatabase.getSRG("CPacketVehicleMove.func_187004_a");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_187007_a = McMappingDatabase.getSRG("field_187007_a");

	/**
	 * <p>
	 * Name: getYaw
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_187006_d = McMappingDatabase.getSRG("CPacketVehicleMove.func_187006_d");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketVehicleMove.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketVehicleMove.func_148837_a");

	/**
	 * <p>
	 * Name: yaw
	 * </p>
	 */
	public static McObfPair field_187010_d = McMappingDatabase.getSRG("field_187010_d");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_187009_c = McMappingDatabase.getSRG("field_187009_c");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_187008_b = McMappingDatabase.getSRG("field_187008_b");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_187003_c = McMappingDatabase.getSRG("CPacketVehicleMove.func_187003_c");

}
