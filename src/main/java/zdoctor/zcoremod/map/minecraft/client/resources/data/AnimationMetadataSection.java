package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AnimationMetadataSection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfi";
		else
			return "net/minecraft/client/resources/data/AnimationMetadataSection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfi";
		else
			return "AnimationMetadataSection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfi;";
		else
			return "Lnet/minecraft/client/resources/data/AnimationMetadataSection;";
	}

	/**
	 * <p>
	 * Name: getFrameIndexSet
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_130073_e = McMappingDatabase.getSRG("AnimationMetadataSection.func_130073_e");

	/**
	 * <p>
	 * Name: frameHeight
	 * </p>
	 */
	public static McObfPair field_110477_c = McMappingDatabase.getSRG("field_110477_c");

	/**
	 * <p>
	 * Name: frameWidth
	 * </p>
	 */
	public static McObfPair field_110476_b = McMappingDatabase.getSRG("field_110476_b");

	/**
	 * <p>
	 * Name: frameHasTime
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_110470_b = McMappingDatabase.getSRG("AnimationMetadataSection.func_110470_b");

	/**
	 * <p>
	 * Name: getFrameWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110474_b = McMappingDatabase.getSRG("AnimationMetadataSection.func_110474_b");

	/**
	 * <p>
	 * Name: getFrameHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110471_a = McMappingDatabase.getSRG("AnimationMetadataSection.func_110471_a");

	/**
	 * <p>
	 * Name: getFrameCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110473_c = McMappingDatabase.getSRG("AnimationMetadataSection.func_110473_c");

	/**
	 * <p>
	 * Name: animationFrames
	 * </p>
	 */
	public static McObfPair field_110478_a = McMappingDatabase.getSRG("field_110478_a");

	/**
	 * <p>
	 * Name: getAnimationFrame
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/resources/data/AnimationFrame;]
	 * </p>
	 */
	public static McObfPair func_130072_d = McMappingDatabase.getSRG("AnimationMetadataSection.func_130072_d");

	/**
	 * <p>
	 * Name: getFrameIndex
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_110468_c = McMappingDatabase.getSRG("AnimationMetadataSection.func_110468_c");

	/**
	 * <p>
	 * Name: frameTime
	 * </p>
	 */
	public static McObfPair field_110475_d = McMappingDatabase.getSRG("field_110475_d");

	/**
	 * <p>
	 * Name: getFrameTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110469_d = McMappingDatabase.getSRG("AnimationMetadataSection.func_110469_d");

	/**
	 * <p>
	 * Name: getFrameTimeSingle
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_110472_a = McMappingDatabase.getSRG("AnimationMetadataSection.func_110472_a");

	/**
	 * <p>
	 * Name: isInterpolate
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177219_e = McMappingDatabase.getSRG("AnimationMetadataSection.func_177219_e");

	/**
	 * <p>
	 * Name: interpolate
	 * </p>
	 */
	public static McObfPair field_177220_e = McMappingDatabase.getSRG("field_177220_e");

}
