package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WeightedBakedModel$Builder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgg$a";
		else
			return "net/minecraft/client/renderer/block/model/WeightedBakedModel$Builder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgg$a";
		else
			return "WeightedBakedModel$Builder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgg$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/WeightedBakedModel$Builder;";
	}

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/IBakedModel;I)Lnet/minecraft/client/renderer/block/model/WeightedBakedModel$Builder;]
	 * </p>
	 */
	public static McObfPair func_177677_a = McMappingDatabase.getSRG("WeightedBakedModel$Builder.func_177677_a");

	/**
	 * <p>
	 * Name: first
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_177675_b = McMappingDatabase.getSRG("WeightedBakedModel$Builder.func_177675_b");

	/**
	 * <p>
	 * Name: build
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/WeightedBakedModel;]
	 * </p>
	 */
	public static McObfPair func_177676_a = McMappingDatabase.getSRG("WeightedBakedModel$Builder.func_177676_a");

	/**
	 * <p>
	 * Name: listItems
	 * </p>
	 */
	public static McObfPair field_177678_a = McMappingDatabase.getSRG("field_177678_a");

}
