package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RandomValueRange {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfw";
		else
			return "net/minecraft/world/storage/loot/RandomValueRange";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfw";
		else
			return "RandomValueRange";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfw;";
		else
			return "Lnet/minecraft/world/storage/loot/RandomValueRange;";
	}

	/**
	 * <p>
	 * Name: getMin
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_186509_a = McMappingDatabase.getSRG("RandomValueRange.func_186509_a");

	/**
	 * <p>
	 * Name: generateInt
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_186511_a = McMappingDatabase.getSRG("RandomValueRange.func_186511_a");

	/**
	 * <p>
	 * Name: min
	 * </p>
	 */
	public static McObfPair field_186514_a = McMappingDatabase.getSRG("field_186514_a");

	/**
	 * <p>
	 * Name: getMax
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_186512_b = McMappingDatabase.getSRG("RandomValueRange.func_186512_b");

	/**
	 * <p>
	 * Name: generateFloat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)F]
	 * </p>
	 */
	public static McObfPair func_186507_b = McMappingDatabase.getSRG("RandomValueRange.func_186507_b");

	/**
	 * <p>
	 * Name: max
	 * </p>
	 */
	public static McObfPair field_186515_b = McMappingDatabase.getSRG("field_186515_b");

	/**
	 * <p>
	 * Name: isInRange
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_186510_a = McMappingDatabase.getSRG("RandomValueRange.func_186510_a");

}
