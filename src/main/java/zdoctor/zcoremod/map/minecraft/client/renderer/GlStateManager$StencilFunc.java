package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$StencilFunc {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$s";
		else
			return "net/minecraft/client/renderer/GlStateManager$StencilFunc";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$s";
		else
			return "GlStateManager$StencilFunc";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$s;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$StencilFunc;";
	}

	/**
	 * <p>
	 * Name: mask
	 * </p>
	 */
	public static McObfPair field_179080_c = McMappingDatabase.getSRG("field_179080_c");

	/**
	 * <p>
	 * Name: func
	 * </p>
	 */
	public static McObfPair field_179081_a = McMappingDatabase.getSRG("field_179081_a");

}
