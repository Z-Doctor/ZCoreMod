package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$BlendState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$b";
		else
			return "net/minecraft/client/renderer/GlStateManager$BlendState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$b";
		else
			return "GlStateManager$BlendState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$b;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$BlendState;";
	}

	/**
	 * <p>
	 * Name: dstFactorAlpha
	 * </p>
	 */
	public static McObfPair field_179210_e = McMappingDatabase.getSRG("field_179210_e");

	/**
	 * <p>
	 * Name: srcFactor
	 * </p>
	 */
	public static McObfPair field_179211_b = McMappingDatabase.getSRG("field_179211_b");

	/**
	 * <p>
	 * Name: srcFactorAlpha
	 * </p>
	 */
	public static McObfPair field_179209_d = McMappingDatabase.getSRG("field_179209_d");

	/**
	 * <p>
	 * Name: blend
	 * </p>
	 */
	public static McObfPair field_179213_a = McMappingDatabase.getSRG("field_179213_a");

	/**
	 * <p>
	 * Name: dstFactor
	 * </p>
	 */
	public static McObfPair field_179212_c = McMappingDatabase.getSRG("field_179212_c");

}
