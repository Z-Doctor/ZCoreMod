package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DamageSourcePredicate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ac";
		else
			return "net/minecraft/advancements/critereon/DamageSourcePredicate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ac";
		else
			return "DamageSourcePredicate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lac;";
		else
			return "Lnet/minecraft/advancements/critereon/DamageSourcePredicate;";
	}

	/**
	 * <p>
	 * Name: ANY
	 * </p>
	 */
	public static McObfPair field_192449_a = McMappingDatabase.getSRG("field_192449_a");

	/**
	 * <p>
	 * Name: isMagic
	 * </p>
	 */
	public static McObfPair field_192456_h = McMappingDatabase.getSRG("field_192456_h");

	/**
	 * <p>
	 * Name: directEntity
	 * </p>
	 */
	public static McObfPair field_193419_i = McMappingDatabase.getSRG("field_193419_i");

	/**
	 * <p>
	 * Name: bypassesInvulnerability
	 * </p>
	 */
	public static McObfPair field_192453_e = McMappingDatabase.getSRG("field_192453_e");

	/**
	 * <p>
	 * Name: bypassesArmor
	 * </p>
	 */
	public static McObfPair field_192452_d = McMappingDatabase.getSRG("field_192452_d");

	/**
	 * <p>
	 * Name: sourceEntity
	 * </p>
	 */
	public static McObfPair field_193420_j = McMappingDatabase.getSRG("field_193420_j");

	/**
	 * <p>
	 * Name: bypassesMagic
	 * </p>
	 */
	public static McObfPair field_192454_f = McMappingDatabase.getSRG("field_192454_f");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/util/DamageSource;)Z]
	 * </p>
	 */
	public static McObfPair func_193418_a = McMappingDatabase.getSRG("DamageSourcePredicate.func_193418_a");

	/**
	 * <p>
	 * Name: isProjectile
	 * </p>
	 */
	public static McObfPair field_192450_b = McMappingDatabase.getSRG("field_192450_b");

	/**
	 * <p>
	 * Name: isExplosion
	 * </p>
	 */
	public static McObfPair field_192451_c = McMappingDatabase.getSRG("field_192451_c");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Lnet/minecraft/advancements/critereon/DamageSourcePredicate;]
	 * </p>
	 */
	public static McObfPair func_192447_a = McMappingDatabase.getSRG("DamageSourcePredicate.func_192447_a");

	/**
	 * <p>
	 * Name: isFire
	 * </p>
	 */
	public static McObfPair field_192455_g = McMappingDatabase.getSRG("field_192455_g");

	/**
	 * <p>
	 * Name: optionalBoolean
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/Boolean;]
	 * </p>
	 */
	public static McObfPair func_192448_a = McMappingDatabase.getSRG("DamageSourcePredicate.func_192448_a");

}
