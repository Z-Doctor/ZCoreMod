package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetworkManager$InboundHandlerTuplePacketListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gw$a";
		else
			return "net/minecraft/network/NetworkManager$InboundHandlerTuplePacketListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gw$a";
		else
			return "NetworkManager$InboundHandlerTuplePacketListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgw$a;";
		else
			return "Lnet/minecraft/network/NetworkManager$InboundHandlerTuplePacketListener;";
	}

	/**
	 * <p>
	 * Name: packet
	 * </p>
	 */
	public static McObfPair field_150774_a = McMappingDatabase.getSRG("field_150774_a");

	/**
	 * <p>
	 * Name: futureListeners
	 * </p>
	 */
	public static McObfPair field_150773_b = McMappingDatabase.getSRG("field_150773_b");

}
