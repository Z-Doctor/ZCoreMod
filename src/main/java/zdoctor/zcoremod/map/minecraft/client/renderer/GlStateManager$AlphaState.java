package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$AlphaState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$a";
		else
			return "net/minecraft/client/renderer/GlStateManager$AlphaState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$a";
		else
			return "GlStateManager$AlphaState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$a;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$AlphaState;";
	}

	/**
	 * <p>
	 * Name: alphaTest
	 * </p>
	 */
	public static McObfPair field_179208_a = McMappingDatabase.getSRG("field_179208_a");

	/**
	 * <p>
	 * Name: func
	 * </p>
	 */
	public static McObfPair field_179206_b = McMappingDatabase.getSRG("field_179206_b");

	/**
	 * <p>
	 * Name: ref
	 * </p>
	 */
	public static McObfPair field_179207_c = McMappingDatabase.getSRG("field_179207_c");

}
