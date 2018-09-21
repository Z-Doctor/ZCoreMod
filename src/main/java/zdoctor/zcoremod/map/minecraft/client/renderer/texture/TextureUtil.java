package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextureUtil {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdt";
		else
			return "net/minecraft/client/renderer/texture/TextureUtil";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdt";
		else
			return "TextureUtil";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdt;";
		else
			return "Lnet/minecraft/client/renderer/texture/TextureUtil;";
	}

	/**
	 * <p>
	 * Name: COLOR_GAMMAS
	 * </p>
	 */
	public static McObfPair field_188544_e = McMappingDatabase.getSRG("field_188544_e");

	/**
	 * <p>
	 * Name: blendColors
	 * </p>
	 * <p>
	 * Desc: [(IIIIZ)I]
	 * </p>
	 */
	public static McObfPair func_147943_a = McMappingDatabase.getSRG("TextureUtil.func_147943_a");

	/**
	 * <p>
	 * Name: setTextureBlurred
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_147951_b = McMappingDatabase.getSRG("TextureUtil.func_147951_b");

	/**
	 * <p>
	 * Name: copyToBuffer
	 * </p>
	 * <p>
	 * Desc: [([II)V]
	 * </p>
	 */
	public static McObfPair func_110990_a = McMappingDatabase.getSRG("TextureUtil.func_110990_a");

	/**
	 * <p>
	 * Name: uploadTextureImageAllocate
	 * </p>
	 * <p>
	 * Desc: [(ILjava/awt/image/BufferedImage;ZZ)I]
	 * </p>
	 */
	public static McObfPair func_110989_a = McMappingDatabase.getSRG("TextureUtil.func_110989_a");

	/**
	 * <p>
	 * Name: uploadTextureImageSubImpl
	 * </p>
	 * <p>
	 * Desc: [(Ljava/awt/image/BufferedImage;IIZZ)V]
	 * </p>
	 */
	public static McObfPair func_110993_a = McMappingDatabase.getSRG("TextureUtil.func_110993_a");

	/**
	 * <p>
	 * Name: anaglyphColor
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_177054_c = McMappingDatabase.getSRG("TextureUtil.func_177054_c");

	/**
	 * <p>
	 * Name: setTextureBlurMipmap
	 * </p>
	 * <p>
	 * Desc: [(ZZ)V]
	 * </p>
	 */
	public static McObfPair func_147954_b = McMappingDatabase.getSRG("TextureUtil.func_147954_b");

	/**
	 * <p>
	 * Name: glGenTextures
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110996_a = McMappingDatabase.getSRG("TextureUtil.func_110996_a");

	/**
	 * <p>
	 * Name: readImageData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;Lnet/minecraft/util/ResourceLocation;)[I]
	 * </p>
	 */
	public static McObfPair func_110986_a = McMappingDatabase.getSRG("TextureUtil.func_110986_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147959_c = McMappingDatabase.getSRG("field_147959_c");

	/**
	 * <p>
	 * Name: MISSING_TEXTURE
	 * </p>
	 */
	public static McObfPair field_111001_a = McMappingDatabase.getSRG("field_111001_a");

	/**
	 * <p>
	 * Name: setTextureClamped
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_110997_a = McMappingDatabase.getSRG("TextureUtil.func_110997_a");

	/**
	 * <p>
	 * Name: getColorGamma
	 * </p>
	 * <p>
	 * Desc: [(I)F]
	 * </p>
	 */
	public static McObfPair func_188543_d = McMappingDatabase.getSRG("TextureUtil.func_188543_d");

	/**
	 * <p>
	 * Name: processPixelValues
	 * </p>
	 * <p>
	 * Desc: [([III)V]
	 * </p>
	 */
	public static McObfPair func_147953_a = McMappingDatabase.getSRG("TextureUtil.func_147953_a");

	/**
	 * <p>
	 * Name: updateAnaglyph
	 * </p>
	 * <p>
	 * Desc: [([I)[I]
	 * </p>
	 */
	public static McObfPair func_110985_a = McMappingDatabase.getSRG("TextureUtil.func_110985_a");

	/**
	 * <p>
	 * Name: uploadTextureImage
	 * </p>
	 * <p>
	 * Desc: [(ILjava/awt/image/BufferedImage;)I]
	 * </p>
	 */
	public static McObfPair func_110987_a = McMappingDatabase.getSRG("TextureUtil.func_110987_a");

	/**
	 * <p>
	 * Name: uploadTexture
	 * </p>
	 * <p>
	 * Desc: [(I[III)V]
	 * </p>
	 */
	public static McObfPair func_110988_a = McMappingDatabase.getSRG("TextureUtil.func_110988_a");

	/**
	 * <p>
	 * Name: uploadTextureImageSub
	 * </p>
	 * <p>
	 * Desc: [(ILjava/awt/image/BufferedImage;IIZZ)I]
	 * </p>
	 */
	public static McObfPair func_110995_a = McMappingDatabase.getSRG("TextureUtil.func_110995_a");

	/**
	 * <p>
	 * Name: uploadTextureSub
	 * </p>
	 * <p>
	 * Desc: [(I[IIIIIZZZ)V]
	 * </p>
	 */
	public static McObfPair func_147947_a = McMappingDatabase.getSRG("TextureUtil.func_147947_a");

	/**
	 * <p>
	 * Name: MISSING_TEXTURE_DATA
	 * </p>
	 */
	public static McObfPair field_110999_b = McMappingDatabase.getSRG("field_110999_b");

	/**
	 * <p>
	 * Name: allocateTextureImpl
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_180600_a = McMappingDatabase.getSRG("TextureUtil.func_180600_a");

	/**
	 * <p>
	 * Name: copyToBufferPos
	 * </p>
	 * <p>
	 * Desc: [([III)V]
	 * </p>
	 */
	public static McObfPair func_110994_a = McMappingDatabase.getSRG("TextureUtil.func_110994_a");

	/**
	 * <p>
	 * Name: deleteTexture
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_147942_a = McMappingDatabase.getSRG("TextureUtil.func_147942_a");

	/**
	 * <p>
	 * Name: readBufferedImage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;]
	 * </p>
	 */
	public static McObfPair func_177053_a = McMappingDatabase.getSRG("TextureUtil.func_177053_a");

	/**
	 * <p>
	 * Name: MIPMAP_BUFFER
	 * </p>
	 */
	public static McObfPair field_147957_g = McMappingDatabase.getSRG("field_147957_g");

	/**
	 * <p>
	 * Name: DATA_BUFFER
	 * </p>
	 */
	public static McObfPair field_111000_c = McMappingDatabase.getSRG("field_111000_c");

	/**
	 * <p>
	 * Name: generateMipmapData
	 * </p>
	 * <p>
	 * Desc: [(II[[I)[[I]
	 * </p>
	 */
	public static McObfPair func_147949_a = McMappingDatabase.getSRG("TextureUtil.func_147949_a");

	/**
	 * <p>
	 * Name: allocateTexture
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_110991_a = McMappingDatabase.getSRG("TextureUtil.func_110991_a");

	/**
	 * <p>
	 * Name: bindTexture
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_94277_a = McMappingDatabase.getSRG("TextureUtil.func_94277_a");

	/**
	 * <p>
	 * Name: blendColorComponent
	 * </p>
	 * <p>
	 * Desc: [(IIIII)I]
	 * </p>
	 */
	public static McObfPair func_147944_a = McMappingDatabase.getSRG("TextureUtil.func_147944_a");

	/**
	 * <p>
	 * Name: uploadTextureMipmap
	 * </p>
	 * <p>
	 * Desc: [([[IIIIIZZ)V]
	 * </p>
	 */
	public static McObfPair func_147955_a = McMappingDatabase.getSRG("TextureUtil.func_147955_a");

}
