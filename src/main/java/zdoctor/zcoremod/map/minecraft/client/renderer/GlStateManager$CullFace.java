package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$CullFace {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$i";
		else
			return "net/minecraft/client/renderer/GlStateManager$CullFace";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$i";
		else
			return "GlStateManager$CullFace";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$i;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$CullFace;";
	}

	/**
	 * <p>
	 * Name: mode
	 * </p>
	 */
	public static McObfPair field_187328_d = McMappingDatabase.getSRG("field_187328_d");

}
