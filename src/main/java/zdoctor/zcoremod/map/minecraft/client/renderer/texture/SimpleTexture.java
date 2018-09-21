package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SimpleTexture {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdm";
		else
			return "net/minecraft/client/renderer/texture/SimpleTexture";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdm";
		else
			return "SimpleTexture";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdm;";
		else
			return "Lnet/minecraft/client/renderer/texture/SimpleTexture;";
	}

	/**
	 * <p>
	 * Name: textureLocation
	 * </p>
	 */
	public static McObfPair field_110568_b = McMappingDatabase.getSRG("field_110568_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147639_c = McMappingDatabase.getSRG("field_147639_c");

	/**
	 * <p>
	 * Name: loadTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110551_a = McMappingDatabase.getSRG("SimpleTexture.func_110551_a");

}
