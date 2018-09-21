package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LocationPredicate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aq";
		else
			return "net/minecraft/advancements/critereon/LocationPredicate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aq";
		else
			return "LocationPredicate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laq;";
		else
			return "Lnet/minecraft/advancements/critereon/LocationPredicate;";
	}

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_193458_d = McMappingDatabase.getSRG("field_193458_d");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldServer;DDD)Z]
	 * </p>
	 */
	public static McObfPair func_193452_a = McMappingDatabase.getSRG("LocationPredicate.func_193452_a");

	/**
	 * <p>
	 * Name: ANY
	 * </p>
	 */
	public static McObfPair field_193455_a = McMappingDatabase.getSRG("field_193455_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Lnet/minecraft/advancements/critereon/LocationPredicate;]
	 * </p>
	 */
	public static McObfPair func_193454_a = McMappingDatabase.getSRG("LocationPredicate.func_193454_a");

	/**
	 * <p>
	 * Name: feature
	 * </p>
	 */
	public static McObfPair field_193460_f = McMappingDatabase.getSRG("field_193460_f");

	/**
	 * <p>
	 * Name: biome
	 * </p>
	 */
	public static McObfPair field_193456_b = McMappingDatabase.getSRG("field_193456_b");

	/**
	 * <p>
	 * Name: dimension
	 * </p>
	 */
	public static McObfPair field_193461_g = McMappingDatabase.getSRG("field_193461_g");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_193457_c = McMappingDatabase.getSRG("field_193457_c");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_193459_e = McMappingDatabase.getSRG("field_193459_e");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldServer;FFF)Z]
	 * </p>
	 */
	public static McObfPair func_193453_a = McMappingDatabase.getSRG("LocationPredicate.func_193453_a");

}
