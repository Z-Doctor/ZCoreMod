package zdoctor.zcoremod.map.minecraft.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Minecraft$7 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bib$14";
		else
			return "net/minecraft/client/Minecraft$7";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bib$14";
		else
			return "Minecraft$7";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbib$14;";
		else
			return "Lnet/minecraft/client/Minecraft$7;";
	}

}
