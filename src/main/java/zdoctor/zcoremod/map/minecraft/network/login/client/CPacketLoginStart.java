package zdoctor.zcoremod.map.minecraft.network.login.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketLoginStart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mm";
		else
			return "net/minecraft/network/login/client/CPacketLoginStart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mm";
		else
			return "CPacketLoginStart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmm;";
		else
			return "Lnet/minecraft/network/login/client/CPacketLoginStart;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/login/INetHandlerLoginServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketLoginStart.func_148833_a");

	/**
	 * <p>
	 * Name: profile
	 * </p>
	 */
	public static McObfPair field_149305_a = McMappingDatabase.getSRG("field_149305_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketLoginStart.func_148837_a");

	/**
	 * <p>
	 * Name: getProfile
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_149304_c = McMappingDatabase.getSRG("CPacketLoginStart.func_149304_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketLoginStart.func_148840_b");

}
