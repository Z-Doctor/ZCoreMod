package zdoctor.zcoremod.map.minecraft.stats;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StatBasic {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qj";
		else
			return "net/minecraft/stats/StatBasic";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qj";
		else
			return "StatBasic";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqj;";
		else
			return "Lnet/minecraft/stats/StatBasic;";
	}

	/**
	 * <p>
	 * Name: registerStat
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/stats/StatBase;]
	 * </p>
	 */
	public static McObfPair func_75971_g = McMappingDatabase.getSRG("StatBasic.func_75971_g");

}
