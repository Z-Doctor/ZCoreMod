package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NettyCompressionDecoder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gu";
		else
			return "net/minecraft/network/NettyCompressionDecoder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gu";
		else
			return "NettyCompressionDecoder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgu;";
		else
			return "Lnet/minecraft/network/NettyCompressionDecoder;";
	}

	/**
	 * <p>
	 * Name: setCompressionThreshold
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179303_a = McMappingDatabase.getSRG("NettyCompressionDecoder.func_179303_a");

	/**
	 * <p>
	 * Name: threshold
	 * </p>
	 */
	public static McObfPair field_179304_b = McMappingDatabase.getSRG("field_179304_b");

	/**
	 * <p>
	 * Name: inflater
	 * </p>
	 */
	public static McObfPair field_179305_a = McMappingDatabase.getSRG("field_179305_a");

}
