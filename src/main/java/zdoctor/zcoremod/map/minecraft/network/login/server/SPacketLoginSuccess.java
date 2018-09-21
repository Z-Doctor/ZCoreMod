package zdoctor.zcoremod.map.minecraft.network.login.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketLoginSuccess {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mh";
		else
			return "net/minecraft/network/login/server/SPacketLoginSuccess";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mh";
		else
			return "SPacketLoginSuccess";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmh;";
		else
			return "Lnet/minecraft/network/login/server/SPacketLoginSuccess;";
	}

	/**
	 * <p>
	 * Name: profile
	 * </p>
	 */
	public static McObfPair field_149602_a = McMappingDatabase.getSRG("field_149602_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/login/INetHandlerLoginClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketLoginSuccess.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketLoginSuccess.func_148837_a");

	/**
	 * <p>
	 * Name: getProfile
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_179730_a = McMappingDatabase.getSRG("SPacketLoginSuccess.func_179730_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketLoginSuccess.func_148840_b");

}
