package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerStatusResponse$Version {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mt$c";
		else
			return "net/minecraft/network/ServerStatusResponse$Version";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mt$c";
		else
			return "ServerStatusResponse$Version";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmt$c;";
		else
			return "Lnet/minecraft/network/ServerStatusResponse$Version;";
	}

	/**
	 * <p>
	 * Name: getProtocol
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_151304_b = McMappingDatabase.getSRG("ServerStatusResponse$Version.func_151304_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151303_a = McMappingDatabase.getSRG("ServerStatusResponse$Version.func_151303_a");

	/**
	 * <p>
	 * Name: protocol
	 * </p>
	 */
	public static McObfPair field_151305_b = McMappingDatabase.getSRG("field_151305_b");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_151306_a = McMappingDatabase.getSRG("field_151306_a");

}
