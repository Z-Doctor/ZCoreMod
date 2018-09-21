package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSpawnPainting {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ib";
		else
			return "net/minecraft/network/play/server/SPacketSpawnPainting";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ib";
		else
			return "SPacketSpawnPainting";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lib;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSpawnPainting;";
	}

	/**
	 * <p>
	 * Name: facing
	 * </p>
	 */
	public static McObfPair field_179839_c = McMappingDatabase.getSRG("field_179839_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSpawnPainting.func_148833_a");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_148968_f = McMappingDatabase.getSRG("field_148968_f");

	/**
	 * <p>
	 * Name: entityID
	 * </p>
	 */
	public static McObfPair field_148973_a = McMappingDatabase.getSRG("field_148973_a");

	/**
	 * <p>
	 * Name: getTitle
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148961_h = McMappingDatabase.getSRG("SPacketSpawnPainting.func_148961_h");

	/**
	 * <p>
	 * Name: getUniqueId
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_186895_b = McMappingDatabase.getSRG("SPacketSpawnPainting.func_186895_b");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_179838_b = McMappingDatabase.getSRG("field_179838_b");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_179836_c = McMappingDatabase.getSRG("SPacketSpawnPainting.func_179836_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSpawnPainting.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSpawnPainting.func_148837_a");

	/**
	 * <p>
	 * Name: uniqueId
	 * </p>
	 */
	public static McObfPair field_186896_b = McMappingDatabase.getSRG("field_186896_b");

	/**
	 * <p>
	 * Name: getEntityID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148965_c = McMappingDatabase.getSRG("SPacketSpawnPainting.func_148965_c");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179837_b = McMappingDatabase.getSRG("SPacketSpawnPainting.func_179837_b");

}
