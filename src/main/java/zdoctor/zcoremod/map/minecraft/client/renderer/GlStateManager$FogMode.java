package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$FogMode {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$m";
		else
			return "net/minecraft/client/renderer/GlStateManager$FogMode";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$m";
		else
			return "GlStateManager$FogMode";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$m;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$FogMode;";
	}

	/**
	 * <p>
	 * Name: capabilityId
	 * </p>
	 */
	public static McObfPair field_187351_d = McMappingDatabase.getSRG("field_187351_d");

}
