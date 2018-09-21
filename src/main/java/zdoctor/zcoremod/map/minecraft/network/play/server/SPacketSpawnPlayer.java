package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSpawnPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ic";
		else
			return "net/minecraft/network/play/server/SPacketSpawnPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ic";
		else
			return "SPacketSpawnPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lic;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSpawnPlayer;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSpawnPlayer.func_148837_a");

	/**
	 * <p>
	 * Name: watcher
	 * </p>
	 */
	public static McObfPair field_148960_i = McMappingDatabase.getSRG("field_148960_i");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_148954_e = McMappingDatabase.getSRG("field_148954_e");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSpawnPlayer.func_148840_b");

	/**
	 * <p>
	 * Name: getDataManagerEntries
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_148944_c = McMappingDatabase.getSRG("SPacketSpawnPlayer.func_148944_c");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186898_d = McMappingDatabase.getSRG("SPacketSpawnPlayer.func_186898_d");

	/**
	 * <p>
	 * Name: dataManagerEntries
	 * </p>
	 */
	public static McObfPair field_148958_j = McMappingDatabase.getSRG("field_148958_j");

	/**
	 * <p>
	 * Name: yaw
	 * </p>
	 */
	public static McObfPair field_148951_f = McMappingDatabase.getSRG("field_148951_f");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSpawnPlayer.func_148833_a");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_148957_a = McMappingDatabase.getSRG("field_148957_a");

	/**
	 * <p>
	 * Name: getYaw
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_148941_i = McMappingDatabase.getSRG("SPacketSpawnPlayer.func_148941_i");

	/**
	 * <p>
	 * Name: uniqueId
	 * </p>
	 */
	public static McObfPair field_179820_b = McMappingDatabase.getSRG("field_179820_b");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_148956_c = McMappingDatabase.getSRG("field_148956_c");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_148945_j = McMappingDatabase.getSRG("SPacketSpawnPlayer.func_148945_j");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_148952_g = McMappingDatabase.getSRG("field_148952_g");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_148953_d = McMappingDatabase.getSRG("field_148953_d");

	/**
	 * <p>
	 * Name: getUniqueId
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_179819_c = McMappingDatabase.getSRG("SPacketSpawnPlayer.func_179819_c");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186899_f = McMappingDatabase.getSRG("SPacketSpawnPlayer.func_186899_f");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186897_e = McMappingDatabase.getSRG("SPacketSpawnPlayer.func_186897_e");

	/**
	 * <p>
	 * Name: getEntityID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148943_d = McMappingDatabase.getSRG("SPacketSpawnPlayer.func_148943_d");

}
