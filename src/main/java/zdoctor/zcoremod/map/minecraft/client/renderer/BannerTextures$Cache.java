package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BannerTextures$Cache {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvi$a";
		else
			return "net/minecraft/client/renderer/BannerTextures$Cache";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvi$a";
		else
			return "BannerTextures$Cache";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvi$a;";
		else
			return "Lnet/minecraft/client/renderer/BannerTextures$Cache;";
	}

	/**
	 * <p>
	 * Name: freeCacheSlot
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187477_a = McMappingDatabase.getSRG("BannerTextures$Cache.func_187477_a");

	/**
	 * <p>
	 * Name: getResourceLocation
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_187478_a = McMappingDatabase.getSRG("BannerTextures$Cache.func_187478_a");

	/**
	 * <p>
	 * Name: cacheResourceBase
	 * </p>
	 */
	public static McObfPair field_187481_c = McMappingDatabase.getSRG("field_187481_c");

	/**
	 * <p>
	 * Name: cacheId
	 * </p>
	 */
	public static McObfPair field_187482_d = McMappingDatabase.getSRG("field_187482_d");

	/**
	 * <p>
	 * Name: cacheMap
	 * </p>
	 */
	public static McObfPair field_187479_a = McMappingDatabase.getSRG("field_187479_a");

	/**
	 * <p>
	 * Name: cacheResourceLocation
	 * </p>
	 */
	public static McObfPair field_187480_b = McMappingDatabase.getSRG("field_187480_b");

}
