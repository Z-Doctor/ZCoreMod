package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketUpdateBossInfo$Operation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ik$a";
		else
			return "net/minecraft/network/play/server/SPacketUpdateBossInfo$Operation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ik$a";
		else
			return "SPacketUpdateBossInfo$Operation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lik$a;";
		else
			return "Lnet/minecraft/network/play/server/SPacketUpdateBossInfo$Operation;";
	}

}
