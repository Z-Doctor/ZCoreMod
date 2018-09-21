package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BossInfo$Overlay {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tt$b";
		else
			return "net/minecraft/world/BossInfo$Overlay";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tt$b";
		else
			return "BossInfo$Overlay";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltt$b;";
		else
			return "Lnet/minecraft/world/BossInfo$Overlay;";
	}

}
