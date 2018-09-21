package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NettyPacketEncoder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ha";
		else
			return "net/minecraft/network/NettyPacketEncoder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ha";
		else
			return "NettyPacketEncoder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lha;";
		else
			return "Lnet/minecraft/network/NettyPacketEncoder;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_150798_a = McMappingDatabase.getSRG("field_150798_a");

	/**
	 * <p>
	 * Name: direction
	 * </p>
	 */
	public static McObfPair field_152500_c = McMappingDatabase.getSRG("field_152500_c");

	/**
	 * <p>
	 * Name: RECEIVED_PACKET_MARKER
	 * </p>
	 */
	public static McObfPair field_150797_b = McMappingDatabase.getSRG("field_150797_b");

}
