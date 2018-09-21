package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MobEffectsPredicate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "at";
		else
			return "net/minecraft/advancements/critereon/MobEffectsPredicate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "at";
		else
			return "MobEffectsPredicate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lat;";
		else
			return "Lnet/minecraft/advancements/critereon/MobEffectsPredicate;";
	}

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Z]
	 * </p>
	 */
	public static McObfPair func_193470_a = McMappingDatabase.getSRG("MobEffectsPredicate.func_193470_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_193472_a = McMappingDatabase.getSRG("MobEffectsPredicate.func_193472_a");

	/**
	 * <p>
	 * Name: ANY
	 * </p>
	 */
	public static McObfPair field_193473_a = McMappingDatabase.getSRG("field_193473_a");

	/**
	 * <p>
	 * Name: effects
	 * </p>
	 */
	public static McObfPair field_193474_b = McMappingDatabase.getSRG("field_193474_b");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_193469_a = McMappingDatabase.getSRG("MobEffectsPredicate.func_193469_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Lnet/minecraft/advancements/critereon/MobEffectsPredicate;]
	 * </p>
	 */
	public static McObfPair func_193471_a = McMappingDatabase.getSRG("MobEffectsPredicate.func_193471_a");

}
