package zdoctor.zcoremod.map.minecraft.realms;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RealmsVertexFormat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/realms/RealmsVertexFormat";
		else
			return "net/minecraft/realms/RealmsVertexFormat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "RealmsVertexFormat";
		else
			return "RealmsVertexFormat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/realms/RealmsVertexFormat;";
		else
			return "Lnet/minecraft/realms/RealmsVertexFormat;";
	}

}
