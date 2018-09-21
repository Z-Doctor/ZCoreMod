package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$ClearState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$d";
		else
			return "net/minecraft/client/renderer/GlStateManager$ClearState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$d";
		else
			return "GlStateManager$ClearState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$d;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$ClearState;";
	}

	/**
	 * <p>
	 * Name: color
	 * </p>
	 */
	public static McObfPair field_179203_b = McMappingDatabase.getSRG("field_179203_b");

	/**
	 * <p>
	 * Name: depth
	 * </p>
	 */
	public static McObfPair field_179205_a = McMappingDatabase.getSRG("field_179205_a");

}
