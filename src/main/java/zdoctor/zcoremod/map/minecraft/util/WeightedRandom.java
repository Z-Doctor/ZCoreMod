package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WeightedRandom {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rs";
		else
			return "net/minecraft/util/WeightedRandom";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rs";
		else
			return "WeightedRandom";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrs;";
		else
			return "Lnet/minecraft/util/WeightedRandom;";
	}

	/**
	 * <p>
	 * Name: getTotalWeight
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)I]
	 * </p>
	 */
	public static McObfPair func_76272_a = McMappingDatabase.getSRG("WeightedRandom.func_76272_a");

	/**
	 * <p>
	 * Name: getRandomItem
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Ljava/util/List;I)Lnet/minecraft/util/WeightedRandom$Item;]
	 * </p>
	 */
	public static McObfPair func_76273_a = McMappingDatabase.getSRG("WeightedRandom.func_76273_a");

	/**
	 * <p>
	 * Name: getRandomItem
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;I)Lnet/minecraft/util/WeightedRandom$Item;]
	 * </p>
	 */
	public static McObfPair func_180166_a = McMappingDatabase.getSRG("WeightedRandom.func_180166_a");

	/**
	 * <p>
	 * Name: getRandomItem
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Ljava/util/List;)Lnet/minecraft/util/WeightedRandom$Item;]
	 * </p>
	 */
	public static McObfPair func_76271_a = McMappingDatabase.getSRG("WeightedRandom.func_76271_a");

}
