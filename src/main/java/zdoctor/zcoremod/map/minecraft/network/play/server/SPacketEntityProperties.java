package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntityProperties {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kv";
		else
			return "net/minecraft/network/play/server/SPacketEntityProperties";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kv";
		else
			return "SPacketEntityProperties";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkv;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntityProperties;";
	}

	/**
	 * <p>
	 * Name: getSnapshots
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_149441_d = McMappingDatabase.getSRG("SPacketEntityProperties.func_149441_d");

	/**
	 * <p>
	 * Name: snapshots
	 * </p>
	 */
	public static McObfPair field_149444_b = McMappingDatabase.getSRG("field_149444_b");

	/**
	 * <p>
	 * Name: getEntityId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149442_c = McMappingDatabase.getSRG("SPacketEntityProperties.func_149442_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEntityProperties.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEntityProperties.func_148837_a");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149445_a = McMappingDatabase.getSRG("field_149445_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEntityProperties.func_148833_a");

}
