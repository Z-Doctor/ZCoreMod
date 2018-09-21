package zdoctor.zcoremod.map.minecraft.client.renderer.culling;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ClippingHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byb";
		else
			return "net/minecraft/client/renderer/culling/ClippingHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byb";
		else
			return "ClippingHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyb;";
		else
			return "Lnet/minecraft/client/renderer/culling/ClippingHelper;";
	}

	/**
	 * <p>
	 * Name: frustum
	 * </p>
	 */
	public static McObfPair field_78557_a = McMappingDatabase.getSRG("field_78557_a");

	/**
	 * <p>
	 * Name: projectionMatrix
	 * </p>
	 */
	public static McObfPair field_178625_b = McMappingDatabase.getSRG("field_178625_b");

	/**
	 * <p>
	 * Name: modelviewMatrix
	 * </p>
	 */
	public static McObfPair field_178626_c = McMappingDatabase.getSRG("field_178626_c");

	/**
	 * <p>
	 * Name: dot
	 * </p>
	 * <p>
	 * Desc: [([FDDD)D]
	 * </p>
	 */
	public static McObfPair func_178624_a = McMappingDatabase.getSRG("ClippingHelper.func_178624_a");

	/**
	 * <p>
	 * Name: clippingMatrix
	 * </p>
	 */
	public static McObfPair field_78554_d = McMappingDatabase.getSRG("field_78554_d");

	/**
	 * <p>
	 * Name: isBoxInFrustum
	 * </p>
	 * <p>
	 * Desc: [(DDDDDD)Z]
	 * </p>
	 */
	public static McObfPair func_78553_b = McMappingDatabase.getSRG("ClippingHelper.func_78553_b");

}
