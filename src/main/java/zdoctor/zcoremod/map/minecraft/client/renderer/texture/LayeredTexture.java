package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayeredTexture {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdk";
		else
			return "net/minecraft/client/renderer/texture/LayeredTexture";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdk";
		else
			return "LayeredTexture";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdk;";
		else
			return "Lnet/minecraft/client/renderer/texture/LayeredTexture;";
	}

	/**
	 * <p>
	 * Name: loadTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110551_a = McMappingDatabase.getSRG("LayeredTexture.func_110551_a");

	/**
	 * <p>
	 * Name: layeredTextureNames
	 * </p>
	 */
	public static McObfPair field_110567_b = McMappingDatabase.getSRG("field_110567_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147638_c = McMappingDatabase.getSRG("field_147638_c");

}
