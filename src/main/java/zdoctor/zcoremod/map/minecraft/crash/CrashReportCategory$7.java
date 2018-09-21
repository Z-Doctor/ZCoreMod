package zdoctor.zcoremod.map.minecraft.crash;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CrashReportCategory$7 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "c$7";
		else
			return "net/minecraft/crash/CrashReportCategory$7";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "c$7";
		else
			return "CrashReportCategory$7";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lc$7;";
		else
			return "Lnet/minecraft/crash/CrashReportCategory$7;";
	}

}
