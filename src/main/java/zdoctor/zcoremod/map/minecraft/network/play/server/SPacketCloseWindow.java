package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketCloseWindow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "iq";
		else
			return "net/minecraft/network/play/server/SPacketCloseWindow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "iq";
		else
			return "SPacketCloseWindow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Liq;";
		else
			return "Lnet/minecraft/network/play/server/SPacketCloseWindow;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketCloseWindow.func_148833_a");

	/**
	 * <p>
	 * Name: windowId
	 * </p>
	 */
	public static McObfPair field_148896_a = McMappingDatabase.getSRG("field_148896_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketCloseWindow.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketCloseWindow.func_148837_a");

}
