package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketBlockAction {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ii";
		else
			return "net/minecraft/network/play/server/SPacketBlockAction";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ii";
		else
			return "SPacketBlockAction";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lii;";
		else
			return "Lnet/minecraft/network/play/server/SPacketBlockAction;";
	}

	/**
	 * <p>
	 * Name: getBlockType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_148868_c = McMappingDatabase.getSRG("SPacketBlockAction.func_148868_c");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_148873_e = McMappingDatabase.getSRG("field_148873_e");

	/**
	 * <p>
	 * Name: getBlockPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179825_a = McMappingDatabase.getSRG("SPacketBlockAction.func_179825_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketBlockAction.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketBlockAction.func_148840_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketBlockAction.func_148833_a");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_148871_f = McMappingDatabase.getSRG("field_148871_f");

	/**
	 * <p>
	 * Name: blockPosition
	 * </p>
	 */
	public static McObfPair field_179826_a = McMappingDatabase.getSRG("field_179826_a");

	/**
	 * <p>
	 * Name: getData2
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148864_h = McMappingDatabase.getSRG("SPacketBlockAction.func_148864_h");

	/**
	 * <p>
	 * Name: getData1
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148869_g = McMappingDatabase.getSRG("SPacketBlockAction.func_148869_g");

	/**
	 * <p>
	 * Name: instrument
	 * </p>
	 */
	public static McObfPair field_148872_d = McMappingDatabase.getSRG("field_148872_d");

}
