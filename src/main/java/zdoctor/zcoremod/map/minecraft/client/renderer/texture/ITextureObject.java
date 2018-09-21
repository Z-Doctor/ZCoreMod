package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ITextureObject {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cds";
		else
			return "net/minecraft/client/renderer/texture/ITextureObject";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cds";
		else
			return "ITextureObject";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcds;";
		else
			return "Lnet/minecraft/client/renderer/texture/ITextureObject;";
	}

	/**
	 * <p>
	 * Name: getGlTextureId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110552_b = McMappingDatabase.getSRG("ITextureObject.func_110552_b");

	/**
	 * <p>
	 * Name: restoreLastBlurMipmap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174935_a = McMappingDatabase.getSRG("ITextureObject.func_174935_a");

	/**
	 * <p>
	 * Name: setBlurMipmap
	 * </p>
	 * <p>
	 * Desc: [(ZZ)V]
	 * </p>
	 */
	public static McObfPair func_174936_b = McMappingDatabase.getSRG("ITextureObject.func_174936_b");

	/**
	 * <p>
	 * Name: loadTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110551_a = McMappingDatabase.getSRG("ITextureObject.func_110551_a");

}
