package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapItemRenderer$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bis$a";
		else
			return "net/minecraft/client/gui/MapItemRenderer$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bis$a";
		else
			return "MapItemRenderer$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbis$a;";
		else
			return "Lnet/minecraft/client/gui/MapItemRenderer$Instance;";
	}

	/**
	 * <p>
	 * Name: location
	 * </p>
	 */
	public static McObfPair field_148240_d = McMappingDatabase.getSRG("field_148240_d");

	/**
	 * <p>
	 * Name: mapTextureData
	 * </p>
	 */
	public static McObfPair field_148241_e = McMappingDatabase.getSRG("field_148241_e");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_148237_a = McMappingDatabase.getSRG("MapItemRenderer$Instance.func_148237_a");

	/**
	 * <p>
	 * Name: mapData
	 * </p>
	 */
	public static McObfPair field_148242_b = McMappingDatabase.getSRG("field_148242_b");

	/**
	 * <p>
	 * Name: updateMapTexture
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148236_a = McMappingDatabase.getSRG("MapItemRenderer$Instance.func_148236_a");

	/**
	 * <p>
	 * Name: mapTexture
	 * </p>
	 */
	public static McObfPair field_148243_c = McMappingDatabase.getSRG("field_148243_c");

}
