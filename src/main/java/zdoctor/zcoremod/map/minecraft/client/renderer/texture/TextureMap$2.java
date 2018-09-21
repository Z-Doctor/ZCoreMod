package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextureMap$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdp$2";
		else
			return "net/minecraft/client/renderer/texture/TextureMap$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdp$2";
		else
			return "TextureMap$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdp$2;";
		else
			return "Lnet/minecraft/client/renderer/texture/TextureMap$2;";
	}

}
