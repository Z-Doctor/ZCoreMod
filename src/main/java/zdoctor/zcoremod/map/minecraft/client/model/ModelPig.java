package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelPig {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqi";
		else
			return "net/minecraft/client/model/ModelPig";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqi";
		else
			return "ModelPig";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqi;";
		else
			return "Lnet/minecraft/client/model/ModelPig;";
	}

}
