package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WeightedRandom$Item {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rs$a";
		else
			return "net/minecraft/util/WeightedRandom$Item";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rs$a";
		else
			return "WeightedRandom$Item";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrs$a;";
		else
			return "Lnet/minecraft/util/WeightedRandom$Item;";
	}

	/**
	 * <p>
	 * Name: itemWeight
	 * </p>
	 */
	public static McObfPair field_76292_a = McMappingDatabase.getSRG("field_76292_a");

}
