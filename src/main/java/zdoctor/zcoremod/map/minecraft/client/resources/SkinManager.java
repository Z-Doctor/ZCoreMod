package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SkinManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cex";
		else
			return "net/minecraft/client/resources/SkinManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cex";
		else
			return "SkinManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcex;";
		else
			return "Lnet/minecraft/client/resources/SkinManager;";
	}

	/**
	 * <p>
	 * Name: THREAD_POOL
	 * </p>
	 */
	public static McObfPair field_152794_b = McMappingDatabase.getSRG("field_152794_b");

	/**
	 * <p>
	 * Name: loadProfileTextures
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;Lnet/minecraft/client/resources/SkinManager$SkinAvailableCallback;Z)V]
	 * </p>
	 */
	public static McObfPair func_152790_a = McMappingDatabase.getSRG("SkinManager.func_152790_a");

	/**
	 * <p>
	 * Name: loadSkinFromCache
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_152788_a = McMappingDatabase.getSRG("SkinManager.func_152788_a");

	/**
	 * <p>
	 * Name: loadSkin
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/minecraft/MinecraftProfileTexture;Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_152792_a = McMappingDatabase.getSRG("SkinManager.func_152792_a");

	/**
	 * <p>
	 * Name: sessionService
	 * </p>
	 */
	public static McObfPair field_152797_e = McMappingDatabase.getSRG("field_152797_e");

	/**
	 * <p>
	 * Name: loadSkin
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/minecraft/MinecraftProfileTexture;Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;Lnet/minecraft/client/resources/SkinManager$SkinAvailableCallback;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_152789_a = McMappingDatabase.getSRG("SkinManager.func_152789_a");

	/**
	 * <p>
	 * Name: skinCacheDir
	 * </p>
	 */
	public static McObfPair field_152796_d = McMappingDatabase.getSRG("field_152796_d");

	/**
	 * <p>
	 * Name: textureManager
	 * </p>
	 */
	public static McObfPair field_152795_c = McMappingDatabase.getSRG("field_152795_c");

	/**
	 * <p>
	 * Name: skinCacheLoader
	 * </p>
	 */
	public static McObfPair field_152798_f = McMappingDatabase.getSRG("field_152798_f");

}
