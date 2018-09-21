package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketCombatEvent {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jo";
		else
			return "net/minecraft/network/play/server/SPacketCombatEvent";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jo";
		else
			return "SPacketCombatEvent";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljo;";
		else
			return "Lnet/minecraft/network/play/server/SPacketCombatEvent;";
	}

	/**
	 * <p>
	 * Name: duration
	 * </p>
	 */
	public static McObfPair field_179772_d = McMappingDatabase.getSRG("field_179772_d");

	/**
	 * <p>
	 * Name: playerId
	 * </p>
	 */
	public static McObfPair field_179774_b = McMappingDatabase.getSRG("field_179774_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketCombatEvent.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketCombatEvent.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketCombatEvent.func_148840_b");

	/**
	 * <p>
	 * Name: deathMessage
	 * </p>
	 */
	public static McObfPair field_179773_e = McMappingDatabase.getSRG("field_179773_e");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_179775_c = McMappingDatabase.getSRG("field_179775_c");

	/**
	 * <p>
	 * Name: eventType
	 * </p>
	 */
	public static McObfPair field_179776_a = McMappingDatabase.getSRG("field_179776_a");

}
