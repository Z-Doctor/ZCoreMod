package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DistancePredicate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ad";
		else
			return "net/minecraft/advancements/critereon/DistancePredicate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ad";
		else
			return "DistancePredicate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lad;";
		else
			return "Lnet/minecraft/advancements/critereon/DistancePredicate;";
	}

	/**
	 * <p>
	 * Name: horizontal
	 * </p>
	 */
	public static McObfPair field_193427_e = McMappingDatabase.getSRG("field_193427_e");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_193425_c = McMappingDatabase.getSRG("field_193425_c");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(DDDDDD)Z]
	 * </p>
	 */
	public static McObfPair func_193422_a = McMappingDatabase.getSRG("DistancePredicate.func_193422_a");

	/**
	 * <p>
	 * Name: absolute
	 * </p>
	 */
	public static McObfPair field_193428_f = McMappingDatabase.getSRG("field_193428_f");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_193424_b = McMappingDatabase.getSRG("field_193424_b");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_193426_d = McMappingDatabase.getSRG("field_193426_d");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Lnet/minecraft/advancements/critereon/DistancePredicate;]
	 * </p>
	 */
	public static McObfPair func_193421_a = McMappingDatabase.getSRG("DistancePredicate.func_193421_a");

	/**
	 * <p>
	 * Name: ANY
	 * </p>
	 */
	public static McObfPair field_193423_a = McMappingDatabase.getSRG("field_193423_a");

}
