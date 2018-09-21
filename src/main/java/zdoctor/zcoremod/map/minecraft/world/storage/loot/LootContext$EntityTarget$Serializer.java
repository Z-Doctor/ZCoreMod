package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootContext$EntityTarget$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bft$b$a";
		else
			return "net/minecraft/world/storage/loot/LootContext$EntityTarget$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bft$b$a";
		else
			return "LootContext$EntityTarget$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbft$b$a;";
		else
			return "Lnet/minecraft/world/storage/loot/LootContext$EntityTarget$Serializer;";
	}

}
