package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityRenderer$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buq$3";
		else
			return "net/minecraft/client/renderer/EntityRenderer$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buq$3";
		else
			return "EntityRenderer$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuq$3;";
		else
			return "Lnet/minecraft/client/renderer/EntityRenderer$3;";
	}

}
