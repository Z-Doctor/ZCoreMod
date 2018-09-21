package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketClientSettings {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lc";
		else
			return "net/minecraft/network/play/client/CPacketClientSettings";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lc";
		else
			return "CPacketClientSettings";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llc;";
		else
			return "Lnet/minecraft/network/play/client/CPacketClientSettings;";
	}

	/**
	 * <p>
	 * Name: getChatVisibility
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/player/EntityPlayer$EnumChatVisibility;]
	 * </p>
	 */
	public static McObfPair func_149523_e = McMappingDatabase.getSRG("CPacketClientSettings.func_149523_e");

	/**
	 * <p>
	 * Name: enableColors
	 * </p>
	 */
	public static McObfPair field_149526_d = McMappingDatabase.getSRG("field_149526_d");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketClientSettings.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketClientSettings.func_148837_a");

	/**
	 * <p>
	 * Name: getLang
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149524_c = McMappingDatabase.getSRG("CPacketClientSettings.func_149524_c");

	/**
	 * <p>
	 * Name: getModelPartFlags
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149521_d = McMappingDatabase.getSRG("CPacketClientSettings.func_149521_d");

	/**
	 * <p>
	 * Name: getMainHand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumHandSide;]
	 * </p>
	 */
	public static McObfPair func_186991_f = McMappingDatabase.getSRG("CPacketClientSettings.func_186991_f");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketClientSettings.func_148840_b");

	/**
	 * <p>
	 * Name: mainHand
	 * </p>
	 */
	public static McObfPair field_186992_f = McMappingDatabase.getSRG("field_186992_f");

	/**
	 * <p>
	 * Name: chatVisibility
	 * </p>
	 */
	public static McObfPair field_149529_c = McMappingDatabase.getSRG("field_149529_c");

	/**
	 * <p>
	 * Name: view
	 * </p>
	 */
	public static McObfPair field_149528_b = McMappingDatabase.getSRG("field_149528_b");

	/**
	 * <p>
	 * Name: modelPartFlags
	 * </p>
	 */
	public static McObfPair field_179711_e = McMappingDatabase.getSRG("field_179711_e");

	/**
	 * <p>
	 * Name: isColorsEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149520_f = McMappingDatabase.getSRG("CPacketClientSettings.func_149520_f");

	/**
	 * <p>
	 * Name: lang
	 * </p>
	 */
	public static McObfPair field_149530_a = McMappingDatabase.getSRG("field_149530_a");

}
