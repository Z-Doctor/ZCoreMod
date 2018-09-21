package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextureManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdr";
		else
			return "net/minecraft/client/renderer/texture/TextureManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdr";
		else
			return "TextureManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdr;";
		else
			return "Lnet/minecraft/client/renderer/texture/TextureManager;";
	}

	/**
	 * <p>
	 * Name: getDynamicTextureLocation
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/client/renderer/texture/DynamicTexture;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110578_a = McMappingDatabase.getSRG("TextureManager.func_110578_a");

	/**
	 * <p>
	 * Name: RESOURCE_LOCATION_EMPTY
	 * </p>
	 */
	public static McObfPair field_194008_a = McMappingDatabase.getSRG("field_194008_a");

	/**
	 * <p>
	 * Name: listTickables
	 * </p>
	 */
	public static McObfPair field_110583_b = McMappingDatabase.getSRG("field_110583_b");

	/**
	 * <p>
	 * Name: mapTextureCounters
	 * </p>
	 */
	public static McObfPair field_110584_c = McMappingDatabase.getSRG("field_110584_c");

	/**
	 * <p>
	 * Name: bindTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_110577_a = McMappingDatabase.getSRG("TextureManager.func_110577_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147646_a = McMappingDatabase.getSRG("field_147646_a");

	/**
	 * <p>
	 * Name: getTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/renderer/texture/ITextureObject;]
	 * </p>
	 */
	public static McObfPair func_110581_b = McMappingDatabase.getSRG("TextureManager.func_110581_b");

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("TextureManager.func_110549_a");

	/**
	 * <p>
	 * Name: loadTickableTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/client/renderer/texture/ITickableTextureObject;)Z]
	 * </p>
	 */
	public static McObfPair func_110580_a = McMappingDatabase.getSRG("TextureManager.func_110580_a");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110550_d = McMappingDatabase.getSRG("TextureManager.func_110550_d");

	/**
	 * <p>
	 * Name: deleteTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_147645_c = McMappingDatabase.getSRG("TextureManager.func_147645_c");

	/**
	 * <p>
	 * Name: loadTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/client/renderer/texture/ITextureObject;)Z]
	 * </p>
	 */
	public static McObfPair func_110579_a = McMappingDatabase.getSRG("TextureManager.func_110579_a");

	/**
	 * <p>
	 * Name: mapTextureObjects
	 * </p>
	 */
	public static McObfPair field_110585_a = McMappingDatabase.getSRG("field_110585_a");

	/**
	 * <p>
	 * Name: resourceManager
	 * </p>
	 */
	public static McObfPair field_110582_d = McMappingDatabase.getSRG("field_110582_d");

}
