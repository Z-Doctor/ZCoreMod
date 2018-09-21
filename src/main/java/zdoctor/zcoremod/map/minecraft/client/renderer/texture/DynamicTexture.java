package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DynamicTexture {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdg";
		else
			return "net/minecraft/client/renderer/texture/DynamicTexture";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdg";
		else
			return "DynamicTexture";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdg;";
		else
			return "Lnet/minecraft/client/renderer/texture/DynamicTexture;";
	}

	/**
	 * <p>
	 * Name: updateDynamicTexture
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110564_a = McMappingDatabase.getSRG("DynamicTexture.func_110564_a");

	/**
	 * <p>
	 * Name: dynamicTextureData
	 * </p>
	 */
	public static McObfPair field_110566_b = McMappingDatabase.getSRG("field_110566_b");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_94233_j = McMappingDatabase.getSRG("field_94233_j");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_94234_k = McMappingDatabase.getSRG("field_94234_k");

	/**
	 * <p>
	 * Name: getTextureData
	 * </p>
	 * <p>
	 * Desc: [()[I]
	 * </p>
	 */
	public static McObfPair func_110565_c = McMappingDatabase.getSRG("DynamicTexture.func_110565_c");

	/**
	 * <p>
	 * Name: loadTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110551_a = McMappingDatabase.getSRG("DynamicTexture.func_110551_a");

}
