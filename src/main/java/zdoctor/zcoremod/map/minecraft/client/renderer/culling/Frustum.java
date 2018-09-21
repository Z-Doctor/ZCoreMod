package zdoctor.zcoremod.map.minecraft.client.renderer.culling;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Frustum {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bya";
		else
			return "net/minecraft/client/renderer/culling/Frustum";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bya";
		else
			return "Frustum";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbya;";
		else
			return "Lnet/minecraft/client/renderer/culling/Frustum;";
	}

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_78551_c = McMappingDatabase.getSRG("field_78551_c");

	/**
	 * <p>
	 * Name: clippingHelper
	 * </p>
	 */
	public static McObfPair field_78552_a = McMappingDatabase.getSRG("field_78552_a");

	/**
	 * <p>
	 * Name: isBoxInFrustum
	 * </p>
	 * <p>
	 * Desc: [(DDDDDD)Z]
	 * </p>
	 */
	public static McObfPair func_78548_b = McMappingDatabase.getSRG("Frustum.func_78548_b");

	/**
	 * <p>
	 * Name: isBoundingBoxInFrustum
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Z]
	 * </p>
	 */
	public static McObfPair func_78546_a = McMappingDatabase.getSRG("Frustum.func_78546_a");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_78550_b = McMappingDatabase.getSRG("field_78550_b");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_78547_a = McMappingDatabase.getSRG("Frustum.func_78547_a");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_78549_d = McMappingDatabase.getSRG("field_78549_d");

}
