package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Util {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "h";
		else
			return "net/minecraft/util/Util";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "h";
		else
			return "Util";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lh;";
		else
			return "Lnet/minecraft/util/Util;";
	}

	/**
	 * <p>
	 * Name: getOSType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/Util$EnumOS;]
	 * </p>
	 */
	public static McObfPair func_110647_a = McMappingDatabase.getSRG("Util.func_110647_a");

	/**
	 * <p>
	 * Name: getLastElement
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_184878_a = McMappingDatabase.getSRG("Util.func_184878_a");

	/**
	 * <p>
	 * Name: runTask
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/concurrent/FutureTask;Lorg/apache/logging/log4j/Logger;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_181617_a = McMappingDatabase.getSRG("Util.func_181617_a");

}
