package zdoctor.zcoremod.map.minecraft.client.renderer.block.model.multipart;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Selector {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwk";
		else
			return "net/minecraft/client/renderer/block/model/multipart/Selector";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwk";
		else
			return "Selector";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwk;";
		else
			return "Lnet/minecraft/client/renderer/block/model/multipart/Selector;";
	}

	/**
	 * <p>
	 * Name: getVariantList
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/VariantList;]
	 * </p>
	 */
	public static McObfPair func_188165_a = McMappingDatabase.getSRG("Selector.func_188165_a");

	/**
	 * <p>
	 * Name: variantList
	 * </p>
	 */
	public static McObfPair field_188168_b = McMappingDatabase.getSRG("field_188168_b");

	/**
	 * <p>
	 * Name: getPredicate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/BlockStateContainer;)Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_188166_a = McMappingDatabase.getSRG("Selector.func_188166_a");

	/**
	 * <p>
	 * Name: condition
	 * </p>
	 */
	public static McObfPair field_188167_a = McMappingDatabase.getSRG("field_188167_a");

}
