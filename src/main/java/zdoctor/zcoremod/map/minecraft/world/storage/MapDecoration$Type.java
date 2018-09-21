package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapDecoration$Type {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "beu$a";
		else
			return "net/minecraft/world/storage/MapDecoration$Type";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "beu$a";
		else
			return "MapDecoration$Type";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbeu$a;";
		else
			return "Lnet/minecraft/world/storage/MapDecoration$Type;";
	}

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_191161_d = McMappingDatabase.getSRG("MapDecoration$Type.func_191161_d");

	/**
	 * <p>
	 * Name: icon
	 * </p>
	 */
	public static McObfPair field_191175_k = McMappingDatabase.getSRG("field_191175_k");

	/**
	 * <p>
	 * Name: getIcon
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_191163_a = McMappingDatabase.getSRG("MapDecoration$Type.func_191163_a");

	/**
	 * <p>
	 * Name: byIcon
	 * </p>
	 * <p>
	 * Desc: [(B)Lnet/minecraft/world/storage/MapDecoration$Type;]
	 * </p>
	 */
	public static McObfPair func_191159_a = McMappingDatabase.getSRG("MapDecoration$Type.func_191159_a");

	/**
	 * <p>
	 * Name: hasMapColor
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191162_c = McMappingDatabase.getSRG("MapDecoration$Type.func_191162_c");

	/**
	 * <p>
	 * Name: isRenderedOnFrame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191160_b = McMappingDatabase.getSRG("MapDecoration$Type.func_191160_b");

	/**
	 * <p>
	 * Name: mapColor
	 * </p>
	 */
	public static McObfPair field_191177_m = McMappingDatabase.getSRG("field_191177_m");

	/**
	 * <p>
	 * Name: renderedOnFrame
	 * </p>
	 */
	public static McObfPair field_191176_l = McMappingDatabase.getSRG("field_191176_l");

}
