package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$SourceFactor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$r";
		else
			return "net/minecraft/client/renderer/GlStateManager$SourceFactor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$r";
		else
			return "GlStateManager$SourceFactor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$r;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;";
	}

	/**
	 * <p>
	 * Name: factor
	 * </p>
	 */
	public static McObfPair field_187395_p = McMappingDatabase.getSRG("field_187395_p");

}
