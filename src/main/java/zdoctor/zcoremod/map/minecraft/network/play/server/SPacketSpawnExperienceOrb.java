package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSpawnExperienceOrb {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hy";
		else
			return "net/minecraft/network/play/server/SPacketSpawnExperienceOrb";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hy";
		else
			return "SPacketSpawnExperienceOrb";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhy;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSpawnExperienceOrb;";
	}

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186885_b = McMappingDatabase.getSRG("SPacketSpawnExperienceOrb.func_186885_b");

	/**
	 * <p>
	 * Name: xpValue
	 * </p>
	 */
	public static McObfPair field_148989_e = McMappingDatabase.getSRG("field_148989_e");

	/**
	 * <p>
	 * Name: entityID
	 * </p>
	 */
	public static McObfPair field_148992_a = McMappingDatabase.getSRG("field_148992_a");

	/**
	 * <p>
	 * Name: posX
	 * </p>
	 */
	public static McObfPair field_148990_b = McMappingDatabase.getSRG("field_148990_b");

	/**
	 * <p>
	 * Name: getXPValue
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148986_g = McMappingDatabase.getSRG("SPacketSpawnExperienceOrb.func_148986_g");

	/**
	 * <p>
	 * Name: posY
	 * </p>
	 */
	public static McObfPair field_148991_c = McMappingDatabase.getSRG("field_148991_c");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186886_c = McMappingDatabase.getSRG("SPacketSpawnExperienceOrb.func_186886_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSpawnExperienceOrb.func_148840_b");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_186884_d = McMappingDatabase.getSRG("SPacketSpawnExperienceOrb.func_186884_d");

	/**
	 * <p>
	 * Name: getEntityID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148985_c = McMappingDatabase.getSRG("SPacketSpawnExperienceOrb.func_148985_c");

	/**
	 * <p>
	 * Name: posZ
	 * </p>
	 */
	public static McObfPair field_148988_d = McMappingDatabase.getSRG("field_148988_d");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSpawnExperienceOrb.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSpawnExperienceOrb.func_148833_a");

}
