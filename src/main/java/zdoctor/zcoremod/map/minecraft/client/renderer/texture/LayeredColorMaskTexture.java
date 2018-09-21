package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayeredColorMaskTexture {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdj";
		else
			return "net/minecraft/client/renderer/texture/LayeredColorMaskTexture";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdj";
		else
			return "LayeredColorMaskTexture";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdj;";
		else
			return "Lnet/minecraft/client/renderer/texture/LayeredColorMaskTexture;";
	}

	/**
	 * <p>
	 * Name: listTextures
	 * </p>
	 */
	public static McObfPair field_174949_h = McMappingDatabase.getSRG("field_174949_h");

	/**
	 * <p>
	 * Name: textureLocation
	 * </p>
	 */
	public static McObfPair field_174948_g = McMappingDatabase.getSRG("field_174948_g");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_174947_f = McMappingDatabase.getSRG("field_174947_f");

	/**
	 * <p>
	 * Name: listDyeColors
	 * </p>
	 */
	public static McObfPair field_174950_i = McMappingDatabase.getSRG("field_174950_i");

	/**
	 * <p>
	 * Name: loadTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110551_a = McMappingDatabase.getSRG("LayeredColorMaskTexture.func_110551_a");

}
