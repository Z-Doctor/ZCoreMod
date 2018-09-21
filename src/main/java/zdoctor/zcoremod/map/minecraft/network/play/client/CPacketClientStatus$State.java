package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketClientStatus$State {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lb$a";
		else
			return "net/minecraft/network/play/client/CPacketClientStatus$State";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lb$a";
		else
			return "CPacketClientStatus$State";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llb$a;";
		else
			return "Lnet/minecraft/network/play/client/CPacketClientStatus$State;";
	}

}
