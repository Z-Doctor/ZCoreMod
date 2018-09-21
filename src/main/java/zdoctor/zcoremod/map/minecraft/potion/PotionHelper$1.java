package zdoctor.zcoremod.map.minecraft.potion;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PotionHelper$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akh$1";
		else
			return "net/minecraft/potion/PotionHelper$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akh$1";
		else
			return "PotionHelper$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakh$1;";
		else
			return "Lnet/minecraft/potion/PotionHelper$1;";
	}

}
