package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapItemRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bis";
		else
			return "net/minecraft/client/gui/MapItemRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bis";
		else
			return "MapItemRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbis;";
		else
			return "Lnet/minecraft/client/gui/MapItemRenderer;";
	}

	/**
	 * <p>
	 * Name: getMapInstanceIfExists
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/gui/MapItemRenderer$Instance;]
	 * </p>
	 */
	public static McObfPair func_191205_a = McMappingDatabase.getSRG("MapItemRenderer.func_191205_a");

	/**
	 * <p>
	 * Name: TEXTURE_MAP_ICONS
	 * </p>
	 */
	public static McObfPair field_148253_a = McMappingDatabase.getSRG("field_148253_a");

	/**
	 * <p>
	 * Name: loadedMaps
	 * </p>
	 */
	public static McObfPair field_148252_c = McMappingDatabase.getSRG("field_148252_c");

	/**
	 * <p>
	 * Name: clearLoadedMaps
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148249_a = McMappingDatabase.getSRG("MapItemRenderer.func_148249_a");

	/**
	 * <p>
	 * Name: updateMapTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/MapData;)V]
	 * </p>
	 */
	public static McObfPair func_148246_a = McMappingDatabase.getSRG("MapItemRenderer.func_148246_a");

	/**
	 * <p>
	 * Name: getMapRendererInstance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/MapData;)Lnet/minecraft/client/gui/MapItemRenderer$Instance;]
	 * </p>
	 */
	public static McObfPair func_148248_b = McMappingDatabase.getSRG("MapItemRenderer.func_148248_b");

	/**
	 * <p>
	 * Name: getData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/MapItemRenderer$Instance;)Lnet/minecraft/world/storage/MapData;]
	 * </p>
	 */
	public static McObfPair func_191207_a = McMappingDatabase.getSRG("MapItemRenderer.func_191207_a");

	/**
	 * <p>
	 * Name: renderMap
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/MapData;Z)V]
	 * </p>
	 */
	public static McObfPair func_148250_a = McMappingDatabase.getSRG("MapItemRenderer.func_148250_a");

	/**
	 * <p>
	 * Name: textureManager
	 * </p>
	 */
	public static McObfPair field_148251_b = McMappingDatabase.getSRG("field_148251_b");

}
