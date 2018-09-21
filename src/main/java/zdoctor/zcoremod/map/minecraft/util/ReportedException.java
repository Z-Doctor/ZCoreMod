package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ReportedException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "f";
		else
			return "net/minecraft/util/ReportedException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "f";
		else
			return "ReportedException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lf;";
		else
			return "Lnet/minecraft/util/ReportedException;";
	}

	/**
	 * <p>
	 * Name: getCrashReport
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/crash/CrashReport;]
	 * </p>
	 */
	public static McObfPair func_71575_a = McMappingDatabase.getSRG("ReportedException.func_71575_a");

	/**
	 * <p>
	 * Name: crashReport
	 * </p>
	 */
	public static McObfPair field_71576_a = McMappingDatabase.getSRG("field_71576_a");

}
