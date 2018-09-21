package zdoctor.zcoremod.map.minecraft.client.renderer.block.model.multipart;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ConditionPropertyValue {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwh";
		else
			return "net/minecraft/client/renderer/block/model/multipart/ConditionPropertyValue";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwh";
		else
			return "ConditionPropertyValue";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwh;";
		else
			return "Lnet/minecraft/client/renderer/block/model/multipart/ConditionPropertyValue;";
	}

	/**
	 * <p>
	 * Name: SPLITTER
	 * </p>
	 */
	public static McObfPair field_188124_c = McMappingDatabase.getSRG("field_188124_c");

	/**
	 * <p>
	 * Name: key
	 * </p>
	 */
	public static McObfPair field_188125_d = McMappingDatabase.getSRG("field_188125_d");

	/**
	 * <p>
	 * Name: makePredicate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;Ljava/lang/String;)Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_188123_a = McMappingDatabase.getSRG("ConditionPropertyValue.func_188123_a");

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_188126_e = McMappingDatabase.getSRG("field_188126_e");

	/**
	 * <p>
	 * Name: getPredicate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/BlockStateContainer;)Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_188118_a = McMappingDatabase.getSRG("ConditionPropertyValue.func_188118_a");

}
