package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$DepthState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$k";
		else
			return "net/minecraft/client/renderer/GlStateManager$DepthState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$k";
		else
			return "GlStateManager$DepthState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$k;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$DepthState;";
	}

	/**
	 * <p>
	 * Name: maskEnabled
	 * </p>
	 */
	public static McObfPair field_179050_b = McMappingDatabase.getSRG("field_179050_b");

	/**
	 * <p>
	 * Name: depthTest
	 * </p>
	 */
	public static McObfPair field_179052_a = McMappingDatabase.getSRG("field_179052_a");

	/**
	 * <p>
	 * Name: depthFunc
	 * </p>
	 */
	public static McObfPair field_179051_c = McMappingDatabase.getSRG("field_179051_c");

}
