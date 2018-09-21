package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketAdvancementInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ku";
		else
			return "net/minecraft/network/play/server/SPacketAdvancementInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ku";
		else
			return "SPacketAdvancementInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lku;";
		else
			return "Lnet/minecraft/network/play/server/SPacketAdvancementInfo;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketAdvancementInfo.func_148837_a");

	/**
	 * <p>
	 * Name: advancementsToRemove
	 * </p>
	 */
	public static McObfPair field_192607_c = McMappingDatabase.getSRG("field_192607_c");

	/**
	 * <p>
	 * Name: isFirstSync
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192602_d = McMappingDatabase.getSRG("SPacketAdvancementInfo.func_192602_d");

	/**
	 * <p>
	 * Name: getAdvancementsToRemove
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_192600_b = McMappingDatabase.getSRG("SPacketAdvancementInfo.func_192600_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketAdvancementInfo.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketAdvancementInfo.func_148840_b");

	/**
	 * <p>
	 * Name: advancementsToAdd
	 * </p>
	 */
	public static McObfPair field_192606_b = McMappingDatabase.getSRG("field_192606_b");

	/**
	 * <p>
	 * Name: progressUpdates
	 * </p>
	 */
	public static McObfPair field_192608_d = McMappingDatabase.getSRG("field_192608_d");

	/**
	 * <p>
	 * Name: getProgressUpdates
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_192604_c = McMappingDatabase.getSRG("SPacketAdvancementInfo.func_192604_c");

	/**
	 * <p>
	 * Name: firstSync
	 * </p>
	 */
	public static McObfPair field_192605_a = McMappingDatabase.getSRG("field_192605_a");

	/**
	 * <p>
	 * Name: getAdvancementsToAdd
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_192603_a = McMappingDatabase.getSRG("SPacketAdvancementInfo.func_192603_a");

}
