package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetworkManager$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gw$2";
		else
			return "net/minecraft/network/NetworkManager$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gw$2";
		else
			return "NetworkManager$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgw$2;";
		else
			return "Lnet/minecraft/network/NetworkManager$2;";
	}

	/**
	 * <p>
	 * Name: load
	 * </p>
	 * <p>
	 * Desc: [()Lio/netty/channel/epoll/EpollEventLoopGroup;, ()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_179280_b = McMappingDatabase.getSRG("NetworkManager$2.func_179280_b");

}
