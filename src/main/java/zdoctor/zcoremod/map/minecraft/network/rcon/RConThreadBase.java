package zdoctor.zcoremod.map.minecraft.network.rcon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RConThreadBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pz";
		else
			return "net/minecraft/network/rcon/RConThreadBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pz";
		else
			return "RConThreadBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpz;";
		else
			return "Lnet/minecraft/network/rcon/RConThreadBase;";
	}

	/**
	 * <p>
	 * Name: logSevere
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_72610_d = McMappingDatabase.getSRG("RConThreadBase.func_72610_d");

	/**
	 * <p>
	 * Name: serverSocketList
	 * </p>
	 */
	public static McObfPair field_72614_f = McMappingDatabase.getSRG("field_72614_f");

	/**
	 * <p>
	 * Name: logInfo
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_72609_b = McMappingDatabase.getSRG("RConThreadBase.func_72609_b");

	/**
	 * <p>
	 * Name: registerSocket
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/DatagramSocket;)V]
	 * </p>
	 */
	public static McObfPair func_72601_a = McMappingDatabase.getSRG("RConThreadBase.func_72601_a");

	/**
	 * <p>
	 * Name: isRunning
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_72613_c = McMappingDatabase.getSRG("RConThreadBase.func_72613_c");

	/**
	 * <p>
	 * Name: rconThread
	 * </p>
	 */
	public static McObfPair field_72618_c = McMappingDatabase.getSRG("field_72618_c");

	/**
	 * <p>
	 * Name: closeServerSocket_do
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/ServerSocket;Z)Z]
	 * </p>
	 */
	public static McObfPair func_72605_a = McMappingDatabase.getSRG("RConThreadBase.func_72605_a");

	/**
	 * <p>
	 * Name: closeServerSocket
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/ServerSocket;)Z]
	 * </p>
	 */
	public static McObfPair func_72608_b = McMappingDatabase.getSRG("RConThreadBase.func_72608_b");

	/**
	 * <p>
	 * Name: getNumberOfPlayers
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_72603_d = McMappingDatabase.getSRG("RConThreadBase.func_72603_d");

	/**
	 * <p>
	 * Name: maxStopWait
	 * </p>
	 */
	public static McObfPair field_72615_d = McMappingDatabase.getSRG("field_72615_d");

	/**
	 * <p>
	 * Name: socketList
	 * </p>
	 */
	public static McObfPair field_72616_e = McMappingDatabase.getSRG("field_72616_e");

	/**
	 * <p>
	 * Name: logWarning
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_72606_c = McMappingDatabase.getSRG("RConThreadBase.func_72606_c");

	/**
	 * <p>
	 * Name: closeSocket
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/DatagramSocket;Z)Z]
	 * </p>
	 */
	public static McObfPair func_72604_a = McMappingDatabase.getSRG("RConThreadBase.func_72604_a");

	/**
	 * <p>
	 * Name: closeAllSockets
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72611_e = McMappingDatabase.getSRG("RConThreadBase.func_72611_e");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_72617_b = McMappingDatabase.getSRG("field_72617_b");

	/**
	 * <p>
	 * Name: running
	 * </p>
	 */
	public static McObfPair field_72619_a = McMappingDatabase.getSRG("field_72619_a");

	/**
	 * <p>
	 * Name: threadName
	 * </p>
	 */
	public static McObfPair field_164003_c = McMappingDatabase.getSRG("field_164003_c");

	/**
	 * <p>
	 * Name: closeAllSockets_do
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_72612_a = McMappingDatabase.getSRG("RConThreadBase.func_72612_a");

	/**
	 * <p>
	 * Name: startThread
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72602_a = McMappingDatabase.getSRG("RConThreadBase.func_72602_a");

	/**
	 * <p>
	 * Name: THREAD_ID
	 * </p>
	 */
	public static McObfPair field_164004_h = McMappingDatabase.getSRG("field_164004_h");

	/**
	 * <p>
	 * Name: logDebug
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_72607_a = McMappingDatabase.getSRG("RConThreadBase.func_72607_a");

}
