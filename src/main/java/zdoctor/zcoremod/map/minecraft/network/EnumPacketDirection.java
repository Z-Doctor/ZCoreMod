package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumPacketDirection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hu";
		else
			return "net/minecraft/network/EnumPacketDirection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hu";
		else
			return "EnumPacketDirection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhu;";
		else
			return "Lnet/minecraft/network/EnumPacketDirection;";
	}

}
