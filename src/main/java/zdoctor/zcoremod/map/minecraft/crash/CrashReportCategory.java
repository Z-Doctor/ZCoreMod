package zdoctor.zcoremod.map.minecraft.crash;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CrashReportCategory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "c";
		else
			return "net/minecraft/crash/CrashReportCategory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "c";
		else
			return "CrashReportCategory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lc;";
		else
			return "Lnet/minecraft/crash/CrashReportCategory;";
	}

	/**
	 * <p>
	 * Name: addCrashSection
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_71507_a = McMappingDatabase.getSRG("CrashReportCategory.func_71507_a");

	/**
	 * <p>
	 * Name: addDetail
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/crash/ICrashReportDetail;)V]
	 * </p>
	 */
	public static McObfPair func_189529_a = McMappingDatabase.getSRG("CrashReportCategory.func_189529_a");

	/**
	 * <p>
	 * Name: getStackTrace
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/StackTraceElement;]
	 * </p>
	 */
	public static McObfPair func_147152_a = McMappingDatabase.getSRG("CrashReportCategory.func_147152_a");

	/**
	 * <p>
	 * Name: firstTwoElementsOfStackTraceMatch
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/StackTraceElement;Ljava/lang/StackTraceElement;)Z]
	 * </p>
	 */
	public static McObfPair func_85069_a = McMappingDatabase.getSRG("CrashReportCategory.func_85069_a");

	/**
	 * <p>
	 * Name: addCrashSectionThrowable
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Throwable;)V]
	 * </p>
	 */
	public static McObfPair func_71499_a = McMappingDatabase.getSRG("CrashReportCategory.func_71499_a");

	/**
	 * <p>
	 * Name: getCoordinateInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_180522_a = McMappingDatabase.getSRG("CrashReportCategory.func_180522_a");

	/**
	 * <p>
	 * Name: getCoordinateInfo
	 * </p>
	 * <p>
	 * Desc: [(DDD)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_85074_a = McMappingDatabase.getSRG("CrashReportCategory.func_85074_a");

	/**
	 * <p>
	 * Name: getPrunedStackTrace
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_85073_a = McMappingDatabase.getSRG("CrashReportCategory.func_85073_a");

	/**
	 * <p>
	 * Name: addBlockInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReportCategory;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;I)V]
	 * </p>
	 */
	public static McObfPair func_180523_a = McMappingDatabase.getSRG("CrashReportCategory.func_180523_a");

	/**
	 * <p>
	 * Name: addBlockInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReportCategory;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_175750_a = McMappingDatabase.getSRG("CrashReportCategory.func_175750_a");

	/**
	 * <p>
	 * Name: children
	 * </p>
	 */
	public static McObfPair field_85077_c = McMappingDatabase.getSRG("field_85077_c");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_85076_b = McMappingDatabase.getSRG("field_85076_b");

	/**
	 * <p>
	 * Name: trimStackTraceEntriesFromBottom
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_85070_b = McMappingDatabase.getSRG("CrashReportCategory.func_85070_b");

	/**
	 * <p>
	 * Name: getCoordinateInfo
	 * </p>
	 * <p>
	 * Desc: [(III)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_184876_a = McMappingDatabase.getSRG("CrashReportCategory.func_184876_a");

	/**
	 * <p>
	 * Name: stackTrace
	 * </p>
	 */
	public static McObfPair field_85075_d = McMappingDatabase.getSRG("field_85075_d");

	/**
	 * <p>
	 * Name: appendToStringBuilder
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/StringBuilder;)V]
	 * </p>
	 */
	public static McObfPair func_85072_a = McMappingDatabase.getSRG("CrashReportCategory.func_85072_a");

	/**
	 * <p>
	 * Name: crashReport
	 * </p>
	 */
	public static McObfPair field_85078_a = McMappingDatabase.getSRG("field_85078_a");

}
