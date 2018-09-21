package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldInfo$7 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfd$8";
		else
			return "net/minecraft/world/storage/WorldInfo$7";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfd$8";
		else
			return "WorldInfo$7";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfd$8;";
		else
			return "Lnet/minecraft/world/storage/WorldInfo$7;";
	}

}
