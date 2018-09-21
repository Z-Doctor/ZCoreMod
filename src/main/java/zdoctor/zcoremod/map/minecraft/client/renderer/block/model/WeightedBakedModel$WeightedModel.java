package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WeightedBakedModel$WeightedModel {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgg$b";
		else
			return "net/minecraft/client/renderer/block/model/WeightedBakedModel$WeightedModel";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgg$b";
		else
			return "WeightedBakedModel$WeightedModel";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgg$b;";
		else
			return "Lnet/minecraft/client/renderer/block/model/WeightedBakedModel$WeightedModel;";
	}

	/**
	 * <p>
	 * Name: model
	 * </p>
	 */
	public static McObfPair field_185281_b = McMappingDatabase.getSRG("field_185281_b");

}
