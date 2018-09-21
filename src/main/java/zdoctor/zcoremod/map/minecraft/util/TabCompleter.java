package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TabCompleter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blq";
		else
			return "net/minecraft/util/TabCompleter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blq";
		else
			return "TabCompleter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblq;";
		else
			return "Lnet/minecraft/util/TabCompleter;";
	}

	/**
	 * <p>
	 * Name: didComplete
	 * </p>
	 */
	public static McObfPair field_186846_c = McMappingDatabase.getSRG("field_186846_c");

	/**
	 * <p>
	 * Name: setCompletions
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_186840_a = McMappingDatabase.getSRG("TabCompleter.func_186840_a");

	/**
	 * <p>
	 * Name: resetRequested
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186843_d = McMappingDatabase.getSRG("TabCompleter.func_186843_d");

	/**
	 * <p>
	 * Name: completions
	 * </p>
	 */
	public static McObfPair field_186849_f = McMappingDatabase.getSRG("field_186849_f");

	/**
	 * <p>
	 * Name: textField
	 * </p>
	 */
	public static McObfPair field_186844_a = McMappingDatabase.getSRG("field_186844_a");

	/**
	 * <p>
	 * Name: requestedCompletions
	 * </p>
	 */
	public static McObfPair field_186847_d = McMappingDatabase.getSRG("field_186847_d");

	/**
	 * <p>
	 * Name: getTargetBlockPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_186839_b = McMappingDatabase.getSRG("TabCompleter.func_186839_b");

	/**
	 * <p>
	 * Name: complete
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186841_a = McMappingDatabase.getSRG("TabCompleter.func_186841_a");

	/**
	 * <p>
	 * Name: requestCompletions
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_186838_a = McMappingDatabase.getSRG("TabCompleter.func_186838_a");

	/**
	 * <p>
	 * Name: resetDidComplete
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186842_c = McMappingDatabase.getSRG("TabCompleter.func_186842_c");

	/**
	 * <p>
	 * Name: hasTargetBlock
	 * </p>
	 */
	public static McObfPair field_186845_b = McMappingDatabase.getSRG("field_186845_b");

	/**
	 * <p>
	 * Name: completionIdx
	 * </p>
	 */
	public static McObfPair field_186848_e = McMappingDatabase.getSRG("field_186848_e");

}
