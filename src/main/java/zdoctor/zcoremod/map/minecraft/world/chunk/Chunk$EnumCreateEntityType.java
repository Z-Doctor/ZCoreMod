package zdoctor.zcoremod.map.minecraft.world.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Chunk$EnumCreateEntityType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axw$a";
		else
			return "net/minecraft/world/chunk/Chunk$EnumCreateEntityType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axw$a";
		else
			return "Chunk$EnumCreateEntityType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxw$a;";
		else
			return "Lnet/minecraft/world/chunk/Chunk$EnumCreateEntityType;";
	}

}
