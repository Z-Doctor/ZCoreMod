package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderGlobal$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buy$2";
		else
			return "net/minecraft/client/renderer/RenderGlobal$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buy$2";
		else
			return "RenderGlobal$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuy$2;";
		else
			return "Lnet/minecraft/client/renderer/RenderGlobal$2;";
	}

}
