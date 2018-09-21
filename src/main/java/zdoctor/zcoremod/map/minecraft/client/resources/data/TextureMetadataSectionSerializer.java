package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextureMetadataSectionSerializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfw";
		else
			return "net/minecraft/client/resources/data/TextureMetadataSectionSerializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfw";
		else
			return "TextureMetadataSectionSerializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfw;";
		else
			return "Lnet/minecraft/client/resources/data/TextureMetadataSectionSerializer;";
	}

	/**
	 * <p>
	 * Name: getSectionName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110483_a = McMappingDatabase.getSRG("TextureMetadataSectionSerializer.func_110483_a");

}
