package zdoctor.zcoremod.map.minecraft.server.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MinecraftServerGui$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oc$2";
		else
			return "net/minecraft/server/gui/MinecraftServerGui$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oc$2";
		else
			return "MinecraftServerGui$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loc$2;";
		else
			return "Lnet/minecraft/server/gui/MinecraftServerGui$2;";
	}

}
