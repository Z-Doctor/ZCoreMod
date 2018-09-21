package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketSpectate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lz";
		else
			return "net/minecraft/network/play/client/CPacketSpectate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lz";
		else
			return "CPacketSpectate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llz;";
		else
			return "Lnet/minecraft/network/play/client/CPacketSpectate;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketSpectate.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketSpectate.func_148837_a");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_179729_a = McMappingDatabase.getSRG("field_179729_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketSpectate.func_148840_b");

	/**
	 * <p>
	 * Name: getEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldServer;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_179727_a = McMappingDatabase.getSRG("CPacketSpectate.func_179727_a");

}
