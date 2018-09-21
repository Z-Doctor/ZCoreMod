package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketDisplayObjective {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kc";
		else
			return "net/minecraft/network/play/server/SPacketDisplayObjective";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kc";
		else
			return "SPacketDisplayObjective";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkc;";
		else
			return "Lnet/minecraft/network/play/server/SPacketDisplayObjective;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketDisplayObjective.func_148840_b");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149371_c = McMappingDatabase.getSRG("SPacketDisplayObjective.func_149371_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketDisplayObjective.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketDisplayObjective.func_148837_a");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_149374_a = McMappingDatabase.getSRG("field_149374_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149370_d = McMappingDatabase.getSRG("SPacketDisplayObjective.func_149370_d");

	/**
	 * <p>
	 * Name: scoreName
	 * </p>
	 */
	public static McObfPair field_149373_b = McMappingDatabase.getSRG("field_149373_b");

}
