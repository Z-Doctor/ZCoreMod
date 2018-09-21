package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VariantList$Deserializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwd$a";
		else
			return "net/minecraft/client/renderer/block/model/VariantList$Deserializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwd$a";
		else
			return "VariantList$Deserializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwd$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/VariantList$Deserializer;";
	}

}
