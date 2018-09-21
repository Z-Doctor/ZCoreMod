package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootFunctionManager$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bga$a";
		else
			return "net/minecraft/world/storage/loot/functions/LootFunctionManager$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bga$a";
		else
			return "LootFunctionManager$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbga$a;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/LootFunctionManager$Serializer;";
	}

}
