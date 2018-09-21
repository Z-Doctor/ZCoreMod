package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketPlayerAbilities {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jn";
		else
			return "net/minecraft/network/play/server/SPacketPlayerAbilities";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jn";
		else
			return "SPacketPlayerAbilities";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljn;";
		else
			return "Lnet/minecraft/network/play/server/SPacketPlayerAbilities;";
	}

	/**
	 * <p>
	 * Name: isAllowFlying
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149105_e = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_149105_e");

	/**
	 * <p>
	 * Name: walkSpeed
	 * </p>
	 */
	public static McObfPair field_149114_f = McMappingDatabase.getSRG("field_149114_f");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_148833_a");

	/**
	 * <p>
	 * Name: setInvulnerable
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_149108_a = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_149108_a");

	/**
	 * <p>
	 * Name: setWalkSpeed
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_149110_b = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_149110_b");

	/**
	 * <p>
	 * Name: allowFlying
	 * </p>
	 */
	public static McObfPair field_149118_c = McMappingDatabase.getSRG("field_149118_c");

	/**
	 * <p>
	 * Name: isInvulnerable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149112_c = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_149112_c");

	/**
	 * <p>
	 * Name: setCreativeMode
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_149111_d = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_149111_d");

	/**
	 * <p>
	 * Name: setFlySpeed
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_149104_a = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_149104_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_148837_a");

	/**
	 * <p>
	 * Name: getWalkSpeed
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149107_h = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_149107_h");

	/**
	 * <p>
	 * Name: invulnerable
	 * </p>
	 */
	public static McObfPair field_149119_a = McMappingDatabase.getSRG("field_149119_a");

	/**
	 * <p>
	 * Name: isCreativeMode
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149103_f = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_149103_f");

	/**
	 * <p>
	 * Name: setFlying
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_149102_b = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_149102_b");

	/**
	 * <p>
	 * Name: flySpeed
	 * </p>
	 */
	public static McObfPair field_149116_e = McMappingDatabase.getSRG("field_149116_e");

	/**
	 * <p>
	 * Name: creativeMode
	 * </p>
	 */
	public static McObfPair field_149115_d = McMappingDatabase.getSRG("field_149115_d");

	/**
	 * <p>
	 * Name: setAllowFlying
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_149109_c = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_149109_c");

	/**
	 * <p>
	 * Name: flying
	 * </p>
	 */
	public static McObfPair field_149117_b = McMappingDatabase.getSRG("field_149117_b");

	/**
	 * <p>
	 * Name: getFlySpeed
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149101_g = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_149101_g");

	/**
	 * <p>
	 * Name: isFlying
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149106_d = McMappingDatabase.getSRG("SPacketPlayerAbilities.func_149106_d");

}
