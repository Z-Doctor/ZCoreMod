package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketParticles {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jg";
		else
			return "net/minecraft/network/play/server/SPacketParticles";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jg";
		else
			return "SPacketParticles";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljg;";
		else
			return "Lnet/minecraft/network/play/server/SPacketParticles;";
	}

	/**
	 * <p>
	 * Name: getXOffset
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149221_g = McMappingDatabase.getSRG("SPacketParticles.func_149221_g");

	/**
	 * <p>
	 * Name: getParticleCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149222_k = McMappingDatabase.getSRG("SPacketParticles.func_149222_k");

	/**
	 * <p>
	 * Name: xCoord
	 * </p>
	 */
	public static McObfPair field_149234_b = McMappingDatabase.getSRG("field_149234_b");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketParticles.func_148840_b");

	/**
	 * <p>
	 * Name: yOffset
	 * </p>
	 */
	public static McObfPair field_149230_f = McMappingDatabase.getSRG("field_149230_f");

	/**
	 * <p>
	 * Name: longDistance
	 * </p>
	 */
	public static McObfPair field_179752_j = McMappingDatabase.getSRG("field_179752_j");

	/**
	 * <p>
	 * Name: zCoord
	 * </p>
	 */
	public static McObfPair field_149232_d = McMappingDatabase.getSRG("field_149232_d");

	/**
	 * <p>
	 * Name: getParticleSpeed
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149227_j = McMappingDatabase.getSRG("SPacketParticles.func_149227_j");

	/**
	 * <p>
	 * Name: particleArguments
	 * </p>
	 */
	public static McObfPair field_179753_k = McMappingDatabase.getSRG("field_179753_k");

	/**
	 * <p>
	 * Name: particleSpeed
	 * </p>
	 */
	public static McObfPair field_149237_h = McMappingDatabase.getSRG("field_149237_h");

	/**
	 * <p>
	 * Name: particleType
	 * </p>
	 */
	public static McObfPair field_179751_a = McMappingDatabase.getSRG("field_179751_a");

	/**
	 * <p>
	 * Name: particleCount
	 * </p>
	 */
	public static McObfPair field_149238_i = McMappingDatabase.getSRG("field_149238_i");

	/**
	 * <p>
	 * Name: xOffset
	 * </p>
	 */
	public static McObfPair field_149233_e = McMappingDatabase.getSRG("field_149233_e");

	/**
	 * <p>
	 * Name: getParticleArgs
	 * </p>
	 * <p>
	 * Desc: [()[I]
	 * </p>
	 */
	public static McObfPair func_179748_k = McMappingDatabase.getSRG("SPacketParticles.func_179748_k");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketParticles.func_148837_a");

	/**
	 * <p>
	 * Name: zOffset
	 * </p>
	 */
	public static McObfPair field_149231_g = McMappingDatabase.getSRG("field_149231_g");

	/**
	 * <p>
	 * Name: yCoord
	 * </p>
	 */
	public static McObfPair field_149235_c = McMappingDatabase.getSRG("field_149235_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketParticles.func_148833_a");

	/**
	 * <p>
	 * Name: getParticleType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumParticleTypes;]
	 * </p>
	 */
	public static McObfPair func_179749_a = McMappingDatabase.getSRG("SPacketParticles.func_179749_a");

	/**
	 * <p>
	 * Name: getYOffset
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149224_h = McMappingDatabase.getSRG("SPacketParticles.func_149224_h");

	/**
	 * <p>
	 * Name: getYCoordinate
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_149226_e = McMappingDatabase.getSRG("SPacketParticles.func_149226_e");

	/**
	 * <p>
	 * Name: isLongDistance
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179750_b = McMappingDatabase.getSRG("SPacketParticles.func_179750_b");

	/**
	 * <p>
	 * Name: getZCoordinate
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_149225_f = McMappingDatabase.getSRG("SPacketParticles.func_149225_f");

	/**
	 * <p>
	 * Name: getXCoordinate
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_149220_d = McMappingDatabase.getSRG("SPacketParticles.func_149220_d");

	/**
	 * <p>
	 * Name: getZOffset
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149223_i = McMappingDatabase.getSRG("SPacketParticles.func_149223_i");

}
