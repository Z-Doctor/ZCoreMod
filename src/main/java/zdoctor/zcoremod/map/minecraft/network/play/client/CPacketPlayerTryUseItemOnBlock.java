package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketPlayerTryUseItemOnBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ma";
		else
			return "net/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ma";
		else
			return "CPacketPlayerTryUseItemOnBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lma;";
		else
			return "Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketPlayerTryUseItemOnBlock.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketPlayerTryUseItemOnBlock.func_148833_a");

	/**
	 * <p>
	 * Name: getFacingY
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_187025_e = McMappingDatabase.getSRG("CPacketPlayerTryUseItemOnBlock.func_187025_e");

	/**
	 * <p>
	 * Name: getPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_187023_a = McMappingDatabase.getSRG("CPacketPlayerTryUseItemOnBlock.func_187023_a");

	/**
	 * <p>
	 * Name: placedBlockDirection
	 * </p>
	 */
	public static McObfPair field_149579_d = McMappingDatabase.getSRG("field_149579_d");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketPlayerTryUseItemOnBlock.func_148840_b");

	/**
	 * <p>
	 * Name: facingZ
	 * </p>
	 */
	public static McObfPair field_149584_h = McMappingDatabase.getSRG("field_149584_h");

	/**
	 * <p>
	 * Name: facingY
	 * </p>
	 */
	public static McObfPair field_149578_g = McMappingDatabase.getSRG("field_149578_g");

	/**
	 * <p>
	 * Name: getHand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumHand;]
	 * </p>
	 */
	public static McObfPair func_187022_c = McMappingDatabase.getSRG("CPacketPlayerTryUseItemOnBlock.func_187022_c");

	/**
	 * <p>
	 * Name: getDirection
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_187024_b = McMappingDatabase.getSRG("CPacketPlayerTryUseItemOnBlock.func_187024_b");

	/**
	 * <p>
	 * Name: getFacingX
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_187026_d = McMappingDatabase.getSRG("CPacketPlayerTryUseItemOnBlock.func_187026_d");

	/**
	 * <p>
	 * Name: hand
	 * </p>
	 */
	public static McObfPair field_187027_c = McMappingDatabase.getSRG("field_187027_c");

	/**
	 * <p>
	 * Name: facingX
	 * </p>
	 */
	public static McObfPair field_149577_f = McMappingDatabase.getSRG("field_149577_f");

	/**
	 * <p>
	 * Name: getFacingZ
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_187020_f = McMappingDatabase.getSRG("CPacketPlayerTryUseItemOnBlock.func_187020_f");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_179725_b = McMappingDatabase.getSRG("field_179725_b");

}
