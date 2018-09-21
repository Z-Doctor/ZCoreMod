package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntityMetadata {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kd";
		else
			return "net/minecraft/network/play/server/SPacketEntityMetadata";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kd";
		else
			return "SPacketEntityMetadata";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkd;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntityMetadata;";
	}

	/**
	 * <p>
	 * Name: getDataManagerEntries
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_149376_c = McMappingDatabase.getSRG("SPacketEntityMetadata.func_149376_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEntityMetadata.func_148833_a");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149379_a = McMappingDatabase.getSRG("field_149379_a");

	/**
	 * <p>
	 * Name: getEntityId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149375_d = McMappingDatabase.getSRG("SPacketEntityMetadata.func_149375_d");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEntityMetadata.func_148837_a");

	/**
	 * <p>
	 * Name: dataManagerEntries
	 * </p>
	 */
	public static McObfPair field_149378_b = McMappingDatabase.getSRG("field_149378_b");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEntityMetadata.func_148840_b");

}
