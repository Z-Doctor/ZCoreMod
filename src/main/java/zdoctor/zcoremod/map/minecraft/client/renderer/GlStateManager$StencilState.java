package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$StencilState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$t";
		else
			return "net/minecraft/client/renderer/GlStateManager$StencilState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$t";
		else
			return "GlStateManager$StencilState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$t;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$StencilState;";
	}

	/**
	 * <p>
	 * Name: zfail
	 * </p>
	 */
	public static McObfPair field_179074_d = McMappingDatabase.getSRG("field_179074_d");

	/**
	 * <p>
	 * Name: zpass
	 * </p>
	 */
	public static McObfPair field_179075_e = McMappingDatabase.getSRG("field_179075_e");

	/**
	 * <p>
	 * Name: func
	 * </p>
	 */
	public static McObfPair field_179078_a = McMappingDatabase.getSRG("field_179078_a");

	/**
	 * <p>
	 * Name: mask
	 * </p>
	 */
	public static McObfPair field_179076_b = McMappingDatabase.getSRG("field_179076_b");

	/**
	 * <p>
	 * Name: fail
	 * </p>
	 */
	public static McObfPair field_179077_c = McMappingDatabase.getSRG("field_179077_c");

}
