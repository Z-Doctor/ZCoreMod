package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$Color {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$e";
		else
			return "net/minecraft/client/renderer/GlStateManager$Color";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$e";
		else
			return "GlStateManager$Color";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$e;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$Color;";
	}

	/**
	 * <p>
	 * Name: alpha
	 * </p>
	 */
	public static McObfPair field_179192_d = McMappingDatabase.getSRG("field_179192_d");

	/**
	 * <p>
	 * Name: red
	 * </p>
	 */
	public static McObfPair field_179195_a = McMappingDatabase.getSRG("field_179195_a");

	/**
	 * <p>
	 * Name: blue
	 * </p>
	 */
	public static McObfPair field_179194_c = McMappingDatabase.getSRG("field_179194_c");

	/**
	 * <p>
	 * Name: green
	 * </p>
	 */
	public static McObfPair field_179193_b = McMappingDatabase.getSRG("field_179193_b");

}
