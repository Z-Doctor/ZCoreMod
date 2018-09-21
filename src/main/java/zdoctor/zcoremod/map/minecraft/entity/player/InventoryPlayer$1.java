package zdoctor.zcoremod.map.minecraft.entity.player;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class InventoryPlayer$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aec$1";
		else
			return "net/minecraft/entity/player/InventoryPlayer$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aec$1";
		else
			return "InventoryPlayer$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laec$1;";
		else
			return "Lnet/minecraft/entity/player/InventoryPlayer$1;";
	}

}
