package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketPlayerPosLook {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jq";
		else
			return "net/minecraft/network/play/server/SPacketPlayerPosLook";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jq";
		else
			return "SPacketPlayerPosLook";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljq;";
		else
			return "Lnet/minecraft/network/play/server/SPacketPlayerPosLook;";
	}

	/**
	 * <p>
	 * Name: flags
	 * </p>
	 */
	public static McObfPair field_179835_f = McMappingDatabase.getSRG("field_179835_f");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_148938_b = McMappingDatabase.getSRG("field_148938_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketPlayerPosLook.func_148833_a");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_148933_e = McMappingDatabase.getSRG("SPacketPlayerPosLook.func_148933_e");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketPlayerPosLook.func_148840_b");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_148937_e = McMappingDatabase.getSRG("field_148937_e");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketPlayerPosLook.func_148837_a");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_148932_c = McMappingDatabase.getSRG("SPacketPlayerPosLook.func_148932_c");

	/**
	 * <p>
	 * Name: getFlags
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_179834_f = McMappingDatabase.getSRG("SPacketPlayerPosLook.func_179834_f");

	/**
	 * <p>
	 * Name: teleportId
	 * </p>
	 */
	public static McObfPair field_186966_g = McMappingDatabase.getSRG("field_186966_g");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_148940_a = McMappingDatabase.getSRG("field_148940_a");

	/**
	 * <p>
	 * Name: getTeleportId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186965_f = McMappingDatabase.getSRG("SPacketPlayerPosLook.func_186965_f");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_148930_g = McMappingDatabase.getSRG("SPacketPlayerPosLook.func_148930_g");

	/**
	 * <p>
	 * Name: getYaw
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_148931_f = McMappingDatabase.getSRG("SPacketPlayerPosLook.func_148931_f");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_148939_c = McMappingDatabase.getSRG("field_148939_c");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_148928_d = McMappingDatabase.getSRG("SPacketPlayerPosLook.func_148928_d");

	/**
	 * <p>
	 * Name: yaw
	 * </p>
	 */
	public static McObfPair field_148936_d = McMappingDatabase.getSRG("field_148936_d");

}
