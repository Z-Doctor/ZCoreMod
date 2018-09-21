package zdoctor.zcoremod.map.minecraft.network.rcon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RConThreadMain {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qc";
		else
			return "net/minecraft/network/rcon/RConThreadMain";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qc";
		else
			return "RConThreadMain";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqc;";
		else
			return "Lnet/minecraft/network/rcon/RConThreadMain;";
	}

	/**
	 * <p>
	 * Name: clientThreads
	 * </p>
	 */
	public static McObfPair field_72648_l = McMappingDatabase.getSRG("field_72648_l");

	/**
	 * <p>
	 * Name: startThread
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72602_a = McMappingDatabase.getSRG("RConThreadMain.func_72602_a");

	/**
	 * <p>
	 * Name: hostname
	 * </p>
	 */
	public static McObfPair field_72652_i = McMappingDatabase.getSRG("field_72652_i");

	/**
	 * <p>
	 * Name: serverPort
	 * </p>
	 */
	public static McObfPair field_72651_h = McMappingDatabase.getSRG("field_72651_h");

	/**
	 * <p>
	 * Name: rconPort
	 * </p>
	 */
	public static McObfPair field_72647_g = McMappingDatabase.getSRG("field_72647_g");

	/**
	 * <p>
	 * Name: initClientThreadList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72646_f = McMappingDatabase.getSRG("RConThreadMain.func_72646_f");

	/**
	 * <p>
	 * Name: cleanClientThreadsMap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72645_g = McMappingDatabase.getSRG("RConThreadMain.func_72645_g");

	/**
	 * <p>
	 * Name: rconPassword
	 * </p>
	 */
	public static McObfPair field_72650_k = McMappingDatabase.getSRG("field_72650_k");

	/**
	 * <p>
	 * Name: serverSocket
	 * </p>
	 */
	public static McObfPair field_72649_j = McMappingDatabase.getSRG("field_72649_j");

}
