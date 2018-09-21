package zdoctor.zcoremod.map.minecraft.network.login;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class INetHandlerLoginClient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mg";
		else
			return "net/minecraft/network/login/INetHandlerLoginClient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mg";
		else
			return "INetHandlerLoginClient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmg;";
		else
			return "Lnet/minecraft/network/login/INetHandlerLoginClient;";
	}

	/**
	 * <p>
	 * Name: handleEnableCompression
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/login/server/SPacketEnableCompression;)V]
	 * </p>
	 */
	public static McObfPair func_180464_a = McMappingDatabase.getSRG("INetHandlerLoginClient.func_180464_a");

	/**
	 * <p>
	 * Name: handleDisconnect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/login/server/SPacketDisconnect;)V]
	 * </p>
	 */
	public static McObfPair func_147388_a = McMappingDatabase.getSRG("INetHandlerLoginClient.func_147388_a");

	/**
	 * <p>
	 * Name: handleLoginSuccess
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/login/server/SPacketLoginSuccess;)V]
	 * </p>
	 */
	public static McObfPair func_147390_a = McMappingDatabase.getSRG("INetHandlerLoginClient.func_147390_a");

	/**
	 * <p>
	 * Name: handleEncryptionRequest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/login/server/SPacketEncryptionRequest;)V]
	 * </p>
	 */
	public static McObfPair func_147389_a = McMappingDatabase.getSRG("INetHandlerLoginClient.func_147389_a");

}
