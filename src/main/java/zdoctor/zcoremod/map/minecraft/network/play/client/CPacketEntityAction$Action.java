package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketEntityAction$Action {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lq$a";
		else
			return "net/minecraft/network/play/client/CPacketEntityAction$Action";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lq$a";
		else
			return "CPacketEntityAction$Action";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llq$a;";
		else
			return "Lnet/minecraft/network/play/client/CPacketEntityAction$Action;";
	}

}
