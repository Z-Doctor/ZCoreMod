package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AbstractTexture {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdf";
		else
			return "net/minecraft/client/renderer/texture/AbstractTexture";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdf";
		else
			return "AbstractTexture";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdf;";
		else
			return "Lnet/minecraft/client/renderer/texture/AbstractTexture;";
	}

	/**
	 * <p>
	 * Name: restoreLastBlurMipmap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174935_a = McMappingDatabase.getSRG("AbstractTexture.func_174935_a");

	/**
	 * <p>
	 * Name: mipmapLast
	 * </p>
	 */
	public static McObfPair field_174939_e = McMappingDatabase.getSRG("field_174939_e");

	/**
	 * <p>
	 * Name: glTextureId
	 * </p>
	 */
	public static McObfPair field_110553_a = McMappingDatabase.getSRG("field_110553_a");

	/**
	 * <p>
	 * Name: mipmap
	 * </p>
	 */
	public static McObfPair field_174941_c = McMappingDatabase.getSRG("field_174941_c");

	/**
	 * <p>
	 * Name: getGlTextureId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110552_b = McMappingDatabase.getSRG("AbstractTexture.func_110552_b");

	/**
	 * <p>
	 * Name: setBlurMipmap
	 * </p>
	 * <p>
	 * Desc: [(ZZ)V]
	 * </p>
	 */
	public static McObfPair func_174936_b = McMappingDatabase.getSRG("AbstractTexture.func_174936_b");

	/**
	 * <p>
	 * Name: setBlurMipmapDirect
	 * </p>
	 * <p>
	 * Desc: [(ZZ)V]
	 * </p>
	 */
	public static McObfPair func_174937_a = McMappingDatabase.getSRG("AbstractTexture.func_174937_a");

	/**
	 * <p>
	 * Name: blurLast
	 * </p>
	 */
	public static McObfPair field_174938_d = McMappingDatabase.getSRG("field_174938_d");

	/**
	 * <p>
	 * Name: deleteGlTexture
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147631_c = McMappingDatabase.getSRG("AbstractTexture.func_147631_c");

	/**
	 * <p>
	 * Name: blur
	 * </p>
	 */
	public static McObfPair field_174940_b = McMappingDatabase.getSRG("field_174940_b");

}
