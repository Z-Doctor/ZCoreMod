package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Criterion {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "n";
		else
			return "net/minecraft/advancements/Criterion";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "n";
		else
			return "Criterion";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ln;";
		else
			return "Lnet/minecraft/advancements/Criterion;";
	}

	/**
	 * <p>
	 * Name: criteriaFromNetwork
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_192142_c = McMappingDatabase.getSRG("Criterion.func_192142_c");

	/**
	 * <p>
	 * Name: criterionFromNetwork
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)Lnet/minecraft/advancements/Criterion;]
	 * </p>
	 */
	public static McObfPair func_192146_b = McMappingDatabase.getSRG("Criterion.func_192146_b");

	/**
	 * <p>
	 * Name: serializeToNetwork
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_192140_a = McMappingDatabase.getSRG("Criterion.func_192140_a");

	/**
	 * <p>
	 * Name: serializeToNetwork
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_192141_a = McMappingDatabase.getSRG("Criterion.func_192141_a");

	/**
	 * <p>
	 * Name: getCriterionInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/ICriterionInstance;]
	 * </p>
	 */
	public static McObfPair func_192143_a = McMappingDatabase.getSRG("Criterion.func_192143_a");

	/**
	 * <p>
	 * Name: criteriaFromJson
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_192144_b = McMappingDatabase.getSRG("Criterion.func_192144_b");

	/**
	 * <p>
	 * Name: criterionFromJson
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/Criterion;]
	 * </p>
	 */
	public static McObfPair func_192145_a = McMappingDatabase.getSRG("Criterion.func_192145_a");

	/**
	 * <p>
	 * Name: criterionInstance
	 * </p>
	 */
	public static McObfPair field_192147_a = McMappingDatabase.getSRG("field_192147_a");

}
