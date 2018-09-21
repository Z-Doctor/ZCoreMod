package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketWorldBorder$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jz$1";
		else
			return "net/minecraft/network/play/server/SPacketWorldBorder$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jz$1";
		else
			return "SPacketWorldBorder$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljz$1;";
		else
			return "Lnet/minecraft/network/play/server/SPacketWorldBorder$1;";
	}

}
