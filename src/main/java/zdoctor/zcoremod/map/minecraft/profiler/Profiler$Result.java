package zdoctor.zcoremod.map.minecraft.profiler;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Profiler$Result {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rl$a";
		else
			return "net/minecraft/profiler/Profiler$Result";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rl$a";
		else
			return "Profiler$Result";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrl$a;";
		else
			return "Lnet/minecraft/profiler/Profiler$Result;";
	}

	/**
	 * <p>
	 * Name: totalUsePercentage
	 * </p>
	 */
	public static McObfPair field_76330_b = McMappingDatabase.getSRG("field_76330_b");

	/**
	 * <p>
	 * Name: profilerName
	 * </p>
	 */
	public static McObfPair field_76331_c = McMappingDatabase.getSRG("field_76331_c");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76329_a = McMappingDatabase.getSRG("Profiler$Result.func_76329_a");

	/**
	 * <p>
	 * Name: usePercentage
	 * </p>
	 */
	public static McObfPair field_76332_a = McMappingDatabase.getSRG("field_76332_a");

}
