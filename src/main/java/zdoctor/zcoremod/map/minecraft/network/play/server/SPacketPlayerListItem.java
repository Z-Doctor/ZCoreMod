package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketPlayerListItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jp";
		else
			return "net/minecraft/network/play/server/SPacketPlayerListItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jp";
		else
			return "SPacketPlayerListItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljp;";
		else
			return "Lnet/minecraft/network/play/server/SPacketPlayerListItem;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketPlayerListItem.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketPlayerListItem.func_148833_a");

	/**
	 * <p>
	 * Name: players
	 * </p>
	 */
	public static McObfPair field_179769_b = McMappingDatabase.getSRG("field_179769_b");

	/**
	 * <p>
	 * Name: getAction
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketPlayerListItem$Action;]
	 * </p>
	 */
	public static McObfPair func_179768_b = McMappingDatabase.getSRG("SPacketPlayerListItem.func_179768_b");

	/**
	 * <p>
	 * Name: getEntries
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_179767_a = McMappingDatabase.getSRG("SPacketPlayerListItem.func_179767_a");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_179770_a = McMappingDatabase.getSRG("field_179770_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketPlayerListItem.func_148840_b");

}
