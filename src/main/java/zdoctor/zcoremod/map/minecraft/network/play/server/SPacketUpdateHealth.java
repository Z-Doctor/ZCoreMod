package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketUpdateHealth {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ki";
		else
			return "net/minecraft/network/play/server/SPacketUpdateHealth";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ki";
		else
			return "SPacketUpdateHealth";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lki;";
		else
			return "Lnet/minecraft/network/play/server/SPacketUpdateHealth;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketUpdateHealth.func_148840_b");

	/**
	 * <p>
	 * Name: foodLevel
	 * </p>
	 */
	public static McObfPair field_149334_b = McMappingDatabase.getSRG("field_149334_b");

	/**
	 * <p>
	 * Name: getHealth
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149332_c = McMappingDatabase.getSRG("SPacketUpdateHealth.func_149332_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketUpdateHealth.func_148837_a");

	/**
	 * <p>
	 * Name: health
	 * </p>
	 */
	public static McObfPair field_149336_a = McMappingDatabase.getSRG("field_149336_a");

	/**
	 * <p>
	 * Name: getFoodLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149330_d = McMappingDatabase.getSRG("SPacketUpdateHealth.func_149330_d");

	/**
	 * <p>
	 * Name: saturationLevel
	 * </p>
	 */
	public static McObfPair field_149335_c = McMappingDatabase.getSRG("field_149335_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketUpdateHealth.func_148833_a");

	/**
	 * <p>
	 * Name: getSaturationLevel
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149331_e = McMappingDatabase.getSRG("SPacketUpdateHealth.func_149331_e");

}
