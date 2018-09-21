package zdoctor.zcoremod.map.minecraft.network.login;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class INetHandlerLoginServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ml";
		else
			return "net/minecraft/network/login/INetHandlerLoginServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ml";
		else
			return "INetHandlerLoginServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lml;";
		else
			return "Lnet/minecraft/network/login/INetHandlerLoginServer;";
	}

	/**
	 * <p>
	 * Name: processEncryptionResponse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/login/client/CPacketEncryptionResponse;)V]
	 * </p>
	 */
	public static McObfPair func_147315_a = McMappingDatabase.getSRG("INetHandlerLoginServer.func_147315_a");

	/**
	 * <p>
	 * Name: processLoginStart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/login/client/CPacketLoginStart;)V]
	 * </p>
	 */
	public static McObfPair func_147316_a = McMappingDatabase.getSRG("INetHandlerLoginServer.func_147316_a");

}
