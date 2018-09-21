package zdoctor.zcoremod.map.minecraft.potion;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PotionHelper$MixPredicate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akh$a";
		else
			return "net/minecraft/potion/PotionHelper$MixPredicate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akh$a";
		else
			return "PotionHelper$MixPredicate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakh$a;";
		else
			return "Lnet/minecraft/potion/PotionHelper$MixPredicate;";
	}

	/**
	 * <p>
	 * Name: input
	 * </p>
	 */
	public static McObfPair field_185198_a = McMappingDatabase.getSRG("field_185198_a");

	/**
	 * <p>
	 * Name: reagent
	 * </p>
	 */
	public static McObfPair field_185199_b = McMappingDatabase.getSRG("field_185199_b");

	/**
	 * <p>
	 * Name: output
	 * </p>
	 */
	public static McObfPair field_185200_c = McMappingDatabase.getSRG("field_185200_c");

}
