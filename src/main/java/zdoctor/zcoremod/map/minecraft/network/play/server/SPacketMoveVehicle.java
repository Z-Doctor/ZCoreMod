package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketMoveVehicle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jk";
		else
			return "net/minecraft/network/play/server/SPacketMoveVehicle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jk";
		else
			return "SPacketMoveVehicle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljk;";
		else
			return "Lnet/minecraft/network/play/server/SPacketMoveVehicle;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketMoveVehicle.func_148837_a");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_186960_a = McMappingDatabase.getSRG("field_186960_a");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186955_b = McMappingDatabase.getSRG("SPacketMoveVehicle.func_186955_b");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_186964_e = McMappingDatabase.getSRG("field_186964_e");

	/**
	 * <p>
	 * Name: yaw
	 * </p>
	 */
	public static McObfPair field_186963_d = McMappingDatabase.getSRG("field_186963_d");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_186961_b = McMappingDatabase.getSRG("field_186961_b");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_186962_c = McMappingDatabase.getSRG("field_186962_c");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_186958_e = McMappingDatabase.getSRG("SPacketMoveVehicle.func_186958_e");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketMoveVehicle.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketMoveVehicle.func_148840_b");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186956_c = McMappingDatabase.getSRG("SPacketMoveVehicle.func_186956_c");

	/**
	 * <p>
	 * Name: getYaw
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_186959_d = McMappingDatabase.getSRG("SPacketMoveVehicle.func_186959_d");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186957_a = McMappingDatabase.getSRG("SPacketMoveVehicle.func_186957_a");

}
