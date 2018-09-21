package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BannerTextures$CacheEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvi$b";
		else
			return "net/minecraft/client/renderer/BannerTextures$CacheEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvi$b";
		else
			return "BannerTextures$CacheEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvi$b;";
		else
			return "Lnet/minecraft/client/renderer/BannerTextures$CacheEntry;";
	}

	/**
	 * <p>
	 * Name: textureLocation
	 * </p>
	 */
	public static McObfPair field_187484_b = McMappingDatabase.getSRG("field_187484_b");

	/**
	 * <p>
	 * Name: lastUseMillis
	 * </p>
	 */
	public static McObfPair field_187483_a = McMappingDatabase.getSRG("field_187483_a");

}
