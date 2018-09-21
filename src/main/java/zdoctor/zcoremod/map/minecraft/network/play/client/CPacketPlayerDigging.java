package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketPlayerDigging {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lp";
		else
			return "net/minecraft/network/play/client/CPacketPlayerDigging";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lp";
		else
			return "CPacketPlayerDigging";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llp;";
		else
			return "Lnet/minecraft/network/play/client/CPacketPlayerDigging;";
	}

	/**
	 * <p>
	 * Name: getAction
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;]
	 * </p>
	 */
	public static McObfPair func_180762_c = McMappingDatabase.getSRG("CPacketPlayerDigging.func_180762_c");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_179714_b = McMappingDatabase.getSRG("CPacketPlayerDigging.func_179714_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketPlayerDigging.func_148837_a");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_179717_a = McMappingDatabase.getSRG("field_179717_a");

	/**
	 * <p>
	 * Name: facing
	 * </p>
	 */
	public static McObfPair field_179716_b = McMappingDatabase.getSRG("field_179716_b");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179715_a = McMappingDatabase.getSRG("CPacketPlayerDigging.func_179715_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketPlayerDigging.func_148840_b");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_149508_e = McMappingDatabase.getSRG("field_149508_e");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketPlayerDigging.func_148833_a");

}
