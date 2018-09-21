package zdoctor.zcoremod.map.minecraft.crash;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CrashReport {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "b";
		else
			return "net/minecraft/crash/CrashReport";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "b";
		else
			return "CrashReport";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lb;";
		else
			return "Lnet/minecraft/crash/CrashReport;";
	}

	/**
	 * <p>
	 * Name: getCauseStackTraceOrString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71498_d = McMappingDatabase.getSRG("CrashReport.func_71498_d");

	/**
	 * <p>
	 * Name: crashReportSections
	 * </p>
	 */
	public static McObfPair field_71512_c = McMappingDatabase.getSRG("field_71512_c");

	/**
	 * <p>
	 * Name: firstCategoryInCrashReport
	 * </p>
	 */
	public static McObfPair field_85059_f = McMappingDatabase.getSRG("field_85059_f");

	/**
	 * <p>
	 * Name: getCrashCause
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Throwable;]
	 * </p>
	 */
	public static McObfPair func_71505_b = McMappingDatabase.getSRG("CrashReport.func_71505_b");

	/**
	 * <p>
	 * Name: populateEnvironment
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71504_g = McMappingDatabase.getSRG("CrashReport.func_71504_g");

	/**
	 * <p>
	 * Name: makeCategory
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/crash/CrashReportCategory;]
	 * </p>
	 */
	public static McObfPair func_85058_a = McMappingDatabase.getSRG("CrashReport.func_85058_a");

	/**
	 * <p>
	 * Name: cause
	 * </p>
	 */
	public static McObfPair field_71511_b = McMappingDatabase.getSRG("field_71511_b");

	/**
	 * <p>
	 * Name: systemDetailsCategory
	 * </p>
	 */
	public static McObfPair field_85061_c = McMappingDatabase.getSRG("field_85061_c");

	/**
	 * <p>
	 * Name: getCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/crash/CrashReportCategory;]
	 * </p>
	 */
	public static McObfPair func_85056_g = McMappingDatabase.getSRG("CrashReport.func_85056_g");

	/**
	 * <p>
	 * Name: getCompleteReport
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71502_e = McMappingDatabase.getSRG("CrashReport.func_71502_e");

	/**
	 * <p>
	 * Name: getDescription
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71501_a = McMappingDatabase.getSRG("CrashReport.func_71501_a");

	/**
	 * <p>
	 * Name: makeCrashReport
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Throwable;Ljava/lang/String;)Lnet/minecraft/crash/CrashReport;]
	 * </p>
	 */
	public static McObfPair func_85055_a = McMappingDatabase.getSRG("CrashReport.func_85055_a");

	/**
	 * <p>
	 * Name: saveToFile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;)Z]
	 * </p>
	 */
	public static McObfPair func_147149_a = McMappingDatabase.getSRG("CrashReport.func_147149_a");

	/**
	 * <p>
	 * Name: makeCategoryDepth
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)Lnet/minecraft/crash/CrashReportCategory;]
	 * </p>
	 */
	public static McObfPair func_85057_a = McMappingDatabase.getSRG("CrashReport.func_85057_a");

	/**
	 * <p>
	 * Name: getSectionsInStringBuilder
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/StringBuilder;)V]
	 * </p>
	 */
	public static McObfPair func_71506_a = McMappingDatabase.getSRG("CrashReport.func_71506_a");

	/**
	 * <p>
	 * Name: stacktrace
	 * </p>
	 */
	public static McObfPair field_85060_g = McMappingDatabase.getSRG("field_85060_g");

	/**
	 * <p>
	 * Name: description
	 * </p>
	 */
	public static McObfPair field_71513_a = McMappingDatabase.getSRG("field_71513_a");

	/**
	 * <p>
	 * Name: getWittyComment
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71503_h = McMappingDatabase.getSRG("CrashReport.func_71503_h");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147150_a = McMappingDatabase.getSRG("field_147150_a");

	/**
	 * <p>
	 * Name: crashReportFile
	 * </p>
	 */
	public static McObfPair field_71510_d = McMappingDatabase.getSRG("field_71510_d");

	/**
	 * <p>
	 * Name: getFile
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_71497_f = McMappingDatabase.getSRG("CrashReport.func_71497_f");

}
