package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketChat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "in";
		else
			return "net/minecraft/network/play/server/SPacketChat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "in";
		else
			return "SPacketChat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lin;";
		else
			return "Lnet/minecraft/network/play/server/SPacketChat;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketChat.func_148840_b");

	/**
	 * <p>
	 * Name: isSystem
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148916_d = McMappingDatabase.getSRG("SPacketChat.func_148916_d");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ChatType;]
	 * </p>
	 */
	public static McObfPair func_192590_c = McMappingDatabase.getSRG("SPacketChat.func_192590_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketChat.func_148837_a");

	/**
	 * <p>
	 * Name: getChatComponent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_148915_c = McMappingDatabase.getSRG("SPacketChat.func_148915_c");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_179842_b = McMappingDatabase.getSRG("field_179842_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketChat.func_148833_a");

	/**
	 * <p>
	 * Name: chatComponent
	 * </p>
	 */
	public static McObfPair field_148919_a = McMappingDatabase.getSRG("field_148919_a");

}
