package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AnimationFrame {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfh";
		else
			return "net/minecraft/client/resources/data/AnimationFrame";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfh";
		else
			return "AnimationFrame";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfh;";
		else
			return "Lnet/minecraft/client/resources/data/AnimationFrame;";
	}

	/**
	 * <p>
	 * Name: getFrameIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110496_c = McMappingDatabase.getSRG("AnimationFrame.func_110496_c");

	/**
	 * <p>
	 * Name: frameTime
	 * </p>
	 */
	public static McObfPair field_110498_b = McMappingDatabase.getSRG("field_110498_b");

	/**
	 * <p>
	 * Name: getFrameTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110497_b = McMappingDatabase.getSRG("AnimationFrame.func_110497_b");

	/**
	 * <p>
	 * Name: hasNoTime
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110495_a = McMappingDatabase.getSRG("AnimationFrame.func_110495_a");

	/**
	 * <p>
	 * Name: frameIndex
	 * </p>
	 */
	public static McObfPair field_110499_a = McMappingDatabase.getSRG("field_110499_a");

}
