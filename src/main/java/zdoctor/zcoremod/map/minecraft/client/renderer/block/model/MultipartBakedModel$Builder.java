package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MultipartBakedModel$Builder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cge$a";
		else
			return "net/minecraft/client/renderer/block/model/MultipartBakedModel$Builder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cge$a";
		else
			return "MultipartBakedModel$Builder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcge$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/MultipartBakedModel$Builder;";
	}

	/**
	 * <p>
	 * Name: builderSelectors
	 * </p>
	 */
	public static McObfPair field_188649_a = McMappingDatabase.getSRG("field_188649_a");

	/**
	 * <p>
	 * Name: putModel
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/common/base/Predicate;Lnet/minecraft/client/renderer/block/model/IBakedModel;)V]
	 * </p>
	 */
	public static McObfPair func_188648_a = McMappingDatabase.getSRG("MultipartBakedModel$Builder.func_188648_a");

	/**
	 * <p>
	 * Name: makeMultipartModel
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_188647_a = McMappingDatabase.getSRG("MultipartBakedModel$Builder.func_188647_a");

}
