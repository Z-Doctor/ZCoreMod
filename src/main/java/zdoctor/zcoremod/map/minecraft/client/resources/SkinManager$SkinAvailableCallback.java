package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SkinManager$SkinAvailableCallback {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cex$a";
		else
			return "net/minecraft/client/resources/SkinManager$SkinAvailableCallback";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cex$a";
		else
			return "SkinManager$SkinAvailableCallback";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcex$a;";
		else
			return "Lnet/minecraft/client/resources/SkinManager$SkinAvailableCallback;";
	}

	/**
	 * <p>
	 * Name: skinAvailable
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;Lnet/minecraft/util/ResourceLocation;Lcom/mojang/authlib/minecraft/MinecraftProfileTexture;)V]
	 * </p>
	 */
	public static McObfPair func_180521_a = McMappingDatabase.getSRG("SkinManager$SkinAvailableCallback.func_180521_a");

}
