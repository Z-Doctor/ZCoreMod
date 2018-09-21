package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntity$S15PacketEntityRelMove {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jj$a";
		else
			return "net/minecraft/network/play/server/SPacketEntity$S15PacketEntityRelMove";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jj$a";
		else
			return "SPacketEntity$S15PacketEntityRelMove";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljj$a;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntity$S15PacketEntityRelMove;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEntity$S15PacketEntityRelMove.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEntity$S15PacketEntityRelMove.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEntity$S15PacketEntityRelMove.func_148837_a");

}
