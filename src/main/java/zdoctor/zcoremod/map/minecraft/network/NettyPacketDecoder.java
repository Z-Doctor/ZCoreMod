package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NettyPacketDecoder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gz";
		else
			return "net/minecraft/network/NettyPacketDecoder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gz";
		else
			return "NettyPacketDecoder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgz;";
		else
			return "Lnet/minecraft/network/NettyPacketDecoder;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_150800_a = McMappingDatabase.getSRG("field_150800_a");

	/**
	 * <p>
	 * Name: direction
	 * </p>
	 */
	public static McObfPair field_152499_c = McMappingDatabase.getSRG("field_152499_c");

	/**
	 * <p>
	 * Name: RECEIVED_PACKET_MARKER
	 * </p>
	 */
	public static McObfPair field_150799_b = McMappingDatabase.getSRG("field_150799_b");

}
