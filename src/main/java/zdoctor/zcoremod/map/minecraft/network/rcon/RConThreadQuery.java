package zdoctor.zcoremod.map.minecraft.network.rcon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RConThreadQuery {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qa";
		else
			return "net/minecraft/network/rcon/RConThreadQuery";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qa";
		else
			return "RConThreadQuery";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqa;";
		else
			return "Lnet/minecraft/network/rcon/RConThreadQuery;";
	}

	/**
	 * <p>
	 * Name: incomingPacket
	 * </p>
	 */
	public static McObfPair field_72631_o = McMappingDatabase.getSRG("field_72631_o");

	/**
	 * <p>
	 * Name: idents
	 * </p>
	 */
	public static McObfPair field_72644_p = McMappingDatabase.getSRG("field_72644_p");

	/**
	 * <p>
	 * Name: sendResponsePacket
	 * </p>
	 * <p>
	 * Desc: [([BLjava/net/DatagramPacket;)V]
	 * </p>
	 */
	public static McObfPair func_72620_a = McMappingDatabase.getSRG("RConThreadQuery.func_72620_a");

	/**
	 * <p>
	 * Name: queryHostname
	 * </p>
	 */
	public static McObfPair field_72643_q = McMappingDatabase.getSRG("field_72643_q");

	/**
	 * <p>
	 * Name: worldName
	 * </p>
	 */
	public static McObfPair field_72632_l = McMappingDatabase.getSRG("field_72632_l");

	/**
	 * <p>
	 * Name: createQueryResponse
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/DatagramPacket;)[B]
	 * </p>
	 */
	public static McObfPair func_72624_b = McMappingDatabase.getSRG("RConThreadQuery.func_72624_b");

	/**
	 * <p>
	 * Name: lastAuthCheckTime
	 * </p>
	 */
	public static McObfPair field_72629_g = McMappingDatabase.getSRG("field_72629_g");

	/**
	 * <p>
	 * Name: sendAuthChallenge
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/DatagramPacket;)V]
	 * </p>
	 */
	public static McObfPair func_72622_d = McMappingDatabase.getSRG("RConThreadQuery.func_72622_d");

	/**
	 * <p>
	 * Name: lastQueryResponseTime
	 * </p>
	 */
	public static McObfPair field_72638_v = McMappingDatabase.getSRG("field_72638_v");

	/**
	 * <p>
	 * Name: serverMotd
	 * </p>
	 */
	public static McObfPair field_72635_k = McMappingDatabase.getSRG("field_72635_k");

	/**
	 * <p>
	 * Name: serverPort
	 * </p>
	 */
	public static McObfPair field_72637_i = McMappingDatabase.getSRG("field_72637_i");

	/**
	 * <p>
	 * Name: time
	 * </p>
	 */
	public static McObfPair field_72640_t = McMappingDatabase.getSRG("field_72640_t");

	/**
	 * <p>
	 * Name: queryClients
	 * </p>
	 */
	public static McObfPair field_72641_s = McMappingDatabase.getSRG("field_72641_s");

	/**
	 * <p>
	 * Name: initQuerySystem
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_72626_g = McMappingDatabase.getSRG("RConThreadQuery.func_72626_g");

	/**
	 * <p>
	 * Name: queryPort
	 * </p>
	 */
	public static McObfPair field_72636_h = McMappingDatabase.getSRG("field_72636_h");

	/**
	 * <p>
	 * Name: serverHostname
	 * </p>
	 */
	public static McObfPair field_72642_r = McMappingDatabase.getSRG("field_72642_r");

	/**
	 * <p>
	 * Name: getRequestID
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/SocketAddress;)[B]
	 * </p>
	 */
	public static McObfPair func_72625_a = McMappingDatabase.getSRG("RConThreadQuery.func_72625_a");

	/**
	 * <p>
	 * Name: buffer
	 * </p>
	 */
	public static McObfPair field_72630_n = McMappingDatabase.getSRG("field_72630_n");

	/**
	 * <p>
	 * Name: verifyClientAuth
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/DatagramPacket;)Ljava/lang/Boolean;]
	 * </p>
	 */
	public static McObfPair func_72627_c = McMappingDatabase.getSRG("RConThreadQuery.func_72627_c");

	/**
	 * <p>
	 * Name: parseIncomingPacket
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/DatagramPacket;)Z]
	 * </p>
	 */
	public static McObfPair func_72621_a = McMappingDatabase.getSRG("RConThreadQuery.func_72621_a");

	/**
	 * <p>
	 * Name: output
	 * </p>
	 */
	public static McObfPair field_72639_u = McMappingDatabase.getSRG("field_72639_u");

	/**
	 * <p>
	 * Name: cleanQueryClientsMap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72628_f = McMappingDatabase.getSRG("RConThreadQuery.func_72628_f");

	/**
	 * <p>
	 * Name: startThread
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72602_a = McMappingDatabase.getSRG("RConThreadQuery.func_72602_a");

	/**
	 * <p>
	 * Name: querySocket
	 * </p>
	 */
	public static McObfPair field_72633_m = McMappingDatabase.getSRG("field_72633_m");

	/**
	 * <p>
	 * Name: maxPlayers
	 * </p>
	 */
	public static McObfPair field_72634_j = McMappingDatabase.getSRG("field_72634_j");

	/**
	 * <p>
	 * Name: stopWithException
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Exception;)V]
	 * </p>
	 */
	public static McObfPair func_72623_a = McMappingDatabase.getSRG("RConThreadQuery.func_72623_a");

}
