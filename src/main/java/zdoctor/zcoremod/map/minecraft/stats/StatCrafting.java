package zdoctor.zcoremod.map.minecraft.stats;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StatCrafting {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qk";
		else
			return "net/minecraft/stats/StatCrafting";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qk";
		else
			return "StatCrafting";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqk;";
		else
			return "Lnet/minecraft/stats/StatCrafting;";
	}

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_150959_a = McMappingDatabase.getSRG("StatCrafting.func_150959_a");

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_150960_a = McMappingDatabase.getSRG("field_150960_a");

}
