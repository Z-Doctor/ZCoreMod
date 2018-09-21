package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextureMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdp";
		else
			return "net/minecraft/client/renderer/texture/TextureMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdp";
		else
			return "TextureMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdp;";
		else
			return "Lnet/minecraft/client/renderer/texture/TextureMap;";
	}

	/**
	 * <p>
	 * Name: mipmapLevels
	 * </p>
	 */
	public static McObfPair field_147636_j = McMappingDatabase.getSRG("field_147636_j");

	/**
	 * <p>
	 * Name: loadSprites
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;Lnet/minecraft/client/renderer/texture/ITextureMapPopulator;)V]
	 * </p>
	 */
	public static McObfPair func_174943_a = McMappingDatabase.getSRG("TextureMap.func_174943_a");

	/**
	 * <p>
	 * Name: listAnimatedSprites
	 * </p>
	 */
	public static McObfPair field_94258_i = McMappingDatabase.getSRG("field_94258_i");

	/**
	 * <p>
	 * Name: mapRegisteredSprites
	 * </p>
	 */
	public static McObfPair field_110574_e = McMappingDatabase.getSRG("field_110574_e");

	/**
	 * <p>
	 * Name: getResourceLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184396_a = McMappingDatabase.getSRG("TextureMap.func_184396_a");

	/**
	 * <p>
	 * Name: registerSprite
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_174942_a = McMappingDatabase.getSRG("TextureMap.func_174942_a");

	/**
	 * <p>
	 * Name: generateMipmaps
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;)Z]
	 * </p>
	 */
	public static McObfPair func_184397_a = McMappingDatabase.getSRG("TextureMap.func_184397_a");

	/**
	 * <p>
	 * Name: setMipmapLevels
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_147633_a = McMappingDatabase.getSRG("TextureMap.func_147633_a");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110550_d = McMappingDatabase.getSRG("TextureMap.func_110550_d");

	/**
	 * <p>
	 * Name: missingImage
	 * </p>
	 */
	public static McObfPair field_94249_f = McMappingDatabase.getSRG("field_94249_f");

	/**
	 * <p>
	 * Name: iconCreator
	 * </p>
	 */
	public static McObfPair field_174946_m = McMappingDatabase.getSRG("field_174946_m");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147635_d = McMappingDatabase.getSRG("field_147635_d");

	/**
	 * <p>
	 * Name: loadTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110551_a = McMappingDatabase.getSRG("TextureMap.func_110551_a");

	/**
	 * <p>
	 * Name: basePath
	 * </p>
	 */
	public static McObfPair field_94254_c = McMappingDatabase.getSRG("field_94254_c");

	/**
	 * <p>
	 * Name: updateAnimations
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94248_c = McMappingDatabase.getSRG("TextureMap.func_94248_c");

	/**
	 * <p>
	 * Name: getMissingSprite
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_174944_f = McMappingDatabase.getSRG("TextureMap.func_174944_f");

	/**
	 * <p>
	 * Name: loadTextureAtlas
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110571_b = McMappingDatabase.getSRG("TextureMap.func_110571_b");

	/**
	 * <p>
	 * Name: mapUploadedSprites
	 * </p>
	 */
	public static McObfPair field_94252_e = McMappingDatabase.getSRG("field_94252_e");

	/**
	 * <p>
	 * Name: getAtlasSprite
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_110572_b = McMappingDatabase.getSRG("TextureMap.func_110572_b");

	/**
	 * <p>
	 * Name: LOCATION_BLOCKS_TEXTURE
	 * </p>
	 */
	public static McObfPair field_110575_b = McMappingDatabase.getSRG("field_110575_b");

	/**
	 * <p>
	 * Name: initMissingImage
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110569_e = McMappingDatabase.getSRG("TextureMap.func_110569_e");

	/**
	 * <p>
	 * Name: LOCATION_MISSING_TEXTURE
	 * </p>
	 */
	public static McObfPair field_174945_f = McMappingDatabase.getSRG("field_174945_f");

}
