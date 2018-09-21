package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBlockDefinition$MissingVariantException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvv$b";
		else
			return "net/minecraft/client/renderer/block/model/ModelBlockDefinition$MissingVariantException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvv$b";
		else
			return "ModelBlockDefinition$MissingVariantException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvv$b;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ModelBlockDefinition$MissingVariantException;";
	}

}
