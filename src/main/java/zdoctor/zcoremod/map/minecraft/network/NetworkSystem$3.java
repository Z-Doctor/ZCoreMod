package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetworkSystem$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oz$3";
		else
			return "net/minecraft/network/NetworkSystem$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oz$3";
		else
			return "NetworkSystem$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loz$3;";
		else
			return "Lnet/minecraft/network/NetworkSystem$3;";
	}

	/**
	 * <p>
	 * Name: load
	 * </p>
	 * <p>
	 * Desc: [()Lio/netty/channel/local/LocalEventLoopGroup;, ()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_179280_b = McMappingDatabase.getSRG("NetworkSystem$3.func_179280_b");

}
