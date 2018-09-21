package zdoctor.zcoremod.map.minecraft.realms;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RealmsDefaultVertexFormat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/realms/RealmsDefaultVertexFormat";
		else
			return "net/minecraft/realms/RealmsDefaultVertexFormat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "RealmsDefaultVertexFormat";
		else
			return "RealmsDefaultVertexFormat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/realms/RealmsDefaultVertexFormat;";
		else
			return "Lnet/minecraft/realms/RealmsDefaultVertexFormat;";
	}

}
