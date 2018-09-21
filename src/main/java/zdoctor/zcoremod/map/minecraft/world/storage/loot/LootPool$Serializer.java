package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootPool$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfq$a";
		else
			return "net/minecraft/world/storage/loot/LootPool$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfq$a";
		else
			return "LootPool$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfq$a;";
		else
			return "Lnet/minecraft/world/storage/loot/LootPool$Serializer;";
	}

}
