package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerArmorBase$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbp$1";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerArmorBase$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbp$1";
		else
			return "LayerArmorBase$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbp$1;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerArmorBase$1;";
	}

}
