package zdoctor.zcoremod.map.minecraft.crash;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ICrashReportDetail {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "d";
		else
			return "net/minecraft/crash/ICrashReportDetail";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "d";
		else
			return "ICrashReportDetail";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ld;";
		else
			return "Lnet/minecraft/crash/ICrashReportDetail;";
	}

}
