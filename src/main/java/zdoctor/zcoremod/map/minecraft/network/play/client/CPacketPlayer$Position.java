package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketPlayer$Position {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lk$a";
		else
			return "net/minecraft/network/play/client/CPacketPlayer$Position";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lk$a";
		else
			return "CPacketPlayer$Position";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llk$a;";
		else
			return "Lnet/minecraft/network/play/client/CPacketPlayer$Position;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketPlayer$Position.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketPlayer$Position.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketPlayer$Position.func_148833_a");

}
