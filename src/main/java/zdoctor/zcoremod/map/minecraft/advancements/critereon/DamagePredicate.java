package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DamagePredicate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ab";
		else
			return "net/minecraft/advancements/critereon/DamagePredicate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ab";
		else
			return "DamagePredicate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lab;";
		else
			return "Lnet/minecraft/advancements/critereon/DamagePredicate;";
	}

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_192371_f = McMappingDatabase.getSRG("field_192371_f");

	/**
	 * <p>
	 * Name: sourceEntity
	 * </p>
	 */
	public static McObfPair field_192369_d = McMappingDatabase.getSRG("field_192369_d");

	/**
	 * <p>
	 * Name: blocked
	 * </p>
	 */
	public static McObfPair field_192370_e = McMappingDatabase.getSRG("field_192370_e");

	/**
	 * <p>
	 * Name: dealt
	 * </p>
	 */
	public static McObfPair field_192367_b = McMappingDatabase.getSRG("field_192367_b");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/util/DamageSource;FFZ)Z]
	 * </p>
	 */
	public static McObfPair func_192365_a = McMappingDatabase.getSRG("DamagePredicate.func_192365_a");

	/**
	 * <p>
	 * Name: ANY
	 * </p>
	 */
	public static McObfPair field_192366_a = McMappingDatabase.getSRG("field_192366_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Lnet/minecraft/advancements/critereon/DamagePredicate;]
	 * </p>
	 */
	public static McObfPair func_192364_a = McMappingDatabase.getSRG("DamagePredicate.func_192364_a");

	/**
	 * <p>
	 * Name: taken
	 * </p>
	 */
	public static McObfPair field_192368_c = McMappingDatabase.getSRG("field_192368_c");

}
