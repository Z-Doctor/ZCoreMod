package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntityTeleport {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kt";
		else
			return "net/minecraft/network/play/server/SPacketEntityTeleport";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kt";
		else
			return "SPacketEntityTeleport";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkt;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntityTeleport;";
	}

	/**
	 * <p>
	 * Name: posY
	 * </p>
	 */
	public static McObfPair field_149457_c = McMappingDatabase.getSRG("field_149457_c");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186982_b = McMappingDatabase.getSRG("SPacketEntityTeleport.func_186982_b");

	/**
	 * <p>
	 * Name: getOnGround
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179697_g = McMappingDatabase.getSRG("SPacketEntityTeleport.func_179697_g");

	/**
	 * <p>
	 * Name: yaw
	 * </p>
	 */
	public static McObfPair field_149455_e = McMappingDatabase.getSRG("field_149455_e");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEntityTeleport.func_148840_b");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_149453_f = McMappingDatabase.getSRG("field_149453_f");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEntityTeleport.func_148837_a");

	/**
	 * <p>
	 * Name: getYaw
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_149450_g = McMappingDatabase.getSRG("SPacketEntityTeleport.func_149450_g");

	/**
	 * <p>
	 * Name: onGround
	 * </p>
	 */
	public static McObfPair field_179698_g = McMappingDatabase.getSRG("field_179698_g");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186983_c = McMappingDatabase.getSRG("SPacketEntityTeleport.func_186983_c");

	/**
	 * <p>
	 * Name: posX
	 * </p>
	 */
	public static McObfPair field_149456_b = McMappingDatabase.getSRG("field_149456_b");

	/**
	 * <p>
	 * Name: getEntityId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149451_c = McMappingDatabase.getSRG("SPacketEntityTeleport.func_149451_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEntityTeleport.func_148833_a");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186981_d = McMappingDatabase.getSRG("SPacketEntityTeleport.func_186981_d");

	/**
	 * <p>
	 * Name: posZ
	 * </p>
	 */
	public static McObfPair field_149454_d = McMappingDatabase.getSRG("field_149454_d");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149458_a = McMappingDatabase.getSRG("field_149458_a");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_149447_h = McMappingDatabase.getSRG("SPacketEntityTeleport.func_149447_h");

}
