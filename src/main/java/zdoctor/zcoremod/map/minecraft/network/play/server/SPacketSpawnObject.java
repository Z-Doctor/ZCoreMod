package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSpawnObject {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hx";
		else
			return "net/minecraft/network/play/server/SPacketSpawnObject";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hx";
		else
			return "SPacketSpawnObject";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhx;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSpawnObject;";
	}

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_149014_d = McMappingDatabase.getSRG("field_149014_d");

	/**
	 * <p>
	 * Name: speedY
	 * </p>
	 */
	public static McObfPair field_149012_f = McMappingDatabase.getSRG("field_149012_f");

	/**
	 * <p>
	 * Name: getSpeedY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149004_h = McMappingDatabase.getSRG("SPacketSpawnObject.func_149004_h");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_149016_b = McMappingDatabase.getSRG("field_149016_b");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149018_a = McMappingDatabase.getSRG("field_149018_a");

	/**
	 * <p>
	 * Name: setSpeedX
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_149003_d = McMappingDatabase.getSRG("SPacketSpawnObject.func_149003_d");

	/**
	 * <p>
	 * Name: getEntityID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149001_c = McMappingDatabase.getSRG("SPacketSpawnObject.func_149001_c");

	/**
	 * <p>
	 * Name: getData
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149009_m = McMappingDatabase.getSRG("SPacketSpawnObject.func_149009_m");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSpawnObject.func_148840_b");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_149017_c = McMappingDatabase.getSRG("field_149017_c");

	/**
	 * <p>
	 * Name: yaw
	 * </p>
	 */
	public static McObfPair field_149022_i = McMappingDatabase.getSRG("field_149022_i");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_149019_j = McMappingDatabase.getSRG("field_149019_j");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186881_e = McMappingDatabase.getSRG("SPacketSpawnObject.func_186881_e");

	/**
	 * <p>
	 * Name: setSpeedZ
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_149007_f = McMappingDatabase.getSRG("SPacketSpawnObject.func_149007_f");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSpawnObject.func_148837_a");

	/**
	 * <p>
	 * Name: getSpeedX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149010_g = McMappingDatabase.getSRG("SPacketSpawnObject.func_149010_g");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148993_l = McMappingDatabase.getSRG("SPacketSpawnObject.func_148993_l");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_149021_h = McMappingDatabase.getSRG("field_149021_h");

	/**
	 * <p>
	 * Name: uniqueId
	 * </p>
	 */
	public static McObfPair field_186883_b = McMappingDatabase.getSRG("field_186883_b");

	/**
	 * <p>
	 * Name: setSpeedY
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_149000_e = McMappingDatabase.getSRG("SPacketSpawnObject.func_149000_e");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_149020_k = McMappingDatabase.getSRG("field_149020_k");

	/**
	 * <p>
	 * Name: getUniqueId
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_186879_b = McMappingDatabase.getSRG("SPacketSpawnObject.func_186879_b");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186880_c = McMappingDatabase.getSRG("SPacketSpawnObject.func_186880_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSpawnObject.func_148833_a");

	/**
	 * <p>
	 * Name: setData
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_149002_g = McMappingDatabase.getSRG("SPacketSpawnObject.func_149002_g");

	/**
	 * <p>
	 * Name: speedZ
	 * </p>
	 */
	public static McObfPair field_149013_g = McMappingDatabase.getSRG("field_149013_g");

	/**
	 * <p>
	 * Name: speedX
	 * </p>
	 */
	public static McObfPair field_149015_e = McMappingDatabase.getSRG("field_149015_e");

	/**
	 * <p>
	 * Name: getYaw
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149006_k = McMappingDatabase.getSRG("SPacketSpawnObject.func_149006_k");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186882_d = McMappingDatabase.getSRG("SPacketSpawnObject.func_186882_d");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149008_j = McMappingDatabase.getSRG("SPacketSpawnObject.func_149008_j");

	/**
	 * <p>
	 * Name: getSpeedZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148999_i = McMappingDatabase.getSRG("SPacketSpawnObject.func_148999_i");

}
