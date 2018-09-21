package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Matrix4f {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cid";
		else
			return "net/minecraft/client/renderer/Matrix4f";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cid";
		else
			return "Matrix4f";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcid;";
		else
			return "Lnet/minecraft/client/renderer/Matrix4f;";
	}

}
