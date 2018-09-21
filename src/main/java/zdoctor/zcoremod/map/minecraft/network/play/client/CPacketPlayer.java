package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lk";
		else
			return "net/minecraft/network/play/client/CPacketPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lk";
		else
			return "CPacketPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llk;";
		else
			return "Lnet/minecraft/network/play/client/CPacketPlayer;";
	}

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [(D)D]
	 * </p>
	 */
	public static McObfPair func_186996_b = McMappingDatabase.getSRG("CPacketPlayer.func_186996_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketPlayer.func_148837_a");

	/**
	 * <p>
	 * Name: isOnGround
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149465_i = McMappingDatabase.getSRG("CPacketPlayer.func_149465_i");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [(D)D]
	 * </p>
	 */
	public static McObfPair func_187000_c = McMappingDatabase.getSRG("CPacketPlayer.func_187000_c");

	/**
	 * <p>
	 * Name: getYaw
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_186999_a = McMappingDatabase.getSRG("CPacketPlayer.func_186999_a");

	/**
	 * <p>
	 * Name: yaw
	 * </p>
	 */
	public static McObfPair field_149476_e = McMappingDatabase.getSRG("field_149476_e");

	/**
	 * <p>
	 * Name: onGround
	 * </p>
	 */
	public static McObfPair field_149474_g = McMappingDatabase.getSRG("field_149474_g");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_149479_a = McMappingDatabase.getSRG("field_149479_a");

	/**
	 * <p>
	 * Name: moving
	 * </p>
	 */
	public static McObfPair field_149480_h = McMappingDatabase.getSRG("field_149480_h");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [(D)D]
	 * </p>
	 */
	public static McObfPair func_186997_a = McMappingDatabase.getSRG("CPacketPlayer.func_186997_a");

	/**
	 * <p>
	 * Name: rotating
	 * </p>
	 */
	public static McObfPair field_149481_i = McMappingDatabase.getSRG("field_149481_i");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_149473_f = McMappingDatabase.getSRG("field_149473_f");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketPlayer.func_148833_a");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_149477_b = McMappingDatabase.getSRG("field_149477_b");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketPlayer.func_148840_b");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_186998_b = McMappingDatabase.getSRG("CPacketPlayer.func_186998_b");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_149478_c = McMappingDatabase.getSRG("field_149478_c");

}
