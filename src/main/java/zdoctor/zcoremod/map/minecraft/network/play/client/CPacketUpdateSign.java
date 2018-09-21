package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketUpdateSign {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lx";
		else
			return "net/minecraft/network/play/client/CPacketUpdateSign";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lx";
		else
			return "CPacketUpdateSign";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llx;";
		else
			return "Lnet/minecraft/network/play/client/CPacketUpdateSign;";
	}

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 */
	public static McObfPair field_179723_a = McMappingDatabase.getSRG("field_179723_a");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179722_a = McMappingDatabase.getSRG("CPacketUpdateSign.func_179722_a");

	/**
	 * <p>
	 * Name: lines
	 * </p>
	 */
	public static McObfPair field_149590_d = McMappingDatabase.getSRG("field_149590_d");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketUpdateSign.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketUpdateSign.func_148840_b");

	/**
	 * <p>
	 * Name: getLines
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_187017_b = McMappingDatabase.getSRG("CPacketUpdateSign.func_187017_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketUpdateSign.func_148833_a");

}
