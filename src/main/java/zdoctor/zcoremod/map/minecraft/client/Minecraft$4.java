package zdoctor.zcoremod.map.minecraft.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Minecraft$4 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bib$11";
		else
			return "net/minecraft/client/Minecraft$4";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bib$11";
		else
			return "Minecraft$4";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbib$11;";
		else
			return "Lnet/minecraft/client/Minecraft$4;";
	}

}
