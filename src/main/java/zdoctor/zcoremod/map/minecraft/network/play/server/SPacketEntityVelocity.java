package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntityVelocity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kf";
		else
			return "net/minecraft/network/play/server/SPacketEntityVelocity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kf";
		else
			return "SPacketEntityVelocity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkf;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntityVelocity;";
	}

	/**
	 * <p>
	 * Name: motionY
	 * </p>
	 */
	public static McObfPair field_149416_c = McMappingDatabase.getSRG("field_149416_c");

	/**
	 * <p>
	 * Name: getEntityID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149412_c = McMappingDatabase.getSRG("SPacketEntityVelocity.func_149412_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEntityVelocity.func_148837_a");

	/**
	 * <p>
	 * Name: motionX
	 * </p>
	 */
	public static McObfPair field_149415_b = McMappingDatabase.getSRG("field_149415_b");

	/**
	 * <p>
	 * Name: getMotionZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149409_f = McMappingDatabase.getSRG("SPacketEntityVelocity.func_149409_f");

	/**
	 * <p>
	 * Name: getMotionX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149411_d = McMappingDatabase.getSRG("SPacketEntityVelocity.func_149411_d");

	/**
	 * <p>
	 * Name: getMotionY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149410_e = McMappingDatabase.getSRG("SPacketEntityVelocity.func_149410_e");

	/**
	 * <p>
	 * Name: motionZ
	 * </p>
	 */
	public static McObfPair field_149414_d = McMappingDatabase.getSRG("field_149414_d");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEntityVelocity.func_148840_b");

	/**
	 * <p>
	 * Name: entityID
	 * </p>
	 */
	public static McObfPair field_149417_a = McMappingDatabase.getSRG("field_149417_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEntityVelocity.func_148833_a");

}
