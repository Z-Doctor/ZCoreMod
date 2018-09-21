package zdoctor.zcoremod.map.minecraft.realms;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RealmsBufferBuilder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/realms/RealmsBufferBuilder";
		else
			return "net/minecraft/realms/RealmsBufferBuilder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "RealmsBufferBuilder";
		else
			return "RealmsBufferBuilder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/realms/RealmsBufferBuilder;";
		else
			return "Lnet/minecraft/realms/RealmsBufferBuilder;";
	}

}
