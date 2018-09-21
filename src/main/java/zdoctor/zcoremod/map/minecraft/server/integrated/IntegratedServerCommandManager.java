package zdoctor.zcoremod.map.minecraft.server.integrated;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IntegratedServerCommandManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "che";
		else
			return "net/minecraft/server/integrated/IntegratedServerCommandManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "che";
		else
			return "IntegratedServerCommandManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lche;";
		else
			return "Lnet/minecraft/server/integrated/IntegratedServerCommandManager;";
	}

}
