package zdoctor.zcoremod.map.minecraft.server.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetHandlerLoginServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pc";
		else
			return "net/minecraft/server/network/NetHandlerLoginServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pc";
		else
			return "NetHandlerLoginServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpc;";
		else
			return "Lnet/minecraft/server/network/NetHandlerLoginServer;";
	}

	/**
	 * <p>
	 * Name: RANDOM
	 * </p>
	 */
	public static McObfPair field_147329_d = McMappingDatabase.getSRG("field_147329_d");

	/**
	 * <p>
	 * Name: onDisconnect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_147231_a = McMappingDatabase.getSRG("NetHandlerLoginServer.func_147231_a");

	/**
	 * <p>
	 * Name: loginGameProfile
	 * </p>
	 */
	public static McObfPair field_147337_i = McMappingDatabase.getSRG("field_147337_i");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147332_c = McMappingDatabase.getSRG("field_147332_c");

	/**
	 * <p>
	 * Name: AUTHENTICATOR_THREAD_ID
	 * </p>
	 */
	public static McObfPair field_147331_b = McMappingDatabase.getSRG("field_147331_b");

	/**
	 * <p>
	 * Name: networkManager
	 * </p>
	 */
	public static McObfPair field_147333_a = McMappingDatabase.getSRG("field_147333_a");

	/**
	 * <p>
	 * Name: verifyToken
	 * </p>
	 */
	public static McObfPair field_147330_e = McMappingDatabase.getSRG("field_147330_e");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_147327_f = McMappingDatabase.getSRG("field_147327_f");

	/**
	 * <p>
	 * Name: secretKey
	 * </p>
	 */
	public static McObfPair field_147335_k = McMappingDatabase.getSRG("field_147335_k");

	/**
	 * <p>
	 * Name: tryAcceptPlayer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147326_c = McMappingDatabase.getSRG("NetHandlerLoginServer.func_147326_c");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("NetHandlerLoginServer.func_73660_a");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_181025_l = McMappingDatabase.getSRG("field_181025_l");

	/**
	 * <p>
	 * Name: disconnect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_194026_b = McMappingDatabase.getSRG("NetHandlerLoginServer.func_194026_b");

	/**
	 * <p>
	 * Name: currentLoginState
	 * </p>
	 */
	public static McObfPair field_147328_g = McMappingDatabase.getSRG("field_147328_g");

	/**
	 * <p>
	 * Name: serverId
	 * </p>
	 */
	public static McObfPair field_147334_j = McMappingDatabase.getSRG("field_147334_j");

	/**
	 * <p>
	 * Name: connectionTimer
	 * </p>
	 */
	public static McObfPair field_147336_h = McMappingDatabase.getSRG("field_147336_h");

	/**
	 * <p>
	 * Name: getConnectionInfo
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_147317_d = McMappingDatabase.getSRG("NetHandlerLoginServer.func_147317_d");

	/**
	 * <p>
	 * Name: processEncryptionResponse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/login/client/CPacketEncryptionResponse;)V]
	 * </p>
	 */
	public static McObfPair func_147315_a = McMappingDatabase.getSRG("NetHandlerLoginServer.func_147315_a");

	/**
	 * <p>
	 * Name: processLoginStart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/login/client/CPacketLoginStart;)V]
	 * </p>
	 */
	public static McObfPair func_147316_a = McMappingDatabase.getSRG("NetHandlerLoginServer.func_147316_a");

	/**
	 * <p>
	 * Name: getOfflineProfile
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152506_a = McMappingDatabase.getSRG("NetHandlerLoginServer.func_152506_a");

}
