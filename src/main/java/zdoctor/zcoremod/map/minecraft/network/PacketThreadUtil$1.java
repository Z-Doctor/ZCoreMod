package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PacketThreadUtil$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hv$1";
		else
			return "net/minecraft/network/PacketThreadUtil$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hv$1";
		else
			return "PacketThreadUtil$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhv$1;";
		else
			return "Lnet/minecraft/network/PacketThreadUtil$1;";
	}

}
