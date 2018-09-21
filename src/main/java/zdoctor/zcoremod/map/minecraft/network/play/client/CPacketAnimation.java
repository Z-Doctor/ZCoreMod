package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketAnimation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ly";
		else
			return "net/minecraft/network/play/client/CPacketAnimation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ly";
		else
			return "CPacketAnimation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lly;";
		else
			return "Lnet/minecraft/network/play/client/CPacketAnimation;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketAnimation.func_148840_b");

	/**
	 * <p>
	 * Name: getHand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumHand;]
	 * </p>
	 */
	public static McObfPair func_187018_a = McMappingDatabase.getSRG("CPacketAnimation.func_187018_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketAnimation.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketAnimation.func_148837_a");

	/**
	 * <p>
	 * Name: hand
	 * </p>
	 */
	public static McObfPair field_187019_a = McMappingDatabase.getSRG("field_187019_a");

}
