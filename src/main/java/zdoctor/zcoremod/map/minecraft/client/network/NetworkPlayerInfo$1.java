package zdoctor.zcoremod.map.minecraft.client.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetworkPlayerInfo$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsc$1";
		else
			return "net/minecraft/client/network/NetworkPlayerInfo$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsc$1";
		else
			return "NetworkPlayerInfo$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsc$1;";
		else
			return "Lnet/minecraft/client/network/NetworkPlayerInfo$1;";
	}

	/**
	 * <p>
	 * Name: skinAvailable
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;Lnet/minecraft/util/ResourceLocation;Lcom/mojang/authlib/minecraft/MinecraftProfileTexture;)V]
	 * </p>
	 */
	public static McObfPair func_180521_a = McMappingDatabase.getSRG("NetworkPlayerInfo$1.func_180521_a");

}
