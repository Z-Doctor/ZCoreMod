package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MinMaxBounds {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "as";
		else
			return "net/minecraft/advancements/critereon/MinMaxBounds";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "as";
		else
			return "MinMaxBounds";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Las;";
		else
			return "Lnet/minecraft/advancements/critereon/MinMaxBounds;";
	}

	/**
	 * <p>
	 * Name: min
	 * </p>
	 */
	public static McObfPair field_192517_b = McMappingDatabase.getSRG("field_192517_b");

	/**
	 * <p>
	 * Name: testSquare
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_192513_a = McMappingDatabase.getSRG("MinMaxBounds.func_192513_a");

	/**
	 * <p>
	 * Name: max
	 * </p>
	 */
	public static McObfPair field_192518_c = McMappingDatabase.getSRG("field_192518_c");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(F)Z]
	 * </p>
	 */
	public static McObfPair func_192514_a = McMappingDatabase.getSRG("MinMaxBounds.func_192514_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Lnet/minecraft/advancements/critereon/MinMaxBounds;]
	 * </p>
	 */
	public static McObfPair func_192515_a = McMappingDatabase.getSRG("MinMaxBounds.func_192515_a");

	/**
	 * <p>
	 * Name: UNBOUNDED
	 * </p>
	 */
	public static McObfPair field_192516_a = McMappingDatabase.getSRG("field_192516_a");

}
