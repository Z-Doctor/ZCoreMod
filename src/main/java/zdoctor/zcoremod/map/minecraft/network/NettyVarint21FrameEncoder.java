package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NettyVarint21FrameEncoder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hd";
		else
			return "net/minecraft/network/NettyVarint21FrameEncoder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hd";
		else
			return "NettyVarint21FrameEncoder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhd;";
		else
			return "Lnet/minecraft/network/NettyVarint21FrameEncoder;";
	}

}
