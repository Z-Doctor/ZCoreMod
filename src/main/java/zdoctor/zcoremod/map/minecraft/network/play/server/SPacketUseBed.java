package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketUseBed {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jr";
		else
			return "net/minecraft/network/play/server/SPacketUseBed";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jr";
		else
			return "SPacketUseBed";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljr;";
		else
			return "Lnet/minecraft/network/play/server/SPacketUseBed;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketUseBed.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketUseBed.func_148837_a");

	/**
	 * <p>
	 * Name: bedPos
	 * </p>
	 */
	public static McObfPair field_179799_b = McMappingDatabase.getSRG("field_179799_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketUseBed.func_148833_a");

	/**
	 * <p>
	 * Name: getPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_149091_a = McMappingDatabase.getSRG("SPacketUseBed.func_149091_a");

	/**
	 * <p>
	 * Name: getBedPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179798_a = McMappingDatabase.getSRG("SPacketUseBed.func_179798_a");

	/**
	 * <p>
	 * Name: playerID
	 * </p>
	 */
	public static McObfPair field_149097_a = McMappingDatabase.getSRG("field_149097_a");

}
