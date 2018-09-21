package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketDestroyEntities {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jt";
		else
			return "net/minecraft/network/play/server/SPacketDestroyEntities";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jt";
		else
			return "SPacketDestroyEntities";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljt;";
		else
			return "Lnet/minecraft/network/play/server/SPacketDestroyEntities;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketDestroyEntities.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketDestroyEntities.func_148833_a");

	/**
	 * <p>
	 * Name: entityIDs
	 * </p>
	 */
	public static McObfPair field_149100_a = McMappingDatabase.getSRG("field_149100_a");

	/**
	 * <p>
	 * Name: getEntityIDs
	 * </p>
	 * <p>
	 * Desc: [()[I]
	 * </p>
	 */
	public static McObfPair func_149098_c = McMappingDatabase.getSRG("SPacketDestroyEntities.func_149098_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketDestroyEntities.func_148840_b");

}
