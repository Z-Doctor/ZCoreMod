package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketUpdateBossInfo$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ik$1";
		else
			return "net/minecraft/network/play/server/SPacketUpdateBossInfo$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ik$1";
		else
			return "SPacketUpdateBossInfo$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lik$1;";
		else
			return "Lnet/minecraft/network/play/server/SPacketUpdateBossInfo$1;";
	}

}
