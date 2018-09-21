package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketEntity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jj";
		else
			return "net/minecraft/network/play/server/SPacketEntity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jj";
		else
			return "SPacketEntity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljj;";
		else
			return "Lnet/minecraft/network/play/server/SPacketEntity;";
	}

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_149074_a = McMappingDatabase.getSRG("field_149074_a");

	/**
	 * <p>
	 * Name: onGround
	 * </p>
	 */
	public static McObfPair field_179743_g = McMappingDatabase.getSRG("field_179743_g");

	/**
	 * <p>
	 * Name: getOnGround
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179742_g = McMappingDatabase.getSRG("SPacketEntity.func_179742_g");

	/**
	 * <p>
	 * Name: posZ
	 * </p>
	 */
	public static McObfPair field_149070_d = McMappingDatabase.getSRG("field_149070_d");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_149068_f = McMappingDatabase.getSRG("field_149068_f");

	/**
	 * <p>
	 * Name: yaw
	 * </p>
	 */
	public static McObfPair field_149071_e = McMappingDatabase.getSRG("field_149071_e");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketEntity.func_148837_a");

	/**
	 * <p>
	 * Name: isRotating
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149060_h = McMappingDatabase.getSRG("SPacketEntity.func_149060_h");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186953_b = McMappingDatabase.getSRG("SPacketEntity.func_186953_b");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketEntity.func_148840_b");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186952_a = McMappingDatabase.getSRG("SPacketEntity.func_186952_a");

	/**
	 * <p>
	 * Name: posY
	 * </p>
	 */
	public static McObfPair field_149073_c = McMappingDatabase.getSRG("field_149073_c");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_149063_g = McMappingDatabase.getSRG("SPacketEntity.func_149063_g");

	/**
	 * <p>
	 * Name: rotating
	 * </p>
	 */
	public static McObfPair field_149069_g = McMappingDatabase.getSRG("field_149069_g");

	/**
	 * <p>
	 * Name: posX
	 * </p>
	 */
	public static McObfPair field_149072_b = McMappingDatabase.getSRG("field_149072_b");

	/**
	 * <p>
	 * Name: getEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_149065_a = McMappingDatabase.getSRG("SPacketEntity.func_149065_a");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186951_c = McMappingDatabase.getSRG("SPacketEntity.func_186951_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketEntity.func_148833_a");

	/**
	 * <p>
	 * Name: getYaw
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_149066_f = McMappingDatabase.getSRG("SPacketEntity.func_149066_f");

}
