package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Timer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bih";
		else
			return "net/minecraft/util/Timer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bih";
		else
			return "Timer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbih;";
		else
			return "Lnet/minecraft/util/Timer;";
	}

	/**
	 * <p>
	 * Name: updateTimer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74275_a = McMappingDatabase.getSRG("Timer.func_74275_a");

	/**
	 * <p>
	 * Name: elapsedPartialTicks
	 * </p>
	 */
	public static McObfPair field_194148_c = McMappingDatabase.getSRG("field_194148_c");

	/**
	 * <p>
	 * Name: lastSyncSysClock
	 * </p>
	 */
	public static McObfPair field_74277_g = McMappingDatabase.getSRG("field_74277_g");

	/**
	 * <p>
	 * Name: tickLength
	 * </p>
	 */
	public static McObfPair field_194149_e = McMappingDatabase.getSRG("field_194149_e");

	/**
	 * <p>
	 * Name: elapsedTicks
	 * </p>
	 */
	public static McObfPair field_74280_b = McMappingDatabase.getSRG("field_74280_b");

	/**
	 * <p>
	 * Name: renderPartialTicks
	 * </p>
	 */
	public static McObfPair field_194147_b = McMappingDatabase.getSRG("field_194147_b");

}
