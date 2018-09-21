package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketRecipeBook$State {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "js$a";
		else
			return "net/minecraft/network/play/server/SPacketRecipeBook$State";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "js$a";
		else
			return "SPacketRecipeBook$State";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljs$a;";
		else
			return "Lnet/minecraft/network/play/server/SPacketRecipeBook$State;";
	}

}
