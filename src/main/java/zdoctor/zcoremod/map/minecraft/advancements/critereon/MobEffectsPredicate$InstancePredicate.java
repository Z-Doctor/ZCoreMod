package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MobEffectsPredicate$InstancePredicate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "at$a";
		else
			return "net/minecraft/advancements/critereon/MobEffectsPredicate$InstancePredicate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "at$a";
		else
			return "MobEffectsPredicate$InstancePredicate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lat$a;";
		else
			return "Lnet/minecraft/advancements/critereon/MobEffectsPredicate$InstancePredicate;";
	}

	/**
	 * <p>
	 * Name: ambient
	 * </p>
	 */
	public static McObfPair field_193467_c = McMappingDatabase.getSRG("field_193467_c");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)Z]
	 * </p>
	 */
	public static McObfPair func_193463_a = McMappingDatabase.getSRG("MobEffectsPredicate$InstancePredicate.func_193463_a");

	/**
	 * <p>
	 * Name: visible
	 * </p>
	 */
	public static McObfPair field_193468_d = McMappingDatabase.getSRG("field_193468_d");

	/**
	 * <p>
	 * Name: amplifier
	 * </p>
	 */
	public static McObfPair field_193465_a = McMappingDatabase.getSRG("field_193465_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/advancements/critereon/MobEffectsPredicate$InstancePredicate;]
	 * </p>
	 */
	public static McObfPair func_193464_a = McMappingDatabase.getSRG("MobEffectsPredicate$InstancePredicate.func_193464_a");

	/**
	 * <p>
	 * Name: duration
	 * </p>
	 */
	public static McObfPair field_193466_b = McMappingDatabase.getSRG("field_193466_b");

}
