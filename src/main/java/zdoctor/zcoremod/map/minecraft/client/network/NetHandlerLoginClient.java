package zdoctor.zcoremod.map.minecraft.client.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetHandlerLoginClient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bry";
		else
			return "net/minecraft/client/network/NetHandlerLoginClient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bry";
		else
			return "NetHandlerLoginClient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbry;";
		else
			return "Lnet/minecraft/client/network/NetHandlerLoginClient;";
	}

	/**
	 * <p>
	 * Name: handleLoginSuccess
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/login/server/SPacketLoginSuccess;)V]
	 * </p>
	 */
	public static McObfPair func_147390_a = McMappingDatabase.getSRG("NetHandlerLoginClient.func_147390_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147396_a = McMappingDatabase.getSRG("field_147396_a");

	/**
	 * <p>
	 * Name: getSessionService
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/minecraft/MinecraftSessionService;]
	 * </p>
	 */
	public static McObfPair func_147391_c = McMappingDatabase.getSRG("NetHandlerLoginClient.func_147391_c");

	/**
	 * <p>
	 * Name: onDisconnect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_147231_a = McMappingDatabase.getSRG("NetHandlerLoginClient.func_147231_a");

	/**
	 * <p>
	 * Name: networkManager
	 * </p>
	 */
	public static McObfPair field_147393_d = McMappingDatabase.getSRG("field_147393_d");

	/**
	 * <p>
	 * Name: gameProfile
	 * </p>
	 */
	public static McObfPair field_175091_e = McMappingDatabase.getSRG("field_175091_e");

	/**
	 * <p>
	 * Name: previousGuiScreen
	 * </p>
	 */
	public static McObfPair field_147395_c = McMappingDatabase.getSRG("field_147395_c");

	/**
	 * <p>
	 * Name: handleEncryptionRequest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/login/server/SPacketEncryptionRequest;)V]
	 * </p>
	 */
	public static McObfPair func_147389_a = McMappingDatabase.getSRG("NetHandlerLoginClient.func_147389_a");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_147394_b = McMappingDatabase.getSRG("field_147394_b");

	/**
	 * <p>
	 * Name: handleEnableCompression
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/login/server/SPacketEnableCompression;)V]
	 * </p>
	 */
	public static McObfPair func_180464_a = McMappingDatabase.getSRG("NetHandlerLoginClient.func_180464_a");

	/**
	 * <p>
	 * Name: handleDisconnect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/login/server/SPacketDisconnect;)V]
	 * </p>
	 */
	public static McObfPair func_147388_a = McMappingDatabase.getSRG("NetHandlerLoginClient.func_147388_a");

}
