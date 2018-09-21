package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BossInfo$Color {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tt$a";
		else
			return "net/minecraft/world/BossInfo$Color";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tt$a";
		else
			return "BossInfo$Color";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltt$a;";
		else
			return "Lnet/minecraft/world/BossInfo$Color;";
	}

}
