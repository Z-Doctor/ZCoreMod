package zdoctor.zcoremod.map.minecraft.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Minecraft$13 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bib$5";
		else
			return "net/minecraft/client/Minecraft$13";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bib$5";
		else
			return "Minecraft$13";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbib$5;";
		else
			return "Lnet/minecraft/client/Minecraft$13;";
	}

}
