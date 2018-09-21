package zdoctor.zcoremod.map.minecraft.client.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LanServerDetector$LanServerList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chg$b";
		else
			return "net/minecraft/client/network/LanServerDetector$LanServerList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chg$b";
		else
			return "LanServerDetector$LanServerList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchg$b;";
		else
			return "Lnet/minecraft/client/network/LanServerDetector$LanServerList;";
	}

	/**
	 * <p>
	 * Name: addServer
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/net/InetAddress;)V]
	 * </p>
	 */
	public static McObfPair func_77551_a = McMappingDatabase.getSRG("LanServerDetector$LanServerList.func_77551_a");

	/**
	 * <p>
	 * Name: listOfLanServers
	 * </p>
	 */
	public static McObfPair field_77555_b = McMappingDatabase.getSRG("field_77555_b");

	/**
	 * <p>
	 * Name: wasUpdated
	 * </p>
	 */
	public static McObfPair field_77556_a = McMappingDatabase.getSRG("field_77556_a");

	/**
	 * <p>
	 * Name: setWasNotUpdated
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_77552_b = McMappingDatabase.getSRG("LanServerDetector$LanServerList.func_77552_b");

	/**
	 * <p>
	 * Name: getWasUpdated
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77553_a = McMappingDatabase.getSRG("LanServerDetector$LanServerList.func_77553_a");

	/**
	 * <p>
	 * Name: getLanServers
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_77554_c = McMappingDatabase.getSRG("LanServerDetector$LanServerList.func_77554_c");

}
