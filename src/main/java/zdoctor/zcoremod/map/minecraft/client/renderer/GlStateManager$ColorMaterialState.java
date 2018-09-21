package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$ColorMaterialState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$h";
		else
			return "net/minecraft/client/renderer/GlStateManager$ColorMaterialState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$h";
		else
			return "GlStateManager$ColorMaterialState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$h;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$ColorMaterialState;";
	}

	/**
	 * <p>
	 * Name: mode
	 * </p>
	 */
	public static McObfPair field_179190_c = McMappingDatabase.getSRG("field_179190_c");

	/**
	 * <p>
	 * Name: face
	 * </p>
	 */
	public static McObfPair field_179189_b = McMappingDatabase.getSRG("field_179189_b");

	/**
	 * <p>
	 * Name: colorMaterial
	 * </p>
	 */
	public static McObfPair field_179191_a = McMappingDatabase.getSRG("field_179191_a");

}
