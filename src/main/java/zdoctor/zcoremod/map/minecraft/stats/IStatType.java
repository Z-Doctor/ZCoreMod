package zdoctor.zcoremod.map.minecraft.stats;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IStatType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qp";
		else
			return "net/minecraft/stats/IStatType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qp";
		else
			return "IStatType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqp;";
		else
			return "Lnet/minecraft/stats/IStatType;";
	}

	/**
	 * <p>
	 * Name: format
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_75843_a = McMappingDatabase.getSRG("IStatType.func_75843_a");

}
