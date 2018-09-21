package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketUpdateBossInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ik";
		else
			return "net/minecraft/network/play/server/SPacketUpdateBossInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ik";
		else
			return "SPacketUpdateBossInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lik;";
		else
			return "Lnet/minecraft/network/play/server/SPacketUpdateBossInfo;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_148837_a");

	/**
	 * <p>
	 * Name: playEndBossMusic
	 * </p>
	 */
	public static McObfPair field_186918_h = McMappingDatabase.getSRG("field_186918_h");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_148833_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_186913_c = McMappingDatabase.getSRG("field_186913_c");

	/**
	 * <p>
	 * Name: getFlags
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186905_j = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_186905_j");

	/**
	 * <p>
	 * Name: percent
	 * </p>
	 */
	public static McObfPair field_186914_d = McMappingDatabase.getSRG("field_186914_d");

	/**
	 * <p>
	 * Name: shouldCreateFog
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186901_i = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_186901_i");

	/**
	 * <p>
	 * Name: shouldPlayEndBossMusic
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186910_h = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_186910_h");

	/**
	 * <p>
	 * Name: getOperation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateBossInfo$Operation;]
	 * </p>
	 */
	public static McObfPair func_186902_b = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_186902_b");

	/**
	 * <p>
	 * Name: darkenSky
	 * </p>
	 */
	public static McObfPair field_186917_g = McMappingDatabase.getSRG("field_186917_g");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_148840_b");

	/**
	 * <p>
	 * Name: getUniqueId
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_186908_a = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_186908_a");

	/**
	 * <p>
	 * Name: color
	 * </p>
	 */
	public static McObfPair field_186915_e = McMappingDatabase.getSRG("field_186915_e");

	/**
	 * <p>
	 * Name: setFlags
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_186903_a = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_186903_a");

	/**
	 * <p>
	 * Name: getPercent
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_186906_d = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_186906_d");

	/**
	 * <p>
	 * Name: uniqueId
	 * </p>
	 */
	public static McObfPair field_186911_a = McMappingDatabase.getSRG("field_186911_a");

	/**
	 * <p>
	 * Name: overlay
	 * </p>
	 */
	public static McObfPair field_186916_f = McMappingDatabase.getSRG("field_186916_f");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/BossInfo$Color;]
	 * </p>
	 */
	public static McObfPair func_186900_e = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_186900_e");

	/**
	 * <p>
	 * Name: operation
	 * </p>
	 */
	public static McObfPair field_186912_b = McMappingDatabase.getSRG("field_186912_b");

	/**
	 * <p>
	 * Name: createFog
	 * </p>
	 */
	public static McObfPair field_186919_i = McMappingDatabase.getSRG("field_186919_i");

	/**
	 * <p>
	 * Name: shouldDarkenSky
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186909_g = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_186909_g");

	/**
	 * <p>
	 * Name: getOverlay
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/BossInfo$Overlay;]
	 * </p>
	 */
	public static McObfPair func_186904_f = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_186904_f");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_186907_c = McMappingDatabase.getSRG("SPacketUpdateBossInfo.func_186907_c");

}
