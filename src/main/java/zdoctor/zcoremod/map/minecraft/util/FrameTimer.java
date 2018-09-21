package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FrameTimer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rb";
		else
			return "net/minecraft/util/FrameTimer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rb";
		else
			return "FrameTimer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrb;";
		else
			return "Lnet/minecraft/util/FrameTimer;";
	}

	/**
	 * <p>
	 * Name: counter
	 * </p>
	 */
	public static McObfPair field_181754_c = McMappingDatabase.getSRG("field_181754_c");

	/**
	 * <p>
	 * Name: index
	 * </p>
	 */
	public static McObfPair field_181755_d = McMappingDatabase.getSRG("field_181755_d");

	/**
	 * <p>
	 * Name: parseIndex
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_181751_b = McMappingDatabase.getSRG("FrameTimer.func_181751_b");

	/**
	 * <p>
	 * Name: lastIndex
	 * </p>
	 */
	public static McObfPair field_181753_b = McMappingDatabase.getSRG("field_181753_b");

	/**
	 * <p>
	 * Name: addFrame
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_181747_a = McMappingDatabase.getSRG("FrameTimer.func_181747_a");

	/**
	 * <p>
	 * Name: getIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_181750_b = McMappingDatabase.getSRG("FrameTimer.func_181750_b");

	/**
	 * <p>
	 * Name: getFrames
	 * </p>
	 * <p>
	 * Desc: [()[J]
	 * </p>
	 */
	public static McObfPair func_181746_c = McMappingDatabase.getSRG("FrameTimer.func_181746_c");

	/**
	 * <p>
	 * Name: getLagometerValue
	 * </p>
	 * <p>
	 * Desc: [(JI)I]
	 * </p>
	 */
	public static McObfPair func_181748_a = McMappingDatabase.getSRG("FrameTimer.func_181748_a");

	/**
	 * <p>
	 * Name: frames
	 * </p>
	 */
	public static McObfPair field_181752_a = McMappingDatabase.getSRG("field_181752_a");

	/**
	 * <p>
	 * Name: getLastIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_181749_a = McMappingDatabase.getSRG("FrameTimer.func_181749_a");

}
