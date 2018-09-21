package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketBlockBreakAnim {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ig";
		else
			return "net/minecraft/network/play/server/SPacketBlockBreakAnim";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ig";
		else
			return "SPacketBlockBreakAnim";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lig;";
		else
			return "Lnet/minecraft/network/play/server/SPacketBlockBreakAnim;";
	}

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_179822_b = McMappingDatabase.getSRG("field_179822_b");

	/**
	 * <p>
	 * Name: getBreakerId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148845_c = McMappingDatabase.getSRG("SPacketBlockBreakAnim.func_148845_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketBlockBreakAnim.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketBlockBreakAnim.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketBlockBreakAnim.func_148837_a");

	/**
	 * <p>
	 * Name: breakerId
	 * </p>
	 */
	public static McObfPair field_148852_a = McMappingDatabase.getSRG("field_148852_a");

	/**
	 * <p>
	 * Name: progress
	 * </p>
	 */
	public static McObfPair field_148849_e = McMappingDatabase.getSRG("field_148849_e");

	/**
	 * <p>
	 * Name: getProgress
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148846_g = McMappingDatabase.getSRG("SPacketBlockBreakAnim.func_148846_g");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179821_b = McMappingDatabase.getSRG("SPacketBlockBreakAnim.func_179821_b");

}
