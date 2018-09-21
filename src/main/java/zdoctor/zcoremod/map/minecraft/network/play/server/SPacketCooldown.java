package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketCooldown {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "iv";
		else
			return "net/minecraft/network/play/server/SPacketCooldown";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "iv";
		else
			return "SPacketCooldown";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Liv;";
		else
			return "Lnet/minecraft/network/play/server/SPacketCooldown;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketCooldown.func_148837_a");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_186920_a = McMappingDatabase.getSRG("SPacketCooldown.func_186920_a");

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_186923_a = McMappingDatabase.getSRG("field_186923_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketCooldown.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketCooldown.func_148840_b");

	/**
	 * <p>
	 * Name: getTicks
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186922_b = McMappingDatabase.getSRG("SPacketCooldown.func_186922_b");

	/**
	 * <p>
	 * Name: ticks
	 * </p>
	 */
	public static McObfPair field_186924_b = McMappingDatabase.getSRG("field_186924_b");

}
