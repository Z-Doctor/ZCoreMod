package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldServer$ServerBlockEventList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oo$a";
		else
			return "net/minecraft/world/WorldServer$ServerBlockEventList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oo$a";
		else
			return "WorldServer$ServerBlockEventList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loo$a;";
		else
			return "Lnet/minecraft/world/WorldServer$ServerBlockEventList;";
	}

}
