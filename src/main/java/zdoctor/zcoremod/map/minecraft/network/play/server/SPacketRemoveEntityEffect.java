package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketRemoveEntityEffect {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ju";
		else
			return "net/minecraft/network/play/server/SPacketRemoveEntityEffect";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ju";
		else
			return "SPacketRemoveEntityEffect";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lju;";
		else
			return "Lnet/minecraft/network/play/server/SPacketRemoveEntityEffect;";
	}

	/**
	 * <p>
	 * Name: getEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_186967_a = McMappingDatabase.getSRG("SPacketRemoveEntityEffect.func_186967_a");

	/**
	 * <p>
	 * Name: effectId
	 * </p>
	 */
	public static McObfPair field_149078_b = McMappingDatabase.getSRG("field_149078_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketRemoveEntityEffect.func_148837_a");

	/**
	 * <p>
	 * Name: getPotion
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/potion/Potion;]
	 * </p>
	 */
	public static McObfPair func_186968_a = McMappingDatabase.getSRG("SPacketRemoveEntityEffect.func_186968_a");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149079_a = McMappingDatabase.getSRG("field_149079_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketRemoveEntityEffect.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketRemoveEntityEffect.func_148840_b");

}
