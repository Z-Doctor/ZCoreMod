package zdoctor.zcoremod.map.minecraft.realms;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Tezzelator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/realms/Tezzelator";
		else
			return "net/minecraft/realms/Tezzelator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Tezzelator";
		else
			return "Tezzelator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/realms/Tezzelator;";
		else
			return "Lnet/minecraft/realms/Tezzelator;";
	}

}
