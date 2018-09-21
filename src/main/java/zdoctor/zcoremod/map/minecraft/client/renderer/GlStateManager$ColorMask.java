package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$ColorMask {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$g";
		else
			return "net/minecraft/client/renderer/GlStateManager$ColorMask";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$g";
		else
			return "GlStateManager$ColorMask";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$g;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$ColorMask;";
	}

	/**
	 * <p>
	 * Name: blue
	 * </p>
	 */
	public static McObfPair field_179187_c = McMappingDatabase.getSRG("field_179187_c");

	/**
	 * <p>
	 * Name: green
	 * </p>
	 */
	public static McObfPair field_179186_b = McMappingDatabase.getSRG("field_179186_b");

	/**
	 * <p>
	 * Name: alpha
	 * </p>
	 */
	public static McObfPair field_179185_d = McMappingDatabase.getSRG("field_179185_d");

	/**
	 * <p>
	 * Name: red
	 * </p>
	 */
	public static McObfPair field_179188_a = McMappingDatabase.getSRG("field_179188_a");

}
