package zdoctor.zcoremod.map.minecraft.client.renderer.block.model.multipart;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ConditionOr {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwj";
		else
			return "net/minecraft/client/renderer/block/model/multipart/ConditionOr";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwj";
		else
			return "ConditionOr";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwj;";
		else
			return "Lnet/minecraft/client/renderer/block/model/multipart/ConditionOr;";
	}

	/**
	 * <p>
	 * Name: conditions
	 * </p>
	 */
	public static McObfPair field_188127_c = McMappingDatabase.getSRG("field_188127_c");

	/**
	 * <p>
	 * Name: getPredicate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/BlockStateContainer;)Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_188118_a = McMappingDatabase.getSRG("ConditionOr.func_188118_a");

}
