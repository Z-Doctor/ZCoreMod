package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketSeenAdvancements {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lu";
		else
			return "net/minecraft/network/play/client/CPacketSeenAdvancements";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lu";
		else
			return "CPacketSeenAdvancements";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llu;";
		else
			return "Lnet/minecraft/network/play/client/CPacketSeenAdvancements;";
	}

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_194166_a = McMappingDatabase.getSRG("field_194166_a");

	/**
	 * <p>
	 * Name: closedScreen
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/client/CPacketSeenAdvancements;]
	 * </p>
	 */
	public static McObfPair func_194164_a = McMappingDatabase.getSRG("CPacketSeenAdvancements.func_194164_a");

	/**
	 * <p>
	 * Name: getTab
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_194165_c = McMappingDatabase.getSRG("CPacketSeenAdvancements.func_194165_c");

	/**
	 * <p>
	 * Name: openedTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)Lnet/minecraft/network/play/client/CPacketSeenAdvancements;]
	 * </p>
	 */
	public static McObfPair func_194163_a = McMappingDatabase.getSRG("CPacketSeenAdvancements.func_194163_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketSeenAdvancements.func_148840_b");

	/**
	 * <p>
	 * Name: tab
	 * </p>
	 */
	public static McObfPair field_194167_b = McMappingDatabase.getSRG("field_194167_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketSeenAdvancements.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketSeenAdvancements.func_148837_a");

	/**
	 * <p>
	 * Name: getAction
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/client/CPacketSeenAdvancements$Action;]
	 * </p>
	 */
	public static McObfPair func_194162_b = McMappingDatabase.getSRG("CPacketSeenAdvancements.func_194162_b");

}
