package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NettyEncryptingEncoder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gt";
		else
			return "net/minecraft/network/NettyEncryptingEncoder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gt";
		else
			return "NettyEncryptingEncoder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgt;";
		else
			return "Lnet/minecraft/network/NettyEncryptingEncoder;";
	}

	/**
	 * <p>
	 * Name: encryptionCodec
	 * </p>
	 */
	public static McObfPair field_150750_a = McMappingDatabase.getSRG("field_150750_a");

}
