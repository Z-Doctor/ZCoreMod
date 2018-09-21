package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$PolygonOffsetState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$p";
		else
			return "net/minecraft/client/renderer/GlStateManager$PolygonOffsetState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$p";
		else
			return "GlStateManager$PolygonOffsetState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$p;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$PolygonOffsetState;";
	}

	/**
	 * <p>
	 * Name: polygonOffsetLine
	 * </p>
	 */
	public static McObfPair field_179042_b = McMappingDatabase.getSRG("field_179042_b");

	/**
	 * <p>
	 * Name: units
	 * </p>
	 */
	public static McObfPair field_179041_d = McMappingDatabase.getSRG("field_179041_d");

	/**
	 * <p>
	 * Name: polygonOffsetFill
	 * </p>
	 */
	public static McObfPair field_179044_a = McMappingDatabase.getSRG("field_179044_a");

	/**
	 * <p>
	 * Name: factor
	 * </p>
	 */
	public static McObfPair field_179043_c = McMappingDatabase.getSRG("field_179043_c");

}
