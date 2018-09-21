package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketExplosion {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ja";
		else
			return "net/minecraft/network/play/server/SPacketExplosion";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ja";
		else
			return "SPacketExplosion";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lja;";
		else
			return "Lnet/minecraft/network/play/server/SPacketExplosion;";
	}

	/**
	 * <p>
	 * Name: motionZ
	 * </p>
	 */
	public static McObfPair field_149159_h = McMappingDatabase.getSRG("field_149159_h");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_149143_g = McMappingDatabase.getSRG("SPacketExplosion.func_149143_g");

	/**
	 * <p>
	 * Name: getMotionY
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149144_d = McMappingDatabase.getSRG("SPacketExplosion.func_149144_d");

	/**
	 * <p>
	 * Name: getAffectedBlockPositions
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_149150_j = McMappingDatabase.getSRG("SPacketExplosion.func_149150_j");

	/**
	 * <p>
	 * Name: affectedBlockPositions
	 * </p>
	 */
	public static McObfPair field_149155_e = McMappingDatabase.getSRG("field_149155_e");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_149145_h = McMappingDatabase.getSRG("SPacketExplosion.func_149145_h");

	/**
	 * <p>
	 * Name: strength
	 * </p>
	 */
	public static McObfPair field_149154_d = McMappingDatabase.getSRG("field_149154_d");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketExplosion.func_148840_b");

	/**
	 * <p>
	 * Name: getMotionZ
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149147_e = McMappingDatabase.getSRG("SPacketExplosion.func_149147_e");

	/**
	 * <p>
	 * Name: getStrength
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149146_i = McMappingDatabase.getSRG("SPacketExplosion.func_149146_i");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketExplosion.func_148833_a");

	/**
	 * <p>
	 * Name: posX
	 * </p>
	 */
	public static McObfPair field_149158_a = McMappingDatabase.getSRG("field_149158_a");

	/**
	 * <p>
	 * Name: motionY
	 * </p>
	 */
	public static McObfPair field_149153_g = McMappingDatabase.getSRG("field_149153_g");

	/**
	 * <p>
	 * Name: posZ
	 * </p>
	 */
	public static McObfPair field_149157_c = McMappingDatabase.getSRG("field_149157_c");

	/**
	 * <p>
	 * Name: getMotionX
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149149_c = McMappingDatabase.getSRG("SPacketExplosion.func_149149_c");

	/**
	 * <p>
	 * Name: motionX
	 * </p>
	 */
	public static McObfPair field_149152_f = McMappingDatabase.getSRG("field_149152_f");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_149148_f = McMappingDatabase.getSRG("SPacketExplosion.func_149148_f");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketExplosion.func_148837_a");

	/**
	 * <p>
	 * Name: posY
	 * </p>
	 */
	public static McObfPair field_149156_b = McMappingDatabase.getSRG("field_149156_b");

}
