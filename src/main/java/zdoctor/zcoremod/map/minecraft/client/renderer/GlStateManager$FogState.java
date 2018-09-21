package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$FogState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$n";
		else
			return "net/minecraft/client/renderer/GlStateManager$FogState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$n";
		else
			return "GlStateManager$FogState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$n;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$FogState;";
	}

	/**
	 * <p>
	 * Name: end
	 * </p>
	 */
	public static McObfPair field_179046_e = McMappingDatabase.getSRG("field_179046_e");

	/**
	 * <p>
	 * Name: density
	 * </p>
	 */
	public static McObfPair field_179048_c = McMappingDatabase.getSRG("field_179048_c");

	/**
	 * <p>
	 * Name: start
	 * </p>
	 */
	public static McObfPair field_179045_d = McMappingDatabase.getSRG("field_179045_d");

	/**
	 * <p>
	 * Name: mode
	 * </p>
	 */
	public static McObfPair field_179047_b = McMappingDatabase.getSRG("field_179047_b");

	/**
	 * <p>
	 * Name: fog
	 * </p>
	 */
	public static McObfPair field_179049_a = McMappingDatabase.getSRG("field_179049_a");

}
