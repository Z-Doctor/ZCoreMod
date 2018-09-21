package zdoctor.zcoremod.map.minecraft.client.renderer.block.model.multipart;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ConditionAnd {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwf";
		else
			return "net/minecraft/client/renderer/block/model/multipart/ConditionAnd";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwf";
		else
			return "ConditionAnd";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwf;";
		else
			return "Lnet/minecraft/client/renderer/block/model/multipart/ConditionAnd;";
	}

	/**
	 * <p>
	 * Name: conditions
	 * </p>
	 */
	public static McObfPair field_188121_c = McMappingDatabase.getSRG("field_188121_c");

	/**
	 * <p>
	 * Name: getPredicate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/BlockStateContainer;)Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_188118_a = McMappingDatabase.getSRG("ConditionAnd.func_188118_a");

}
