package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderItem$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzw$4";
		else
			return "net/minecraft/client/renderer/RenderItem$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzw$4";
		else
			return "RenderItem$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzw$4;";
		else
			return "Lnet/minecraft/client/renderer/RenderItem$3;";
	}

}
