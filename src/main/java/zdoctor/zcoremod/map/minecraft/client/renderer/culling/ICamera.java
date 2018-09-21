package zdoctor.zcoremod.map.minecraft.client.renderer.culling;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ICamera {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxy";
		else
			return "net/minecraft/client/renderer/culling/ICamera";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxy";
		else
			return "ICamera";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxy;";
		else
			return "Lnet/minecraft/client/renderer/culling/ICamera;";
	}

	/**
	 * <p>
	 * Name: isBoundingBoxInFrustum
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Z]
	 * </p>
	 */
	public static McObfPair func_78546_a = McMappingDatabase.getSRG("ICamera.func_78546_a");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_78547_a = McMappingDatabase.getSRG("ICamera.func_78547_a");

}
