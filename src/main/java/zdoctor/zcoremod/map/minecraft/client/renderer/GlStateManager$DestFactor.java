package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$DestFactor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$l";
		else
			return "net/minecraft/client/renderer/GlStateManager$DestFactor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$l";
		else
			return "GlStateManager$DestFactor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$l;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$DestFactor;";
	}

	/**
	 * <p>
	 * Name: factor
	 * </p>
	 */
	public static McObfPair field_187345_o = McMappingDatabase.getSRG("field_187345_o");

}
