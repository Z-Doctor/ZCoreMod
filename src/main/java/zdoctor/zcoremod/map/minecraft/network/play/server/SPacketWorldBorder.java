package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketWorldBorder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jz";
		else
			return "net/minecraft/network/play/server/SPacketWorldBorder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jz";
		else
			return "SPacketWorldBorder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljz;";
		else
			return "Lnet/minecraft/network/play/server/SPacketWorldBorder;";
	}

	/**
	 * <p>
	 * Name: centerZ
	 * </p>
	 */
	public static McObfPair field_179791_d = McMappingDatabase.getSRG("field_179791_d");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketWorldBorder.func_148833_a");

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;)V]
	 * </p>
	 */
	public static McObfPair func_179788_a = McMappingDatabase.getSRG("SPacketWorldBorder.func_179788_a");

	/**
	 * <p>
	 * Name: targetSize
	 * </p>
	 */
	public static McObfPair field_179792_e = McMappingDatabase.getSRG("field_179792_e");

	/**
	 * <p>
	 * Name: size
	 * </p>
	 */
	public static McObfPair field_179793_b = McMappingDatabase.getSRG("field_179793_b");

	/**
	 * <p>
	 * Name: diameter
	 * </p>
	 */
	public static McObfPair field_179789_f = McMappingDatabase.getSRG("field_179789_f");

	/**
	 * <p>
	 * Name: centerX
	 * </p>
	 */
	public static McObfPair field_179794_c = McMappingDatabase.getSRG("field_179794_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketWorldBorder.func_148840_b");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_179795_a = McMappingDatabase.getSRG("field_179795_a");

	/**
	 * <p>
	 * Name: warningDistance
	 * </p>
	 */
	public static McObfPair field_179797_i = McMappingDatabase.getSRG("field_179797_i");

	/**
	 * <p>
	 * Name: timeUntilTarget
	 * </p>
	 */
	public static McObfPair field_179790_g = McMappingDatabase.getSRG("field_179790_g");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketWorldBorder.func_148837_a");

	/**
	 * <p>
	 * Name: warningTime
	 * </p>
	 */
	public static McObfPair field_179796_h = McMappingDatabase.getSRG("field_179796_h");

}
