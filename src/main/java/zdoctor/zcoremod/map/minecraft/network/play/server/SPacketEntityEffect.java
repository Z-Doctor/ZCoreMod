package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntityEffect {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kw";
		else
			return "net/minecraft/network/play/server/SPacketEntityEffect";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kw";
		else
			return "SPacketEntityEffect";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkw;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntityEffect;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEntityEffect.func_148837_a");

	/**
	 * <p>
	 * Name: effectId
	 * </p>
	 */
	public static McObfPair field_149432_b = McMappingDatabase.getSRG("field_149432_b");

	/**
	 * <p>
	 * Name: getEffectId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_149427_e = McMappingDatabase.getSRG("SPacketEntityEffect.func_149427_e");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEntityEffect.func_148840_b");

	/**
	 * <p>
	 * Name: getIsAmbient
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186984_g = McMappingDatabase.getSRG("SPacketEntityEffect.func_186984_g");

	/**
	 * <p>
	 * Name: flags
	 * </p>
	 */
	public static McObfPair field_186985_e = McMappingDatabase.getSRG("field_186985_e");

	/**
	 * <p>
	 * Name: getAmplifier
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_149428_f = McMappingDatabase.getSRG("SPacketEntityEffect.func_149428_f");

	/**
	 * <p>
	 * Name: duration
	 * </p>
	 */
	public static McObfPair field_149431_d = McMappingDatabase.getSRG("field_149431_d");

	/**
	 * <p>
	 * Name: amplifier
	 * </p>
	 */
	public static McObfPair field_149433_c = McMappingDatabase.getSRG("field_149433_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEntityEffect.func_148833_a");

	/**
	 * <p>
	 * Name: isMaxDuration
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149429_c = McMappingDatabase.getSRG("SPacketEntityEffect.func_149429_c");

	/**
	 * <p>
	 * Name: doesShowParticles
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179707_f = McMappingDatabase.getSRG("SPacketEntityEffect.func_179707_f");

	/**
	 * <p>
	 * Name: getEntityId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149426_d = McMappingDatabase.getSRG("SPacketEntityEffect.func_149426_d");

	/**
	 * <p>
	 * Name: getDuration
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_180755_e = McMappingDatabase.getSRG("SPacketEntityEffect.func_180755_e");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149434_a = McMappingDatabase.getSRG("field_149434_a");

}
