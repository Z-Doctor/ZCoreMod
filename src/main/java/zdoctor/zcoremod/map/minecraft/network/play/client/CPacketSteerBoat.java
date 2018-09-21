package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketSteerBoat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lm";
		else
			return "net/minecraft/network/play/client/CPacketSteerBoat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lm";
		else
			return "CPacketSteerBoat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llm;";
		else
			return "Lnet/minecraft/network/play/client/CPacketSteerBoat;";
	}

	/**
	 * <p>
	 * Name: getRight
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187014_b = McMappingDatabase.getSRG("CPacketSteerBoat.func_187014_b");

	/**
	 * <p>
	 * Name: left
	 * </p>
	 */
	public static McObfPair field_187015_a = McMappingDatabase.getSRG("field_187015_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketSteerBoat.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketSteerBoat.func_148833_a");

	/**
	 * <p>
	 * Name: getLeft
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187012_a = McMappingDatabase.getSRG("CPacketSteerBoat.func_187012_a");

	/**
	 * <p>
	 * Name: right
	 * </p>
	 */
	public static McObfPair field_187016_b = McMappingDatabase.getSRG("field_187016_b");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketSteerBoat.func_148840_b");

}
