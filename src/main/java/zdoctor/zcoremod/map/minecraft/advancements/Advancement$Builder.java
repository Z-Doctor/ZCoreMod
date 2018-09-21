package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Advancement$Builder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "i$a";
		else
			return "net/minecraft/advancements/Advancement$Builder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "i$a";
		else
			return "Advancement$Builder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Li$a;";
		else
			return "Lnet/minecraft/advancements/Advancement$Builder;";
	}

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/Advancement$Builder;]
	 * </p>
	 */
	public static McObfPair func_192059_a = McMappingDatabase.getSRG("Advancement$Builder.func_192059_a");

	/**
	 * <p>
	 * Name: build
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/advancements/Advancement;]
	 * </p>
	 */
	public static McObfPair func_192056_a = McMappingDatabase.getSRG("Advancement$Builder.func_192056_a");

	/**
	 * <p>
	 * Name: writeTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_192057_a = McMappingDatabase.getSRG("Advancement$Builder.func_192057_a");

	/**
	 * <p>
	 * Name: display
	 * </p>
	 */
	public static McObfPair field_192063_c = McMappingDatabase.getSRG("field_192063_c");

	/**
	 * <p>
	 * Name: readFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)Lnet/minecraft/advancements/Advancement$Builder;]
	 * </p>
	 */
	public static McObfPair func_192060_b = McMappingDatabase.getSRG("Advancement$Builder.func_192060_b");

	/**
	 * <p>
	 * Name: resolveParent
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/function/Function;)Z]
	 * </p>
	 */
	public static McObfPair func_192058_a = McMappingDatabase.getSRG("Advancement$Builder.func_192058_a");

	/**
	 * <p>
	 * Name: requirements
	 * </p>
	 */
	public static McObfPair field_192066_f = McMappingDatabase.getSRG("field_192066_f");

	/**
	 * <p>
	 * Name: parent
	 * </p>
	 */
	public static McObfPair field_192062_b = McMappingDatabase.getSRG("field_192062_b");

	/**
	 * <p>
	 * Name: criteria
	 * </p>
	 */
	public static McObfPair field_192065_e = McMappingDatabase.getSRG("field_192065_e");

	/**
	 * <p>
	 * Name: rewards
	 * </p>
	 */
	public static McObfPair field_192064_d = McMappingDatabase.getSRG("field_192064_d");

	/**
	 * <p>
	 * Name: parentId
	 * </p>
	 */
	public static McObfPair field_192061_a = McMappingDatabase.getSRG("field_192061_a");

}
