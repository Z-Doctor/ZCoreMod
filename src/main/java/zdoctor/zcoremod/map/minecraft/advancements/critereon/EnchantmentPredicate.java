package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentPredicate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ag";
		else
			return "net/minecraft/advancements/critereon/EnchantmentPredicate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ag";
		else
			return "EnchantmentPredicate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lag;";
		else
			return "Lnet/minecraft/advancements/critereon/EnchantmentPredicate;";
	}

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Z]
	 * </p>
	 */
	public static McObfPair func_192463_a = McMappingDatabase.getSRG("EnchantmentPredicate.func_192463_a");

	/**
	 * <p>
	 * Name: deserializeArray
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)[Lnet/minecraft/advancements/critereon/EnchantmentPredicate;]
	 * </p>
	 */
	public static McObfPair func_192465_b = McMappingDatabase.getSRG("EnchantmentPredicate.func_192465_b");

	/**
	 * <p>
	 * Name: ANY
	 * </p>
	 */
	public static McObfPair field_192466_a = McMappingDatabase.getSRG("field_192466_a");

	/**
	 * <p>
	 * Name: levels
	 * </p>
	 */
	public static McObfPair field_192468_c = McMappingDatabase.getSRG("field_192468_c");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Lnet/minecraft/advancements/critereon/EnchantmentPredicate;]
	 * </p>
	 */
	public static McObfPair func_192464_a = McMappingDatabase.getSRG("EnchantmentPredicate.func_192464_a");

	/**
	 * <p>
	 * Name: enchantment
	 * </p>
	 */
	public static McObfPair field_192467_b = McMappingDatabase.getSRG("field_192467_b");

}
