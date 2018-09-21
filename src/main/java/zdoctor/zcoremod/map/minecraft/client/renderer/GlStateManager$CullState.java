package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$CullState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$j";
		else
			return "net/minecraft/client/renderer/GlStateManager$CullState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$j";
		else
			return "GlStateManager$CullState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$j;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$CullState;";
	}

	/**
	 * <p>
	 * Name: cullFace
	 * </p>
	 */
	public static McObfPair field_179054_a = McMappingDatabase.getSRG("field_179054_a");

	/**
	 * <p>
	 * Name: mode
	 * </p>
	 */
	public static McObfPair field_179053_b = McMappingDatabase.getSRG("field_179053_b");

}
