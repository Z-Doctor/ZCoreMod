package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$TextureState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$x";
		else
			return "net/minecraft/client/renderer/GlStateManager$TextureState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$x";
		else
			return "GlStateManager$TextureState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$x;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$TextureState;";
	}

	/**
	 * <p>
	 * Name: textureName
	 * </p>
	 */
	public static McObfPair field_179059_b = McMappingDatabase.getSRG("field_179059_b");

	/**
	 * <p>
	 * Name: texture2DState
	 * </p>
	 */
	public static McObfPair field_179060_a = McMappingDatabase.getSRG("field_179060_a");

}
