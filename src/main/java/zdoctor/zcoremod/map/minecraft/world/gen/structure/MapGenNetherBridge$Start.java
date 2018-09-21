package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenNetherBridge$Start {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbm$a";
		else
			return "net/minecraft/world/gen/structure/MapGenNetherBridge$Start";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbm$a";
		else
			return "MapGenNetherBridge$Start";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbm$a;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenNetherBridge$Start;";
	}

}
