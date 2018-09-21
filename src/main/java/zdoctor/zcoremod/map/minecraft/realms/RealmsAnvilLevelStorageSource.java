package zdoctor.zcoremod.map.minecraft.realms;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RealmsAnvilLevelStorageSource {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/realms/RealmsAnvilLevelStorageSource";
		else
			return "net/minecraft/realms/RealmsAnvilLevelStorageSource";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "RealmsAnvilLevelStorageSource";
		else
			return "RealmsAnvilLevelStorageSource";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/realms/RealmsAnvilLevelStorageSource;";
		else
			return "Lnet/minecraft/realms/RealmsAnvilLevelStorageSource;";
	}

}
