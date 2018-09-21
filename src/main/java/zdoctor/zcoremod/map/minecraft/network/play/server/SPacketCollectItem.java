package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketCollectItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ks";
		else
			return "net/minecraft/network/play/server/SPacketCollectItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ks";
		else
			return "SPacketCollectItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lks;";
		else
			return "Lnet/minecraft/network/play/server/SPacketCollectItem;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketCollectItem.func_148833_a");

	/**
	 * <p>
	 * Name: getCollectedItemEntityID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149354_c = McMappingDatabase.getSRG("SPacketCollectItem.func_149354_c");

	/**
	 * <p>
	 * Name: getAmount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_191208_c = McMappingDatabase.getSRG("SPacketCollectItem.func_191208_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketCollectItem.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketCollectItem.func_148837_a");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149356_b = McMappingDatabase.getSRG("field_149356_b");

	/**
	 * <p>
	 * Name: getEntityID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149353_d = McMappingDatabase.getSRG("SPacketCollectItem.func_149353_d");

	/**
	 * <p>
	 * Name: collectedQuantity
	 * </p>
	 */
	public static McObfPair field_191209_c = McMappingDatabase.getSRG("field_191209_c");

	/**
	 * <p>
	 * Name: collectedItemEntityId
	 * </p>
	 */
	public static McObfPair field_149357_a = McMappingDatabase.getSRG("field_149357_a");

}
