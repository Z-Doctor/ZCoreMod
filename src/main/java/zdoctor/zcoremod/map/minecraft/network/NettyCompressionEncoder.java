package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NettyCompressionEncoder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gv";
		else
			return "net/minecraft/network/NettyCompressionEncoder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gv";
		else
			return "NettyCompressionEncoder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgv;";
		else
			return "Lnet/minecraft/network/NettyCompressionEncoder;";
	}

	/**
	 * <p>
	 * Name: threshold
	 * </p>
	 */
	public static McObfPair field_179301_c = McMappingDatabase.getSRG("field_179301_c");

	/**
	 * <p>
	 * Name: setCompressionThreshold
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179299_a = McMappingDatabase.getSRG("NettyCompressionEncoder.func_179299_a");

	/**
	 * <p>
	 * Name: buffer
	 * </p>
	 */
	public static McObfPair field_179302_a = McMappingDatabase.getSRG("field_179302_a");

	/**
	 * <p>
	 * Name: deflater
	 * </p>
	 */
	public static McObfPair field_179300_b = McMappingDatabase.getSRG("field_179300_b");

}
