package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementProgress$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "k$a";
		else
			return "net/minecraft/advancements/AdvancementProgress$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "k$a";
		else
			return "AdvancementProgress$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lk$a;";
		else
			return "Lnet/minecraft/advancements/AdvancementProgress$Serializer;";
	}

}
