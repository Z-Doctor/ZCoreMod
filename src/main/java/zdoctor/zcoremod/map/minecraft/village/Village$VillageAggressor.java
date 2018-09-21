package zdoctor.zcoremod.map.minecraft.village;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Village$VillageAggressor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zo$a";
		else
			return "net/minecraft/village/Village$VillageAggressor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zo$a";
		else
			return "Village$VillageAggressor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzo$a;";
		else
			return "Lnet/minecraft/village/Village$VillageAggressor;";
	}

	/**
	 * <p>
	 * Name: agressionTime
	 * </p>
	 */
	public static McObfPair field_75590_b = McMappingDatabase.getSRG("field_75590_b");

	/**
	 * <p>
	 * Name: agressor
	 * </p>
	 */
	public static McObfPair field_75592_a = McMappingDatabase.getSRG("field_75592_a");

}
