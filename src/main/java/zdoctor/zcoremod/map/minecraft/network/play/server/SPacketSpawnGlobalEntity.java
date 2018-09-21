package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSpawnGlobalEntity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hz";
		else
			return "net/minecraft/network/play/server/SPacketSpawnGlobalEntity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hz";
		else
			return "SPacketSpawnGlobalEntity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhz;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSpawnGlobalEntity;";
	}

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186887_d = McMappingDatabase.getSRG("SPacketSpawnGlobalEntity.func_186887_d");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_149057_b = McMappingDatabase.getSRG("field_149057_b");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSpawnGlobalEntity.func_148840_b");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186889_c = McMappingDatabase.getSRG("SPacketSpawnGlobalEntity.func_186889_c");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_149058_c = McMappingDatabase.getSRG("field_149058_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSpawnGlobalEntity.func_148833_a");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149059_a = McMappingDatabase.getSRG("field_149059_a");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_149056_e = McMappingDatabase.getSRG("field_149056_e");

	/**
	 * <p>
	 * Name: getEntityId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149052_c = McMappingDatabase.getSRG("SPacketSpawnGlobalEntity.func_149052_c");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_149055_d = McMappingDatabase.getSRG("field_149055_d");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186888_b = McMappingDatabase.getSRG("SPacketSpawnGlobalEntity.func_186888_b");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149053_g = McMappingDatabase.getSRG("SPacketSpawnGlobalEntity.func_149053_g");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSpawnGlobalEntity.func_148837_a");

}
