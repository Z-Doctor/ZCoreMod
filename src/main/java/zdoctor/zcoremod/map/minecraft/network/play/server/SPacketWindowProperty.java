package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketWindowProperty {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "it";
		else
			return "net/minecraft/network/play/server/SPacketWindowProperty";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "it";
		else
			return "SPacketWindowProperty";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lit;";
		else
			return "Lnet/minecraft/network/play/server/SPacketWindowProperty;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketWindowProperty.func_148840_b");

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_149185_c = McMappingDatabase.getSRG("field_149185_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketWindowProperty.func_148833_a");

	/**
	 * <p>
	 * Name: getProperty
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149181_d = McMappingDatabase.getSRG("SPacketWindowProperty.func_149181_d");

	/**
	 * <p>
	 * Name: property
	 * </p>
	 */
	public static McObfPair field_149184_b = McMappingDatabase.getSRG("field_149184_b");

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149180_e = McMappingDatabase.getSRG("SPacketWindowProperty.func_149180_e");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketWindowProperty.func_148837_a");

	/**
	 * <p>
	 * Name: windowId
	 * </p>
	 */
	public static McObfPair field_149186_a = McMappingDatabase.getSRG("field_149186_a");

	/**
	 * <p>
	 * Name: getWindowId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149182_c = McMappingDatabase.getSRG("SPacketWindowProperty.func_149182_c");

}
