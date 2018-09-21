package zdoctor.zcoremod.map.minecraft.network.rcon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RConThreadQuery$Auth {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qa$a";
		else
			return "net/minecraft/network/rcon/RConThreadQuery$Auth";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qa$a";
		else
			return "RConThreadQuery$Auth";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqa$a;";
		else
			return "Lnet/minecraft/network/rcon/RConThreadQuery$Auth;";
	}

	/**
	 * <p>
	 * Name: challengeValue
	 * </p>
	 */
	public static McObfPair field_72597_e = McMappingDatabase.getSRG("field_72597_e");

	/**
	 * <p>
	 * Name: randomChallenge
	 * </p>
	 */
	public static McObfPair field_72599_c = McMappingDatabase.getSRG("field_72599_c");

	/**
	 * <p>
	 * Name: timestamp
	 * </p>
	 */
	public static McObfPair field_72598_b = McMappingDatabase.getSRG("field_72598_b");

	/**
	 * <p>
	 * Name: getChallengeValue
	 * </p>
	 * <p>
	 * Desc: [()[B]
	 * </p>
	 */
	public static McObfPair func_72594_b = McMappingDatabase.getSRG("RConThreadQuery$Auth.func_72594_b");

	/**
	 * <p>
	 * Name: getRandomChallenge
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_72592_a = McMappingDatabase.getSRG("RConThreadQuery$Auth.func_72592_a");

	/**
	 * <p>
	 * Name: hasExpired
	 * </p>
	 * <p>
	 * Desc: [(J)Ljava/lang/Boolean;]
	 * </p>
	 */
	public static McObfPair func_72593_a = McMappingDatabase.getSRG("RConThreadQuery$Auth.func_72593_a");

	/**
	 * <p>
	 * Name: requestId
	 * </p>
	 */
	public static McObfPair field_72596_d = McMappingDatabase.getSRG("field_72596_d");

	/**
	 * <p>
	 * Name: getRequestId
	 * </p>
	 * <p>
	 * Desc: [()[B]
	 * </p>
	 */
	public static McObfPair func_72591_c = McMappingDatabase.getSRG("RConThreadQuery$Auth.func_72591_c");

	/**
	 * <p>
	 * Name: requestIdAsString
	 * </p>
	 */
	public static McObfPair field_72595_f = McMappingDatabase.getSRG("field_72595_f");

}
