package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BannerTextures {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvi";
		else
			return "net/minecraft/client/renderer/BannerTextures";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvi";
		else
			return "BannerTextures";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvi;";
		else
			return "Lnet/minecraft/client/renderer/BannerTextures;";
	}

	/**
	 * <p>
	 * Name: BANNER_DESIGNS
	 * </p>
	 */
	public static McObfPair field_178466_c = McMappingDatabase.getSRG("field_178466_c");

	/**
	 * <p>
	 * Name: BANNER_BASE_TEXTURE
	 * </p>
	 */
	public static McObfPair field_187487_d = McMappingDatabase.getSRG("field_187487_d");

	/**
	 * <p>
	 * Name: SHIELD_BASE_TEXTURE
	 * </p>
	 */
	public static McObfPair field_187486_c = McMappingDatabase.getSRG("field_187486_c");

	/**
	 * <p>
	 * Name: SHIELD_DESIGNS
	 * </p>
	 */
	public static McObfPair field_187485_b = McMappingDatabase.getSRG("field_187485_b");

}
