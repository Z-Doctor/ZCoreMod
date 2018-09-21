package zdoctor.zcoremod.map.minecraft.crash;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CrashReportCategory$Entry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "c$a";
		else
			return "net/minecraft/crash/CrashReportCategory$Entry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "c$a";
		else
			return "CrashReportCategory$Entry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lc$a;";
		else
			return "Lnet/minecraft/crash/CrashReportCategory$Entry;";
	}

	/**
	 * <p>
	 * Name: key
	 * </p>
	 */
	public static McObfPair field_85092_a = McMappingDatabase.getSRG("field_85092_a");

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_85091_b = McMappingDatabase.getSRG("field_85091_b");

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_85090_b = McMappingDatabase.getSRG("CrashReportCategory$Entry.func_85090_b");

	/**
	 * <p>
	 * Name: getKey
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_85089_a = McMappingDatabase.getSRG("CrashReportCategory$Entry.func_85089_a");

}
