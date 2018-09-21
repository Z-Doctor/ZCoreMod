package zdoctor.zcoremod.map.minecraft.crash;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CrashReportCategory$6 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "c$6";
		else
			return "net/minecraft/crash/CrashReportCategory$6";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "c$6";
		else
			return "CrashReportCategory$6";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lc$6;";
		else
			return "Lnet/minecraft/crash/CrashReportCategory$6;";
	}

}
