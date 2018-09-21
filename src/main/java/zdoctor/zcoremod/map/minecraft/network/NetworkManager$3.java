package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetworkManager$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gw$3";
		else
			return "net/minecraft/network/NetworkManager$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gw$3";
		else
			return "NetworkManager$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgw$3;";
		else
			return "Lnet/minecraft/network/NetworkManager$3;";
	}

	/**
	 * <p>
	 * Name: load
	 * </p>
	 * <p>
	 * Desc: [()Lio/netty/channel/local/LocalEventLoopGroup;, ()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_179280_b = McMappingDatabase.getSRG("NetworkManager$3.func_179280_b");

}
