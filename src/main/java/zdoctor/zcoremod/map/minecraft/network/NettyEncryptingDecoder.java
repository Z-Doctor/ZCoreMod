package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NettyEncryptingDecoder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gs";
		else
			return "net/minecraft/network/NettyEncryptingDecoder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gs";
		else
			return "NettyEncryptingDecoder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgs;";
		else
			return "Lnet/minecraft/network/NettyEncryptingDecoder;";
	}

	/**
	 * <p>
	 * Name: decryptionCodec
	 * </p>
	 */
	public static McObfPair field_150509_a = McMappingDatabase.getSRG("field_150509_a");

}
