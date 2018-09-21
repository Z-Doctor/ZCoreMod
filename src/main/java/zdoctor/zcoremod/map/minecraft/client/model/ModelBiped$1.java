package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBiped$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpx$1";
		else
			return "net/minecraft/client/model/ModelBiped$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpx$1";
		else
			return "ModelBiped$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpx$1;";
		else
			return "Lnet/minecraft/client/model/ModelBiped$1;";
	}

}
