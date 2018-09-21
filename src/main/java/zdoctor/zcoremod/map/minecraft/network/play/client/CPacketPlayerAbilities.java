package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketPlayerAbilities {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lo";
		else
			return "net/minecraft/network/play/client/CPacketPlayerAbilities";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lo";
		else
			return "CPacketPlayerAbilities";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llo;";
		else
			return "Lnet/minecraft/network/play/client/CPacketPlayerAbilities;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_148833_a");

	/**
	 * <p>
	 * Name: isCreativeMode
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149484_f = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_149484_f");

	/**
	 * <p>
	 * Name: setFlySpeed
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_149485_a = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_149485_a");

	/**
	 * <p>
	 * Name: flying
	 * </p>
	 */
	public static McObfPair field_149498_b = McMappingDatabase.getSRG("field_149498_b");

	/**
	 * <p>
	 * Name: flySpeed
	 * </p>
	 */
	public static McObfPair field_149497_e = McMappingDatabase.getSRG("field_149497_e");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_148837_a");

	/**
	 * <p>
	 * Name: isAllowFlying
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149486_e = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_149486_e");

	/**
	 * <p>
	 * Name: creativeMode
	 * </p>
	 */
	public static McObfPair field_149496_d = McMappingDatabase.getSRG("field_149496_d");

	/**
	 * <p>
	 * Name: setAllowFlying
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_149491_c = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_149491_c");

	/**
	 * <p>
	 * Name: setInvulnerable
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_149490_a = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_149490_a");

	/**
	 * <p>
	 * Name: isInvulnerable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149494_c = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_149494_c");

	/**
	 * <p>
	 * Name: setCreativeMode
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_149493_d = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_149493_d");

	/**
	 * <p>
	 * Name: setFlying
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_149483_b = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_149483_b");

	/**
	 * <p>
	 * Name: setWalkSpeed
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_149492_b = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_149492_b");

	/**
	 * <p>
	 * Name: walkSpeed
	 * </p>
	 */
	public static McObfPair field_149495_f = McMappingDatabase.getSRG("field_149495_f");

	/**
	 * <p>
	 * Name: allowFlying
	 * </p>
	 */
	public static McObfPair field_149499_c = McMappingDatabase.getSRG("field_149499_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_148840_b");

	/**
	 * <p>
	 * Name: isFlying
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149488_d = McMappingDatabase.getSRG("CPacketPlayerAbilities.func_149488_d");

	/**
	 * <p>
	 * Name: invulnerable
	 * </p>
	 */
	public static McObfPair field_149500_a = McMappingDatabase.getSRG("field_149500_a");

}
