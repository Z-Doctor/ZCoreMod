package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketInput {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lr";
		else
			return "net/minecraft/network/play/client/CPacketInput";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lr";
		else
			return "CPacketInput";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llr;";
		else
			return "Lnet/minecraft/network/play/client/CPacketInput;";
	}

	/**
	 * <p>
	 * Name: isSneaking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149617_f = McMappingDatabase.getSRG("CPacketInput.func_149617_f");

	/**
	 * <p>
	 * Name: getStrafeSpeed
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149620_c = McMappingDatabase.getSRG("CPacketInput.func_149620_c");

	/**
	 * <p>
	 * Name: strafeSpeed
	 * </p>
	 */
	public static McObfPair field_149624_a = McMappingDatabase.getSRG("field_149624_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketInput.func_148833_a");

	/**
	 * <p>
	 * Name: forwardSpeed
	 * </p>
	 */
	public static McObfPair field_192621_b = McMappingDatabase.getSRG("field_192621_b");

	/**
	 * <p>
	 * Name: sneaking
	 * </p>
	 */
	public static McObfPair field_149621_d = McMappingDatabase.getSRG("field_149621_d");

	/**
	 * <p>
	 * Name: jumping
	 * </p>
	 */
	public static McObfPair field_149623_c = McMappingDatabase.getSRG("field_149623_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketInput.func_148840_b");

	/**
	 * <p>
	 * Name: getForwardSpeed
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_192620_b = McMappingDatabase.getSRG("CPacketInput.func_192620_b");

	/**
	 * <p>
	 * Name: isJumping
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149618_e = McMappingDatabase.getSRG("CPacketInput.func_149618_e");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketInput.func_148837_a");

}
