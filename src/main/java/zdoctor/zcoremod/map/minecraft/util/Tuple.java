package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Tuple {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rr";
		else
			return "net/minecraft/util/Tuple";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rr";
		else
			return "Tuple";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrr;";
		else
			return "Lnet/minecraft/util/Tuple;";
	}

	/**
	 * <p>
	 * Name: getSecond
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_76340_b = McMappingDatabase.getSRG("Tuple.func_76340_b");

	/**
	 * <p>
	 * Name: getFirst
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_76341_a = McMappingDatabase.getSRG("Tuple.func_76341_a");

}
