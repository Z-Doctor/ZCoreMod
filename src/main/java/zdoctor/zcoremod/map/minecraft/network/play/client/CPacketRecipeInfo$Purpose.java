package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketRecipeInfo$Purpose {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ls$a";
		else
			return "net/minecraft/network/play/client/CPacketRecipeInfo$Purpose";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ls$a";
		else
			return "CPacketRecipeInfo$Purpose";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lls$a;";
		else
			return "Lnet/minecraft/network/play/client/CPacketRecipeInfo$Purpose;";
	}

}
