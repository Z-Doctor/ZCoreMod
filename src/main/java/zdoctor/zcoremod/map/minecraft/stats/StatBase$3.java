package zdoctor.zcoremod.map.minecraft.stats;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StatBase$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qo$3";
		else
			return "net/minecraft/stats/StatBase$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qo$3";
		else
			return "StatBase$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqo$3;";
		else
			return "Lnet/minecraft/stats/StatBase$3;";
	}

	/**
	 * <p>
	 * Name: format
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_75843_a = McMappingDatabase.getSRG("StatBase$3.func_75843_a");

}
