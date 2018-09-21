package zdoctor.zcoremod.map.minecraft.profiler;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Profiler {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rl";
		else
			return "net/minecraft/profiler/Profiler";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rl";
		else
			return "Profiler";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrl;";
		else
			return "Lnet/minecraft/profiler/Profiler;";
	}

	/**
	 * <p>
	 * Name: startSection
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_76320_a = McMappingDatabase.getSRG("Profiler.func_76320_a");

	/**
	 * <p>
	 * Name: endStartSection
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_76318_c = McMappingDatabase.getSRG("Profiler.func_76318_c");

	/**
	 * <p>
	 * Name: profilingMap
	 * </p>
	 */
	public static McObfPair field_76324_e = McMappingDatabase.getSRG("field_76324_e");

	/**
	 * <p>
	 * Name: getNameOfLastSection
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_76322_c = McMappingDatabase.getSRG("Profiler.func_76322_c");

	/**
	 * <p>
	 * Name: profilingSection
	 * </p>
	 */
	public static McObfPair field_76323_d = McMappingDatabase.getSRG("field_76323_d");

	/**
	 * <p>
	 * Name: endSection
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76319_b = McMappingDatabase.getSRG("Profiler.func_76319_b");

	/**
	 * <p>
	 * Name: clearProfiling
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76317_a = McMappingDatabase.getSRG("Profiler.func_76317_a");

	/**
	 * <p>
	 * Name: profilingEnabled
	 * </p>
	 */
	public static McObfPair field_76327_a = McMappingDatabase.getSRG("field_76327_a");

	/**
	 * <p>
	 * Name: sectionList
	 * </p>
	 */
	public static McObfPair field_76325_b = McMappingDatabase.getSRG("field_76325_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151234_b = McMappingDatabase.getSRG("field_151234_b");

	/**
	 * <p>
	 * Name: getProfilingData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_76321_b = McMappingDatabase.getSRG("Profiler.func_76321_b");

	/**
	 * <p>
	 * Name: timestampList
	 * </p>
	 */
	public static McObfPair field_76326_c = McMappingDatabase.getSRG("field_76326_c");

}
