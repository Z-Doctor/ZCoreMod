package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntityStatus {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "iz";
		else
			return "net/minecraft/network/play/server/SPacketEntityStatus";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "iz";
		else
			return "SPacketEntityStatus";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Liz;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntityStatus;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEntityStatus.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEntityStatus.func_148840_b");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149164_a = McMappingDatabase.getSRG("field_149164_a");

	/**
	 * <p>
	 * Name: getEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_149161_a = McMappingDatabase.getSRG("SPacketEntityStatus.func_149161_a");

	/**
	 * <p>
	 * Name: getOpCode
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_149160_c = McMappingDatabase.getSRG("SPacketEntityStatus.func_149160_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEntityStatus.func_148837_a");

	/**
	 * <p>
	 * Name: logicOpcode
	 * </p>
	 */
	public static McObfPair field_149163_b = McMappingDatabase.getSRG("field_149163_b");

}
