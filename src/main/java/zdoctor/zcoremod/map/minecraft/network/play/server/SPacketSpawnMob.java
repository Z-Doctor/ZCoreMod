package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSpawnMob {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ia";
		else
			return "net/minecraft/network/play/server/SPacketSpawnMob";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ia";
		else
			return "SPacketSpawnMob";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lia;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSpawnMob;";
	}

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_149038_d = McMappingDatabase.getSRG("field_149038_d");

	/**
	 * <p>
	 * Name: getVelocityZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149031_k = McMappingDatabase.getSRG("SPacketSpawnMob.func_149031_k");

	/**
	 * <p>
	 * Name: getHeadPitch
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_149032_n = McMappingDatabase.getSRG("SPacketSpawnMob.func_149032_n");

	/**
	 * <p>
	 * Name: dataManagerEntries
	 * </p>
	 */
	public static McObfPair field_149044_m = McMappingDatabase.getSRG("field_149044_m");

	/**
	 * <p>
	 * Name: getEntityID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149024_d = McMappingDatabase.getSRG("SPacketSpawnMob.func_149024_d");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSpawnMob.func_148840_b");

	/**
	 * <p>
	 * Name: getYaw
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_149028_l = McMappingDatabase.getSRG("SPacketSpawnMob.func_149028_l");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_149045_j = McMappingDatabase.getSRG("field_149045_j");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_149040_b = McMappingDatabase.getSRG("field_149040_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSpawnMob.func_148833_a");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186892_f = McMappingDatabase.getSRG("SPacketSpawnMob.func_186892_f");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186891_e = McMappingDatabase.getSRG("SPacketSpawnMob.func_186891_e");

	/**
	 * <p>
	 * Name: getDataManagerEntries
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_149027_c = McMappingDatabase.getSRG("SPacketSpawnMob.func_149027_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSpawnMob.func_148837_a");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_149039_e = McMappingDatabase.getSRG("field_149039_e");

	/**
	 * <p>
	 * Name: velocityX
	 * </p>
	 */
	public static McObfPair field_149036_f = McMappingDatabase.getSRG("field_149036_f");

	/**
	 * <p>
	 * Name: headPitch
	 * </p>
	 */
	public static McObfPair field_149046_k = McMappingDatabase.getSRG("field_149046_k");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_149030_m = McMappingDatabase.getSRG("SPacketSpawnMob.func_149030_m");

	/**
	 * <p>
	 * Name: velocityZ
	 * </p>
	 */
	public static McObfPair field_149047_h = McMappingDatabase.getSRG("field_149047_h");

	/**
	 * <p>
	 * Name: dataManager
	 * </p>
	 */
	public static McObfPair field_149043_l = McMappingDatabase.getSRG("field_149043_l");

	/**
	 * <p>
	 * Name: getVelocityX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149026_i = McMappingDatabase.getSRG("SPacketSpawnMob.func_149026_i");

	/**
	 * <p>
	 * Name: getUniqueId
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_186890_c = McMappingDatabase.getSRG("SPacketSpawnMob.func_186890_c");

	/**
	 * <p>
	 * Name: getEntityType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149025_e = McMappingDatabase.getSRG("SPacketSpawnMob.func_149025_e");

	/**
	 * <p>
	 * Name: velocityY
	 * </p>
	 */
	public static McObfPair field_149037_g = McMappingDatabase.getSRG("field_149037_g");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_149041_c = McMappingDatabase.getSRG("field_149041_c");

	/**
	 * <p>
	 * Name: getVelocityY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149033_j = McMappingDatabase.getSRG("SPacketSpawnMob.func_149033_j");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149042_a = McMappingDatabase.getSRG("field_149042_a");

	/**
	 * <p>
	 * Name: uniqueId
	 * </p>
	 */
	public static McObfPair field_186894_b = McMappingDatabase.getSRG("field_186894_b");

	/**
	 * <p>
	 * Name: yaw
	 * </p>
	 */
	public static McObfPair field_149048_i = McMappingDatabase.getSRG("field_149048_i");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186893_g = McMappingDatabase.getSRG("SPacketSpawnMob.func_186893_g");

}
