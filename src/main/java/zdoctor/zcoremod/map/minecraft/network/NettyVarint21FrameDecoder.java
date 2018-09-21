package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NettyVarint21FrameDecoder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hc";
		else
			return "net/minecraft/network/NettyVarint21FrameDecoder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hc";
		else
			return "NettyVarint21FrameDecoder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhc;";
		else
			return "Lnet/minecraft/network/NettyVarint21FrameDecoder;";
	}

}
