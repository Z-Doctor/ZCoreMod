package zdoctor.zcoremod.map.minecraft.client.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LanServerInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chf";
		else
			return "net/minecraft/client/network/LanServerInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chf";
		else
			return "LanServerInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchf;";
		else
			return "Lnet/minecraft/client/network/LanServerInfo;";
	}

	/**
	 * <p>
	 * Name: getServerIpPort
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77488_b = McMappingDatabase.getSRG("LanServerInfo.func_77488_b");

	/**
	 * <p>
	 * Name: getServerMotd
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77487_a = McMappingDatabase.getSRG("LanServerInfo.func_77487_a");

	/**
	 * <p>
	 * Name: timeLastSeen
	 * </p>
	 */
	public static McObfPair field_77491_c = McMappingDatabase.getSRG("field_77491_c");

	/**
	 * <p>
	 * Name: lanServerMotd
	 * </p>
	 */
	public static McObfPair field_77492_a = McMappingDatabase.getSRG("field_77492_a");

	/**
	 * <p>
	 * Name: updateLastSeen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_77489_c = McMappingDatabase.getSRG("LanServerInfo.func_77489_c");

	/**
	 * <p>
	 * Name: lanServerIpPort
	 * </p>
	 */
	public static McObfPair field_77490_b = McMappingDatabase.getSRG("field_77490_b");

}
