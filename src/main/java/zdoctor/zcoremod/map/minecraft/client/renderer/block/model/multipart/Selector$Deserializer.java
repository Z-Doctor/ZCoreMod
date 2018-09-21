package zdoctor.zcoremod.map.minecraft.client.renderer.block.model.multipart;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Selector$Deserializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwk$a";
		else
			return "net/minecraft/client/renderer/block/model/multipart/Selector$Deserializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwk$a";
		else
			return "Selector$Deserializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwk$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/multipart/Selector$Deserializer;";
	}

	/**
	 * <p>
	 * Name: FUNCTION_OR_AND
	 * </p>
	 */
	public static McObfPair field_188163_a = McMappingDatabase.getSRG("field_188163_a");

	/**
	 * <p>
	 * Name: getOrAndCondition
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/client/renderer/block/model/multipart/ICondition;]
	 * </p>
	 */
	public static McObfPair func_188158_a = McMappingDatabase.getSRG("Selector$Deserializer.func_188158_a");

	/**
	 * <p>
	 * Name: FUNCTION_PROPERTY_VALUE
	 * </p>
	 */
	public static McObfPair field_188164_b = McMappingDatabase.getSRG("field_188164_b");

	/**
	 * <p>
	 * Name: makePropertyValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map$Entry;)Lnet/minecraft/client/renderer/block/model/multipart/ConditionPropertyValue;]
	 * </p>
	 */
	public static McObfPair func_188161_b = McMappingDatabase.getSRG("Selector$Deserializer.func_188161_b");

	/**
	 * <p>
	 * Name: getWhenCondition
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/client/renderer/block/model/multipart/ICondition;]
	 * </p>
	 */
	public static McObfPair func_188159_b = McMappingDatabase.getSRG("Selector$Deserializer.func_188159_b");

}
