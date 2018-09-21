package zdoctor.zcoremod.map.minecraft.network.rcon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RConThreadClient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qb";
		else
			return "net/minecraft/network/rcon/RConThreadClient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qb";
		else
			return "RConThreadClient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqb;";
		else
			return "Lnet/minecraft/network/rcon/RConThreadClient;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_164005_h = McMappingDatabase.getSRG("field_164005_h");

	/**
	 * <p>
	 * Name: sendResponse
	 * </p>
	 * <p>
	 * Desc: [(IILjava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_72654_a = McMappingDatabase.getSRG("RConThreadClient.func_72654_a");

	/**
	 * <p>
	 * Name: closeSocket
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72653_g = McMappingDatabase.getSRG("RConThreadClient.func_72653_g");

	/**
	 * <p>
	 * Name: clientSocket
	 * </p>
	 */
	public static McObfPair field_72659_h = McMappingDatabase.getSRG("field_72659_h");

	/**
	 * <p>
	 * Name: rconPassword
	 * </p>
	 */
	public static McObfPair field_72658_j = McMappingDatabase.getSRG("field_72658_j");

	/**
	 * <p>
	 * Name: buffer
	 * </p>
	 */
	public static McObfPair field_72660_i = McMappingDatabase.getSRG("field_72660_i");

	/**
	 * <p>
	 * Name: sendMultipacketResponse
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_72655_a = McMappingDatabase.getSRG("RConThreadClient.func_72655_a");

	/**
	 * <p>
	 * Name: loggedIn
	 * </p>
	 */
	public static McObfPair field_72657_g = McMappingDatabase.getSRG("field_72657_g");

	/**
	 * <p>
	 * Name: sendLoginFailedResponse
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72656_f = McMappingDatabase.getSRG("RConThreadClient.func_72656_f");

}
