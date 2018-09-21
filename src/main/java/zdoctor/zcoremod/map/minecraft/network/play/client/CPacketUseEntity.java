package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketUseEntity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "li";
		else
			return "net/minecraft/network/play/client/CPacketUseEntity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "li";
		else
			return "CPacketUseEntity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lli;";
		else
			return "Lnet/minecraft/network/play/client/CPacketUseEntity;";
	}

	/**
	 * <p>
	 * Name: hand
	 * </p>
	 */
	public static McObfPair field_186995_d = McMappingDatabase.getSRG("field_186995_d");

	/**
	 * <p>
	 * Name: getEntityFromWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_149564_a = McMappingDatabase.getSRG("CPacketUseEntity.func_149564_a");

	/**
	 * <p>
	 * Name: getHand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumHand;]
	 * </p>
	 */
	public static McObfPair func_186994_b = McMappingDatabase.getSRG("CPacketUseEntity.func_186994_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketUseEntity.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketUseEntity.func_148833_a");

	/**
	 * <p>
	 * Name: getHitVec
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_179712_b = McMappingDatabase.getSRG("CPacketUseEntity.func_179712_b");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149567_a = McMappingDatabase.getSRG("field_149567_a");

	/**
	 * <p>
	 * Name: getAction
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/client/CPacketUseEntity$Action;]
	 * </p>
	 */
	public static McObfPair func_149565_c = McMappingDatabase.getSRG("CPacketUseEntity.func_149565_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketUseEntity.func_148840_b");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_149566_b = McMappingDatabase.getSRG("field_149566_b");

	/**
	 * <p>
	 * Name: hitVec
	 * </p>
	 */
	public static McObfPair field_179713_c = McMappingDatabase.getSRG("field_179713_c");

}
