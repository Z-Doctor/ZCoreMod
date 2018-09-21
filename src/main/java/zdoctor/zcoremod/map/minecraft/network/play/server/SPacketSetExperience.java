package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSetExperience {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kh";
		else
			return "net/minecraft/network/play/server/SPacketSetExperience";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kh";
		else
			return "SPacketSetExperience";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkh;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSetExperience;";
	}

	/**
	 * <p>
	 * Name: totalExperience
	 * </p>
	 */
	public static McObfPair field_149399_b = McMappingDatabase.getSRG("field_149399_b");

	/**
	 * <p>
	 * Name: getExperienceBar
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149397_c = McMappingDatabase.getSRG("SPacketSetExperience.func_149397_c");

	/**
	 * <p>
	 * Name: getLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149395_e = McMappingDatabase.getSRG("SPacketSetExperience.func_149395_e");

	/**
	 * <p>
	 * Name: level
	 * </p>
	 */
	public static McObfPair field_149400_c = McMappingDatabase.getSRG("field_149400_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSetExperience.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSetExperience.func_148840_b");

	/**
	 * <p>
	 * Name: experienceBar
	 * </p>
	 */
	public static McObfPair field_149401_a = McMappingDatabase.getSRG("field_149401_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSetExperience.func_148837_a");

	/**
	 * <p>
	 * Name: getTotalExperience
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149396_d = McMappingDatabase.getSRG("SPacketSetExperience.func_149396_d");

}
