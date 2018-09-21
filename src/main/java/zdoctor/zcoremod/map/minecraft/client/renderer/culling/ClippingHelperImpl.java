package zdoctor.zcoremod.map.minecraft.client.renderer.culling;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ClippingHelperImpl {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxz";
		else
			return "net/minecraft/client/renderer/culling/ClippingHelperImpl";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxz";
		else
			return "ClippingHelperImpl";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxz;";
		else
			return "Lnet/minecraft/client/renderer/culling/ClippingHelperImpl;";
	}

	/**
	 * <p>
	 * Name: instance
	 * </p>
	 */
	public static McObfPair field_78563_e = McMappingDatabase.getSRG("field_78563_e");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78560_b = McMappingDatabase.getSRG("ClippingHelperImpl.func_78560_b");

	/**
	 * <p>
	 * Name: getInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/culling/ClippingHelper;]
	 * </p>
	 */
	public static McObfPair func_78558_a = McMappingDatabase.getSRG("ClippingHelperImpl.func_78558_a");

	/**
	 * <p>
	 * Name: modelviewMatrixBuffer
	 * </p>
	 */
	public static McObfPair field_78562_g = McMappingDatabase.getSRG("field_78562_g");

	/**
	 * <p>
	 * Name: floatBuffer16
	 * </p>
	 */
	public static McObfPair field_78564_h = McMappingDatabase.getSRG("field_78564_h");

	/**
	 * <p>
	 * Name: projectionMatrixBuffer
	 * </p>
	 */
	public static McObfPair field_78561_f = McMappingDatabase.getSRG("field_78561_f");

	/**
	 * <p>
	 * Name: normalize
	 * </p>
	 * <p>
	 * Desc: [([F)V]
	 * </p>
	 */
	public static McObfPair func_180547_a = McMappingDatabase.getSRG("ClippingHelperImpl.func_180547_a");

}
