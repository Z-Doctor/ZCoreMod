package zdoctor.zcoremod.map.minecraft.client.renderer.block.model.multipart;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ICondition$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwg$1";
		else
			return "net/minecraft/client/renderer/block/model/multipart/ICondition$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwg$1";
		else
			return "ICondition$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwg$1;";
		else
			return "Lnet/minecraft/client/renderer/block/model/multipart/ICondition$1;";
	}

	/**
	 * <p>
	 * Name: getPredicate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/BlockStateContainer;)Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_188118_a = McMappingDatabase.getSRG("ICondition$1.func_188118_a");

}
