package zdoctor.zcoremod.map.minecraft.profiler;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ISnooperInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "um";
		else
			return "net/minecraft/profiler/ISnooperInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "um";
		else
			return "ISnooperInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lum;";
		else
			return "Lnet/minecraft/profiler/ISnooperInfo;";
	}

	/**
	 * <p>
	 * Name: addServerTypeToSnooper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/profiler/Snooper;)V]
	 * </p>
	 */
	public static McObfPair func_70001_b = McMappingDatabase.getSRG("ISnooperInfo.func_70001_b");

	/**
	 * <p>
	 * Name: addServerStatsToSnooper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/profiler/Snooper;)V]
	 * </p>
	 */
	public static McObfPair func_70000_a = McMappingDatabase.getSRG("ISnooperInfo.func_70000_a");

	/**
	 * <p>
	 * Name: isSnooperEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70002_Q = McMappingDatabase.getSRG("ISnooperInfo.func_70002_Q");

}
