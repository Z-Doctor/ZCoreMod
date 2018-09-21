package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntity$S17PacketEntityLookMove {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jj$b";
		else
			return "net/minecraft/network/play/server/SPacketEntity$S17PacketEntityLookMove";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jj$b";
		else
			return "SPacketEntity$S17PacketEntityLookMove";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljj$b;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntity$S17PacketEntityLookMove;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEntity$S17PacketEntityLookMove.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEntity$S17PacketEntityLookMove.func_148840_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEntity$S17PacketEntityLookMove.func_148833_a");

}
