package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntityHeadLook {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jx";
		else
			return "net/minecraft/network/play/server/SPacketEntityHeadLook";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jx";
		else
			return "SPacketEntityHeadLook";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljx;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntityHeadLook;";
	}

	/**
	 * <p>
	 * Name: getYaw
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_149380_c = McMappingDatabase.getSRG("SPacketEntityHeadLook.func_149380_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEntityHeadLook.func_148840_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEntityHeadLook.func_148833_a");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149384_a = McMappingDatabase.getSRG("field_149384_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEntityHeadLook.func_148837_a");

	/**
	 * <p>
	 * Name: getEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_149381_a = McMappingDatabase.getSRG("SPacketEntityHeadLook.func_149381_a");

	/**
	 * <p>
	 * Name: yaw
	 * </p>
	 */
	public static McObfPair field_149383_b = McMappingDatabase.getSRG("field_149383_b");

}
