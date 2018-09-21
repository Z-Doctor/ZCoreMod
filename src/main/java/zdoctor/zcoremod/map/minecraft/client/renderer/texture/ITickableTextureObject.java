package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ITickableTextureObject {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdv";
		else
			return "net/minecraft/client/renderer/texture/ITickableTextureObject";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdv";
		else
			return "ITickableTextureObject";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdv;";
		else
			return "Lnet/minecraft/client/renderer/texture/ITickableTextureObject;";
	}

}
