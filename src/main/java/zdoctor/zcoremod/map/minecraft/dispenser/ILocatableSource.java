package zdoctor.zcoremod.map.minecraft.dispenser;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ILocatableSource {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fe";
		else
			return "net/minecraft/dispenser/ILocatableSource";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fe";
		else
			return "ILocatableSource";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfe;";
		else
			return "Lnet/minecraft/dispenser/ILocatableSource;";
	}

}
