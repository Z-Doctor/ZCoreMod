package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$TexGenState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$w";
		else
			return "net/minecraft/client/renderer/GlStateManager$TexGenState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$w";
		else
			return "GlStateManager$TexGenState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$w;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$TexGenState;";
	}

	/**
	 * <p>
	 * Name: t
	 * </p>
	 */
	public static McObfPair field_179062_b = McMappingDatabase.getSRG("field_179062_b");

	/**
	 * <p>
	 * Name: q
	 * </p>
	 */
	public static McObfPair field_179061_d = McMappingDatabase.getSRG("field_179061_d");

	/**
	 * <p>
	 * Name: s
	 * </p>
	 */
	public static McObfPair field_179064_a = McMappingDatabase.getSRG("field_179064_a");

	/**
	 * <p>
	 * Name: r
	 * </p>
	 */
	public static McObfPair field_179063_c = McMappingDatabase.getSRG("field_179063_c");

}
