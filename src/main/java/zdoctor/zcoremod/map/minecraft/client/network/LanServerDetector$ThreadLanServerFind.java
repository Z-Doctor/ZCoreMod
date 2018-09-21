package zdoctor.zcoremod.map.minecraft.client.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LanServerDetector$ThreadLanServerFind {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chg$a";
		else
			return "net/minecraft/client/network/LanServerDetector$ThreadLanServerFind";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chg$a";
		else
			return "LanServerDetector$ThreadLanServerFind";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchg$a;";
		else
			return "Lnet/minecraft/client/network/LanServerDetector$ThreadLanServerFind;";
	}

	/**
	 * <p>
	 * Name: localServerList
	 * </p>
	 */
	public static McObfPair field_77500_a = McMappingDatabase.getSRG("field_77500_a");

	/**
	 * <p>
	 * Name: socket
	 * </p>
	 */
	public static McObfPair field_77499_c = McMappingDatabase.getSRG("field_77499_c");

	/**
	 * <p>
	 * Name: broadcastAddress
	 * </p>
	 */
	public static McObfPair field_77498_b = McMappingDatabase.getSRG("field_77498_b");

}
