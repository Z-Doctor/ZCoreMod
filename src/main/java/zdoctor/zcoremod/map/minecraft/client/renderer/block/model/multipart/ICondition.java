package zdoctor.zcoremod.map.minecraft.client.renderer.block.model.multipart;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ICondition {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwg";
		else
			return "net/minecraft/client/renderer/block/model/multipart/ICondition";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwg";
		else
			return "ICondition";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwg;";
		else
			return "Lnet/minecraft/client/renderer/block/model/multipart/ICondition;";
	}

	/**
	 * <p>
	 * Name: getPredicate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/BlockStateContainer;)Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_188118_a = McMappingDatabase.getSRG("ICondition.func_188118_a");

	/**
	 * <p>
	 * Name: TRUE
	 * </p>
	 */
	public static McObfPair field_188119_a = McMappingDatabase.getSRG("field_188119_a");

	/**
	 * <p>
	 * Name: FALSE
	 * </p>
	 */
	public static McObfPair field_188120_b = McMappingDatabase.getSRG("field_188120_b");

}
