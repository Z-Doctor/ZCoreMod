package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LazyLoadBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rh";
		else
			return "net/minecraft/util/LazyLoadBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rh";
		else
			return "LazyLoadBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrh;";
		else
			return "Lnet/minecraft/util/LazyLoadBase;";
	}

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_179281_c = McMappingDatabase.getSRG("LazyLoadBase.func_179281_c");

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_179283_a = McMappingDatabase.getSRG("field_179283_a");

	/**
	 * <p>
	 * Name: load
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_179280_b = McMappingDatabase.getSRG("LazyLoadBase.func_179280_b");

	/**
	 * <p>
	 * Name: isLoaded
	 * </p>
	 */
	public static McObfPair field_179282_b = McMappingDatabase.getSRG("field_179282_b");

}
