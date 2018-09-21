package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ITextureMapPopulator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdi";
		else
			return "net/minecraft/client/renderer/texture/ITextureMapPopulator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdi";
		else
			return "ITextureMapPopulator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdi;";
		else
			return "Lnet/minecraft/client/renderer/texture/ITextureMapPopulator;";
	}

	/**
	 * <p>
	 * Name: registerSprites
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureMap;)V]
	 * </p>
	 */
	public static McObfPair func_177059_a = McMappingDatabase.getSRG("ITextureMapPopulator.func_177059_a");

}
